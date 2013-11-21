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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import org.hibernate.annotations.ForeignKey;

/**
 *
 * @author André
 */
@Entity
@Table(name = "cliente")
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID_Cliente", nullable = false)
    private Integer idCliente;

    @Column(name = "Nome_Cliente", nullable = false)
    private String NomeCliente;

    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name = "Data_De_Cadastro", nullable = false)
    private Date dataDeCadastro;

    @Column(name = "Sexo_Cliente", nullable = false)
    private Character sexoCliente;

    @OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY)
    @ForeignKey(name = "FK_Cliente_Pedido")
    @JoinColumn(name = "", referencedColumnName = "")
    private List<Pedido> pedidos;

    public Cliente() {
    } 
}
