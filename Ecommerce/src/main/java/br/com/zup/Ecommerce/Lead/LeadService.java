package br.com.zup.Ecommerce.Lead;

import br.com.zup.Ecommerce.DTO.LeadDTO;
import br.com.zup.Ecommerce.DTO.ProdutoDTO;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@Service
public class LeadService {
    private List<LeadDTO> listaDeLeads = new ArrayList<>();

    public List<LeadDTO> exibirLead() {
        return listaDeLeads;
    }

boolean iguais = false;
    public void adicionarLead(@RequestBody LeadDTO leadDTO) {
        for (LeadDTO leadReferencia : listaDeLeads) {
            if (leadReferencia.getEmail().equals(leadDTO.getEmail())) {
                throw new ResponseStatusException(HttpStatus.NOT_FOUND);
            } else {
                listaDeLeads.add(leadDTO);
            }
        }
    }


    public LeadDTO verificarCadastro(LeadDTO leadDTO) {
        for (LeadDTO leadReferencia : listaDeLeads) {
            if (leadReferencia.getEmail().equals(leadDTO.getEmail())) {
                return leadReferencia;
            }
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

    public LeadDTO buscarLead(String email) {
        for (LeadDTO leadReferencia : listaDeLeads) {
            if (leadReferencia.getEmail().equals(leadReferencia.getEmail())) {
                return leadReferencia;
            }
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

    public ProdutoDTO verificarProduto(LeadDTO lead, String nome) {
        //LeadDTO leadDTO = buscarLead(lead.getEmail());
        for (ProdutoDTO produtoReferencia : lead.getListaDeProdutos()) {
            if (lead.getListaDeProdutos().equals(nome)) {
                return produtoReferencia;
            }

        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }


}





