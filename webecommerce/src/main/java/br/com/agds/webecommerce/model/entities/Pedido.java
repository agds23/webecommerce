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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import org.hibernate.annotations.ForeignKey;

/**
 *
 * @author André
 */
@Entity
@Table(name = "compra")
public class Pedido implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID_Compra", nullable = false)
    private Integer idCompra;

    @OneToMany(mappedBy = "compra", fetch = FetchType.LAZY)
    @ForeignKey(name = "FK_Compra_Pedido")
    @JoinColumn(name = "", referencedColumnName = "")
    private List<Produto> produtos;

    @Column(name = "Data_Da_Compra", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataDaCompra;

    @Column(name = "Observacao_Da_Compra", nullable = false)
    private String observacaoDaCompra;

    @ManyToOne(optional = false)
    @ForeignKey(name = "FK_Cliente_Pedido")
    @JoinColumn(name = "", referencedColumnName = "")
    private Cliente cliente;

    public Pedido() {
    }
}
