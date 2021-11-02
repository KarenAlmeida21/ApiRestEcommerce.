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


    public void adicionarLead(@RequestBody LeadDTO leadDTO) {
        for (LeadDTO leadReferencia : listaDeLeads) {
            if (listaDeLeads.equals(leadReferencia)) {
                throw new ResponseStatusException(HttpStatus.NOT_FOUND);
            } else {
                LeadDTO lead = verificarCadastro(leadDTO.getEmail());
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

    public void verificarProduto(LeadDTO leadDTO, String nome) {
buscarLead()
    }
}
