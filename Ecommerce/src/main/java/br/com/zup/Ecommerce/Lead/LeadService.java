package br.com.zup.Ecommerce.Lead;

import br.com.zup.Ecommerce.DTO.LeadDTO;
import br.com.zup.Ecommerce.DTO.ProdutoDTO;
import br.com.zup.Ecommerce.Repository.LeadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@Service
public class LeadService {

    private LeadRepository leadRepository;
    //private List<LeadDTO> listaDeLeads = new ArrayList<>();

    public List<LeadDTO> exibirLead() {
         leadRepository = new LeadRepository();
        return leadRepository.getListaDeleads();
    }


    public LeadDTO adicionarLead( LeadDTO leadDTO) {
      leadRepository = new LeadRepository();
      return leadRepository.armazenarLead(leadDTO);

    }





    public ProdutoDTO verificarProduto(LeadDTO lead, String nome) {
        for (ProdutoDTO produtoReferencia : lead.getListaDeProdutos()) {
            if (lead.getListaDeProdutos().equals(nome)) {
                return produtoReferencia;
            }

        }
        throw new RuntimeException("Não encontrado");
    }



}





