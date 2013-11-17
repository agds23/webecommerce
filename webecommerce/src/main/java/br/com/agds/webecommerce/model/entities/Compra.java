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
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author André
 */

@Entity
@Table(name = "Compra")
public class Compra implements Serializable {
    
    private static final long serialVersionUID = 1L;
 
    @Id
    @Column(name = "ID_Compra", nullable = false)
    private Integer idCompra;
    
    @Column(name = "Procudo_Da_Compra", nullable = false)
    private Produto produtoDaCompra;
    
    @Column(name = "Data_Da_Compra", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataDaCompra;
    
    @Column(name = "Observacao_Da_Compra", nullable = false)
    private String observacaoDaCompra;

    public Integer getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    public Produto getProdutoDaCompra() {
        return produtoDaCompra;
    }

    public void setProdutoDaCompra(Produto produtoDaCompra) {
        this.produtoDaCompra = produtoDaCompra;
    }

    public Date getDataDaCompra() {
        return dataDaCompra;
    }

    public void setDataDaCompra(Date dataDaCompra) {
        this.dataDaCompra = dataDaCompra;
    }

    public String getObservacaoDaCompra() {
        return observacaoDaCompra;
    }

    public void setObservacaoDaCompra(String observacaoDaCompra) {
        this.observacaoDaCompra = observacaoDaCompra;
    }

    public Compra() {
    }

}
