package school.sptech;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class Login {
    private String usuario;
    private String senha;
    private List<Usuario> usuarios = new ArrayList<>();
    private Boolean isLogado;


    public Login(){
        preencherDados();
        isLogado = false;
    }

    @Override
    public String toString() {
        return "OLá login";
    }

    public Boolean setLogin(String user, String password){
        if (!user.equals("") && !password.equals("")){
            this.usuario = user;
            this.senha = password;

            return checkLogin();
        } else{
            return false;
        }
    }

    private void preencherDados(){
        if(usuarios.size() == 0){

            usuarios.add(new Usuario("edu@gmail.com","123"));

            usuarios.add(new Usuario("gragas@gmail.com","321"));

            usuarios.add(new Usuario("davi@gmail.com", "555"));

            usuarios.add(new Usuario("pablo@gmail.com", "555"));
        }
    }

    private boolean checkLogin(){
        Usuario verificacao;
        for (Integer i = 0; i<usuarios.size(); i++){
            verificacao = usuarios.get(i);
            if (verificacao.getEmail().equals(usuario) && verificacao.getSenha().equals(senha)){
                isLogado = true;
                return true;
            }
        }
        return false;
    }

    public void cadastrarUsuario(Usuario usuario){
        if(isLogado){
            this.usuarios.add(usuario);
        } else{
            System.out.println("Você não está logado!");
        }
    }

    public List<Usuario> consultarUsuario(){
        if (isLogado){
            return usuarios;
        } else{
            return null;
        }
    }
}
