
package General;

import Armas.Armas;
import Pociones.Pociones;
import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {

    Scanner scn =  new Scanner(System.in);
    private String username; 
    int score;
    boolean flag;
    int vida = 100;
    int ataque = 0;
    public static ArrayList <Armas> inventarioArmas = new ArrayList <Armas>();
    public static ArrayList<Pociones> inventarioPociones = new ArrayList <Pociones>();


    public Usuario(){} 
    
    public void agregarArma(Armas ar){
        inventarioArmas.add(ar);
    }
    
    public void agregarPocion(Pociones poci){
        inventarioPociones.add(poci);
    }
    
    public void  usarArma(Armas ar){
        setVida(0);
        inventarioArmas.forEach(arma->{
            if (arma.getTipo().equals(ar.getTipo())){
                setAtaque((int) (getAtaque()+ arma.getValorAtaque()));
            }
        });
    }

    public void usarPocion(Pociones poci){
        
    }
    
    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    
    
    public Usuario(String username, int score) {
        this.username = username;
        this.score = score;
    }

    public String getUsername() {
        return username;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    
    public void mostrar(){
        Usuario usu = new Usuario();
        System.out.println("Username: " + usu.getUsername() + " || Score: " + usu.getScore());
    }
    


    public String getNombre() {
        return this.username;
    }
    
    public void pedirNombre(){
        while(flag){
            //nombre = scn.nextLine();
            if(setNombre(scn.nextLine())){
                flag = false;
            }else{
                System.out.println("Nombre invalido, intenta de nuevo");

            }
        }
    }

    public boolean setNombre(String nombre) {
        if(Validar(nombre)){
            this.username = nombre;
            return true;
        } else {
            return false;
        }
    }
    
    public boolean Validar(String username){
        char usrname;
        if (username.length()>2 && username.length()<13){
            for (int i = 0; i<username.length(); i++){
                usrname = username.charAt(i);
                if(!(Character.isAlphabetic(usrname) || Character.isDigit(usrname))){
                    return false;
                }
            }
        } else {
            return false;
        }
        
        return true;
    }
    
}
