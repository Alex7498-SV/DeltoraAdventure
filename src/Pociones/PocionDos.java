/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pociones;

import Personajes.Personaje;

/**
 *
 * @author HugoJr. <Hugo Rivera at 00161417@uca.edu.sv>
 */
public class PocionDos extends PocionesBuilder{

    Personaje personajePrincipal =  new Personaje();
    
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
    
    public void pocionMisteriosa(){
        numeroAleatorio();
        if(suma == true){
            sumarVida();
            //System.out.println(personajePrincipal.getVida()+sumarVida);
            //System.out.println("Se ha sumado "+sumarVida+" a la vida del jugador");
            //System.out.println(personajePrincipal.getVida());
        } else {
            restarVida();
            //System.out.println(personajePrincipal.getVida()-restarVida);
            //System.out.println("Se ha restado "+restarVida+" a la vida del jugador");
            //System.out.println(personajePrincipal.getVida());
        }
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
    
    public void restarVida(){

        Personaje p = new Personaje();
        
        System.out.println(p.getVida());
        System.out.println("se ha restado "+restarVida+" a la vida del personaje"+p.getNombre());
        p.setVida(p.getVida()-restarVida);
        System.out.println("La nueva vida es "+p.getVida());
    }

    @Override
    public void sumarVida() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sumarDanio() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sumarFullVida() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
