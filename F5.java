/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package f5;

import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class F5 {

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
        out.print("Kérem a háromszög oldalát: ");
        a = billentyu.nextInt();
        out.print("Kérem a háromszög oldalát: ");
        b = billentyu.nextInt();
        out.print("Kérem a háromszög oldalát: ");
        c = billentyu.nextInt();
    }
    public void kiir(){
        if(a+b>c&&a+c>b&&b+c>a){
            out.println("A háromszög szerkezthető.");
        }
        else{
            out.println("A háromszög nem szerkezthető.");
        }
    }
}
/* ???
public beolvas(){
        String tmp;
        if(a+b>c&&a+c>b&&b+c>a){
            tmp = "A háromszög szerkezthető.";
        }
        else{
            tmp = "A háromszög nem szerkezthető.";
        }
public void kiir(){
        out.println(tmp);
    }
*/