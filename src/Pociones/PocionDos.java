/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pociones;

import PersonajesPrincipales.PersonajePrincipal;

/**
 *
 * @author HugoJr. <Hugo Rivera at 00161417@uca.edu.sv>
 */
public class PocionDos extends PocionesBuilder{

    PersonajesPrincipales.PersonajePrincipal personajePrincipal =  new PersonajePrincipal();
    
    public int sumarVida = 100 ;
    public int restarVida = 50;
    public boolean suma = true;
    
    public PocionDos() {
        super.pociones = new Pociones();
    }

    @Override
    public void buildTipo() {
        pociones.setTipo("Pocion Dos suma o resta vida?");
    }
    
    public boolean numeroAleatorio(){
        int aleatorio = (int)(Math.random()*100)+1;
        
        if (aleatorio % 2 == 0){
            suma = true;
        } 
        else{
            suma = false;
        }
        return suma;
    }
    
//    public void pocionMisteriosa(){
//        numeroAleatorio();
//        if (suma == true){
//            System.out.println("Se ha sumado " + sumarVida + " a la vida del jugador");
//            personajePrincipal.sumarVida(sumarVida);
//        }
//        else{
//            System.out.println("Se ha restado " + sumarVida + " a la vida del jugador");
//            personajePrincipal.restarVida(restarVida);
//        }
//    }
}
