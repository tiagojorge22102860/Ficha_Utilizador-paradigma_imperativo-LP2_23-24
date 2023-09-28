public class Utilizador {
    String primeiroNome;
    String ultimoNome;
    String email;
    String username;
    String password;

    public Utilizador() {
    }

    public Utilizador(String password, String username) {
       this.password=password;
        this.username = username;
    }

    public Utilizador(String email, String username, String password) {
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public Utilizador(String primeiroNome, String ultimoNome, String email, String username, String password) {
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
        this.email = email;
        this.username = username;
        this.password = password;
    }
}

