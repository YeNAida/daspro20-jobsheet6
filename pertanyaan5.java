import java.util.Scanner;

public class pertanyaan5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String member;
        int menu,harga=0,jumlahBeli;
        double diskon=0,TotalBayar;

        System.out.println("------------------------------------------");
        System.out.println("--MENU KAFE JURUSAN TEKNOLOGI INFORMASI---");
        System.out.println("------------------------------------------");
        System.out.println("--1.RICEBOWL------------------------------");
        System.out.println("--2.ICE TEA-------------------------------");
        System.out.println("--3.PAKET BUNDING(RICEBOWL+ICE TEA)-------");
        System.out.println("------------------------------------------");
        System.out.print("MASUKKAN ANGKA DARI MENU YANG ANDA PILIH =");
        menu = input.nextInt();
        input.nextLine();
        System.out.print("Apakah kamu sudah terdaftar member(y/n)?=");
        member = input.nextLine();
        System.out.println("------------------------------------------");

        if (member.equals("y")) {
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
        if (menu == 1) {
            harga = 14000;
            System.out.println("HARGA RICEBOWL=" + harga);
        }
        else if (menu == 2) {
            harga = 3000; 
            System.out.println("HARGA ICE TEA="+harga);
        }
        else if (menu == 3){
            harga = 15000;
            System.out.println("HARGA BULDING="+harga);
        }
        else {
            System.out.println("Masukkan pilihan sesuai dengan yang ada di menu!");
        }
        TotalBayar = (int) harga - (harga*diskon);
        System.out.println("Total bayar setelah diskon="+ TotalBayar);
    } else if (member.equals("n") ) {
        if (menu == 1) {
            harga = 140000;
            System.out.println("HARGA RICEBOWL="+harga);
        }
        else if (menu == 2) {
            harga = 3000;
            System.out.println("HARGA ICE TEA="+harga);
        }
        else if (menu == 3) {
            harga = 15000;
            System.out.println("HARGA BULDING="+harga);
        }
        else{
            System.out.println("Masukkan pilihan sesuai dengan yang ada di menu!");
            return;
        }
        System.out.println("Total yang harus anda bayar="+harga);
    }else{
        System.out.println("Member anda tidak terverifikasi!");
    }
    System.out.println("------------------------------------------");
    }
}

    
