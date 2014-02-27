/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datos;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author joshua
 */
class Rubro {
    private int idRubro;
    private String nombre;
    
    private Set<Articulo> articulos = new TreeSet<Articulo>();
    private Set<Proveedor> proveedores = new TreeSet<Proveedor>();

    public Rubro() {
    }

    public Rubro(String nombre) {
        this.nombre = nombre;
    }

    public int getIdRubro() {
        return idRubro;
    }

    private void setIdRubro(int idRubro) {
        this.idRubro = idRubro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(Set<Articulo> articulos) {
        this.articulos = articulos;
    }

    public Set<Proveedor> getProveedores() {
        return proveedores;
    }

    public void setProveedores(Set<Proveedor> proveedores) {
        this.proveedores = proveedores;
    }
    
    
    
}

