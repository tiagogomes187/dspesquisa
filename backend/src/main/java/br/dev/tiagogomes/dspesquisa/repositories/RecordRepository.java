package br.dev.tiagogomes.dspesquisa.repositories;

import br.dev.tiagogomes.dspesquisa.etities.Record;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordRepository extends JpaRepository<Record, Long> {

}
