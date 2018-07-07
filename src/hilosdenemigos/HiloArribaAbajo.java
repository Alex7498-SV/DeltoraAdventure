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
public class HiloArribaAbajo extends Thread {

    private String nombre;
    private int limite;
    private JLabel enemigo;
    private int x;
    private int y;

    public HiloArribaAbajo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HiloArribaAbajo(String nombre, int limite, JLabel enemigo, int x, int y) {
        this.nombre = nombre;
        this.limite = limite;
        this.enemigo = enemigo;
        this.x = x;
        this.y = y;
    }

    @Override
    public void run() {
        while (true) {
            for (int i = y; i <= this.limite; i += 15) {
                this.enemigo.setLocation(x, i);
                try {
                    if (this.nombre.equals("Mago8")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesMago/BossVeneficusF.png")));
                        sleep(250);
                    } else if (this.nombre.equals("Mago0")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesMago/enemigoVeneficusF.png")));
                        sleep(250);
                    } else if (this.nombre.equals("Mago1")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesMago/enemigoVeneficusF.png")));
                        sleep(250);
                    } else if (this.nombre.equals("Mago2")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesMago/enemigoVeneficusF.png")));
                        sleep(250);
                    } else if (this.nombre.equals("Mago3")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesMago/enemigoVeneficusF.png")));
                        sleep(250);
                    } else if (this.nombre.equals("Mago4")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesMago/enemigoVeneficusF.png")));
                        sleep(250);
                    } else if (this.nombre.equals("Mago5")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesMago/enemigoVeneficusF.png")));
                        sleep(250);
                    } else if (this.nombre.equals("Mago6")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesMago/enemigoVeneficusF.png")));
                        sleep(250);
                    } else if (this.nombre.equals("Mago7")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesMago/enemigoVeneficusF.png")));
                        sleep(250);
                    } else if (this.nombre.equals("enemigo0")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesEspartano/enemigoNathanF.png")));
                        sleep(250);
                    } else if (this.nombre.equals("enemigo1")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesEspartano/enemigoNathanF.png")));
                        sleep(250);
                    } else if (this.nombre.equals("enemigo2")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesEspartano/enemigoNathanF.png")));
                        sleep(250);
                    } else if (this.nombre.equals("enemigo3")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesEspartano/enemigoNathanF.png")));
                        sleep(250);
                    } else if (this.nombre.equals("enemigo4")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesEspartano/enemigoNathanF.png")));
                        sleep(250);
                    } else if (this.nombre.equals("enemigo5")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesEspartano/enemigoNathanF.png")));
                        sleep(250);
                    } else if (this.nombre.equals("enemigo6")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesEspartano/enemigoNathanF.png")));
                        sleep(250);
                    } else if (this.nombre.equals("enemigo7")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesEspartano/enemigoNathanF.png")));
                        sleep(250);
                    } else if (this.nombre.equals("enemigo8")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesEspartano/enemigoNathanF.png")));
                        sleep(250);
                    } else if (this.nombre.equals("enemigo9")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesEspartano/enemigoNathanF.png")));
                        sleep(250);
                    } else if (this.nombre.equals("enemigo10")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesEspartano/enemigoNathanF.png")));
                        sleep(250);
                    } else if (this.nombre.equals("enemigo11")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesEspartano/BossNathanF.png")));
                        sleep(250);
                    } else {
                        // this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesMago/enemigoVeneficusF.png")));
                        sleep(250);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            for (int i = this.limite; i >= y; i -= 15) {
                this.enemigo.setLocation(x, i);
                try {
                    if (this.nombre.equals("Mago8")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesMago/BossVeneficusT.png")));
                        sleep(250);}
                        else if (this.nombre.equals("Mago0")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesMago/enemigoVeneficusT.png")));
                        sleep(250);}
                     else if (this.nombre.equals("Mago1")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesMago/enemigoVeneficusT.png")));
                        sleep(250);}
                      else if (this.nombre.equals("Mago2")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesMago/enemigoVeneficusT.png")));
                        sleep(250);}
                       else if (this.nombre.equals("Mago3")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesMago/enemigoVeneficusT.png")));
                        sleep(250);}
                        else if (this.nombre.equals("Mago4")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesMago/enemigoVeneficusT.png")));
                        sleep(250);}
                         else if (this.nombre.equals("Mago5")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesMago/enemigoVeneficusT.png")));
                        sleep(250);}
                          else if (this.nombre.equals("Mago6")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesMago/enemigoVeneficusT.png")));
                        sleep(250);}
                           else if (this.nombre.equals("Mago7")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesMago/enemigoVeneficusT.png")));
                        sleep(250);}
                     else if (this.nombre.equals("enemigo0")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesEspartano/enemigoNathanT.png")));
                        sleep(250);
                    } else if (this.nombre.equals("enemigo1")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesEspartano/enemigoNathanT.png")));
                        sleep(250);
                    } else if (this.nombre.equals("enemigo2")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesEspartano/enemigoNathanT.png")));
                        sleep(250);
                    } else if (this.nombre.equals("enemigo3")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesEspartano/enemigoNathanT.png")));
                        sleep(250);
                    } else if (this.nombre.equals("enemigo4")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesEspartano/enemigoNathanT.png")));
                        sleep(250);
                    } else if (this.nombre.equals("enemigo5")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesEspartano/enemigoNathanT.png")));
                        sleep(250);
                    } else if (this.nombre.equals("enemigo6")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesEspartano/enemigoNathanT.png")));
                        sleep(250);
                    } else if (this.nombre.equals("enemigo7")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesEspartano/enemigoNathanT.png")));
                        sleep(250);
                    } else if (this.nombre.equals("enemigo8")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesEspartano/enemigoNathanT.png")));
                        sleep(250);
                    } else if (this.nombre.equals("enemigo9")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesEspartano/enemigoNathanT.png")));
                        sleep(250);
                    } else if (this.nombre.equals("enemigo10")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesEspartano/enemigoNathanT.png")));
                        sleep(250);
                    } else if (this.nombre.equals("enemigo11")) {
                        this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesEspartano/BossNathanT.png")));
                        sleep(250);
                    } else {
                        //this.enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesMago/enemigoVeneficusT.png")));
                        sleep(250);
                    }

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
