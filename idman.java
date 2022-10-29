public class idman {
    private int burpeeSayisi;
    private int pushupSayisi;
    private int situpSayisi;
    private int squatSayisi;

    public idman(int burpeeSayisi, int pushupSayisi, int situpSayisi, int squatSayisi) {
        this.burpeeSayisi = burpeeSayisi;
        this.pushupSayisi = pushupSayisi;
        this.situpSayisi = situpSayisi;
        this.squatSayisi = squatSayisi;
    }

    public int getBurpeeSayisi() {
        return burpeeSayisi;
    }

    public void setBurpeeSayisi(int burpeeSayisi) {
        this.burpeeSayisi = burpeeSayisi;
    }

    public int getPushupSayisi() {
        return pushupSayisi;
    }

    public void setPushupSayisi(int pushupSayisi) {
        this.pushupSayisi = pushupSayisi;
    }

    public int getSitupSayisi() {
        return situpSayisi;
    }

    public void setSitupSayisi(int situpSayisi) {
        this.situpSayisi = situpSayisi;
    }

    public int getSquatSayisi() {
        return squatSayisi;
    }

    public void setSquatSayisi(int squatSayisi) {
        this.squatSayisi = squatSayisi;
    }
    public void hareketYap (String hareketTürü, int sayi){
        if (hareketTürü.equals("burpee")){
            burpeeYap(sayi);
        }else if (hareketTürü.equals("pushup")){
            pushupYap(sayi);
        }else if (hareketTürü.equals("situp")){
            situpYap(sayi);
        }else if (hareketTürü.equals("squat")){
            squatYap(sayi);
        }else {
            System.out.println("Geçersiz Hareket");
        }

    }

    public void burpeeYap(int sayi){
        if (burpeeSayisi == sayi){
            System.out.println("Yapacak burpee kalmadı");
        }
        if (burpeeSayisi - sayi < 0){
            System.out.println("Tebrikler hedeflediğin sayıyı geçtin");
            burpeeSayisi =0;
            System.out.println("Kalan burpee sayısı"+ burpeeSayisi);
        }else {
            burpeeSayisi -= sayi;
            System.out.println("Kalan burpee sayısı" + burpeeSayisi);
        }


    }public void pushupYap(int sayi) {
        if (pushupSayisi == sayi) {
            System.out.println("Yapacak pushup kalmadı");
        }
        if (pushupSayisi - sayi < 0) {
            System.out.println("Tebrikler hedeflediğin sayıyı geçtin");
            pushupSayisi = 0;
            System.out.println("Kalan pushup sayısı" + pushupSayisi);
        } else {
            pushupSayisi -= sayi;
            System.out.println("Kalan pushup sayısı" + pushupSayisi);


        }
    }public void situpYap(int sayi) {
        if (situpSayisi == sayi) {
            System.out.println("Yapacak situp kalmadı");
        }
        if (situpSayisi - sayi < 0) {
            System.out.println("Tebrikler hedeflediğin sayıyı geçtin");
            situpSayisi = 0;
            System.out.println("Kalan situp sayısı" + situpSayisi);
        } else {
            situpSayisi -= sayi;
            System.out.println("Kalan situp sayısı" + situpSayisi);

       }
    }public void squatYap(int sayi) {
        if (squatSayisi == sayi) {
            System.out.println("Yapacak squat kalmadı");
        }
        if (squatSayisi - sayi < 0) {
            System.out.println("Tebrikler hedeflediğin sayıyı geçtin");
            situpSayisi = 0;
            System.out.println("Kalan squat sayısı" + squatSayisi);
        } else {
            squatSayisi -= sayi;
            System.out.println("Kalan squat sayısı" + squatSayisi);

        }
    }
    public boolean idmanBittimi (){
        return ((burpeeSayisi== 0) && (pushupSayisi == 0) && (situpSayisi == 0) && (squatSayisi == 0));
    }

}
