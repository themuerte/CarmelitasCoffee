/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carmelitascoffee.vista.compras;

import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;

/**
 *
 * @author admin
 */
public class Proveedores extends JInternalFrame {

    /**
     * Creates new form InternalFrameZ
     */
    public Proveedores() {
        initComponents();
        setImagenes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane1 = new javax.swing.JScrollPane();
        tProveedores = new swing.Controles.TableZ();
        lNombre = new swing.Controles.LabelZ();
        tfNombre = new swing.Controles.TextFieldZ();
        lDescripcion = new swing.Controles.LabelZ();
        tfDescripcion = new swing.Controles.TextFieldZ();
        labelZ3 = new swing.Controles.LabelZ();
        tfTelefono = new swing.Controles.TextFieldZ();
        lCorreo = new swing.Controles.LabelZ();
        tfCorreo = new swing.Controles.TextFieldZ();
        labelZ5 = new swing.Controles.LabelZ();
        jScrollPane2 = new javax.swing.JScrollPane();
        taDirección = new swing.Controles.TextAreaZ();
        pImagen = new swing.Contenedores.PanelZ();

        setBackground(new java.awt.Color(255, 247, 162));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Proveedores");
        setName(""); // NOI18N
        setVisible(true);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        tProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Descripción", "Teléfono", "Correo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tProveedores.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(tProveedores);
        tProveedores.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        getContentPane().add(jScrollPane1, gridBagConstraints);

        lNombre.setText("Nombre del proveedor: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        getContentPane().add(lNombre, gridBagConstraints);

        tfNombre.setText("Empresas LOL xd");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.3;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        getContentPane().add(tfNombre, gridBagConstraints);

        lDescripcion.setText("Descripción: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        getContentPane().add(lDescripcion, gridBagConstraints);

        tfDescripcion.setText("Nunca quedan de acuerdo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.3;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        getContentPane().add(tfDescripcion, gridBagConstraints);

        labelZ3.setText("Teléfono: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        getContentPane().add(labelZ3, gridBagConstraints);

        tfTelefono.setText("+50581380937");
        tfTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTelefonoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.3;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        getContentPane().add(tfTelefono, gridBagConstraints);

        lCorreo.setText("Correo: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        getContentPane().add(lCorreo, gridBagConstraints);

        tfCorreo.setText("tamarindo@example.com");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.3;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        getContentPane().add(tfCorreo, gridBagConstraints);

        labelZ5.setText("Dirección: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        getContentPane().add(labelZ5, gridBagConstraints);

        taDirección.setColumns(20);
        taDirección.setRows(5);
        taDirección.setText("de aquí más para allá");
        jScrollPane2.setViewportView(taDirección);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.3;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        getContentPane().add(jScrollPane2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.7;
        gridBagConstraints.weighty = 0.8;
        getContentPane().add(pImagen, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void tfTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTelefonoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private swing.Controles.LabelZ lCorreo;
    private swing.Controles.LabelZ lDescripcion;
    private swing.Controles.LabelZ lNombre;
    private swing.Controles.LabelZ labelZ3;
    private swing.Controles.LabelZ labelZ5;
    private swing.Contenedores.PanelZ pImagen;
    private swing.Controles.TableZ tProveedores;
    private swing.Controles.TextAreaZ taDirección;
    private swing.Controles.TextFieldZ tfCorreo;
    private swing.Controles.TextFieldZ tfDescripcion;
    private swing.Controles.TextFieldZ tfNombre;
    private swing.Controles.TextFieldZ tfTelefono;
    // End of variables declaration//GEN-END:variables

    private void setImagenes() {
        URL ruta = getClass().getClassLoader().getResource("com//carmelitascoffee//img//proveedores.jpg");
        pImagen.setImagenfondo(new ImageIcon(ruta).getImage());
    }
}
