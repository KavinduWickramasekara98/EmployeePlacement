/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprojectsem1.pos.view;
import finalprojectsem1.pos.model.Directorate;
import finalprojectsem1.pos.controller.DirectorateController;
import finalprojectsem1.pos.controller.DutyPointController;
import finalprojectsem1.pos.controller.EmployeeChoiceController;
import finalprojectsem1.pos.controller.EmployeeController;
import finalprojectsem1.pos.controller.GroupController;
import finalprojectsem1.pos.controller.PortTypeController;
import finalprojectsem1.pos.db.DBConnection;
import finalprojectsem1.pos.model.DutyPoint;
import finalprojectsem1.pos.model.Employee;
import finalprojectsem1.pos.model.Group;
import finalprojectsem1.pos.model.Port;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Acer
 */
public class EmployeeChoice extends javax.swing.JFrame {

    
    public EmployeeChoice() {
        try {
            initComponents();
            loadAllEmployeeID();
            loadAllDutyPointID();
            loadDateTransferMake();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EmployeeChoice.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeChoice.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cmbDutyPointNames = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblChoice = new javax.swing.JTable();
        cmbEmployeeID = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        cmbLoadMakedDate = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbEmployeeID1 = new javax.swing.JComboBox<>();
        cmbEmployeeID2 = new javax.swing.JComboBox<>();
        cmbEmployeeID3 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel1.setText("WHAT IS EMPLOYEE CHOICE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, 590, 63));

        cmbDutyPointNames.setBackground(new java.awt.Color(51, 0, 51));
        cmbDutyPointNames.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cmbDutyPointNames.setForeground(new java.awt.Color(255, 255, 255));
        cmbDutyPointNames.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DP01-Galle-Airport-Group A", "DP02-Galle-Airport-Group B", "DP03-Colombo-Airport-Group A", "DP04-Colombo-Airport-Group B", "DP05-Colombo-Harbor-Group A", "DP06-Colombo-Harbor-Group B", " " }));
        cmbDutyPointNames.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbDutyPointNamesItemStateChanged(evt);
            }
        });
        cmbDutyPointNames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDutyPointNamesActionPerformed(evt);
            }
        });
        jPanel1.add(cmbDutyPointNames, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 640, 48));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Duty Point:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 130, 36));

        tblChoice.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee ID", "Name", "Choice"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblChoice);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 497, 1590, 400));

        cmbEmployeeID.setBackground(new java.awt.Color(51, 0, 51));
        cmbEmployeeID.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cmbEmployeeID.setForeground(new java.awt.Color(255, 255, 255));
        cmbEmployeeID.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbEmployeeIDItemStateChanged(evt);
            }
        });
        cmbEmployeeID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEmployeeIDActionPerformed(evt);
            }
        });
        jPanel1.add(cmbEmployeeID, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 100, 181, 48));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Select dutypoints and add to column");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 250, 410, 36));

        txtName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 1140, 36));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Set Date:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 200, 36));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 0, 51));
        jButton1.setText("Remove");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 390, 190, 50));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 0, 51));
        jButton2.setText("ADD+");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 310, 190, 50));

        cmbLoadMakedDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbLoadMakedDateActionPerformed(evt);
            }
        });
        jPanel1.add(cmbLoadMakedDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 320, 300, 50));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Name of employee:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 230, 36));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Employee ID:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 200, 36));

        cmbEmployeeID1.setBackground(new java.awt.Color(51, 0, 51));
        cmbEmployeeID1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cmbEmployeeID1.setForeground(new java.awt.Color(255, 255, 255));
        cmbEmployeeID1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbEmployeeID1ItemStateChanged(evt);
            }
        });
        cmbEmployeeID1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEmployeeID1ActionPerformed(evt);
            }
        });
        jPanel1.add(cmbEmployeeID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 100, 181, 48));

        cmbEmployeeID2.setBackground(new java.awt.Color(51, 0, 51));
        cmbEmployeeID2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cmbEmployeeID2.setForeground(new java.awt.Color(255, 255, 255));
        cmbEmployeeID2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbEmployeeID2ItemStateChanged(evt);
            }
        });
        cmbEmployeeID2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEmployeeID2ActionPerformed(evt);
            }
        });
        jPanel1.add(cmbEmployeeID2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 181, 48));

        cmbEmployeeID3.setBackground(new java.awt.Color(51, 0, 51));
        cmbEmployeeID3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cmbEmployeeID3.setForeground(new java.awt.Color(255, 255, 255));
        cmbEmployeeID3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbEmployeeID3ItemStateChanged(evt);
            }
        });
        cmbEmployeeID3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEmployeeID3ActionPerformed(evt);
            }
        });
        jPanel1.add(cmbEmployeeID3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 100, 181, 48));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbDutyPointNamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDutyPointNamesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbDutyPointNamesActionPerformed

    private void cmbEmployeeIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEmployeeIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbEmployeeIDActionPerformed

    private void cmbEmployeeIDItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbEmployeeIDItemStateChanged
        try {
            Employee e1=EmployeeController.getEmployee(cmbEmployeeID.getSelectedItem().toString());
            
            txtName.setText(e1.getName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EmployeeChoice.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeChoice.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbEmployeeIDItemStateChanged

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void cmbDutyPointNamesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbDutyPointNamesItemStateChanged
        try {
          
            DutyPoint d1=DutyPointController.getDutyPoint(cmbDutyPointNames.getSelectedItem().toString());
           Directorate dr1=DirectorateController.getDirectorate(d1.getD_ID());
         //  txtDirectorate.setText(dr1.getDirectorate_Name().toString());
            Port p1 = PortTypeController.getPortType(dr1.getP_ID());
         //  txtPortType.setText(p1.getPort_Name());
           Group g1=GroupController.getgroup(d1.getG_ID());
          // txtGroupType.setText(g1.getGroup_Name());
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EmployeeChoice.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeChoice.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbDutyPointNamesItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        
        
        System.out.println();
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cmbLoadMakedDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbLoadMakedDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbLoadMakedDateActionPerformed

    private void cmbEmployeeID1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbEmployeeID1ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbEmployeeID1ItemStateChanged

    private void cmbEmployeeID1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEmployeeID1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbEmployeeID1ActionPerformed

    private void cmbEmployeeID2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbEmployeeID2ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbEmployeeID2ItemStateChanged

    private void cmbEmployeeID2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEmployeeID2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbEmployeeID2ActionPerformed

    private void cmbEmployeeID3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbEmployeeID3ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbEmployeeID3ItemStateChanged

    private void cmbEmployeeID3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEmployeeID3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbEmployeeID3ActionPerformed

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
            java.util.logging.Logger.getLogger(EmployeeChoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeChoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeChoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeChoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeChoice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbDutyPointNames;
    private javax.swing.JComboBox<String> cmbEmployeeID;
    private javax.swing.JComboBox<String> cmbEmployeeID1;
    private javax.swing.JComboBox<String> cmbEmployeeID2;
    private javax.swing.JComboBox<String> cmbEmployeeID3;
    private javax.swing.JComboBox<String> cmbLoadMakedDate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblChoice;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables

    private void loadAllEmployeeID() throws ClassNotFoundException, SQLException {
       for(String s:EmployeeController.getEmployeeID()){
           cmbEmployeeID.addItem(s);
       }
    }

    private void loadAllDutyPointID() throws ClassNotFoundException, SQLException {
        for(String s:DutyPointController.getDutypointID()){
           cmbDutyPointNames.addItem(s);
       }
    }

    private void loadDateTransferMake() throws ClassNotFoundException, SQLException {
       for(String s:EmployeeChoiceController.getAllTransferDates() ){
       cmbLoadMakedDate.addItem(s);
       }
    }
}
