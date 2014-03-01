/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clasesPrincipales;

import forms.*;

/**
 *
 * @author joshua
 */
public class Singleton {
    private static final Singleton INSTANCE = new Singleton();
    
    //Atributos
    private static int indiceVentanas=0;
    
    //Formularios
    public frmVerProv frmVerProv = new frmVerProv();
    
    //Constructor
    public Singleton(){}
    
    public static Singleton getInstance(){
        return INSTANCE;
    }
    
    //Metodo privados
    private int nuevoIndiceVentana(){
        indiceVentanas++;
        return indiceVentanas;
    }
    
    //Abrir y cerrar JFrames
    public void ventanaVerProveedores(boolean act){
        if(act){
            Principal.jDesktopPane1.add(frmVerProv,nuevoIndiceVentana());
            frmVerProv.setLocation(10,10);
            frmVerProv.show();
        } else{
            frmVerProv.dispose();
        }
        Principal.mnuProvListar.setEnabled(!act);
        Principal.cmdProveedores.setEnabled(!act);
    }
}
