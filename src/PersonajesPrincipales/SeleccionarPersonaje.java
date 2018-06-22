/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersonajesPrincipales;

import java.util.Scanner;

/**
 *
 * @author uca
 */
public class SeleccionarPersonaje {
    private static SeleccionarPersonaje SeleccionarPersonaje;
    
    public static SeleccionarPersonaje getInstance(){
        if (SeleccionarPersonaje == null){
            SeleccionarPersonaje = new SeleccionarPersonaje();
        }
        return SeleccionarPersonaje;
    }
    
    public void elegirPersonaje(){
        Scanner nuevoPersonaje = new Scanner(System.in);
        int personajeSeleccionado = 0;
        
        while (personajeSeleccionado == 0){
            
            personajeSeleccionado = nuevoPersonaje.nextInt();
            switch (personajeSeleccionado){
                case 1:
                    MaestroVeneficus entrenadorVeneficus = new MaestroVeneficus();
                    Creador creadorVeneficus =  new Creador(entrenadorVeneficus);
                    creadorVeneficus.crearPersonaje();
                    PersonajePrincipal Veneficus =  creadorVeneficus.getPersonajePrincipal();

                    System.out.println(Veneficus.toString());
                    break;
                case 2:
                    MaestroNathan entrenadorNathan = new MaestroNathan();
                    Creador creadorNathan =  new Creador(entrenadorNathan);
                    creadorNathan.crearPersonaje();
                    PersonajePrincipal Nathan =  creadorNathan.getPersonajePrincipal();

                    System.out.println(Nathan.toString());
                    break;
                default:
                    System.out.println("Seleccion invalida, usted selecciono el numero "+ personajeSeleccionado+".");
                    System.out.println("Seleccione una opcion entre 1 y 2.");
                    personajeSeleccionado = 0;
            }
        }
    }
}
