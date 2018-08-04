/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author moyOl
 */
public class PizzaMexicana extends Pizza{
    List<String> ingredientes = Arrays.asList("Chile", "Chorizo", "Cebolla", "Masa Mexicana", "Queso Mexicano");
    
    public void preparaPizza(){
        super.pasos.forEach(item->{
            System.out.println(item);
            if("En Armado".equals(item)){
                System.out.println(ingredientes);
            };
            randomWait();
        });
    }
}
