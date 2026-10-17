package Ex_02;

public class ValidarSenha {
    public void verificarMaiusculas(String senha) throws IllegalArgumentException{

        Boolean tem_Upper = false;
        for(int i=0; i<senha.length() && !tem_Upper; i++){
            char caracter = senha.charAt(i);
            if(caracter >='A' && caracter<='Z') tem_Upper=true;
        }

        if(!tem_Upper) throw new IllegalArgumentException("Erro: a senha deve conter pelo menos uma letra maiúscula");
    }
}
