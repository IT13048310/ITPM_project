/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqllites;

import Manage.ManageSubject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL™
 */
public class Subject extends javax.swing.JFrame {

    /**
     * Creates new form Lecture
     */
    public Subject() {
        initComponents();
    }
int offeredsem;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        oyear = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSpinner3 = new javax.swing.JSpinner();
        jSpinner4 = new javax.swing.JSpinner();
        jSpinner5 = new javax.swing.JSpinner();
        jSpinner6 = new javax.swing.JSpinner();
        save1 = new javax.swing.JButton();
        Savebtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Offered Year");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Offered Semester");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Subject Name");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Subject Code");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Number of Lecture Hours");

        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        oyear.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        oyear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", " " }));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 0, 0));
        jLabel9.setText("           Add Subject");

        jRadioButton1.setText("1 st Semester");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("2 nd semester");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Number of Tutorial Hours");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("Number of Lab Hours");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("Number of Evaluvation Hours");

        save1.setBackground(new java.awt.Color(102, 102, 255));
        save1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        save1.setText("clear");
        save1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save1ActionPerformed(evt);
            }
        });

        Savebtn.setBackground(new java.awt.Color(102, 102, 255));
        Savebtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Savebtn.setText("Save");
        Savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SavebtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(oyear, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton2))
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Savebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner6, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(save1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(265, 265, 265))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(oyear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioButton1)
                        .addComponent(jRadioButton2)
                        .addComponent(jLabel6)
                        .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jSpinner6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save1)
                    .addComponent(Savebtn))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        
        offeredsem = 1;
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        
offeredsem = 2;
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void save1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save1ActionPerformed
        // TODO add your handling code here:

    
    }//GEN-LAST:event_save1ActionPerformed

    private void SavebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SavebtnActionPerformed
        String dbURL = "jdbc:sqlite:C:\\Users\\DELL™\\Documents\\NetBeansProjects\\sqllite\\Resourses.db";

try {

    Connection conn = DriverManager.getConnection(dbURL);
    
    if (conn != null) {
        System.out.println("Connected");
     }
 int semester = offeredsem;
     String year = oyear.getSelectedItem().toString();
     int years=Integer.parseInt(year);  

String subject = jTextField1.getText();
String code = jTextField2.getText();    
  int lecture = (Integer) jSpinner3.getValue();
               int tutorial = (Integer) jSpinner4.getValue();
             int lab = (Integer) jSpinner5.getValue();
              int evaluvation = (Integer) jSpinner6.getValue();
     
              
              
              
              
              System.out.println(years+subject+code+lecture+tutorial+lab+evaluvation);
              
              
              
  String sql = "INSERT INTO Subject(years,semester,subject,code,lecture,tutorial,lab,evaluvation) VALUES (?, ?, ?, ?,?,?,?,?)";

//String selectedValue = jComboBox1.getSelectedItem().toString();
 
 Integer i = 5;
 
PreparedStatement statement = conn.prepareStatement(sql);
statement.setInt(1, years);
statement.setInt(2, semester);
statement.setString(3, subject);
statement.setString(4, code);
statement.setInt(5, lecture);
statement.setInt(6, tutorial);
statement.setInt(7, lab);
statement.setInt(8, evaluvation);

int rowsInserted = statement.executeUpdate();
if (rowsInserted > 0) {
    
                ManageSubject frame = new ManageSubject();
                dispose();
                frame.setVisible(true);
                          JOptionPane.showMessageDialog(null, "Insert successfully!");

    
  System.out.println("A new user was inserted successfully!");
    
}

} catch (SQLException ex) {
    ex.printStackTrace();

        }                     
        
        
        
    }//GEN-LAST:event_SavebtnActionPerformed

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
            java.util.logging.Logger.getLogger(Subject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Subject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Subject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Subject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Subject().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Savebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JSpinner jSpinner5;
    private javax.swing.JSpinner jSpinner6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JComboBox<String> oyear;
    private javax.swing.JButton save1;
    // End of variables declaration//GEN-END:variables
}
