/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilosdenemigos;

import GUI.VentanaInventarioMago;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author UCA
 */
public class HiloArribaAbajo extends Thread {

    private String nombre;
    private int limite;
    private JLabel enemigo;
    private int speed = 500;
    private JLabel yo;
    private boolean mago0 = true; 
    private boolean mago1 = true; 
    private boolean mago2 = true; 
    private boolean mago3 = true; 
    private boolean mago4 = true; 
    private boolean mago5 = true; 
    private boolean mago6 = true; 
    private boolean enemigo0 = true; 
    private boolean enemigo1 = true; 
    private boolean enemigo2 = true; 
    private boolean enemigo3 = true; 
    private boolean enemigo4 = true; 
    private boolean enemigo5 = true; 
    private boolean enemigo6 = true; 
     
    private int x;
    private int y;
    
    
    public boolean isMago0() {
        return mago0;
    }

    public void setMago0(boolean mago0) {
        this.mago0 = mago0;
    }

    public boolean isMago1() {
        return mago1;
    }

    public void setMago1(boolean mago1) {
        this.mago1 = mago1;
    }

    public boolean isMago2() {
        return mago2;
    }

    public void setMago2(boolean mago2) {
        this.mago2 = mago2;
    }

    public boolean isMago3() {
        return mago3;
    }

    public void setMago3(boolean mago3) {
        this.mago3 = mago3;
    }

    public boolean isMago4() {
        return mago4;
    }

    public void setMago4(boolean mago4) {
        this.mago4 = mago4;
    }

    public boolean isMago5() {
        return mago5;
    }

    public void setMago5(boolean mago5) {
        this.mago5 = mago5;
    }

    public boolean isMago6() {
        return mago6;
    }

    public void setMago6(boolean mago6) {
        this.mago6 = mago6;
    }

    public boolean isEnemigo0() {
        return enemigo0;
    }

    public void setEnemigo0(boolean enemigo0) {
        this.enemigo0 = enemigo0;
    }

    public boolean isEnemigo1() {
        return enemigo1;
    }

    public void setEnemigo1(boolean enemigo1) {
        this.enemigo1 = enemigo1;
    }

    public boolean isEnemigo2() {
        return enemigo2;
    }

    public void setEnemigo2(boolean enemigo2) {
        this.enemigo2 = enemigo2;
    }

    public boolean isEnemigo3() {
        return enemigo3;
    }

    public void setEnemigo3(boolean enemigo3) {
        this.enemigo3 = enemigo3;
    }

    public boolean isEnemigo4() {
        return enemigo4;
    }

    public void setEnemigo4(boolean enemigo4) {
        this.enemigo4 = enemigo4;
    }

    public boolean isEnemigo5() {
        return enemigo5;
    }

    public void setEnemigo5(boolean enemigo5) {
        this.enemigo5 = enemigo5;
    }

    public boolean isEnemigo6() {
        return enemigo6;
    }

    public void setEnemigo6(boolean enemigo6) {
        this.enemigo6 = enemigo6;
    }
    
    
    
    public HiloArribaAbajo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HiloArribaAbajo(String nombre, int limite, JLabel enemigo, JLabel yo, int x, int y) {
        this.nombre = nombre;
        this.limite = limite;
        this.enemigo = enemigo;
        this.x = x;
        this.y = y;
this.yo= yo;    
}

