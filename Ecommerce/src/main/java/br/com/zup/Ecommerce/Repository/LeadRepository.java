package br.com.zup.Ecommerce.Repository;

import br.com.zup.Ecommerce.DTO.LeadDTO;

import java.util.ArrayList;
import java.util.List;

public class LeadRepository {
    List<LeadDTO> listaDeleads;


    public LeadDTO armazenarLead(LeadDTO leadDTO) {
        listaDeleads = new ArrayList<>();

        listaDeleads.add(leadDTO);
        for (LeadDTO leadReferencia:listaDeleads) {
            System.out.println(listaDeleads);


        }


        return leadDTO;
    }

    public List<LeadDTO> getListaDeleads() {
        return listaDeleads;
    }
    public List<LeadDTO> leadDTOList (){
        LeadDTO ld = new LeadDTO("karen", "777777", "karen@");
        listaDeleads.add(ld);
        return listaDeleads;
    }

}
