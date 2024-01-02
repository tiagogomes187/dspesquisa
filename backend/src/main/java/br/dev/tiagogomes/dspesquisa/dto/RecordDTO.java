package br.dev.tiagogomes.dspesquisa.dto;

import br.dev.tiagogomes.dspesquisa.etities.Record;
import br.dev.tiagogomes.dspesquisa.etities.enums.Platform;

import java.io.Serial;
import java.io.Serializable;
import java.time.Instant;

public class RecordDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private Long id;
    private Instant moment;
    private String name;
    private Integer age;
    private String gameTitle;
    private Platform gamePlataform;
    private String genreName;

    public RecordDTO() {
    }

    public RecordDTO(Record entity) {
        id = entity.getId();
        moment = entity.getMoment();
        name = entity.getName();
        age = entity.getAge();
        gameTitle = entity.getGame().getTitle();
        gamePlataform = entity.getGame().getPlatform();
        genreName = entity.getGame().getGenre().getName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGameTitle() {
        return gameTitle;
    }

    public void setGameTitle(String gameTitle) {
        this.gameTitle = gameTitle;
    }

    public Platform getGamePlataform() {
        return gamePlataform;
    }

    public void setGamePlataform(Platform gamePlataform) {
        this.gamePlataform = gamePlataform;
    }

    public String getGenreName() {
        return genreName;
    }

    public void setGenreName(String genreName) {
        this.genreName = genreName;
    }
}
