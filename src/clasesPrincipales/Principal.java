/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesPrincipales;

import dao.ArticulosDao;
import dao.ProveedoresDao;
import datos.Articulo;
import datos.Proveedor;
import java.awt.Image;
import java.awt.Toolkit;
import otras.pintarJDP;

/**
 *
 * @author joshua
 */
public class Principal extends javax.swing.JFrame {

    static public Singleton singleton = Singleton.getInstance();

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        jDesktopPane1.setBorder(new pintarJDP("/imagenes/fondo3.jpg"));
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/icono.png"));
        setIconImage(icon);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        cmdAgregarArticulo = new javax.swing.JButton();
        cmdVerArticulos = new javax.swing.JButton();
        cmdVentaNueva = new javax.swing.JButton();
        cmdProveedores = new javax.swing.JButton();
        cmdPedidos = new javax.swing.JButton();
        prueba = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuArchivoConfig = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuArchivoSalir = new javax.swing.JMenuItem();
        mnuArticulos = new javax.swing.JMenu();
        mnuArticulosAgregar = new javax.swing.JMenuItem();
        mnuArticulosVer = new javax.swing.JMenuItem();
        mnuProvs = new javax.swing.JMenu();
        mnuProvAgregar = new javax.swing.JMenuItem();
        mnuProvListar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuRubrosAgregarRubro = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        cmdRubrosAgregarSubRubro = new javax.swing.JMenuItem();
        mnuRubrosVer = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Papelera M&M 2.0");

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 684, Short.MAX_VALUE)
        );

        cmdAgregarArticulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mas-mini-mini.png"))); // NOI18N
        cmdAgregarArticulo.setToolTipText("Agregar artículo nuevo");

        cmdVerArticulos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa-mini-mini.png"))); // NOI18N
        cmdVerArticulos.setToolTipText("Ver lista de artículos");

        cmdVentaNueva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/carrito-mini-mini.png"))); // NOI18N
        cmdVentaNueva.setToolTipText("Abrir venta nueva");

        cmdProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/prov-mini-mini.png"))); // NOI18N
        cmdProveedores.setToolTipText("Agregar artículo nuevo");
        cmdProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdProveedoresActionPerformed(evt);
            }
        });

        cmdPedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pin-mini.png"))); // NOI18N
        cmdPedidos.setToolTipText("Agregar artículo nuevo");

        prueba.setText("Probar query update");
        prueba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pruebaActionPerformed(evt);
            }
        });

        jMenu1.setText("Archivo");

        mnuArchivoConfig.setText("Configuración");
        jMenu1.add(mnuArchivoConfig);
        jMenu1.add(jSeparator1);

        mnuArchivoSalir.setText("Salir");
        mnuArchivoSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArchivoSalirActionPerformed(evt);
            }
        });
        jMenu1.add(mnuArchivoSalir);

        jMenuBar1.add(jMenu1);

        mnuArticulos.setText("Articulos");

        mnuArticulosAgregar.setText("Agregar");
        mnuArticulos.add(mnuArticulosAgregar);

        mnuArticulosVer.setText("Ver lista");
        mnuArticulos.add(mnuArticulosVer);

        jMenuBar1.add(mnuArticulos);

        mnuProvs.setText("Proveedores");

        mnuProvAgregar.setText("Agregar");
        mnuProvs.add(mnuProvAgregar);

        mnuProvListar.setText("Ver lista");
        mnuProvListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuProvListarActionPerformed(evt);
            }
        });
        mnuProvs.add(mnuProvListar);

        jMenuBar1.add(mnuProvs);

        jMenu2.setText("Rubros");

        mnuRubrosAgregarRubro.setText("Ver rubros y sub-rubros");
        jMenu2.add(mnuRubrosAgregarRubro);
        jMenu2.add(jSeparator2);

        cmdRubrosAgregarSubRubro.setText("Agregar rubro");
        jMenu2.add(cmdRubrosAgregarSubRubro);

        mnuRubrosVer.setText("Agregar sub-rubro");
        jMenu2.add(mnuRubrosVer);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDesktopPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmdVentaNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(cmdVerArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdAgregarArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(cmdProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(cmdPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122)
                        .addComponent(prueba)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmdAgregarArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmdVerArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmdVentaNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmdProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmdPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(prueba)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuArchivoSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArchivoSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_mnuArchivoSalirActionPerformed

    private void cmdProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdProveedoresActionPerformed
        singleton.ventanaVerProveedores(true);
    }//GEN-LAST:event_cmdProveedoresActionPerformed

    private void mnuProvListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuProvListarActionPerformed
        singleton.ventanaVerProveedores(true);
    }//GEN-LAST:event_mnuProvListarActionPerformed

    private void pruebaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pruebaActionPerformed
        Articulo art = new ArticulosDao().traerArticulo(1);
        System.out.println(art.getProveedor().getNombre());
//        art.setProveedor(new ProveedoresDao().traerProveedor(0));
//        
//        new ArticulosDao().actualizaArticulo(art);
//        System.out.println(art.getProveedor().getNombre());
    }//GEN-LAST:event_pruebaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton cmdAgregarArticulo;
    public static javax.swing.JButton cmdPedidos;
    public static javax.swing.JButton cmdProveedores;
    private javax.swing.JMenuItem cmdRubrosAgregarSubRubro;
    public static javax.swing.JButton cmdVentaNueva;
    public static javax.swing.JButton cmdVerArticulos;
    public static javax.swing.JDesktopPane jDesktopPane1;
    public static javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    public static javax.swing.JMenuItem mnuArchivoConfig;
    public static javax.swing.JMenuItem mnuArchivoSalir;
    public static javax.swing.JMenu mnuArticulos;
    public static javax.swing.JMenuItem mnuArticulosAgregar;
    public static javax.swing.JMenuItem mnuArticulosVer;
    public static javax.swing.JMenuItem mnuProvAgregar;
    public static javax.swing.JMenuItem mnuProvListar;
    public static javax.swing.JMenu mnuProvs;
    private javax.swing.JMenuItem mnuRubrosAgregarRubro;
    private javax.swing.JMenuItem mnuRubrosVer;
    private javax.swing.JButton prueba;
    // End of variables declaration//GEN-END:variables
}
