/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilosdenemigos;

import GUI.VentanaInventarioMago;
import GUI.VentanaPeleaMagoBoss;
import GUI.VentanaPeleaMagoEnemigo;
import static java.lang.Thread.sleep;
import static java.lang.Thread.yield;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author DGuardado <david.guardado at guardado.org>
 */
public class HiloAMago8 extends Thread {

    private String nombre;
    private int limite;
    private JLabel enemigo;
    private JLabel yo;
    private int speed = 25;
    private boolean mago8 = true;
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

    public boolean isMago1() {
        return mago8;
    }

    public void setMago1(boolean mago1) {
        this.mago8 = mago1;
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

    public HiloAMago8(String nombre, int limite, JLabel enemigo, JLabel yo, int x, int y) {
        this.nombre = nombre;
        this.limite = limite;
        this.enemigo = enemigo;
        this.x = x;
        this.y = y;
        this.yo = yo;
    }

    @Override
    public void run() {
        while (mago8) {
            for (int i = y; i <= this.limite; i += 1) {
                this.enemigo.setLocation(x, i);
                float v = (float) Math.sqrt(Math.pow(yo.getX() - enemigo.getX(), 2) + Math.pow(yo.getY() - enemigo.getY(), 2));
                if (v <= 50) {
                    flag = false;
                    break;
                }
                try {
                    if (this.nombre.equals("Mago8")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesMago/BossVeneficusF.png")));
                        sleep(speed);
                    }
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
            if (!flag) {
                mago8 = false;
                enemigo.setVisible(false);
                new VentanaPeleaMagoBoss().setVisible(true);
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
                    if (this.nombre.equals("Mago8")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesMago/BossVeneficusT.png")));
                        sleep(speed);
                    }
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
            if (!flag) {
                // Seguir();
                mago8 = false;
                enemigo.setVisible(false);
             new VentanaPeleaMagoBoss().setVisible(true);
                System.out.println(enemigo.getX());
                System.out.println(enemigo.getY());
                break;
            }
            yield();
        }
    }

}
