package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

public class HelloController {

    // Campos de texto
    @FXML private TextField nomeCadastroCliente;
    @FXML private TextField cpfCadastroCliente;
    @FXML private TextField telefoneCadastroCliente;
    @FXML private TextField enderecoCadastroCliente;

    // Botões
    @FXML private Button buttonSalvarCadastroCliente;
    @FXML private Button buttonAlterarCadastroCliente;
    @FXML private Button buttonExcluirCadastroCliente;
    @FXML private Button buttonPesquisarCliente;

    @FXML
    public void salvarCadastro() {
        String nome = nomeCadastroCliente.getText();
        String cpf = cpfCadastroCliente.getText();
        String telefone = telefoneCadastroCliente.getText();
        String endereco = enderecoCadastroCliente.getText();

        System.out.println("=== Salvando Cadastro ===");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Telefone: " + telefone);
        System.out.println("Endereço: " + endereco);
        System.out.println("=========================");
    }

    @FXML
    public void alterarCadastro() {
        System.out.println("Alterando cadastro do CPF: " + cpfCadastroCliente.getText());
    }

    @FXML
    public void excluirCadastro() {
        System.out.println("Excluindo cadastro do CPF: " + cpfCadastroCliente.getText());
    }

    @FXML
    public void pesquisarCliente() {
        System.out.println("Pesquisando cliente com CPF: " + cpfCadastroCliente.getText());
    }


}
