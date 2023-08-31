package school.sptech;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        Login entrar = new Login();
        System.out.println("Logue-se para entrar no sistema");
        String user;
        String senha;
        Boolean entrou = false;
        Integer contador = 0;
        do {
            if (contador > 0){
                System.out.println("Tente novamente");
            }
            System.out.print("E-mail: ");
            user = l.nextLine();
            System.out.print("Senha: ");
            senha = l.nextLine();
            entrou = entrar.setLogin(user, senha);
            contador++;
        } while (!entrou);
        System.out.println("Logado!");
    }
}