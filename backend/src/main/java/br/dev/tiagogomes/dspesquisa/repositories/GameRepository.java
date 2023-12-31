package br.dev.tiagogomes.dspesquisa.repositories;

import br.dev.tiagogomes.dspesquisa.etities.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {

}
