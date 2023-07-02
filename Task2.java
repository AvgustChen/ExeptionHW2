import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите 1 число: ");
        float num1 = in.nextInt();
        System.out.print("Введите 2 число: ");
        float num2 = in.nextInt();
        in.close();

        try {
            checkNum(num1, num2);
        } catch (MyExeption ex) {
            System.out.println("Ошибка! " + ex.getMessage());
        } 
        
    }

    public static void checkNum(float num1, float num2) throws MyExeption {
        
        if (num2 == 0)
            throw new MyExeption("Деление на ноль недопустимо");
        else{
          float result = 0;
          result = num1/num2;
          System.out.println(result);          
        }  
    }
}

class MyExeption extends Exception {
    public MyExeption(String messedge) {
        super(messedge);
    }

}