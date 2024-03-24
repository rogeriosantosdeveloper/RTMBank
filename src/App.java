import entities.Account;

public class App {
    public static void main(String[] args){
        Account account = new Account(123, "Rogerio", "Teste", 1200);

        System.out.println(account);
    }
}
