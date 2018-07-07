/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilosdenemigos;

import javax.swing.JLabel;

/**
 *
 * @author UCA
 */
public class HiloArribaAbajo extends Thread {
     private String nombre;
      private int limite;
    private JLabel enemigo;
    private int x;
    private int y;
    
    public HiloArribaAbajo(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public HiloArribaAbajo(String nombre, int limite, JLabel enemigo, int x, int y){
    this.nombre= nombre;
    this.limite= limite;
    this.enemigo= enemigo;
    this.x=x;
    this.y=y;
    }
     @Override 
     public void run(){
         while(true){
             for(int i=y; i<= this.limite; i+=15){
                 this.enemigo.setLocation(x, i);
                 try {
                     if (this.nombre.equals("boss")) {
                         sleep(100);
                     } else {
                         sleep(250);
                     }

                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
             }
            for(int i=this.limite; i>= y; i-=15){
                this.enemigo.setLocation(x, i);
                try{
                    if(this.nombre.equals("boss")){
                        sleep(100);
                    }
                    else{
                        sleep(250);
                    }

                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
