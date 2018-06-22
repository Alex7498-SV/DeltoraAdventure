/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersonajesPrincipales;

/**
 *
 * @author Alex
 */
public class MaestroVeneficus implements Maestro{
    private PersonajePrincipal personajePrincipal;
    
    public MaestroVeneficus (){
        this.personajePrincipal = new PersonajePrincipal();
    }

    @Override
    public void darNombre() {
        personajePrincipal.setNombre("Veneficus");
    }

    @Override
    public void darTipo() {
        personajePrincipal.setTipo("Magico");
    }

    @Override
    public void darNivel() {
        personajePrincipal.setNivel(0);
    }

    @Override
    public void darPuntosExperiencia() {
        personajePrincipal.setNivel(0);
    }

    @Override
    public void darVida() {
        personajePrincipal.setVida(75);
    }

    @Override
    public void darAtaque() {
        personajePrincipal.setAtaque(75);
    }

    @Override
    public PersonajePrincipal getPersonajePrincipal() {
        return this.personajePrincipal;
    }
    
}
