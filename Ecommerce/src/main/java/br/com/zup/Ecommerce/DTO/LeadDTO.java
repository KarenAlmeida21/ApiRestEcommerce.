package br.com.zup.Ecommerce.DTO;

import java.util.List;

public class LeadDTO {
    private String nome;
    private String cpf;
    private String email;
    public List<ProdutoDTO> listaDeProdutos;

    public LeadDTO() {
    }

    public LeadDTO(String nome, String cpf, String email, List<ProdutoDTO> listaDeProdutos) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.listaDeProdutos = listaDeProdutos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ProdutoDTO getProdutoDTO() {
        return produtoDTO;
    }

    public void setProdutoDTO(ProdutoDTO produtoDTO) {
        this.produtoDTO = produtoDTO;
    }
}
