/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package f6;
import static java.lang.System.out; 
import java.util.Scanner; 
/**
 *
 * @author admin
 */
public class F6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Szamol szam = new Szamol();
        Atlag atl = new Atlag();
        szam.beolvas();
        szam.kiir();
        atl.kiir(szam);
    }
    
}
class Szamol{
    final int MAX = 5;
    public int[] elemek = new int[MAX];
    public void beolvas(){
        Scanner billentyu = new Scanner (System.in); 
        for(int i = 0; i<MAX; i++){
            out.print("Kérem az elemet: ");
            elemek[i] = billentyu.nextInt();
        }
    }
    public void kiir(){ 
        int tmp = 0;
        for(int i=0;i<MAX; i++){
            tmp += elemek[i];
        }
        out.println("Összegük: " + tmp);
}
}
class Atlag extends Szamol{
    //@Override
    public void kiir(Szamol o){ 
        int tmp = 0;
        for(int i=0;i<MAX; i++){
            tmp += o.elemek[i];
        }
        out.printf("Átlaguk: " + tmp/MAX + "\n\n");
    }
}


