import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int yariCap,aci;
        double alan,cevre,aciliDaireninAlani;
        System.out.print("Yaricapi giriniz : ");
        yariCap = scan.nextInt();
        System.out.print("Dairenin acisini giriniz : ");
        aci = scan.nextInt();
        alan = Math.PI*yariCap*yariCap;
        cevre = 2*Math.PI*yariCap;
        aciliDaireninAlani = (Math.PI * (yariCap*yariCap) * aci) / 360;
        System.out.println("Dairenin Alani : "+alan);
        System.out.println("Dairenin cevresi : "+cevre);
        System.out.println("Dairenin Acili Alani : "+aciliDaireninAlani);
    }
}