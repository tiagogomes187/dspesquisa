package br.dev.tiagogomes.dspesquisa.repositories;

import br.dev.tiagogomes.dspesquisa.etities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
