/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carmelitascoffee.vista.ventas;

import com.carmelitascoffee.controlador.ventas.CClienteVista;
import com.carmelitascoffee.pojo.Cliente;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Session;

/**
 *
 * @author admin
 */
public class ClienteVista extends JInternalFrame {

    Session s;
    CClienteVista controlador;

    /**
     * Creates new form InternalFrameZ
     */
    public ClienteVista() {
        initComponents();
    }

    ClienteVista(Session s) {
        initComponents();
        this.s = s;
        controlador = new CClienteVista(s);
        cargarTabla();
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

        jScrollPane3 = new javax.swing.JScrollPane();
        tClienteList = new swing.Controles.TableZ();
        bAgregarCliente = new swing.Controles.ButtonZ();
        tfFiltroDatos = new swing.Controles.TextFieldZ();
        lFiltro = new swing.Controles.LabelZ();

        setBackground(new java.awt.Color(255, 247, 162));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Búsqueda Avanzada Cliente");
        setMinimumSize(new java.awt.Dimension(725, 562));
        setName("AgregarEmpleadoFRM"); // NOI18N
        setPreferredSize(new java.awt.Dimension(725, 562));
        setVisible(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
        });
        getContentPane().setLayout(new java.awt.GridBagLayout());

        tClienteList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "RUC", "Nombre", "Apellido", "Teléfono", "Correo", "Dirección", "PersonaContacto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tClienteList.setColumnSelectionAllowed(true);
        jScrollPane3.setViewportView(tClienteList);
        tClienteList.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tClienteList.getColumnModel().getColumnCount() > 0) {
            tClienteList.getColumnModel().getColumn(0).setMinWidth(40);
            tClienteList.getColumnModel().getColumn(0).setPreferredWidth(40);
            tClienteList.getColumnModel().getColumn(0).setMaxWidth(40);
        }

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        getContentPane().add(jScrollPane3, gridBagConstraints);

        bAgregarCliente.setText("Agregar Cliente");
        bAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAgregarClienteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.4;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(bAgregarCliente, gridBagConstraints);

        tfFiltroDatos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfFiltroDatos.setText("");
        tfFiltroDatos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfFiltroDatosKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.4;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(tfFiltroDatos, gridBagConstraints);

        lFiltro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lFiltro.setText("Palabra clave: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.4;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(lFiltro, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened

    }//GEN-LAST:event_formInternalFrameOpened

    private void tfFiltroDatosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfFiltroDatosKeyTyped
        cargarTabla();
    }//GEN-LAST:event_tfFiltroDatosKeyTyped

    private void bAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAgregarClienteActionPerformed
        JDesktopPane jdp = getDesktopPane();
        NuevoCliente nuevoCliente = new NuevoCliente(s);
        nuevoCliente.setVisible(true);
        nuevoCliente.pack();
        jdp.add(nuevoCliente);
        nuevoCliente.toFront();
    }//GEN-LAST:event_bAgregarClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Controles.ButtonZ bAgregarCliente;
    private javax.swing.JScrollPane jScrollPane3;
    private swing.Controles.LabelZ lFiltro;
    private swing.Controles.TableZ tClienteList;
    private swing.Controles.TextFieldZ tfFiltroDatos;
    // End of variables declaration//GEN-END:variables

    private void ActualizarPanel() {

    }

    private void cargarTabla() {
        DefaultTableModel dtm = (DefaultTableModel) tClienteList.getModel();
        dtm.setRowCount(0);
        List lista = controlador.cargarFiltros(tfFiltroDatos.getText());
        Object[] row = new Object[8];
        for (int i = 0; i < lista.size(); i++) {
            Cliente c = (Cliente) lista.get(i);
            row[0] = c.getIdCliente();
            row[1] = c.getNumeroRuc();
            row[2] = c.getNombres();
            row[3] = c.getApellidos();
            row[4] = c.getTelefono();
            row[5] = c.getCorreo();
            row[6] = c.getDireccion();
            row[7] = c.getPersonaContacto().getNombres() + " " + c.getPersonaContacto().getApellidos();
            dtm.addRow(row);
        }
        tClienteList.setModel(dtm);
    }

}
