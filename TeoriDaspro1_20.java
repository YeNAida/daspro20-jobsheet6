import java.util.Scanner;
public class TeoriDaspro1_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bilangan1,bilangan2, bilangan3;
        System.out.println("Cara Perbandingan bilangan");
        System.out.println("masukkan bilangan 1: ");
        bilangan1 = input.nextInt();
        System.out.println("masukkan bilangan 2: ");
        bilangan2 = input.nextInt();
        System.out.println("masukkan bilangan 3: ");
        bilangan3 = input.nextInt();
        
        

        if (bilangan1<bilangan2 && bilangan1>bilangan3 && bilangan3<bilangan2) {
            System.out.println("Bilangan 2 terbesar!");
        } 
         else {
            System.out.println("Bilangan tidak sesuai denganketentuan soal yang ada!");
        }    
        }
    }

