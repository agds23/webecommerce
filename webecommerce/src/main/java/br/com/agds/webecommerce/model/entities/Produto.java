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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import org.hibernate.annotations.ForeignKey;

/**
 *
 * @author André
 */
@Entity
@Table(name = "produto")
public class Produto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID_Produto", nullable = false)
    private Integer idProduto;

    @ManyToOne(optional = false)
    @ForeignKey(name = "FK_Categoria_Produto")
    @JoinColumn(name = "", referencedColumnName = "")
    private Categoria categoriaProduto;

    @Column(name = "Nome_Produto", nullable = false)
    private String nomeProduto;

    @Column(name = "Preco_Produto", nullable = false)
    private double precoProduto;

    @Column(name = "Quantidade_Produto", nullable = false)
    private Integer quantidadeProduto;

    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name = "Data_De_Cadastro_Produto", nullable = false)
    private Date dataDeCadastroProduto;

    @Column(name = "Descricao_Produto", nullable = false)
    private String descricaoProduto;

    @ManyToOne(optional = false)
    @ForeignKey(name = "FK_Compra_Pedido")
    @JoinColumn(name = "", referencedColumnName = "")
    private Pedido pedido;
    
    public Produto() {
    }
}
