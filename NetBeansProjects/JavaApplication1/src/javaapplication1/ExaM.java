package javaapplication1;

import java.awt.Color;
import static java.lang.Integer.parseInt;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ExaM extends javax.swing.JFrame {

    JTable table;
    Connection c;
    Statement s;

    public ExaM() {
        initComponents();
        table = new JTable();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///database1", "root", "abhijite");
            s = c.createStatement();
            ResultSet rs = s.executeQuery("select * from exam  where date>current_date() order by date asc");
//            table.setModel(DbUtils.resultSetToTableModel(rs));
            int no = 1;
            while (rs.next()) {
//                   System.out.println(rs.getInt(1)+ " "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getInt(5));
//                String no = String.valueOf(rs.getInt("no"));
                String course = rs.getString("course");
                String type = rs.getString("type");
                String mark = rs.getString("marks");
                String date = rs.getString("date");

                String tdata[] = {no + "", course, type, mark, date};
                DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
                table.addRow(tdata);
                no++;
            }

        } catch (Exception e) {
            e.printStackTrace();
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

        jLabel1 = new javax.swing.JLabel();
        txtcourse = new javax.swing.JTextField();
        examtype = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtmark = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnadd = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        btnupdate1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jdate = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        searchcourse = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(100, 100));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Course Code     ");

        examtype.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        examtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quiz", "Mid", "Final" }));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Marks               ");

        txtmark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmarkActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Course", "Type", "Marks", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(50);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        btnadd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnadd.setText("ADD ");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btndelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btndelete.setText("DELETE");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Upcoming Exam", "All", "Previous Exam" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        btnupdate1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnupdate1.setText("UPDATE");
        btnupdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdate1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel5.setText("Upcoming Exam:");

        jdate.setDateFormatString("yyyy-MM-dd");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("EXAM CORNER");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Course Type   ");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Date");

        jLabel43.setBackground(new java.awt.Color(0, 76, 142));
        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("MY PLAN");
        jLabel43.setOpaque(true);

        searchcourse.setForeground(new java.awt.Color(153, 153, 153));
        searchcourse.setText("Enter course-code");
        searchcourse.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchcourseFocusGained(evt);
            }
        });
        searchcourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchcourseActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(searchcourse, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnadd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jdate, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtcourse, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtmark, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                                            .addComponent(examtype, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addContainerGap(266, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnupdate1)
                                .addGap(69, 69, 69)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40))))))
            .addComponent(jLabel43, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtcourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(examtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtmark, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btndelete)
                    .addComponent(btnupdate1)
                    .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchcourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
        String course = txtcourse.getText();
        String type = examtype.getSelectedItem().toString();
        String mark = txtmark.getText();
        String date = ((JTextField) jdate.getDateEditor().getUiComponent()).getText();
        if (type == "Mid" && parseInt(mark) > 30) {
            JOptionPane.showMessageDialog(null, "Enter valid Mark");
            return;
        }
        if (type == "Quiz" && parseInt(mark) > 15) {
            JOptionPane.showMessageDialog(null, "Enter valid Mark");
            return;
        }
        if (type == "Final" && parseInt(mark) > 90) {
            JOptionPane.showMessageDialog(null, "Enter valid Mark");
            return;
        }
        if (course.equals("")) {
            JOptionPane.showMessageDialog(null, "Course name is empty");
        } else {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                c = DriverManager.getConnection("jdbc:mysql:///database1", "root", "abhijite");
                s = c.createStatement();
                String query = "insert into exam values('" + course.toUpperCase() + "','" + type + "','" + mark + "','" + date + "')";
                s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Added Successfully");
                setVisible(false);
                new ExaM().setVisible(true);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnaddActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        if (jTable1.getSelectedRowCount() == 0 || jTable1.getSelectedRowCount() > 1) {
            JOptionPane.showMessageDialog(this, "Please Select a Row..");
        } else {
            DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
            String title = tblModel.getValueAt(jTable1.getSelectedRow(), 1).toString();
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                c = DriverManager.getConnection("jdbc:mysql:///database1", "root", "abhijite");
                s = c.createStatement();
                String query = "delete from exam where course='" + ttitle + "' and type='" + ttype + "'";
                s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Topic Deleted Successfully");
                setVisible(false);
                new ExaM().setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
        first btn1 = new first();
        btn1.show();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed

        String value = jComboBox2.getSelectedItem().toString();
        jTable1.setModel(new DefaultTableModel(null, new String[]{"No", "Course", "Type", "Marks", "Date"}));
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///database1", "root", "abhijite");
            s = c.createStatement();
            ResultSet rs;
            System.out.println(value);
            if (value == "All") {
                jLabel5.setText("All Exam Schedule ");
                rs = s.executeQuery("select * from exam order by date asc");
            } else if (value == "Upcoming Exam") {
                jLabel5.setText("Upcoming Exam ");
                rs = s.executeQuery("select * from exam  where date>current_date() order by date asc");
            } else {
                jLabel5.setText("Previous Exam ");
                rs = s.executeQuery("select * from exam  where date<current_date() order by date desc");
            }
            //            table.setModel(DbUtils.resultSetToTableModel(rs));
            int no = 1;
            while (rs.next()) {
                String course = rs.getString("course");
                String type = rs.getString("type");
                String mark = rs.getString("marks");
                String date = rs.getString("date");

                String tdata[] = {no + "", course, type, mark, date};
                DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
                table.addRow(tdata);
                no++;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void btnupdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdate1ActionPerformed
        DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
        if (jTable1.getSelectedRowCount() == 1) {
            String course = txtcourse.getText();
            String type = examtype.getSelectedItem().toString();
            String mark = txtmark.getText();
            String date = ((JTextField) jdate.getDateEditor().getUiComponent()).getText();

            tblModel.setValueAt(course, jTable1.getSelectedRow(), 1);
//            tblModel.setValueAt(sup, jTable1.getSelectedRow(), 2);
//            tblModel.setValueAt(note, jTable1.getSelectedRow(), 3);
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                c = DriverManager.getConnection("jdbc:mysql:///database1", "root", "abhijite");
                s = c.createStatement();
                String query = "update exam set course = '" + course + "', type = '" + type + "', marks = '" + mark + "',date= '" + date + "' where course='" + ttitle + "' and type='" + ttype + "'";
                s.executeUpdate(query);
                //            System.out.println(query);
                JOptionPane.showMessageDialog(this, "Update Successfully..");
                setVisible(false);
                new ExaM().setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            if (jTable1.getSelectedRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Empty Table..");
            } else {
                JOptionPane.showMessageDialog(this, "Multiple Row Selected..");
            }
        }
    }//GEN-LAST:event_btnupdate1ActionPerformed
    String ttitle = "";
    String ttype = "";
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();

        ttitle = tblModel.getValueAt(jTable1.getSelectedRow(), 1).toString();
        ttype = tblModel.getValueAt(jTable1.getSelectedRow(), 2).toString();
        String mark = tblModel.getValueAt(jTable1.getSelectedRow(), 3).toString();

        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse((String) tblModel.getValueAt(jTable1.getSelectedRow(), 4).toString());
            jdate.setDate(date);
        } catch (Exception e) {
            e.printStackTrace();
        }
        txtcourse.setText(ttitle);
        txtmark.setText(mark);
        if (ttype.equals("Quiz"))
            examtype.setSelectedIndex(0);
        else if (ttype.equals("Mid"))
            examtype.setSelectedIndex(1);
        else
            examtype.setSelectedIndex(2);
    }//GEN-LAST:event_jTable1MouseClicked

    private void txtmarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmarkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmarkActionPerformed

    private void searchcourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchcourseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchcourseActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String value = jComboBox2.getSelectedItem().toString();
        jTable1.setModel(new DefaultTableModel(null, new String[]{"No", "Course", "Type", "Marks", "Date"}));
        System.out.println(s);
        jLabel5.setText("Search Result");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///database1", "root", "abhijite");
            s = c.createStatement();
            ResultSet rs = s.executeQuery("select * from exam where course ='" + searchcourse.getText().toUpperCase() + "'order by date asc");
            int no = 1;
            while (rs.next()) {
                String course = rs.getString("course");
                String type = rs.getString("type");
                String mark = rs.getString("marks");
                String date = rs.getString("date");

                String tdata[] = {no + "", course, type, mark, date};
                DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
                table.addRow(tdata);
                no++;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void searchcourseFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchcourseFocusGained
        if(searchcourse.getText().equals("Enter course-code"))
        {
            searchcourse.setText("");
            searchcourse.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_searchcourseFocusGained

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
            java.util.logging.Logger.getLogger(ExaM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExaM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExaM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExaM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExaM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnupdate1;
    private javax.swing.JComboBox<String> examtype;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private com.toedter.calendar.JDateChooser jdate;
    private javax.swing.JTextField searchcourse;
    private javax.swing.JTextField txtcourse;
    private javax.swing.JTextField txtmark;
    // End of variables declaration//GEN-END:variables
}
