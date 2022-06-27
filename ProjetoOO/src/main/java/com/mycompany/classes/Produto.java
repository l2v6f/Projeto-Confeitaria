/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classes;

import com.mycompany.conexao.EntidadeBase;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "produto")
@NamedQueries({
    @NamedQuery(name = "Produto.findAll", query = "SELECT p FROM Produto p")})
public class Produto implements Serializable, EntidadeBase {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "com_recheio")
    private boolean comRecheio;
    @Basic(optional = false)
    @Column(name = "tem_massa")
    private boolean temMassa;
    @Basic(optional = false)
    @Column(name = "tem_cobertura")
    private boolean temCobertura;
    @Basic(optional = false)
    @Column(name = "unidade")
    private int unidade;

    public Produto() {
    }

    public Produto(Integer id) {
        this.id = id;
    }

    public Produto(Integer id, boolean comRecheio, boolean temMassa, boolean temCobertura, int unidade) {
        this.id = id;
        this.comRecheio = comRecheio;
        this.temMassa = temMassa;
        this.temCobertura = temCobertura;
        this.unidade = unidade;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean getComRecheio() {
        return comRecheio;
    }

    public void setComRecheio(boolean comRecheio) {
        this.comRecheio = comRecheio;
    }

    public boolean getTemMassa() {
        return temMassa;
    }

    public void setTemMassa(boolean temMassa) {
        this.temMassa = temMassa;
    }

    public boolean getTemCobertura() {
        return temCobertura;
    }

    public void setTemCobertura(boolean temCobertura) {
        this.temCobertura = temCobertura;
    }

    public int getUnidade() {
        return unidade;
    }

    public void setUnidade(int unidade) {
        this.unidade = unidade;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produto)) {
            return false;
        }
        Produto other = (Produto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.classes.Produto[ id=" + id + " ]";
    }
    
}
