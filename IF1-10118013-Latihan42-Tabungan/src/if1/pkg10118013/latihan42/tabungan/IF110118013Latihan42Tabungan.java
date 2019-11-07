/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118013.latihan42.tabungan;
import java.util.Scanner;
/**
 *
 * @author Rifian
 * Nama : Rifian Joe Premilenio
 * Kelas : IF-01
 * NIM : 10118013
 */
public class IF110118013Latihan42Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int saldo ;
        Scanner input = new Scanner(System.in);
       
        System.out.println("====Program Penarikan Uang====");
        System.out.print("Masukkan Saldo Anda : " );
        saldo = input.nextInt();
        Tabungan tabungan = new Tabungan(saldo);
    }
    
}
