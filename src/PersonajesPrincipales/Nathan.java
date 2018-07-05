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
public class Nathan extends PersonajePrincipalBuilder{

    public Nathan(){
        super.personajePrincipal = new PersonajePrincipal();
    }
    
    @Override
    public void BuildVida(int vida) {
        personajePrincipal.setVida(vida);
    }

    @Override
    public void BuildAtaque(int ataque) {
        personajePrincipal.setAtaque(ataque);
    }

    @Override
    public void BuildNivel(int nivel) {
        personajePrincipal.setNivel(nivel);
    }

    @Override
    public void BuildPuntosExperiencia(int puntosExperiencia) {
        personajePrincipal.setPuntosExperiencia(puntosExperiencia);
    }

    @Override
    public void BuildNombre(String nombre) {
        personajePrincipal.setNombre(nombre);
    }

    @Override
    public void BuildTipo(String tipo) {
        personajePrincipal.setTipo(tipo);
    }

    ///////////////////////////////// MODIFICAR VALORES ///////////////////////////
    
    @Override
    public void aumentarVida(int suma) {
        personajePrincipal.setVida((int) (personajePrincipal.getVida() + suma));
    }

    @Override
    public void restarVida(int resta) {
        personajePrincipal.setVida((int) (personajePrincipal.getVida() - resta));
    }

    @Override
    public void aumentarAtaque(int sumaAtaque) {
        personajePrincipal.setAtaque((int) (personajePrincipal.getAtaque() + sumaAtaque));
    }
    
    /////////////////////////// REGRESO ///////////////
}
