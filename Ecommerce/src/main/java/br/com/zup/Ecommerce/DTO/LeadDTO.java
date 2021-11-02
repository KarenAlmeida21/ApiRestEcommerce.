package br.com.zup.Ecommerce.DTO;

public class LeadDTO {
    private String nome;
    private String cpf;
    private String email;
    public ProdutoDTO produtoDTO;

    public LeadDTO() {
    }

    public LeadDTO(String nome, String cpf, String email, ProdutoDTO produtoDTO) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.produtoDTO = produtoDTO;
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
