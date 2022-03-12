/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package f8;
import static java.lang.System.out;
import java.util.Scanner;
/**
 *
 * @author admin
 */
public class F8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Homer hom = new Homer();
        hom.beolvas();
        hom.kiir();
    }
    
}
class Homer{
    public int a;
    public void beolvas(){
        Scanner billentyu = new Scanner (System.in); 
        out.print("Kérem a hőmérsékletet: ");
        a = billentyu.nextInt();

    }
    public void kiir(){
        if(a<0){
            out.println("Jég");
        }
        else if(a>100){
            out.println("Gőz");
        }
        else{
            out.println("Víz");
        }
    }
}