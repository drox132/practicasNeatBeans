/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.fran.reportsystemcascon.forms;

import com.fran.reportsystemcascon.dataAccessObject.InspectorDao;
import com.fran.reportsystemcascon.model.Inspector;
import com.mysql.jdbc.StringUtils;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;






/**
 *
 * @author Francisco
 */
public class FormInspector extends javax.swing.JFrame {

    public FormInspector() {
        initComponents();
    }
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        buttonAdd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listInspector = new javax.swing.JList<>();
        labelName = new javax.swing.JLabel();
        txtNameInspector = new javax.swing.JTextField();
        labelPhone = new javax.swing.JLabel();
        txtPhoneInspector = new javax.swing.JTextField();
        labelEmail = new javax.swing.JLabel();
        txtEmailInspector = new javax.swing.JTextField();
        ButtonDeleteInspector = new javax.swing.JButton();
        buttonEdit = new javax.swing.JButton();
        lbl = new javax.swing.JLabel();
        labelId = new javax.swing.JLabel();
        ButtonUpdate = new javax.swing.JButton();
        ButtonNew = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("Inspector");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        buttonAdd.setText("Add");
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(listInspector);

        labelName.setText("Name:");

        labelPhone.setText("Phone:");

        labelEmail.setText("Email:");

        ButtonDeleteInspector.setText("Delete");
        ButtonDeleteInspector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDeleteInspectorActionPerformed(evt);
            }
        });

        buttonEdit.setText("Edit");
        buttonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditActionPerformed(evt);
            }
        });

        lbl.setText("Id:");

        ButtonUpdate.setText("Update");
        ButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonUpdateActionPerformed(evt);
            }
        });

        ButtonNew.setText("New");
        ButtonNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonNewActionPerformed(evt);
            }
        });

        jLabel2.setText("Inspector");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ButtonDeleteInspector)
                .addGap(44, 44, 44))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ButtonNew)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ButtonUpdate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonEdit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonAdd))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(labelPhone)
                                            .addComponent(labelName)
                                            .addComponent(labelEmail))
                                        .addGap(18, 18, 18))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(lbl)
                                        .addGap(40, 40, 40)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(labelId)
                                    .addComponent(txtNameInspector, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                                    .addComponent(txtPhoneInspector)
                                    .addComponent(txtEmailInspector)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonDeleteInspector)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl)
                            .addComponent(labelId))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelName)
                    .addComponent(txtNameInspector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPhone)
                    .addComponent(txtPhoneInspector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEmail)
                    .addComponent(txtEmailInspector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAdd)
                    .addComponent(buttonEdit)
                    .addComponent(ButtonUpdate)
                    .addComponent(ButtonNew))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    InspectorDao inspectorDao = new InspectorDao();
    List<Inspector>getAll= new ArrayList<>();
     
     
     
    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
     
     Inspector inspector = new Inspector();
     inspector.setName(this.txtNameInspector.getText());
     inspector.setPhone(this.txtPhoneInspector.getText());
     inspector.setEmail(this.txtEmailInspector.getText());
     
        inspectorDao.add(inspector);
        updateList();
     JOptionPane.showMessageDialog(rootPane, "The Inspector has been successfully saved");
        cleanBoxText();
     
    }//GEN-LAST:event_buttonAddActionPerformed

    private void ButtonDeleteInspectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDeleteInspectorActionPerformed
        
        int iSelected=this.listInspector.getSelectedIndex();
        Inspector inspector= getAll.get(iSelected);
        inspectorDao.delete(inspector.getId());
        updateList();
        cleanBoxText();
        JOptionPane.showMessageDialog(rootPane, "The Inspector has been successfully removed");
        
    }//GEN-LAST:event_ButtonDeleteInspectorActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        updateList();
    }//GEN-LAST:event_formComponentShown

    private void buttonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditActionPerformed
        int iSelected=this.listInspector.getSelectedIndex();
        Inspector inspector= getAll.get(iSelected);
        this.txtNameInspector.setText(inspector.getName());
        this.txtPhoneInspector.setText(inspector.getPhone());
        this.txtEmailInspector.setText(inspector.getEmail());
        this.labelId.setText(String.valueOf(inspector.getId()));
        
    }//GEN-LAST:event_buttonEditActionPerformed

    private void ButtonNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonNewActionPerformed
      cleanBoxText();
    }//GEN-LAST:event_ButtonNewActionPerformed

    private void ButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonUpdateActionPerformed
       
        Inspector inspector = new Inspector();
        inspector.setId(Integer.parseInt(this.labelId.getText()));
        inspector.setName(this.txtNameInspector.getText());
        inspector.setPhone(this.txtPhoneInspector.getText());
        inspector.setEmail(this.txtEmailInspector.getText());
        inspectorDao.update(inspector);
        updateList();
        cleanBoxText();
        JOptionPane.showMessageDialog(rootPane, "The Inspector has been successfully Updated");
        
    }//GEN-LAST:event_ButtonUpdateActionPerformed

    private void updateList(){
    DefaultListModel model = new DefaultListModel();          
        getAll = inspectorDao.getAll();
    for(int i=0; i<getAll.size();i++){
     Inspector particular= getAll.get(i);
     model.addElement(particular);
    }
    this.listInspector.setModel(model);
    
    }
    
    
    private void cleanBoxText() {
        this.txtNameInspector.setText("");
        this.txtPhoneInspector.setText("");
        this.txtEmailInspector.setText("");
        this.labelId.setText("");
    }
    
    
    
    
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
            java.util.logging.Logger.getLogger(FormInspector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormInspector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormInspector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormInspector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormInspector().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonDeleteInspector;
    private javax.swing.JButton ButtonNew;
    private javax.swing.JButton ButtonUpdate;
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonEdit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelId;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelPhone;
    private javax.swing.JLabel lbl;
    private javax.swing.JList<String> listInspector;
    private javax.swing.JTextField txtEmailInspector;
    private javax.swing.JTextField txtNameInspector;
    private javax.swing.JTextField txtPhoneInspector;
    // End of variables declaration//GEN-END:variables

    
}
