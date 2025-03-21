package br.com.cadUser;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named("usuarioBean") 
@SessionScoped 
public class UsuarioBean implements Serializable {
	public static final long serialVersionUID = 1L;
    public String nome;
    public List<String> nomes = new ArrayList<>();
    public String mensagem; 

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getNomes() {
        return nomes;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void adicionarNome() {
        if (nome != null && !nome.trim().isEmpty()) {
            nomes.add(nome);
            mensagem = "Nome cadastrado com sucesso!"; // Define a mensagem
            nome = ""; // Limpa o campo
        } else {
            mensagem = "Por favor, insira um nome válido.";
        }
    }
}
