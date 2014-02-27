/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datos;

import java.util.GregorianCalendar;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author joshua
 */
class SubRubro {
    private int idSubRubro;
    private String nombre;
    private double precioCompra;
    private double precioVenta;
    private Rubro rubro;
    private GregorianCalendar fecUltimaModif;
    private double ultimoPorc;
    private Set<Articulo> articulos = new TreeSet<Articulo>();

    public SubRubro() {
    }

    public SubRubro(String nombre, double precioCompra, double precioVenta, Rubro rubro, GregorianCalendar fecUltimaModif, double ultimoPorc) {
        this.nombre = nombre;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.rubro = rubro;
        this.fecUltimaModif = fecUltimaModif;
        this.ultimoPorc = ultimoPorc;
    }

    public int getIdSubRubro() {
        return idSubRubro;
    }

    private void setIdSubRubro(int idSubRubro) {
        this.idSubRubro = idSubRubro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Rubro getRubro() {
        return rubro;
    }

    public void setRubro(Rubro rubro) {
        this.rubro = rubro;
    }

    public GregorianCalendar getFecUltimaModif() {
        return fecUltimaModif;
    }

    public void setFecUltimaModif(GregorianCalendar fecUltimaModif) {
        this.fecUltimaModif = fecUltimaModif;
    }

    public double getUltimoPorc() {
        return ultimoPorc;
    }

    public void setUltimoPorc(double ultimoPorc) {
        this.ultimoPorc = ultimoPorc;
    }

    public Set<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(Set<Articulo> articulos) {
        this.articulos = articulos;
    }
    
    
}
