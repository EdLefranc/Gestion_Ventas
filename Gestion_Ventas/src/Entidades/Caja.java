/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Ed Le Franc
 */
public class Caja {
    private int codCaja;
    private List<Compras> salidas;
    private List<Ventas> entradas;
    private Date fecha;

    public Caja() {
    }

    public Caja(int codCaja, List<Compras> salidas, List<Ventas> entradas, Date fecha) {
        this.codCaja = codCaja;
        this.salidas = salidas;
        this.entradas = entradas;
        this.fecha = fecha;
    }

    public int getCodCaja() {
        return codCaja;
    }

    public void setCodCaja(int codCaja) {
        this.codCaja = codCaja;
    }

    public List<Compras> getSalidas() {
        return salidas;
    }

    public void setSalidas(List<Compras> salidas) {
        this.salidas = salidas;
    }

    public List<Ventas> getEntradas() {
        return entradas;
    }

    public void setEntradas(List<Ventas> entradas) {
        this.entradas = entradas;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Caja{" + "codCaja=" + codCaja + ", salidas=" + salidas + ", entradas=" + entradas + ", fecha=" + fecha + '}';
    }
    
    
}
