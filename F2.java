/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package f2;

import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class F2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        beolvas ob = new beolvas();
        kisbetu kb = new kisbetu();
        ob.beolvas();
        ob.kiir();
        kb.kisbetu(ob);
    }
    
}
class beolvas{
    String szoveg;
    int i=0;
    public void beolvas(){
        Scanner billentyu = new Scanner (System.in);
        out.println("Karakterlánc: ");
        szoveg = billentyu.next();
    }
    public void kiir(){
        out.println("A beírt szöveg: " + szoveg + "\n\n");
    }
}
class kisbetu extends beolvas{
    public void kisbetu(beolvas o){
        int tmp = 0;
        for(int i=0; i<o.szoveg.length();i++){
            if(o.szoveg.charAt(i)>='a'&&o.szoveg.charAt(i)<='z'){
                tmp++;
            }
        }
        out.println("Kisbetűk száma: " + tmp);
    }
}