/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * Clase principal de la aplicacion
 * @author moyOl
 */
public class Pizzeria {
    
    /**
     * Metodo main
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        /* String para guardar lo insertado por el usuario*/
        String string = "";
        // do-while para ciclar hasta que el usuario introduzca la palabra "exit"
        do{
            /*
            * Bandera para indicar el procesamiento de alguna orden
            * Leer los datos del usuario para guardar la orden
            */
            Boolean orden = false;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("¿De que quieres tu pízza?: ");
            string = br.readLine().toLowerCase();
            // ¿Salir de la aplicacion?
            if(string.contains("exit"))
                break;
            // Inicializar la construccion de la Pizza
            Pizza pizza = null;
            // Comparaciones para indicar el tipo de pizza a procesar
            // Abarcar una amplia variedad de instrucciones como la misma pizza
            if(string.contains("hawai")){
                pizza = new PizzaHawaiana();
                orden = true;
            }else if(string.contains("mexic")){
                pizza = new PizzaMexicana();
                orden = true;
            }else if(string.contains("chicago")){
                pizza = new PizzaChicago();
                orden = true;
            }else if(string.contains("clas")){
                pizza = new PizzaClasica();
                orden = true;
            }
            //Preparar la pizza en caso valido
            if(orden)
                pizza.preparaPizza();
        // do-while para ciclar hasta que el usuario introduzca la palabra "exit"
        }while(string!="exit");
    }    
}
