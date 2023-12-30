package br.dev.tiagogomes.dspesquisa.repositories;

import br.dev.tiagogomes.dspesquisa.etities.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre, Long> {

}
