
package General;

import java.util.Scanner;

public class Usuario {
    
    Scanner scn =  new Scanner(System.in);
    private String username, score;
    boolean flag;

    public Usuario(){} 
    
    public Usuario(String username, String score) {
        this.username = username;
        this.score = score;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
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
        if (username.length()>2 && username.length()<12){
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
