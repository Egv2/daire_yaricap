import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double pi=3.14, alan, a, r;

        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz: ");
        r = input.nextDouble();
        System.out.print("Dairenin merkez yarıçapını giriniz: ");
        a = input.nextDouble();
        alan = (pi*(r*r)*a) / 360;
        System.out.println("Daire diliminin alanı: "+alan);

    }
}
