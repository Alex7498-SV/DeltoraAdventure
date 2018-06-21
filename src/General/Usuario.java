
package General;


public class Usuario {
    
    private String username, score;

    public Usuario() {
    }
    
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
}
