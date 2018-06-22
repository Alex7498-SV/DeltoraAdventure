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
public class MaestroNathan implements Maestro{
    private PersonajePrincipal personajePrincipal;
    
    public MaestroNathan (){
        this.personajePrincipal = new PersonajePrincipal();
    }

    @Override
    public void darNombre() {
        personajePrincipal.setNombre("Nathan");
    }

    @Override
    public void darTipo() {
        personajePrincipal.setTipo("Fisico");
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
        personajePrincipal.setVida(100);
    }

    @Override
    public void darAtaque() {
        personajePrincipal.setAtaque(25);
    }

    @Override
    public PersonajePrincipal getPersonajePrincipal() {
        return this.personajePrincipal;
    }
    
}
