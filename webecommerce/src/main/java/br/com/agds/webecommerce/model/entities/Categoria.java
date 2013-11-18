/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agds.webecommerce.model.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import org.hibernate.annotations.ForeignKey;

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

    @OneToMany(mappedBy = "cateroria", fetch = FetchType.LAZY)
    @ForeignKey(name = "FK_Categoria_Produto")
    private List<Produto> produtos;

    public Categoria() {
    }
}
