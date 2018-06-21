
package Armas;

public class Armas {
    
    private String tipo = "";
    private int resistencia = 0;
    private float valorAtaque; 

    public String getTipo() {
        return tipo;
    }

    public int getResistencia() {
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
    
     public void setValorAtaque(float valorAtaque) {
        this.valorAtaque = valorAtaque;
    }

}
