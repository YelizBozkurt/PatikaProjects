import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        double tutar , kdoranı = 0.18;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen tutar giriniz: " );
        tutar=input.nextDouble();
        double kdvoranı=tutar*kdoranı;
        double  kdvliTutar=tutar+kdoranı;
        System.out.println(kdvliTutar);

    }
}