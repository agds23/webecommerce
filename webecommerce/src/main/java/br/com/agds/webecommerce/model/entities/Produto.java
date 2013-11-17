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
import javax.persistence.OneToOne;
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
    @Column(name="ID_Produto", nullable = false)
    private Integer idProduto;

    @ManyToOne(optional = false)
    @ForeignKey(name = "FK_Categoria_Produto")
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

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public Categoria getCategoriaProduto() {
        return categoriaProduto;
    }

    public void setCategoriaProduto(Categoria categoriaProduto) {
        this.categoriaProduto = categoriaProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public Integer getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(Integer quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    public Date getDataDeCadastroProduto() {
        return dataDeCadastroProduto;
    }

    public void setDataDeCadastroProduto(Date dataDeCadastroProduto) {
        this.dataDeCadastroProduto = dataDeCadastroProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public Produto() {
    }
    
}
