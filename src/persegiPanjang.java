
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class persegiPanjang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double panjang, lebar, luas ;
        
        Scanner reader = new Scanner(System.in);
        System.out.print("masukkan panjang =");
        panjang = reader.nextDouble();
        System.out.print("masukkan lebar =");
         lebar = reader.nextDouble();
         luas = panjang * lebar;
          System.out.println("luas = "+luas);
    }
    
}
