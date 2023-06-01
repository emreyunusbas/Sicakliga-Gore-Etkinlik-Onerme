import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int heat;

        Scanner input = new Scanner(System.in);

        System.out.println("Hava sıcaklığını Giriniz :");
        heat = input.nextInt();

        if (heat < 5) {
            System.out.println("Kayak Yapabilirsiniz Eğer Paranız Yetiyorsa :)");
        } else if (heat <= 25) {
            if (heat <= 15) {
                System.out.println("Sinemaya Gidebilirsiniz Gerçi Bu Ekonomide Zor Ama Neyse");
            }
            if (heat >=10){
                System.out.println("Pikniğe Gidebilirsiniz ALLAH'ın Fakirleri");

            }
        }else {
            System.out.println("Yüzmeye Gidebilirsiniz O da Halk Plajına :)");
        }

    }
}