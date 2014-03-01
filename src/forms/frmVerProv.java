/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import clasesPrincipales.Principal;
import dao.ArticulosDao;
import dao.ProveedoresDao;
import datos.Articulo;
import datos.Proveedor;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author joshua
 */
public class frmVerProv extends javax.swing.JInternalFrame {

    private boolean hayProveedores = false;
    private int[] idList;

//    idList es un array de enteros. En primer lugar tengo la posición del elemento,
//    y en segundo lugar tengo el valor del elemento. La posición representa el
//    lugar que ocupa el proveedor en la lista. El valor representa el id del
//    proveedor seleccionado en la base de datos. Por ejemplo, el elemeneto
//    idList[2] con valor 3 refiere al proveedor ubicado en la segunda posición
//    en la lista de proveedores que tiene en la base de datos el número de id 3.
    public frmVerProv() {
        initComponents();
    }

    private void llenarLista() {
        Thread cargarLista = new Thread(new Runnable() {
            @Override
            public void run() {
                hayProveedores = false;
                List<Proveedor> listProvs = new ProveedoresDao().traerListaProveedores();
                DefaultListModel model = new DefaultListModel();
                if (listProvs.size() > 0) {
                    idList = new int[listProvs.size()];
                    for (int i = 0; i < listProvs.size(); i++) {
                        model.addElement(listProvs.get(i).getNombre());
                        idList[i] = listProvs.get(i).getIdProveedor();
                    }
                    lstProvs.setModel(model);
                    hayProveedores = true;
                } else {
                    hayProveedores = false;
                }
                lblCarga.setVisible(false);
            }
        });
        cargarLista.start();
    }

    /**
     * Creates new form frmVerProv
     */
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCarga = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstProvs = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtDir1 = new javax.swing.JTextField();
        txtDir2 = new javax.swing.JTextField();
        txtTel1 = new javax.swing.JTextField();
        txtTel2 = new javax.swing.JTextField();
        txtEmp1 = new javax.swing.JTextField();
        txtEmp2 = new javax.swing.JTextField();
        cmdEliminar = new javax.swing.JButton();
        cmdGuardar = new javax.swing.JButton();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(520, 315));
        setRequestFocusEnabled(false);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCarga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/carga.gif"))); // NOI18N
        getContentPane().add(lblCarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, 40));

        lstProvs.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstProvsValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstProvs);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, 190, 260));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Nombre:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 14, 100, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Dirección 1:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 45, 100, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Dirección 2:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 76, 100, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Teléfono 1:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 107, 100, -1));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Teléfono 2:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 138, 100, -1));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Empleado 1:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 169, 100, -1));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Empleado 2:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 200, 100, -1));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTel2ActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 12, 170, -1));

        txtDir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTel2ActionPerformed(evt);
            }
        });
        getContentPane().add(txtDir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 43, 170, -1));

        txtDir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTel2ActionPerformed(evt);
            }
        });
        getContentPane().add(txtDir2, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 74, 170, -1));

        txtTel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTel2ActionPerformed(evt);
            }
        });
        getContentPane().add(txtTel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 105, 170, -1));

        txtTel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTel2ActionPerformed(evt);
            }
        });
        getContentPane().add(txtTel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 136, 170, -1));

        txtEmp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTel2ActionPerformed(evt);
            }
        });
        getContentPane().add(txtEmp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 167, 170, -1));

        txtEmp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTel2ActionPerformed(evt);
            }
        });
        getContentPane().add(txtEmp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 198, 170, -1));

        cmdEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menos-mini-mini.png"))); // NOI18N
        cmdEliminar.setText("Eliminar");
        cmdEliminar.setEnabled(false);
        cmdEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(cmdEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 130, 30));

        cmdGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/edit-mini-mini2.png"))); // NOI18N
        cmdGuardar.setText("Guardar");
        cmdGuardar.setEnabled(false);
        cmdGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(cmdGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 240, 130, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        lblCarga.setVisible(true);
        llenarLista();
    }//GEN-LAST:event_formInternalFrameOpened

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        Principal.singleton.ventanaVerProveedores(false);
    }//GEN-LAST:event_formInternalFrameClosing

    private void lstProvsValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstProvsValueChanged
        if (hayProveedores) {
            Proveedor prov = new ProveedoresDao().traerProveedor(idList[lstProvs.getSelectedIndex()]);
            txtNombre.setText(prov.getNombre());
            txtDir1.setText(prov.getDireccion1());
            txtDir2.setText(prov.getDireccion2());
            txtEmp1.setText(prov.getEmpleado1());
            txtEmp2.setText(prov.getEmpleado2());
            txtTel1.setText(prov.getTelefono1());
            txtTel2.setText(prov.getTelefono2());
            cmdGuardar.setEnabled(true);
            cmdEliminar.setEnabled(true);
        } else {
            cmdGuardar.setEnabled(false);
            cmdEliminar.setEnabled(false);
        }
    }//GEN-LAST:event_lstProvsValueChanged

    private void cmdGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdGuardarActionPerformed
        Guardar();
    }//GEN-LAST:event_cmdGuardarActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed

    }//GEN-LAST:event_formKeyPressed

    private void txtTel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTel2ActionPerformed
        if(lstProvs.getSelectedIndex()>0){
            Guardar();
        }
    }//GEN-LAST:event_txtTel2ActionPerformed

    private void cmdEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEliminarActionPerformed
        List<Articulo> arts = new ArticulosDao().traerArticulosDeProveedor(idList[lstProvs.getSelectedIndex()]);
        if(arts.size()>0){
            int opc = JOptionPane.showConfirmDialog(this,"Existen "+arts.size()+" artículos de este proveedor.\n\n"
                    + "Si elimina el proveedor de todas formas, estos artículos\nquedarán con proveedor sin especificar.\n\n"
                    + "Lo quiere hacer de todas formas?","Confirme",JOptionPane.YES_NO_OPTION);
        }
    }//GEN-LAST:event_cmdEliminarActionPerformed

    private void Guardar() {
        Proveedor prov = new ProveedoresDao().traerProveedor(idList[lstProvs.getSelectedIndex()]);
        prov.setNombre(txtNombre.getText());
        prov.setDireccion1(txtDir1.getText());
        prov.setDireccion2(txtDir2.getText());
        prov.setEmpleado1(txtEmp1.getText());
        prov.setEmpleado2(txtEmp2.getText());
        prov.setTelefono1(txtTel1.getText());
        prov.setTelefono2(txtTel2.getText());

        new ProveedoresDao().actualizaProveedor(prov);
        llenarLista();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdEliminar;
    private javax.swing.JButton cmdGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCarga;
    private javax.swing.JList lstProvs;
    private javax.swing.JTextField txtDir1;
    private javax.swing.JTextField txtDir2;
    private javax.swing.JTextField txtEmp1;
    private javax.swing.JTextField txtEmp2;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTel1;
    private javax.swing.JTextField txtTel2;
    // End of variables declaration//GEN-END:variables
}
