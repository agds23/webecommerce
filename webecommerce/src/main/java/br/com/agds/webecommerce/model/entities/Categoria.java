/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agds.webecommerce.model.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author André
 */
@Entity
@Table(name = "categoria")
class Categoria implements Serializable {
    
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID_Categoria", nullable = false)
    private Integer idCategoria;

    @Column(name = "Nome_Categoria", nullable = false)
    private String nomeCategoria;

    @Column(name = "Data_De_Criacao_Categoria", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataDeCriacaoCategoria;

    @Column(name = "Descricao_Categoria", nullable = false)
    private String descricaCategoria;
    
    public Categoria() {
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

    public Date getDataDeCriacaoCategoria() {
        return dataDeCriacaoCategoria;
    }

    public void setDataDeCriacaoCategoria(Date dataDeCriacaoCategoria) {
        this.dataDeCriacaoCategoria = dataDeCriacaoCategoria;
    }

    public String getDescricaCategoria() {
        return descricaCategoria;
    }

    public void setDescricaCategoria(String descricaCategoria) {
        this.descricaCategoria = descricaCategoria;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + (this.idCategoria != null ? this.idCategoria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Categoria other = (Categoria) obj;
        if (this.idCategoria != other.idCategoria && (this.idCategoria == null || !this.idCategoria.equals(other.idCategoria))) {
            return false;
        }
        return true;
    }

    
}
