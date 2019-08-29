/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carmelitascoffee.vista.inventario;
import com.carmelitascoffee.controlador.inventario.CInsumos;
import com.carmelitascoffee.controlador.inventario.CInsumos;
import com.carmelitascoffee.pojo.Insumo;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.JInternalFrame;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Session;

/**
 *
 * @author admin
 */
public class Insumos extends JInternalFrame {

   private CInsumos controlador;
    private Session se;
    private DefaultTableModel modelo;
    /**
     * Creates new form InternalFrameZ
     */
    public Insumos(Session s) {
        initComponents();
        se = s;
        modelo = new DefaultTableModel();
        modelo.addColumn("Código");
        modelo.addColumn("Nombre");
        modelo.addColumn("Cantidad");;
        controlador = new CInsumos(se,modelo);
        controlador.LlenarTabla(tableZ1);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelZ2 = new swing.Controles.LabelZ();
        Bus = new swing.Controles.TextFieldZ();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableZ1 = new swing.Controles.TableZ();
        labelZ1 = new swing.Controles.LabelZ();
        cod = new swing.Controles.TextFieldZ();
        nom = new swing.Controles.TextFieldZ();
        labelZ5 = new swing.Controles.LabelZ();
        cant = new swing.Controles.TextFieldZ();
        labelZ3 = new swing.Controles.LabelZ();
        btnEditar = new swing.Controles.ButtonZ();
        btnAñadir = new swing.Controles.ButtonZ();

        setBackground(new java.awt.Color(255, 247, 162));
        setClosable(true);
        setIconifiable(true);
        setTitle("Insumos");
        setVisible(true);

        labelZ2.setText("Buscar por nombre de Insumo");
        labelZ2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        Bus.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        Bus.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Bus.setText("");
        Bus.setCaretColor(new java.awt.Color(255, 255, 255));
        Bus.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        Bus.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Bus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BusKeyTyped(evt);
            }
        });

        tableZ1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre", "Cantidad"
            }
        ));
        tableZ1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableZ1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableZ1);

        labelZ1.setText("Código");
        labelZ1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        cod.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        cod.setText("");
        cod.setCaretColor(new java.awt.Color(255, 255, 255));
        cod.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        cod.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        nom.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        nom.setText("");
        nom.setCaretColor(new java.awt.Color(255, 255, 255));
        nom.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        nom.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        labelZ5.setText("Nombre");
        labelZ5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        cant.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        cant.setText("");
        cant.setCaretColor(new java.awt.Color(255, 255, 255));
        cant.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        cant.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantActionPerformed(evt);
            }
        });

        labelZ3.setText("Cantidad");
        labelZ3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnAñadir.setText("Añadir");
        btnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cod, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelZ1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelZ5, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                            .addComponent(nom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(125, 125, 125)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelZ3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cant, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(labelZ2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Bus, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(63, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelZ2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bus, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelZ5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelZ1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cod, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelZ3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cant, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(42, 42, 42))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tableZ1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableZ1MouseClicked
       int Selec = tableZ1.rowAtPoint(evt.getPoint());
        cod.setText(String.valueOf(tableZ1.getValueAt(Selec, 0)));
        nom.setText(String.valueOf(tableZ1.getValueAt(Selec, 1)));
        cant.setText(String.valueOf(tableZ1.getValueAt(Selec, 2)));
    }//GEN-LAST:event_tableZ1MouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
     Insumo insumo = new Insumo(nom.getText(),Integer.parseInt(cant.getText()));
        //insumo.setInsumo(Integer.parseInt(cod.getText()));
        insumo.setIdInsumo(Integer.parseInt(cod.getText()));
        controlador.setInsumo(insumo);     
        
        controlador.LlenarTabla(tableZ1);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
        String descripcion;
        int cantidadInventario;

        descripcion = nom.getText();
        cantidadInventario = Integer.parseInt(cant.getText());
        
        Insumo insumo = new Insumo(descripcion,cantidadInventario);
        controlador.AgregarInsumo(insumo);
        cargarTabla(Bus.getText());
    }//GEN-LAST:event_btnAñadirActionPerformed

    private void BusKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BusKeyTyped
        cargarTabla(Bus.getText());
    }//GEN-LAST:event_BusKeyTyped

    private void cantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Controles.TextFieldZ Bus;
    private swing.Controles.ButtonZ btnAñadir;
    private swing.Controles.ButtonZ btnEditar;
    private swing.Controles.TextFieldZ cant;
    private swing.Controles.TextFieldZ cod;
    private javax.swing.JScrollPane jScrollPane1;
    private swing.Controles.LabelZ labelZ1;
    private swing.Controles.LabelZ labelZ2;
    private swing.Controles.LabelZ labelZ3;
    private swing.Controles.LabelZ labelZ5;
    private swing.Controles.TextFieldZ nom;
    private swing.Controles.TableZ tableZ1;
    // End of variables declaration//GEN-END:variables

private void cargarTabla(String textFiltro) {
        DefaultTableModel dtm = (DefaultTableModel) tableZ1.getModel();
        dtm.setRowCount(0);
        List lista = controlador.cargarFiltros(textFiltro);
        Object[] row = new Object[3];
        for (int i = 0; i < lista.size(); i++) {
            Insumo in = (Insumo) lista.get(i);
            row[0] = in.getIdInsumo();
            row[1] = in.getDescripcion();
            row[2] = in.getCantidadInventario();
             dtm.addRow(row);
        }
        tableZ1.setModel(dtm);
    }




}




