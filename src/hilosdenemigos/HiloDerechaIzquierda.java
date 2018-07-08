/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilosdenemigos;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author UCA
 */
public class HiloDerechaIzquierda extends Thread {
      private String nombre;
      private int limite;
    private JLabel enemigo;
    private int x;
    private int y;
    
    public HiloDerechaIzquierda(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public HiloDerechaIzquierda(String nombre, int limite, JLabel enemigo, int x, int y){
    this.nombre= nombre;
    this.limite= limite;
    this.enemigo= enemigo;
    this.x=x;
    this.y=y;
    }
     @Override 
     public void run(){
         while(true){
             for(int i=x; i<= this.limite; i+=1){
                 this.enemigo.setLocation(i, y);
                 try {
                     if (this.nombre.equals("Mago8")) {
                          this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesMago/enemigoVeneficusD.png")));
                         sleep(250);
                     } 
                     else if (this.nombre.equals("Mago0")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesMago/enemigoVeneficusD.png")));
                        sleep(250);
                    } else if (this.nombre.equals("Mago1")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesMago/enemigoVeneficusD.png")));
                        sleep(250);
                    } else if (this.nombre.equals("Mago2")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesMago/enemigoVeneficusD.png")));
                        sleep(250);
                    } else if (this.nombre.equals("Mago3")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesMago/enemigoVeneficusD.png")));
                        sleep(250);
                    } else if (this.nombre.equals("Mago4")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesMago/enemigoVeneficusD.png")));
                        sleep(250);
                    } else if (this.nombre.equals("Mago5")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesMago/enemigoVeneficusD.png")));
                        sleep(250);
                    } else if (this.nombre.equals("Mago6")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesMago/enemigoVeneficusD.png")));
                        sleep(250);
                    } else if (this.nombre.equals("Mago7")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesMago/enemigoVeneficusD.png")));
                        sleep(250);
                    } else if (this.nombre.equals("enemigo0")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesEspartano/enemigoNathanD.png")));
                        sleep(250);
                    } else if (this.nombre.equals("enemigo1")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesEspartano/enemigoNathanD.png")));
                        sleep(250);
                    } else if (this.nombre.equals("enemigo2")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesEspartano/enemigoNathanD.png")));
                        sleep(250);
                    } else if (this.nombre.equals("enemigo3")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesEspartano/enemigoNathanD.png")));
                        sleep(250);
                    } else if (this.nombre.equals("enemigo4")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesEspartano/enemigoNathanD.png")));
                        sleep(250);
                    } else if (this.nombre.equals("enemigo5")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesEspartano/enemigoNathanD.png")));
                        sleep(250);
                    } else if (this.nombre.equals("enemigo6")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesEspartano/enemigoNathanD.png")));
                        sleep(250);
                    } else if (this.nombre.equals("enemigo7")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesEspartano/enemigoNathanD.png")));
                        sleep(250);
                    } else if (this.nombre.equals("enemigo8")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesEspartano/enemigoNathanD.png")));
                        sleep(250);
                    } else if (this.nombre.equals("enemigo9")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesEspartano/enemigoNathanD.png")));
                        sleep(250);
                    } else if (this.nombre.equals("enemigo10")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesEspartano/enemigoNathanD.png")));
                        sleep(250);
                    } else if (this.nombre.equals("enemigo11")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesEspartano/BossNathanD.png")));
                        sleep(50);
                    } else {
                        // this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesMago/enemigoVeneficusF.png")));
                        sleep(250);
                    }
                   
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
             }
            for(int i=this.limite; i>= x; i-=1){
                this.enemigo.setLocation(i, y);
                try{
                     if (this.nombre.equals("Mago8")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesMago/BossVeneficusI.png")));
                        sleep(250);}
                        else if (this.nombre.equals("Mago0")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesMago/enemigoVeneficusI.png")));
                        sleep(250);}
                     else if (this.nombre.equals("Mago1")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesMago/enemigoVeneficusI.png")));
                        sleep(250);}
                      else if (this.nombre.equals("Mago2")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesMago/enemigoVeneficusI.png")));
                        sleep(250);}
                       else if (this.nombre.equals("Mago3")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesMago/enemigoVeneficusI.png")));
                        sleep(250);}
                        else if (this.nombre.equals("Mago4")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesMago/enemigoVeneficusI.png")));
                        sleep(250);}
                         else if (this.nombre.equals("Mago5")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesMago/enemigoVeneficusI.png")));
                        sleep(250);}
                          else if (this.nombre.equals("Mago6")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesMago/enemigoVeneficusI.png")));
                        sleep(250);}
                           else if (this.nombre.equals("Mago7")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesMago/enemigoVeneficusI.png")));
                        sleep(250);}
                     else if (this.nombre.equals("enemigo0")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesEspartano/enemigoNathanI.png")));
                        sleep(250);
                    } else if (this.nombre.equals("enemigo1")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesEspartano/enemigoNathanI.png")));
                        sleep(250);
                    } else if (this.nombre.equals("enemigo2")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesEspartano/enemigoNathanI.png")));
                        sleep(250);
                    } else if (this.nombre.equals("enemigo3")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesEspartano/enemigoNathanI.png")));
                        sleep(250);
                    } else if (this.nombre.equals("enemigo4")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesEspartano/enemigoNathanI.png")));
                        sleep(250);
                    } else if (this.nombre.equals("enemigo5")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesEspartano/enemigoNathanI.png")));
                        sleep(250);
                    } else if (this.nombre.equals("enemigo6")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesEspartano/enemigoNathanI.png")));
                        sleep(250);
                    } else if (this.nombre.equals("enemigo7")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesEspartano/enemigoNathanI.png")));
                        sleep(250);
                    } else if (this.nombre.equals("enemigo8")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesEspartano/enemigoNathanI.png")));
                        sleep(250);
                    } else if (this.nombre.equals("enemigo9")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesEspartano/enemigoNathanI.png")));
                        sleep(250);
                    } else if (this.nombre.equals("enemigo10")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesEspartano/enemigoNathanI.png")));
                        sleep(250);
                    } else if (this.nombre.equals("enemigo11")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesEspartano/BossNathanI.png")));
                        sleep(50);
                    } else {
                        //this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesMago/enemigoVeneficusT.png")));
                        sleep(250);
                    }

                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
