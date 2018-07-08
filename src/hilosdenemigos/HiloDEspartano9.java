package hilosdenemigos;

import GUI.VentanaInventarioMago;
import static java.lang.Thread.sleep;
import static java.lang.Thread.yield;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class HiloDEspartano9 extends Thread {

    private String nombre;
    private JLabel yo;
    private boolean flag = true;
    private int limite;
    private JLabel enemigo;
    private int speed = 25;
    private int x;
    private int y;
    private boolean enemigo9 = true;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public JLabel getYo() {
        return yo;
    }

    public void setYo(JLabel yo) {
        this.yo = yo;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
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

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
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

    public boolean isEnemigo3() {
        return enemigo9;
    }

    public void setEnemigo3(boolean enemigo9) {
        this.enemigo9 = enemigo9;
    }

    public HiloDEspartano9(String nombre, int limite, JLabel enemigo , JLabel yo , int x, int y ) {
        this.nombre = nombre;
        this.limite = limite;
        this.enemigo = enemigo;
        this.x = x;
        this.y = y;
        this.yo = yo;
    }

    @Override
    public void run() {
        while (enemigo9) {
            for (int i = x; i <= this.limite; i += 1) {
                this.enemigo.setLocation(i, y);
                float v = (float) Math.sqrt(Math.pow(yo.getX() - enemigo.getX(), 2) + Math.pow(yo.getY() - enemigo.getY(), 2));
                if (v <= 50) {
                    flag = false;
                    break;
                }
                try {
                    if (this.nombre.equals("enemigo9")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesEspartano/enemigoNathanD.png")));
                        sleep(speed);
                    }
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }

            if (!flag) {
                enemigo9 = false;
                enemigo.setVisible(false);
                new VentanaInventarioMago().setVisible(true);
                System.out.println(enemigo.getX());
                System.out.println(enemigo.getY());

                // Seguir();
                break;
            }
            yield();

            for (int i = this.limite; i >= x; i -= 1) {
                this.enemigo.setLocation(i, y);
                float v = (float) Math.sqrt(Math.pow(yo.getX() - enemigo.getX(), 2) + Math.pow(yo.getY() - enemigo.getY(), 2));
                if (v <= 50) {
                    flag = false;
                    break;
                }
                try {
                    if (this.nombre.equals("enemigo9")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesEspartano/enemigoNathanI.png")));
                        sleep(speed);
                    }
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                if (!flag) {
                    // Seguir();
                    enemigo9 = false;
                    enemigo.setVisible(false);
                    new VentanaInventarioMago().setVisible(true);
                    System.out.println(enemigo.getX());
                    System.out.println(enemigo.getY());
                    break;
                }
                yield();
            }
        }
    }
}
