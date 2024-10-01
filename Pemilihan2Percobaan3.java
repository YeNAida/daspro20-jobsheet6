import java.util.Scanner;

public class Pemilihan2Percobaan3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String Kategori;
        int penghasilan,gajibersih;
        double pajak = 0;
        
        System.out.println("Masukkan Kategori(Pekerja/Pembisnis) : ");
        Kategori = input.nextLine();
        System.out.println("Masukkan besarnya Penghasilan :");
        penghasilan = input.nextInt();
        
        if (Kategori.equalsIgnoreCase("pekerja")) {
            if (penghasilan <= 2000000) {
                pajak = 0.1;
            }
            else if (penghasilan <=3000000) {
                pajak = 0.15;
            }
            else {
                pajak= 0.2;
                
            }
            gajibersih = (int) (penghasilan-(pajak*penghasilan));
            System.out.println("Penghasil bersih:" + gajibersih);
        } else if (Kategori.equalsIgnoreCase("pembisnis")) {
            if (penghasilan<=2500000) {
                pajak = 0.15;
            }
            else if (penghasilan <= 3500000) {
                pajak = 0.2;
            }else {
            pajak = 0.25;
            
            } gajibersih= (int) (penghasilan-(pajak*penghasilan));
            System.out.println("Penghasil Bersih:"+ gajibersih);
        } else {
            System.out.println("Masukkan kategori salah!");
        }

    }
}
