import java.util.Scanner;

public class UcgenHesap {

    public static void main(String[] args){

        
        
        Scanner inp = new Scanner(System.in);

        double ken1, ken2, ken3, u, alan;
        
        System.out.println("Please login the first edge : ");
        ken1 = inp.nextDouble();
        
        System.out.println("Please login the second edge : ");
        ken2 = inp.nextDouble();
        
        System.out.println("Please login the third edge : ");
        ken3 = inp.nextDouble();
        
        u = (ken1+ken2+ken3)/2;
        alan = u*(u-ken1)*(u-ken2)*(u-ken3);
        double alan2 = Math.sqrt(alan);
        System.out.println("Area of your triangle : " + alan2);

    }
    
}
