import java.util.ArrayList;

public class Main {
    static ArrayList<Utilizador> utilizadoresDoSistema() {
        Utilizador user1 = new Utilizador("a", "a", "a", "a", "a");
        Utilizador user2 = new Utilizador("a", "a", "a");
        Utilizador user3 = new Utilizador("a", "a");
        Utilizador user4 = new Utilizador();
        ArrayList<Utilizador> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        return users;

    }

    static String imprimirUtilizador(Utilizador user) {
        return user.primeiroNome + " " + user.ultimoNome + " (" + user.email + " " + user.username + ")";
    }

    static boolean temEmail(Utilizador user) {
        if (user.email != null) {
            return true;
        }
        return false;
    }

    static boolean autenticar(Utilizador user, String pass) {
        if (user.password.equals(pass)) {
            return true;
        }
        return false;
    }

    static boolean utilizadorBloqueado(Utilizador user) {
        return false;
    }

    static boolean desbloquearUtilizador(Utilizador user) {
        return false;
    }

    static boolean emailExistente(ArrayList<Utilizador> emails, String mail) {
        for (Utilizador email : emails) {
            if (email.email.equals(mail)) {
                return true;
            }
        }
        return false;
    }

    static ArrayList<String> obterEmails(ArrayList<Utilizador> emails) {
        ArrayList<String> list = new ArrayList<>();
        for (Utilizador email : emails) {
            if (email.email != null) {
                list.add(email.email);
            }

        }
        return list;
    }

    static boolean temPasswordFraca(Utilizador user) {
        return true;
    }


    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}