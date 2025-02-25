package src.myfirstjava;
public class Users {
   static String a = "amigo";
   int b = 1;
    public static void main(String[] args) {
        System.out.print("Three..");
        System.out.println("Two..");
        try{
            if (1 == 1){
              System.out.println("If else Statements");
              System.out.println("Hello World" + " " + a);
            }
            else{
                System.out.println("No its error");
            }
            Cat.walk();
            Cat.fc();//adam
        }
        catch (Exception e){
            System.out.println("Error นะคร้าบบบ: " + e);
        }
    }
    public static void passWord(){

    }
}