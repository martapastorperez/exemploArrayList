
package exemploarraylist;

import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.sort;
import java.util.Iterator;


public class Numeros {
    
  //private ArrayList listaNum = new ArrayList();
    private ArrayList listaNum;
    Object[] listaNum2;
   
    
    public Numeros (){
        listaNum = new ArrayList();
    }
    
    public void cargarArray(){
        listaNum.add(1);       
        listaNum.add(9);
        listaNum.add(2);
        listaNum.add(5);
    }
    
    public void añadirElemento(){
        listaNum.add(2, 7);
    }
    
    public void buscarElemento(int eleBus){        
        if(listaNum.contains(eleBus))
            System.out.println("Está");
        else
            System.out.println("No está");
    }
    
    public void amosar(){
        for(int i =0; i<listaNum.size();i++)
            System.out.println(listaNum.get(i));
    }
    
    public void amosarElemento(){
        System.out.println(listaNum.get(3));
    }
    
    public void borrarElemento(){
        listaNum.remove(new Integer(7));//borra elemento de VALOR 2
        //listaNum.remove(2);//borra el elemento de la POSICIÓN 2
    }
    
    public void borrarLista(){
        listaNum.clear();
    }
    
    public void comprobarBorrado(){        
        if(listaNum.isEmpty())
            System.out.println("Borrado");
        else
            System.out.println("No borrado");
    }
    
    public void pasarArray(){
        listaNum2 = new Object[5];
        listaNum2 = listaNum.toArray();
          for(Object ele:listaNum2)
            System.out.println("-->" + (int)ele);
        }
    
    public void amosarIterator(){
        //con Iterator
        Iterator<Integer> it = listaNum.iterator();
        while(it.hasNext()){
            int aux = it.next();
            System.out.println(aux);
            //también System.out.println(it.next());
        }
    }
    public void ordenar(){
      Collections.sort(listaNum);
    }
    
    
}