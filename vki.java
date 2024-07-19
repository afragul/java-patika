import java.util.Scanner;

public class vki {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        double height= input.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz : ");
        int weight= input.nextInt();


        double vki=weight/(height*height);
        System.out.println("Vücut Kitle İndeksiniz :" + vki);
    }
}
