import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите 1 число: ");
        int num1 = in.nextInt();
        System.out.print("Введите 2 число: ");
        int num2 = in.nextInt();
        in.close();

        try {
            checkNum(num2);
        } catch (MyExeption ex) {
            System.out.println("Ошибка! " + ex.getMessage());
        } finally {
            if (num2 != 0)
                System.out.printf("%d / %d = " + num1/num2, num1, num2);
        }
    }

    public static void checkNum(int num) throws MyExeption {
        if (num == 0)
            throw new MyExeption("Деление на ноль недопустимо");
    }
}

class MyExeption extends Exception {
    public MyExeption(String messedge) {
        super(messedge);
    }

}