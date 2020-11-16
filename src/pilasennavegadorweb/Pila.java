
package pilasennavegadorweb;

/**
 *
 * @author User
 */
public class Pila {
    String arr[];
    int maxSize;
    int cima;
    
    //Constructor de la clase Pila
    public Pila(int n){
        maxSize = n;
        arr = new String[maxSize];
        cima = 0;
    }
    
    
    public void visitarSitioWeb(String str){
        if(cima < maxSize){
            cima++;
            arr[cima] = str;
        }    
    }
    
    
    public String regresar(){
         String temp = null;
         arr[0]= temp;
        if(cima > 0){
            temp = arr[cima-1];
            cima--;
        }else{
            cima=0;
        }
        return temp;
    }
    
    public String avanzar(){
        String temp = arr[cima];
        if(cima >= 0){
            temp = arr[cima+1];
            cima++;
        }
        if(temp == null){
        temp = arr[cima-1];
        cima--;
        }
        return temp;
    }
   
}
