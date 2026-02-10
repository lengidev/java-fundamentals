import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args){
        //Write a program with .charAt() method to print a string in reverse


        Scanner username = new Scanner(System.in);

        System.out.println("What is your name: ");
        String name = username.nextLine();

        for (int i = name.length() - 1; i >= 0; i--){
            System.out.print(name.charAt(i));
        }
    }
}
