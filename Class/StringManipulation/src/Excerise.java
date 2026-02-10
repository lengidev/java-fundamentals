import java.util.Scanner;

public class Excerise {
    public static void main(String[] args){


        System.out.println("What is your name: ");
        Scanner name = new Scanner(System.in);
        String username = name.nextLine();

        //split
        String [] parts = username.split(" ");
        for(String p:parts) {
            System.out.print(p.charAt(0));;
        }
    }
}
