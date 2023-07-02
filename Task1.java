import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = in.nextInt();
        in.close();

        try {
            checkNum(num);
        } catch (MyExeption ex) {
            System.out.println("Ошибка! " + ex.getMessage());
        } finally {
            if (num > 0)
                System.out.println("Число коректно!");
        }
    }

    public static void checkNum(int num) throws MyExeption {
        if (num <= 0)
            throw new MyExeption("Некоректное число!");
    }
}

class MyExeption extends Exception {
    public MyExeption(String messedge) {
        super(messedge);
    }

}
