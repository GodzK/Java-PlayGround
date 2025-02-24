package src.myfirstjava;
// Comment
/* multiple line
comment*/

public class Users {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.print("Three..");
        System.out.println("Two..");
        try{
            int[] myNumber = {1,2,3};
            System.out.println(myNumber[4]);
        }
        catch (Exception e){
            System.out.println("Error นะคร้าบบบ: " + e);
        }
    }
}