/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clasesPrincipales;

import dao.ProveedoresDao;
import datos.Proveedor;

/**
 *
 * @author joshua
 */
public class pruebaMapeo1 {
    
    public static void main(String[] args) {
        Proveedor prov0 = new Proveedor();
        prov0.setNombre("Proveedor de prueba");
        
        new ProveedoresDao().guardaProveedor(prov0);
        
        Proveedor prov1 = new ProveedoresDao().traerProveedor(1);
        System.out.println(prov1.getNombre());
    }
    
    
}
