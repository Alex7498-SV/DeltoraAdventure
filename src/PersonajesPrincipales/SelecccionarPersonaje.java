/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersonajesPrincipales;



/**
 *
 * @author uca
 */
public class SelecccionarPersonaje {
    private int PersonajeSeleccionado;
    
    public void elegirPersonaje(int personajeSeleccionado){
        this.PersonajeSeleccionado = personajeSeleccionado;
        
        switch (PersonajeSeleccionado){
            case 1:
                MaestroNathan entrenadorNathan = new MaestroNathan();
                Creador creadorNathan =  new Creador(entrenadorNathan);
                creadorNathan.crearPersonaje();
                PersonajePrincipal Nathan =  creadorNathan.getPersonajePrincipal();
                break;
            case 2:
                MaestroVeneficus entrenadorVeneficus = new MaestroVeneficus();
                Creador creadorVeneficus =  new Creador(entrenadorVeneficus);
                creadorVeneficus.crearPersonaje();
                PersonajePrincipal Veneficus =  creadorVeneficus.getPersonajePrincipal();
                break;
        }
    }
    
}
