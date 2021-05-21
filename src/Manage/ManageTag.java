/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manage;
import java.awt.Color;
import javax.swing.JRadioButton;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.UIManager.getString;
import javax.swing.table.DefaultTableModel;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.ListSelectionModel;
import sqllites.Tag;
import sqllites.Welcome;

/**
 *show_user
 * @author DELL™
 */
public class ManageTag extends javax.swing.JFrame {

    /**
     * Creates new form Lecture
     */
    public ManageTag() {
        initComponents();
        show_user();
    }

  public void show_user(){
      
       DefaultTableModel model = (DefaultTableModel)jTable1.getModel();

        Statement st;

        ResultSet rs;

    String dbURL = "jdbc:sqlite:C:\\Users\\DELL™\\Documents\\NetBeansProjects\\sqllite\\Resourses.db";
        try {

            Connection con = DriverManager.getConnection(dbURL);

        
            st = con.createStatement();
            rs = st.executeQuery("SELECT Tagid,tname,tcode,tag FROM Tag");
//
//      Users user;
            while (rs.next()) {
                    String Tagid = rs.getString("Tagid");

String tname = rs.getString("tname");
  String tcode = rs.getString("tcode");
    
  String tag = rs.getString("tag");
    
 
String tvdata[] ={Tagid,tname,tcode,tag};
          model.addRow(tvdata);
  
            }
        }
        
         catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }
        /**
         * This method is called from within the constructor to initialize the
         * form. WARNING: Do NOT modify this code. The content of this method is
         * always regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Savebtn = new javax.swing.JButton();
        Savebtn1 = new javax.swing.JButton();
        Savebtn2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 0, 0));
        jLabel9.setText("           Manage Tag");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Subject Name", "Subject Code", "Related Tag"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton5.setText("Delete");
        jButton5.setToolTipText("");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Add Tag");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " Lecture", " tutorial", " practical" }));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Tag Code");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Related Tag");

        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Tag Name");

        Savebtn.setBackground(new java.awt.Color(102, 102, 255));
        Savebtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Savebtn.setText("Back");
        Savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SavebtnActionPerformed(evt);
            }
        });

        Savebtn1.setBackground(new java.awt.Color(102, 102, 255));
        Savebtn1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Savebtn1.setText("Save");
        Savebtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Savebtn1ActionPerformed(evt);
            }
        });

        Savebtn2.setBackground(new java.awt.Color(102, 102, 255));
        Savebtn2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Savebtn2.setText("Clear");
        Savebtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Savebtn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(348, 348, 348)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Savebtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(Savebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(11, 11, 11)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(168, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(105, 105, 105))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(257, 257, 257)
                    .addComponent(Savebtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(706, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(123, 123, 123)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Savebtn)
                    .addComponent(Savebtn2))
                .addContainerGap(84, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(637, Short.MAX_VALUE)
                    .addComponent(Savebtn1)
                    .addGap(85, 85, 85)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
         
    
        int column = 0;
int row = jTable1.getSelectedRow();
String value = jTable1.getModel().getValueAt(row, column).toString();

 System.out.println("sdsd"+value);

        Statement st;

        ResultSet rs;

      String dbURL = "jdbc:sqlite:C:\\Users\\DELL™\\Documents\\NetBeansProjects\\sqllite\\Resourses.db";

        try {

            Connection con = DriverManager.getConnection(dbURL);

            if (con != null) {
//                System.out.println("Connected");
            }
            st = con.createStatement();
            
            
            rs = st.executeQuery("SELECT * FROM Tag where Tagid = "+value);
     DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
          model.setRowCount(0);
 
            while (rs.next()) {
      Integer Lecid = rs.getInt("Tagid");
String Tagid = Integer.toString(Lecid);
String tag = rs.getString("tag");
  String tname = rs.getString("tname");
    String tcode = rs.getString("tcode");
    

String tvdata[] ={Tagid,tag,tname,tcode};

   jComboBox1.setSelectedItem(tag);
  
   jTextField1.setText(tname);
      jTextField2.setText(tcode);


show_user();
// 
            }
        } catch (SQLException ex) {
            ex.printStackTrace();

        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
   DefaultTableModel model = (DefaultTableModel) this.jTable1.getModel();
   int[] rows = jTable1.getSelectedRows();
   for(int i=0;i<rows.length;i++){
     model.removeRow(rows[i]-i);
   }
      
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       try {
                Tag frame = new Tag();
                dispose();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void SavebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SavebtnActionPerformed
        // TODO add your handling code here:

        
         try{
                    Welcome frame = new Welcome();
                dispose();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        
        
        
        
        
    }//GEN-LAST:event_SavebtnActionPerformed

    private void Savebtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Savebtn1ActionPerformed
        // TODO add your handling code here:
        
          Savebtn1.setBackground(Color.BLUE);
    String dbURL = "jdbc:sqlite:C:\\Users\\DELL™\\Documents\\NetBeansProjects\\sqllite\\Resourses.db";

  int column = 0;
 int row = jTable1.getSelectedRow();
String value = jTable1.getModel().getValueAt(row, column).toString();

try {

    Connection conn = DriverManager.getConnection(dbURL);
    
    if (conn != null) {
        System.out.println("Connected");
     }
// String selectedValue = jComboBox1.getSelectedItem().toString();
  String tag = jComboBox1.getSelectedItem().toString();
String tname = jTextField1.getText();
String tcode = jTextField2.getText();
    
    
//jTextField2.setText(jTextField1.getText()+"."+selectedValue1);
//  String sql = "INSERT INTO Lecturer (lname,emp_id,faculty,department,Center,building,level,rank) VALUES (?, ?, ?, ?,?,?,?,?)";


   String sql="Update Tag set tag='"+tag+"', tname='"+tname+"', tcode='"+tcode+"' where Tagid='"+value+"' ";


  System.out.println("A new user was updated successfully!");
                    JOptionPane.showMessageDialog(null, "updated successfully!", "Alert", JOptionPane.OK_OPTION);        

//}

} catch (SQLException ex) {
    ex.printStackTrace();

        }                     
    }//GEN-LAST:event_Savebtn1ActionPerformed

    private void Savebtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Savebtn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Savebtn2ActionPerformed

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
            java.util.logging.Logger.getLogger(ManageTag.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageTag.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageTag.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageTag.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageTag().setVisible(true);
                

            }
      

 
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Savebtn;
    private javax.swing.JButton Savebtn1;
    private javax.swing.JButton Savebtn2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables


    private String JRadioButton(String java) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
}
