

import Tugas4.DataBuku.DataBuku;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import Tugas4.Helper.Parse;
import Tugas4.StatusBuku.StatusBuku;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<DataBuku> listBook = new ArrayList<DataBuku>();

        System.out.println("===========================================");
        System.out.println("----------- Masukan Daftar Buku -----------");
        System.out.println("===========================================");
        Boolean star = true;

        while (star != false){
            DataBuku book = new DataBuku();

            System.out.print("\nMasukkan judul            : ");
            book.setJudul(scan.nextLine());

            System.out.print("Masukkan penerbit         : ");
            book.setPenerbit(scan.nextLine());

            System.out.print("Masukkan tahunTerbit      : ");
            book.setTahunTerbit(scan.nextLine());

            System.out.print("Masukkan pengarang        : ");
            book.setPengarang(scan.nextLine());

            System.out.print("Masukkan isbn             : ");
            book.setIsbn(scan.nextLine());

            System.out.print("Masukkan tanggal Kembali  : ");
            Date parsed = Parse.stringToDate(scan.nextLine());
            book.setTanggalKembali(parsed);

            if(parsed == null){
                book.setStatus(StatusBuku.Status.BELUM_DIKEMBALIKAN);
            } else {
                book.setStatus(StatusBuku.Status.SUDAH_DIKEMBALIKAN);
            }

            listBook.add(book);

            System.out.print("\nTambah lagi (y/n) ? ");
            String input = scan.nextLine();

            if (input.equals("n")){
                star = false;
            }
        }

        System.out.println("\n============ Daftar Buku ============");
        for(DataBuku book : listBook){
            System.out.println("Judul            : " + book.getJudul()+"\n"+
                               "Penerbit         : " + book.getPenerbit()+"\n"+
                               "Tahun Terbit     : " + book.getTahunTerbit()+"\n" + 
                               "Pengarang        : " + book.getPengarang()+"\n"+ 
                               "ISBN             : " + book.getIsbn()+"\n"+ 
                               "Status           : " + book.getStatus()+"\n"+ 
                               "Tanggal Kembali  : " + book.getTanggalKembali() + "\n\n");

        }
    }
}