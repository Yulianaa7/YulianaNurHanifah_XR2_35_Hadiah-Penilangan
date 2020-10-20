/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penilangan;
import java.util.Scanner;
/**
 *
 * @author Yuliana
 */
public class Penilangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int langgar;
        String nama,alamat;
        Scanner input = new Scanner(System.in);
        System.out.println("PENILANGAN");
        System.out.println("___________________");
        System.out.println("1. Tidak memakai/membawa masker");
        System.out.println("2. Tidak membawa SIM");
        System.out.println("3. Tidak membawa STNK");
        System.out.print("Masukkan nama anda = ");
        nama = input.nextLine();
        System.out.print("Masukkan Alamat anda = ");
        alamat = input.nextLine();
        System.out.print("Apa yang tidak anda bawa? (1-3) = ");
        langgar = input.nextInt();
        switch(langgar){
            case 1:
                System.out.println("ANDA TIDAK MEMAKAI MASKER");
                System.out.println("Silahkan membeli masker di toko terdekat");
            break;
            case 2:
                System.out.println("ANDA TIDAK MEMBAWA SIM");
                System.out.println("BUKTI PELANGGARAN LALU LINTAS");
                System.out.println("Nama    : " + nama);
                System.out.println("Alamat  : " + alamat);    
            break;
            case 3:
                System.out.println("ANDA TIDAK MEMBAWA STNK");
                System.out.println("BUKTI PELANGGARAN LALU LINTAS");
                System.out.println("Nama    : " + nama);
                System.out.println("Alamat  : " + alamat); 
            break;
            default:
                System.out.println("Semuanya Lengkap");
    }
    
    }}
