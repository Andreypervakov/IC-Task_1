import java.util.InputMismatchException;
import java.util.Scanner;

public class boyInLove {
    public static void main (String[] args) {
        int threeLetter = 62;
        int oneSpace = 12;
        int lengheFence = 5 * threeLetter + 3 * oneSpace;
        System.out.println("Ведите число:");
        System.out.println(lengheFence);

        Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();

        try {
            //Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();

            if (num <= 0) {
                System.out.println("Введено неверное число");
            }
            else if (num <= lengheFence) {

                System.out.println("Вы поместились");
            }
            else {
                System.out.println("Вы не поместились");
            }
        }
        catch (InputMismatchException e) {

            System.out.println("Введено не то значение");
        }
    }
}

