import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите целое число");

        int x;
        Scanner sc = new Scanner(System.in);
        x= sc.nextInt();

        int sumArea = 0;
        for (int i = 0; i<x; i++){
            Rectangle r = new Rectangle();
            System.out.println(r);
            sumArea +=r.area();

        }

        System.out.println(sumArea);


    }
}