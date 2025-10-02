package main.java.tratamentodeexcecoes.validarsenha;

class ValidarSenha {
    public void verificarMaiusculas(String senha){
        boolean flag = false;
        for (char c : senha.toCharArray()) {
            if (Character.isUpperCase(c)) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            throw new IllegalArgumentException("Erro: a senha deve conter pelo menos uma letra maiúscula");
        }
    }
}
