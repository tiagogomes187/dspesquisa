package br.dev.tiagogomes.dspesquisa.dto;

import br.dev.tiagogomes.dspesquisa.etities.Game;
import br.dev.tiagogomes.dspesquisa.etities.enums.Platform;

import java.io.Serial;
import java.io.Serializable;

public class GameDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private Long id;
    private String title;
    private Platform platform;

    public GameDTO() {
    }

    public GameDTO(Game entity) {
        id = entity.getId();
        title = entity.getTitle();
        platform = entity.getPlatform();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Platform getPlatform() {
        return platform;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }
}
