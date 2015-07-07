package br.com.camtwo.mylist.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vitor on 06/07/15.
 */
public class Lista {

    private Integer _id;
    private Long version = 0l;
    private String descricao;
    private List<Item> itens = new ArrayList<>();

    public Integer get_id() {
        return _id;
    }

    public void set_id(Integer _id) {
        this._id = _id;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }
}
