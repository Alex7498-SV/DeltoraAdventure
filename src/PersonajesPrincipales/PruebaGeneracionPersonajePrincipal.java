/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersonajesPrincipales;

import java.util.Scanner;
/**
 *
 * @author Alex
 */
public class PruebaGeneracionPersonajePrincipal {
    private static PruebaGeneracionPersonajePrincipal pruebaGeneracionPersonajePrincipal;
    
    public static PruebaGeneracionPersonajePrincipal getInstance(){
        if (pruebaGeneracionPersonajePrincipal == null){
            pruebaGeneracionPersonajePrincipal = new PruebaGeneracionPersonajePrincipal();
        }
        return pruebaGeneracionPersonajePrincipal;
    }
    
    public void GenerarPersonaje(){
        int numero;
        
        Scanner Tipo = new Scanner(System.in);
        System.out.println("Ingrese el numero, segun el personaje principal que desea crear.");
        System.out.println("Ingrese 1 para crear a Nathan, ingrese 2 para crear a Veneficus");
    
        numero = Tipo.nextInt();
        
        SeleccionarPersonaje hacerPersonaje;
        hacerPersonaje = SeleccionarPersonaje.getInstance();
        hacerPersonaje.elegirPersonaje(numero);
        
    }
}
