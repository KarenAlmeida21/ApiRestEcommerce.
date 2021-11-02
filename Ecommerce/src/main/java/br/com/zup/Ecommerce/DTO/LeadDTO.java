package br.com.zup.Ecommerce.DTO;

import java.util.List;

public class LeadDTO {
    private String nome;
    private String telefone;
    private String email;
    public List<ProdutoDTO> listaDeProdutos;

    public LeadDTO() {
    }

    public LeadDTO(String nome, String telefone, String email, List<ProdutoDTO> listaDeProdutos) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.listaDeProdutos = listaDeProdutos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public List<ProdutoDTO> getListaDeProdutos() {
        return listaDeProdutos;
    }

    public void setListaDeProdutos(List<ProdutoDTO> listaDeProdutos) {
        this.listaDeProdutos = listaDeProdutos;
    }

}
