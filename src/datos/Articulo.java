/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datos;

/**
 *
 * @author joshua
 */
public class Articulo {
    private int idArticulo;
    private String nombre;
    private int stock;
    private double precioCompra;
    private double precioVentaU;
    private int cantPorBulto;
    private double precioVentaB;
    
    private Proveedor proveedor;
    private Rubro rubro;
    private SubRubro subRubro;

    public Articulo() {
    }

    public Articulo(String nombre, int stock, double precioCompra, double precioVentaU, int cantPorBulto, double precioVentaB, Proveedor proveedor, Rubro rubro, SubRubro subRubro) {
        this.nombre = nombre;
        this.stock = stock;
        this.precioCompra = precioCompra;
        this.precioVentaU = precioVentaU;
        this.cantPorBulto = cantPorBulto;
        this.precioVentaB = precioVentaB;
        this.proveedor = proveedor;
        this.rubro = rubro;
        this.subRubro = subRubro;
    }

    public int getIdArticulo() {
        return idArticulo;
    }

    private void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public double getPrecioVentaU() {
        return precioVentaU;
    }

    public void setPrecioVentaU(double precioVentaU) {
        this.precioVentaU = precioVentaU;
    }

    public int getCantPorBulto() {
        return cantPorBulto;
    }

    public void setCantPorBulto(int cantPorBulto) {
        this.cantPorBulto = cantPorBulto;
    }

    public double getPrecioVentaB() {
        return precioVentaB;
    }

    public void setPrecioVentaB(double precioVentaB) {
        this.precioVentaB = precioVentaB;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Rubro getRubro() {
        return rubro;
    }

    public void setRubro(Rubro rubro) {
        this.rubro = rubro;
    }

    public SubRubro getSubRubro() {
        return subRubro;
    }

    public void setSubRubro(SubRubro subRubro) {
        this.subRubro = subRubro;
    }
    
    
    
}
