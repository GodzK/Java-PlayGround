package Methodkeeper;
import java.util.Scanner;
public class method {
    public static void inp(){
        // THIS IS MY FIRST INPUT IN JAVA
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();       // Read integer
        double d = sc.nextDouble(); // Read double
        sc.nextLine();              // Clear the leftover newline

        String s = sc.nextLine();   // Read full line of text
        sc.close();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
    public static void ifelse(){
        // This is my first if else in java
        int N = scanner.nextInt();
        scanner.close();
        if(N % 2 != 0){
            System.out.println("Weird");
        }
        else {
            if (N >= 2 && N <= 5) {
                System.out.println("Not Weird");
            } else if (N >= 6 && N <= 20) {
                System.out.println("Weird");
            } else {
                System.out.println("Not Weird");
            }
        }
    }
    public static void String(String[] args) {
        //String format
        Scanner sc  =new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.printf("%-15s%03d%n", s1, x);
        }
        System.out.println("================================");
    }
}
