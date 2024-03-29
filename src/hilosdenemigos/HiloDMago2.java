package hilosdenemigos;

import GUI.VentanaInventarioMago;
import GUI.VentanaPeleaMagoEnemigo;
import static java.lang.Thread.yield;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class HiloDMago2 extends Thread {

    private String nombre;
    private int limite;
    private JLabel enemigo;
    private JLabel yo;
    private int speed = 25;
    private int x;
    private int y;
    private boolean mago2 = true;
    private boolean flag= true;

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

    public boolean isMago2() {
        return mago2;
    }

    public void setMago2(boolean mago2) {
        this.mago2 = mago2;
    }

    public HiloDMago2(String nombre, int limite, JLabel enemigo, JLabel yo, int x, int y) {
        this.nombre = nombre;
        this.limite = limite;
        this.enemigo = enemigo;
        this.x = x;
        this.y = y;
        this.yo = yo;
    }

    @Override
    public void run() {
        while (mago2) {
            for (int i = x; i <= this.limite; i += 1) {
                this.enemigo.setLocation(i, y);
                float v = (float) Math.sqrt(Math.pow(yo.getX() - enemigo.getX(), 2) + Math.pow(yo.getY() - enemigo.getY(), 2));
                if (v <= 50) {
                    flag = false;
                    break;
                }
                try {
                    if (this.nombre.equals("Mago2")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesMago/enemigoVeneficusD.png")));
                        sleep(speed);
                    }
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
            if (!flag) {
                mago2 = false;
                enemigo.setVisible(false);
          new VentanaPeleaMagoEnemigo().setVisible(true);
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
                    if (this.nombre.equals("Mago2")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesMago/enemigoVeneficusI.png")));
                        sleep(speed);
                    }
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                if (!flag) {
                // Seguir();
                mago2 = false;
                enemigo.setVisible(false);
             new VentanaPeleaMagoEnemigo().setVisible(true);
                System.out.println(enemigo.getX());
                System.out.println(enemigo.getY());
                break;
            }
            yield();
            }
        }
    }
}