    @Override
    public void run() {
        boolean flag= true;
//        Enemigo mago #0
//        while (mago0){
//            for (int i = y; i <= this.limite; i += 1) {
//                this.enemigo.setLocation(x, i);
//                try {
//                    if (this.nombre.equals("Mago0")) {
//                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesMago/BossVeneficusF.png")));
//                        sleep(speed);
//                    }
//                } catch (InterruptedException ex) {
//                        ex.printStackTrace();
//                    }
//                }
//            
//            for (int i = this.limite; i >= y; i -= 1) {
//                this.enemigo.setLocation(x, i);
//                try {
//                    if (this.nombre.equals("Mago0")) {
//                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesMago/BossVeneficusT.png")));
//                        sleep(speed);
//                    }
//                }catch (InterruptedException ex) {
//                    ex.printStackTrace();
//                }
//            }
//        }
//        Enemigo mago #1
                 while (mago0){
            for (int i = y; i <= this.limite; i += 1) {
                this.enemigo.setLocation(x, i);
                float v = (float) Math.sqrt(Math.pow(yo.getX()-enemigo.getX(), 2)+Math.pow(yo.getY()-enemigo.getY(), 2));
                if(v <= 50){
                    flag = false;
                    break;
                }
                try {
                    if (this.nombre.equals("Mago1")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesMago/BossVeneficusF.png")));
                        sleep(speed);
                    }
                } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
            if(!flag){
                mago0=false;
                enemigo.setVisible(false);
                new VentanaInventarioMago().setVisible(true);
                  System.out.println(enemigo.getX());
                  System.out.println(enemigo.getY());
                  
               // Seguir();
                break;}
            yield();
            
            for (int i = this.limite; i >= y; i -= 1) {
                this.enemigo.setLocation(x, i);
                float v = (float) Math.sqrt(Math.pow(yo.getX()-enemigo.getX(), 2)+Math.pow(yo.getY()-enemigo.getY(), 2));
                if(v <= 50){
                    flag = false;
                    break;
                }
                try {
                    if (this.nombre.equals("Mago1")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesMago/BossVeneficusT.png")));
                        sleep(speed);
                    }
                }catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
              if(!flag){
               // Seguir();
               mago0=false;
                enemigo.setVisible(false);
                new VentanaInventarioMago().setVisible(true);
                  System.out.println(enemigo.getX());
                  System.out.println(enemigo.getY());
                break;}
            yield();
        }
        //Enemigo mago #2
                while (mago2){
            for (int i = y; i <= this.limite; i += 1) {
                this.enemigo.setLocation(x, i);
                try {
                    if (this.nombre.equals("Mago2")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesMago/enemigoVeneficusF.png")));
                        sleep(speed);
                    }
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                }
            
            for (int i = this.limite; i >= y; i -= 1) {
                this.enemigo.setLocation(x, i);
                try {
                    if (this.nombre.equals("Mago2")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesMago/enemigoVeneficusT.png")));
                        sleep(speed);
                    }
                }catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }
        //Enemigo mago #3
                while (mago3){
            for (int i = y; i <= this.limite; i += 1) {
                this.enemigo.setLocation(x, i);
                
                try {
                    if (this.nombre.equals("Mago3")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesMago/enemigoVeneficusF.png")));
                        sleep(speed);
                    }
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                }
            
            for (int i = this.limite; i >= y; i -= 1) {
                this.enemigo.setLocation(x, i);
                try {
                    if (this.nombre.equals("Mago3")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesMago/enemigoVeneficusT.png")));
                        sleep(speed);
                    }
                }catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }
        //Enemigo mago #4
        while (mago4){
            for (int i = y; i <= this.limite; i += 1) {
                this.enemigo.setLocation(x, i);
                
                try {
                    if (this.nombre.equals("Mago4")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesMago/enemigoVeneficusF.png")));
                        sleep(speed);
                    }
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                }
            
            for (int i = this.limite; i >= y; i -= 1) {
                this.enemigo.setLocation(x, i);
                try {
                    if (this.nombre.equals("Mago4")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesMago/enemigoVeneficusT.png")));
                        sleep(speed);
                    }
                }catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }
        // Enemigo mago #5
                while (mago5){
            for (int i = y; i <= this.limite; i += 1) {
                this.enemigo.setLocation(x, i);
                
                try {
                    if (this.nombre.equals("Mago5")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesMago/enemigoVeneficusF.png")));
                        sleep(speed);
                    }
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                }
            
            for (int i = this.limite; i >= y; i -= 1) {
                this.enemigo.setLocation(x, i);
                try {
                    if (this.nombre.equals("Mago5")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesMago/enemigoVeneficusT.png")));
                        sleep(speed);
                    }
                }catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }
        //Enemigo mago #6
        while (mago6){
            for (int i = y; i <= this.limite; i += 1) {
                this.enemigo.setLocation(x, i);
                
                try {
                    if (this.nombre.equals("Mago6")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesMago/enemigoVeneficusF.png")));
                        sleep(speed);
                    }
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                }
            
            for (int i = this.limite; i >= y; i -= 1) {
                this.enemigo.setLocation(x, i);
                try {
                    if (this.nombre.equals("Mago6")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesMago/enemigoVeneficusT.png")));
                        sleep(speed);
                    }
                }catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }
                
        //Enemigo Guerrero #0
        while (enemigo0){
            for (int i = y; i <= this.limite; i += 1) {
                this.enemigo.setLocation(x, i); 
                
                try {
                    if (this.nombre.equals("enemigo0")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesEspartano/BossNathanF.png")));
                        sleep(speed);
                    }
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                }
            
            for (int i = this.limite; i >= y; i -= 1) {
                this.enemigo.setLocation(x, i);
                try {
                    if (this.nombre.equals("enemigo0")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesEspartano/BossNathanT.png")));
                        sleep(speed);
                    }
                }catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        
        }
        //Enemigo Guerrero #1
        while (enemigo1){
            for (int i = y; i <= this.limite; i += 1) {
                this.enemigo.setLocation(x, i);
                
                try {
                    if (this.nombre.equals("enemigo1")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesEspartano/BossNathanF.png")));
                        sleep(speed);
                    }
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                }
            
            for (int i = this.limite; i >= y; i -= 1) {
                this.enemigo.setLocation(x, i);
                try {
                    if (this.nombre.equals("enemigo1")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesEspartano/enemigoNathanT.png")));
                        sleep(speed);
                    }
                }catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }
        //Enemigo Guerrero #2
        while (enemigo2){
            for (int i = y; i <= this.limite; i += 1) {
                this.enemigo.setLocation(x, i);
                
                try {
                    if (this.nombre.equals("enemigo2")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesEspartano/enemigoNathanF.png")));
                        sleep(speed);
                    }
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                }
            
            for (int i = this.limite; i >= y; i -= 1) {
                this.enemigo.setLocation(x, i);
                try {
                    if (this.nombre.equals("enemigo2")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesEspartano/enemigoNathanT.png")));
                        sleep(speed);
                    }
                }catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }
        //Enemigo Guerrero #3
        while (enemigo3){
            for (int i = y; i <= this.limite; i += 1) {
                this.enemigo.setLocation(x, i);
                
                    try {
                        if (this.nombre.equals("enemigo3")) {
                            this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesEspartano/enemigoNathanF.png")));
                            sleep(speed);
                        }
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
            
            for (int i = this.limite; i >= y; i -= 1) {
                this.enemigo.setLocation(x, i);
                try {
                    if (this.nombre.equals("enemigo3")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesEspartano/enemigoNathanT.png")));
                        sleep(speed);
                    }
                }catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }
        //Enemigo Guerrero #4
        while (enemigo4){
            for (int i = y; i <= this.limite; i += 1) {
                this.enemigo.setLocation(x, i);
                
                    try {
                        if (this.nombre.equals("enemigo4")) {
                            this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesEspartano/enemigoNathanF.png")));
                            sleep(speed);
                        }
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
            
            for (int i = this.limite; i >= y; i -= 1) {
                this.enemigo.setLocation(x, i);
                try {
                    if (this.nombre.equals("enemigo4")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesEspartano/enemigoNathanT.png")));
                        sleep(speed);
                    }
                }catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }
        //Enemigo Guerrero #5
        while (enemigo5){
            for (int i = y; i <= this.limite; i += 1) {
                this.enemigo.setLocation(x, i);
                
                        
                try {
                    if (this.nombre.equals("enemigo5")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesEspartano/enemigoNathanF.png")));
                        sleep(speed);
                    }
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                }
            
            for (int i = this.limite; i >= y; i -= 1) {
                this.enemigo.setLocation(x, i);
                try {
                    if (this.nombre.equals("enemigo5")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesEspartano/enemigoNathanT.png")));
                        sleep(speed);
                    }
                }catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }
        //Enemigo Guerrero #6
        while (enemigo6){
            for (int i = y; i <= this.limite; i += 1) {
                this.enemigo.setLocation(x, i);
                
                try {
                    if (this.nombre.equals("enemigo6")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesEspartano/enemigoNathanF.png")));
                        sleep(speed);
                    }
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                }
            
            for (int i = this.limite; i >= y; i -= 1) {
                this.enemigo.setLocation(x, i);
                try {
                    if (this.nombre.equals("enemigo6")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesEspartano/enemigoNathanT.png")));
                        sleep(speed);
                    }
                }catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }}
        }
    }     

