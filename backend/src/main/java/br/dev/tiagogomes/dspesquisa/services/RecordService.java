package br.dev.tiagogomes.dspesquisa.services;

import br.dev.tiagogomes.dspesquisa.dto.GameDTO;
import br.dev.tiagogomes.dspesquisa.dto.RecordDTO;
import br.dev.tiagogomes.dspesquisa.dto.RecordInsertDTO;
import br.dev.tiagogomes.dspesquisa.etities.Game;
import br.dev.tiagogomes.dspesquisa.etities.Record;
import br.dev.tiagogomes.dspesquisa.repositories.GameRepository;
import br.dev.tiagogomes.dspesquisa.repositories.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RecordService {


    @Autowired
    private RecordRepository recordRepository;

    @Autowired
    private GameRepository gameRepository;

    @Transactional
    public RecordDTO insert(RecordInsertDTO recordInsertDTO) {
        Record entity = new Record();
        entity.setName(recordInsertDTO.getName());
        entity.setAge(recordInsertDTO.getAge());
        entity.setMoment(Instant.now());
        Game game = gameRepository.getReferenceById(recordInsertDTO.getGameId());
        entity.setGame(game);

        entity = recordRepository.save(entity);

        return new RecordDTO(entity);
    }

    @Transactional(readOnly = true)
    public Page<RecordDTO> findByMoments(Instant minDate, Instant maxDate, PageRequest pageRequest) {
        return recordRepository.findByMoments(minDate, maxDate, pageRequest).map(x -> new RecordDTO(x));
    }
}
