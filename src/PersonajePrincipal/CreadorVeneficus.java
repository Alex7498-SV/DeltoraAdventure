/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersonajePrincipal;

/**
 *
 * @author uca
 */
public class CreadorVeneficus {
    private MaestroVeneficus maestroVeneficus;
    
    public CreadorVeneficus(MaestroVeneficus maestroVeneficus){
        this.maestroVeneficus = maestroVeneficus;
    }
    
    public void crearVeneficus(){
        this.maestroVeneficus.darNombre();
        this.maestroVeneficus.darTipo();
        this.maestroVeneficus.darNivel();
        this.maestroVeneficus.darVida();
        this.maestroVeneficus.darAtaque();
    }
    
    public Veneficus getVeneficus(){
        return this.maestroVeneficus.getVeneficus();
    }
}
