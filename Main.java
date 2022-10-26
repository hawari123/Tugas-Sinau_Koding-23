import java.util.Scanner;

public class Main { 
    public static void main(String[] args) {
        int phi = 22/7;
        
        persegi();
        persegiPanjang();
        segitiga();
        lingkaran(phi);
        jajarGenjang();
        belahKetupat();
        trapesium();
        layangLayang();
    }
    
    static void persegi(){
        Scanner myObj1 = new Scanner(System.in);
        System.out.println("Menghitung keliling dan luas dari persegi");

        System.out.println("Masukan sisi :");
        int sisi = myObj1.nextInt();

        System.out.println("Keliling dari persegi adalah : "+ (sisi*4));
        System.out.println("Luas dari persegi adalah : "+ (sisi*sisi));
    }

    static void persegiPanjang(){
        Scanner myObj2 = new Scanner(System.in);
        System.out.println("Menghitung keliling dan luas dari persegi panjang");

        System.out.println("Masukan panjang :");
        int panjang = myObj2.nextInt();
        System.out.println("Masukan lebar :");
        int lebar = myObj2.nextInt();

        System.out.println("Keliling-nya adalah : "+ (2*(panjang+lebar)));
        System.out.println("Luas-nya adalah : "+ (panjang*lebar));
    }

    static void segitiga(){
        Scanner myObj3 = new Scanner(System.in);
        System.out.println("Menghitung keliling dan luas dari segitiga");

        System.out.println("Masukan sisi miring :");
        int sisiMiring = myObj3.nextInt();
        System.out.println("Masukan alas :");
        int alas = myObj3.nextInt();
        System.out.println("Masukan tinggi :");
        int tinggi = myObj3.nextInt();

        System.out.println("Keliling-nya adalah : "+ (sisiMiring+alas+tinggi));
        System.out.println("Luas-nya adalah : "+ ((alas*tinggi)/2));
    }
    
    static void lingkaran(int phi){
        Scanner myObj4 = new Scanner(System.in);
        System.out.println("Menghitung keliling dan luas dari lingkaran");

        System.out.println("Masukan jari-jari :");
        int jariJari = myObj4.nextInt();

        System.out.println("Keliling-nya adalah : "+ (2*phi*jariJari));
        System.out.println("Luas-nya adalah : "+ (phi*jariJari*jariJari));
    }
     
    static void jajarGenjang(){
        Scanner myObj5 = new Scanner(System.in);
        System.out.println("Menghitung keliling dan luas dari jajar genjang");

        System.out.println("Masukan alas :");
        int alas = myObj5.nextInt();
        System.out.println("Masukan sisi miring :");
        int sisiMiring = myObj5.nextInt();
        System.out.println("Masukan Tinggi :");
        int tinggi = myObj5.nextInt();

        System.out.println("Keliling-nya adalah : "+ (2*(alas+sisiMiring)));
        System.out.println("Luas-nya adalah : "+ (alas*tinggi));
    }
    
    static void belahKetupat(){
        Scanner myObj5 = new Scanner(System.in);
        System.out.println("Menghitung keliling dan luas dari belah ketupat");

        System.out.println("Masukan sisi :");
        int sisi = myObj5.nextInt();
        System.out.println("Masukan diagonal 1 :");
        int diagonal1 = myObj5.nextInt();
        System.out.println("Masukan diagonal 2 :");
        int diagonal2 = myObj5.nextInt();

        System.out.println("Keliling-nya adalah : "+ (4*sisi));
        System.out.println("Luas-nya adalah : "+ ((diagonal1*diagonal2)/2));
    }
    
    static void trapesium(){
        Scanner myObj5 = new Scanner(System.in);
        System.out.println("Menghitung keliling dan luas dari trapesium");

        System.out.println("Masukan sisi atas :");
        int sisiAtas = myObj5.nextInt();
        System.out.println("Masukan sisi bawah :");
        int sisiBawah = myObj5.nextInt();
        System.out.println("Masukan sisi miring :");
        int sisiMirng = myObj5.nextInt();
        System.out.println("Masukan tinggi :");
        int tinggi = myObj5.nextInt();

        System.out.println("Keliling-nya adalah : "+ (sisiAtas+sisiBawah+sisiMirng+tinggi));
        System.out.println("Luas-nya adalah : "+ (((sisiAtas+sisiBawah)*tinggi)/2));
    }
    
    static void layangLayang(){
        Scanner myObj5 = new Scanner(System.in);
        System.out.println("Menghitung keliling dan luas dari belah ketupat");

        System.out.println("Masukan sisi 1 :");
        int sisi1 = myObj5.nextInt();
        System.out.println("Masukan  2 :");
        int sisi2 = myObj5.nextInt();
        System.out.println("Masukan diagonal 1 :");
        int diagonal1 = myObj5.nextInt();
        System.out.println("Masukan diagonal 2 :");
        int diagonal2 = myObj5.nextInt();

        System.out.println("Keliling-nya adalah : "+ (2*(sisi1+sisi2)));
        System.out.println("Luas-nya adalah : "+ ((diagonal1*diagonal2)/2));
    }
}