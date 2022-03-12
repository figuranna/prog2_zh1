/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package f1;
import static java.lang.System.out; 
import java.util.Scanner; 

/**
 *
 * @author admin
 */
public class F1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        beolvas ob = new beolvas();
        Index ind = new Index();
        ob.beolvas();
        //ob.kiir();
        ind.kiir(ob);

    }
}
class beolvas{
    final int MAX = 10;
    public int[] elemek = new int[MAX];
    public void beolvas(){
        Scanner billentyu = new Scanner (System.in); 
        for(int i = 0; i<MAX; i++){
            out.print("Kérem az elemet: ");
            elemek[i] = billentyu.nextInt();
        }
    }
    public void kiir(){ 
        for(int i=0;i<MAX; i++){
            out.println(elemek[i]);
        }
}
}
class Index extends beolvas{
    //@Override
    public void kiir(beolvas o){ 
        int i;
        for(i=0;i<MAX; i++){
            out.println(i+1 + ". " + o.elemek[i]);
        }
}
}
