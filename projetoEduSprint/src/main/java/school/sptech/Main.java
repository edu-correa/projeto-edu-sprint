package school.sptech;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        Login entrar = new Login();


        Tela tela = new Tela();

        if (tela.logar(entrar, l)){
            tela.primeiraTela(l, entrar);
        } else{
            System.out.println("Encerrado");
        }
    }
}