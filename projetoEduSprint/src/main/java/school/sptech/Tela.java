package school.sptech;

import java.util.List;
import java.util.Scanner;

public class Tela {

    public boolean logar(Login entrar, Scanner l) {
        System.out.println("Logue-se para entrar no sistema");
        String user;
        String senha;
        Boolean entrou = false;
        Integer contador = 0;
        do {
            if (contador > 0) {
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
        return true;
    }
    public void primeiraTela(Scanner l, Login entrar){
        Integer escolha;
        Scanner num = new Scanner(System.in);
        do{
            System.out.print("""
                    O que deseja fazer?
                    1 - Funcionalidades
                    2 - Sair
                    """);
            escolha = num.nextInt();

            if (escolha == 1){
                funcionalidades(l, entrar);
            }
        } while (escolha != 2);
        System.out.println("-------------------------------------\nFinalizado");
    }
    public void funcionalidades(Scanner l, Login entrar){
        Integer escolha;
        Scanner num = new Scanner(System.in);
        do{
            System.out.print("""
                    O que deseja fazer?
                    1 - Cadastrar novos usuários
                    2 - Consultar usuários
                    3 - Voltar
                    4 - Verificar o uso da maquina
                    """);
            escolha = num.nextInt();

            if (escolha == 1){
                System.out.println("Cadastrar ---- ");
                System.out.print("E-mail: ");
                String newEmail = l.nextLine();
                System.out.print("Senha: ");
                String newSenha = l.nextLine();
                entrar.cadastrarUsuario(new Usuario(newEmail, newSenha));
                System.out.println("CADASTRADO COM SUCESSO");
            } else if(escolha == 2){
                List<Usuario> lista = entrar.consultarUsuario();
                for (Integer i = 0; i < lista.size(); i++){
                    System.out.println(lista.get(i).getAll());
                }
            }
        } while (escolha != 3);
    }
}
