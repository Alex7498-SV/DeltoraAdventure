/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilosdenemigos;

import GUI.VentanaInventarioMago;
import GUI.VentanaPeleaGuerreroEnemigo;
import static java.lang.Thread.sleep;
import static java.lang.Thread.yield;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author DGuardado <david.guardado at guardado.org>
 */
public class HiloAEspartano7 extends Thread {
    private String nombre;
    private int limite;
    private JLabel enemigo;
    private JLabel yo;
    private int speed = 25;
    private boolean enemigo7 = true;
    private int x;
    private int y;
    private boolean flag = true;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public JLabel getEnemigo() {
        return enemigo;
    }

    public void setEnemigo(JLabel enemigo) {
        this.enemigo = enemigo;
    }

    public JLabel getYo() {
        return yo;
    }

    public void setYo(JLabel yo) {
        this.yo = yo;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isEnemigo6() {
        return enemigo7;
    }

    public void setEnemigo6(boolean enemigo7) {
        this.enemigo7 = enemigo7;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
    public HiloAEspartano7(String nombre, int limite, JLabel enemigo, JLabel yo, int x, int y) {
        this.nombre = nombre;
        this.limite = limite;
        this.enemigo = enemigo;
        this.x = x;
        this.y = y;
        this.yo = yo;
    }
     
    
    @Override
    public void run() {
        boolean flag= true;
    
    while (enemigo7){
            for (int i = y; i <= this.limite; i += 1) {
                this.enemigo.setLocation(x, i);
                float v = (float) Math.sqrt(Math.pow(yo.getX() - enemigo.getX(), 2) + Math.pow(yo.getY() - enemigo.getY(), 2));
                if (v <= 50) {
                    flag = false;
                    break;
                }
                
                try {
                    if (this.nombre.equals("enemigo7")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesEspartano/enemigoNathanF.png")));
                        sleep(speed);
                    }
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                }
            
            if (!flag) {
                enemigo7 = false;
                enemigo.setVisible(false);
                new VentanaPeleaGuerreroEnemigo().setVisible(true);
                System.out.println(enemigo.getX());
                System.out.println(enemigo.getY());

                // Seguir();
                break;
            }
            yield();
            
            for (int i = this.limite; i >= y; i -= 1) {
                this.enemigo.setLocation(x, i);
                float v = (float) Math.sqrt(Math.pow(yo.getX() - enemigo.getX(), 2) + Math.pow(yo.getY() - enemigo.getY(), 2));
                if (v <= 50) {
                    flag = false;
                    break;
                }
                try {
                    if (this.nombre.equals("enemigo7")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesEspartano/enemigoNathanT.png")));
                        sleep(speed);
                    }
                }catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
            if (!flag) {
                // Seguir();
                enemigo7 = false;
                enemigo.setVisible(false);
                new VentanaPeleaGuerreroEnemigo().setVisible(true);
                System.out.println(enemigo.getX());
                System.out.println(enemigo.getY());
                break;
            }
            yield();
        }
}}