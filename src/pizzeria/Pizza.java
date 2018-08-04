/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;

import static java.lang.Thread.sleep;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author moyOl
 */
public class Pizza {
    /*
    * Pasos e ingredientes en clase Pizza
    */
    List<String> pasos = Arrays.asList("En Pedido", "En Armado", "En Horno", "En empacado", "Entregada al cliente");
    List<String> ingredientes = Arrays.asList("ING1", "ING2", "ING3", "ING4");
    // Metodo de preparacion de la pizza
    public void preparaPizza(){
        // Recorre e imprime los pasos en la elaboracion de la pizza  
        pasos.forEach(item->{
            System.out.println(item);
            if("En Armado".equals(item)){
                System.out.println(ingredientes);
            };
            randomWait();
        });
    }
    //Sleep entre pasos de preparacion
    public void randomWait(){
        try {
            sleep(1500);
        } catch (InterruptedException ex) {
            Logger.getLogger(Pizza.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
