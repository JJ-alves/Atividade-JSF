package br.com.atividade2;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named("contatoBean")
@RequestScoped
public class ContatoBean {

    private String nome;
    private String sobrenome;
    private String telefone;
    private String email;

    // Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String enviar() {
        System.out.println("Dados enviados com sucesso!");
        System.out.println("Nome: " + nome);
        System.out.println("Sobrenome: " + sobrenome);
        System.out.println("Telefone: " + telefone);
        System.out.println("Email: " + email);
        return null; // ou navegação, se desejar
    }
}
