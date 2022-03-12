/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package f7;
import static java.lang.System.out;
import java.util.Scanner;
import java.lang.Math.*;

/**
 *
 * @author admin
 */
public class F7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Henger ob = new Henger();
        ob.beolvas();
        ob.kiir();
    }
    
}
class Henger{
    public int m, r;
    public void beolvas(){
        Scanner billentyu = new Scanner (System.in); 
        out.print("Kérem a henger magasságát: ");
        m = billentyu.nextInt();
        out.print("Kérem a henger sugarát: ");
        r = billentyu.nextInt();
    }
    public void kiir(){
        out.printf("A téglatest felszíne = %.2f\n", r*r*Math.PI*m);
        out.printf("A téglatest térfogata = %.2f\n", (2*r*r*Math.PI+2*Math.PI*r*m));

    }
}
