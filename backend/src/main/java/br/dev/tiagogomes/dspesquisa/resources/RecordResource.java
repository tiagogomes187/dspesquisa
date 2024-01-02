package br.dev.tiagogomes.dspesquisa.resources;

import br.dev.tiagogomes.dspesquisa.dto.RecordDTO;
import br.dev.tiagogomes.dspesquisa.dto.RecordInsertDTO;
import br.dev.tiagogomes.dspesquisa.services.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/records")
public class RecordResource {

    @Autowired
    private RecordService recordService;

    @PostMapping
    public ResponseEntity<RecordDTO> insert(@RequestBody RecordInsertDTO recordInsertDTO) {
        RecordDTO newDTO = recordService.insert(recordInsertDTO);
        return ResponseEntity.ok().body(newDTO);
    }
}
