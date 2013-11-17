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
@Table(name = "Cliente")
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
    
}
