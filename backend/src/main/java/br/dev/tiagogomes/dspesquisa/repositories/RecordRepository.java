package br.dev.tiagogomes.dspesquisa.repositories;

import br.dev.tiagogomes.dspesquisa.etities.Record;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecordRepository extends JpaRepository<Record, Long> {

}
