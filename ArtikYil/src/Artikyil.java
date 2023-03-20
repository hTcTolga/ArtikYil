import java.util.Scanner;
public class Artikyil {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int yil;

        System.out.print("Yıl Giriniz: ");
        yil = girdi.nextInt();
        if (yil % 4 == 0 && yil % 100 != 0 || yil % 400 == 0){
            System.out.print(yil +" artık yıldır.");
        }
        else {
            System.out.print(yil +" artık yil değildir");
        }
    }
}