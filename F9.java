/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package f9;

import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class F9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        beolvas ob = new beolvas();
        ob.kiir();
    }
    
}
class beolvas{
    public int a, b, c;
    public beolvas(){
        Scanner billentyu = new Scanner (System.in); 
        out.print("Kérem a téglatest hosszúságát: ");
        a = billentyu.nextInt();
        out.print("Kérem a téglatest szélességét: ");
        b = billentyu.nextInt();
        out.print("Kérem a téglatest magasságát: ");
        c = billentyu.nextInt();
    }
    public void kiir(){
        out.printf("A téglatest felszíne = %d\n", 2*(a*b +a*c +b*c));
        out.printf("A téglatest térfogata = %d\n", a*b*c); 
    }
}
