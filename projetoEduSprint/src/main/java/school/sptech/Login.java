package school.sptech;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class Login {
    private String usuario;
    private String senha;
    private List<String> usuarios = new ArrayList<String>();
    private List<String> senhas = new ArrayList<String>();


    public Boolean setLogin(String user, String password){
        preencherDados();

        if (!user.equals("") && !password.equals("")){
            this.usuario = user;
            this.senha = password;

            return checkLogin();
        } else{
            return false;
        }
    }

    private void preencherDados(){
        if(usuarios.size() == 0 && senhas.size() == 0){
            usuarios.add("edu@gmail.com");
            senhas.add("123");

            usuarios.add("gragas@gmail.com");
            senhas.add("321");

            usuarios.add("davi@gmail.com");
            senhas.add("555");

            usuarios.add("pablo@gmail.com");
            senhas.add("666");
        }
    }

    private boolean checkLogin(){
        Integer numEncontrado = -1;
        Boolean isFind = false;
        for (Integer i = 0; i<usuarios.size(); i++){
            if (usuarios.get(i).equals(usuario)){
                isFind = true;
                numEncontrado = i;
                break;
            }
        }
        if(isFind){
            if (senhas.get(numEncontrado).equals(senha)){
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

}
