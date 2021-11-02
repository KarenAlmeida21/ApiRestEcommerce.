package br.com.zup.Ecommerce.Lead;

import br.com.zup.Ecommerce.DTO.LeadDTO;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@Service
public class LeadService {
    List<LeadDTO> listaDeLeads = new ArrayList<>();
    public LeadDTO exibirLead(){
        return (LeadDTO) listaDeLeads;
    }


    public void adicionarLead(@RequestBody LeadDTO leadDTO) {
        for (LeadDTO leadReferencia : listaDeLeads) {
            if (listaDeLeads.equals(leadReferencia)) {
                throw new ResponseStatusException(HttpStatus.NOT_FOUND);
            } else {
                listaDeLeads.add(leadDTO);
            }
        }
    }
}
