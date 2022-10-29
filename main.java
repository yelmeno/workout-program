import java.util.Scanner;

public class main {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("İdman programına hoşgeldiniz..");
        String idmanlar = "Burpee idmanı\n"
                         +"Pushup idmanı\n"
                         +"Situp idmanı\n"
                         +"Squat idmanı\n";
        System.out.println("************************");
          System.out.println(idmanlar);
        System.out.println("Bir idman programı oluşturun");
        System.out.println("Burpee Sayısı: ");
        int burpee = scanner.nextInt();
        System.out.println("Pushup sayısı:" );
        int pushup = scanner.nextInt();
        System.out.println("Situp sayısı:" );
        int situp = scanner.nextInt();
        System.out.println("Squat sayısı:" );
        int squat = scanner.nextInt();
        scanner.nextLine();

        idman Idman = new idman(burpee,pushup,situp,squat);
        System.out.println("İdman başlıyor");
        while (Idman.idmanBittimi() == false){
            System.out.println("Hareket türü: Burpee, pushup , situp , squat..");
            String tur = scanner.nextLine();
            System.out.println("Bu hareketten kaç tekrar yapacaksınız");
            int sayi = scanner.nextInt();
            scanner.nextLine();
            Idman.hareketYap(tur,sayi);
        }



    }
}
