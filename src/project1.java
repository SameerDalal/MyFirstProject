
import java.util.Scanner;
public class project1{

    public static void main(String[] args){
    project1 object = new project1();
    object.answer();

    }

    public static void answer(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input first number:");
        int number1 = scan.nextInt();
        System.out.println("Input second number:");
        int number2 = scan.nextInt();
        System.out.println("Input third number:");
        int number3 = scan.nextInt();
        System.out.println("Input fourth number:");
        int number4 = scan.nextInt();

        if (number1 == number2 && number2 == number3 && number3 == number4){

            System.out.println("Numbers are equal!");

        } else {
            System.out.println("Numbers are not equal!");


        }
    }
}
