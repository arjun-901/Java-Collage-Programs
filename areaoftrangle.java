import java.util.Scanner;

public class areaoftrangle {
    
    public static void main(String[] args) {

        int l=6;
        int b=8;
      //  System.err.println("");
        Scanner y = new Scanner(System.in);
    System.out.println("enter a number ");
        l=y.nextInt();
        System.out.println("enter a name");
        String name = y.nextLine();
        
         int a=l*b;
         System.out.println(name);
         System.out.println("the area is " + a+ " is the best po..");
         y.close();

    }
    
}
