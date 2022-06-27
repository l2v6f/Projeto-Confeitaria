/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classes;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "tipo_pagamento")
@NamedQueries({
    @NamedQuery(name = "TipoPagamento.findAll", query = "SELECT t FROM TipoPagamento t")})
public class TipoPagamento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "pix")
    private boolean pix;
    @Basic(optional = false)
    @Column(name = "cartao")
    private boolean cartao;
    @Basic(optional = false)
    @Column(name = "boleto")
    private boolean boleto;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipoPag")
    private List<Pagamento> pagamentoList;

    public TipoPagamento() {
    }

    public TipoPagamento(Integer id) {
        this.id = id;
    }

    public TipoPagamento(Integer id, boolean pix, boolean cartao, boolean boleto) {
        this.id = id;
        this.pix = pix;
        this.cartao = cartao;
        this.boleto = boleto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean getPix() {
        return pix;
    }

    public void setPix(boolean pix) {
        this.pix = pix;
    }

    public boolean getCartao() {
        return cartao;
    }

    public void setCartao(boolean cartao) {
        this.cartao = cartao;
    }

    public boolean getBoleto() {
        return boleto;
    }

    public void setBoleto(boolean boleto) {
        this.boleto = boleto;
    }

    public List<Pagamento> getPagamentoList() {
        return pagamentoList;
    }

    public void setPagamentoList(List<Pagamento> pagamentoList) {
        this.pagamentoList = pagamentoList;
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
        if (!(object instanceof TipoPagamento)) {
            return false;
        }
        TipoPagamento other = (TipoPagamento) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.classes.TipoPagamento[ id=" + id + " ]";
    }
    
}
