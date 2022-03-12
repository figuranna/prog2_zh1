/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package f10;

import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class F10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Atlag a = new Atlag();
        a.beolvas();
        a.kiir();
    }
    
}
class Magassag{
    public int m, a;
    public void beolvas(){
        Scanner billentyu = new Scanner (System.in); 
        out.print("Kérem a magasságot: ");
        m = billentyu.nextInt();
        /*out.print("Kérem az átlagot: ");
        a = billentyu.nextInt();*/

    }
    public void kiir(){
        if(a<m){
            out.println("Magasabb az átlagnál.\n");
        }
        else{
            out.println("Alacsonyabb az átlagnál.\n");
        }
    }
}
class Atlag extends Magassag{
    public Atlag() {
        Scanner billentyu = new Scanner (System.in); 
        out.print("Kérem az átlagot: ");
        a = billentyu.nextInt();
    }
}