
package Armas;

public class Armas {
    
    private String tipo = "";
    private int resistencia = 50;
    private int valorAtaque = 50; 

    public String getTipo() {
        return tipo;
    }

    public float getResistencia() {
        return resistencia;
    }

    public float getValorAtaque() {
        return valorAtaque;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }
    
     public void setValorAtaque(int valorAtaque) {
        this.valorAtaque = valorAtaque;
    }

}