package br.com.zup.Ecommerce.Lead;

import br.com.zup.Ecommerce.DTO.LeadDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/leads")
public class LeadController {
    @Autowired
    private LeadService leadService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void cadastrarLead(@RequestBody LeadDTO leadDTO) {
        leadService.adicionarLead(leadDTO);
    }

    @GetMapping
    public List<LeadDTO>exibir(){
        return leadService.exibirLead();
    }

}
