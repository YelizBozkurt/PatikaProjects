import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        //Değişkenleri oluştur
        int maths,physical,chemistry,biology,history,music;

        //Scanner sınıfımızı tanımladık
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan değerleri al
        System.out.print("Your math grade: ");
        maths= inp.nextInt();

        System.out.print("Your physical grade: ");
        physical=inp.nextInt();

        System.out.print("Your chemistry grade: ");
        chemistry=inp.nextInt();

        System.out.print("Your biology grade: ");
        biology=inp.nextInt();

        System.out.print("Your history grade: ");
        history=inp.nextInt();

        System.out.print("Your music grade: ");
        music=inp.nextInt();

        int total=(maths+physical+chemistry+biology+history+music);
        double result=total/6.0;

        String result2 = result >= 60 ? "Success" : "Fail";

        System.out.println("Your average: " + result);
        System.out.println(result2);

    }
}
