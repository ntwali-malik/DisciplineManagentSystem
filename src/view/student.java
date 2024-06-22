package view;

import java.awt.Window;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author N.Maliki
 */
public class student extends javax.swing.JFrame {

    /**
     * Creates new form student
     */
    public student() {
        initComponents();
        populateClassCombo();
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
        msg1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        firstNameBox = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        lastNameBox = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        guardianNumberBox = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        dobBox = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        disciplineMarksBox = new javax.swing.JTextField();
        addStudentBtn = new javax.swing.JButton();
        updateStudentBtn = new javax.swing.JButton();
        deleteStudentBtn = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        allStudentsTable = new javax.swing.JTable();
        printAllStudentsBtn = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        searchTextField = new javax.swing.JTextField();
        SearchBtn = new javax.swing.JButton();
        classCombo = new javax.swing.JComboBox<>();
        refreshStudentBtn = new javax.swing.JButton();
        backToDashBoardBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("STUDENTS");

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        msg1.setBackground(new java.awt.Color(235, 252, 252));
        msg1.setFont(new java.awt.Font("Unispace", 1, 36)); // NOI18N
        msg1.setForeground(new java.awt.Color(235, 252, 252));
        msg1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        msg1.setText("STUDENT");
        msg1.setAlignmentX(1.0F);
        msg1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setBackground(new java.awt.Color(51, 0, 153));
        jLabel7.setFont(new java.awt.Font("Unispace", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Class");

        jLabel8.setBackground(new java.awt.Color(51, 0, 153));
        jLabel8.setFont(new java.awt.Font("Unispace", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("First Name");

        firstNameBox.setBackground(new java.awt.Color(235, 252, 252));

        jLabel9.setBackground(new java.awt.Color(51, 0, 153));
        jLabel9.setFont(new java.awt.Font("Unispace", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Last Name");

        lastNameBox.setBackground(new java.awt.Color(235, 252, 252));

        jLabel10.setBackground(new java.awt.Color(51, 0, 153));
        jLabel10.setFont(new java.awt.Font("Unispace", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Guardian's Number");

        guardianNumberBox.setBackground(new java.awt.Color(235, 252, 252));

        jLabel11.setBackground(new java.awt.Color(51, 0, 153));
        jLabel11.setFont(new java.awt.Font("Unispace", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Date of Birth");

        dobBox.setBackground(new java.awt.Color(235, 252, 252));

        jLabel12.setBackground(new java.awt.Color(51, 0, 153));
        jLabel12.setFont(new java.awt.Font("Unispace", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Discipline Marks");

        disciplineMarksBox.setBackground(new java.awt.Color(235, 252, 252));

        addStudentBtn.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        addStudentBtn.setForeground(new java.awt.Color(0, 102, 102));
        addStudentBtn.setText("Add Student");
        addStudentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentBtnActionPerformed(evt);
            }
        });

        updateStudentBtn.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        updateStudentBtn.setForeground(new java.awt.Color(0, 102, 102));
        updateStudentBtn.setText("Update Student");
        updateStudentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateStudentBtnActionPerformed(evt);
            }
        });

        deleteStudentBtn.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        deleteStudentBtn.setForeground(new java.awt.Color(0, 102, 102));
        deleteStudentBtn.setText("Delete Student");
        deleteStudentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteStudentBtnActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel33.setBackground(new java.awt.Color(51, 0, 153));
        jLabel33.setFont(new java.awt.Font("Unispace", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(235, 252, 252));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("ALL STUDENTS");
        jLabel33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        allStudentsTable.setBackground(new java.awt.Color(235, 252, 252));
        allStudentsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(allStudentsTable);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                .addContainerGap())
        );

        printAllStudentsBtn.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        printAllStudentsBtn.setForeground(new java.awt.Color(0, 102, 102));
        printAllStudentsBtn.setText("Print");
        printAllStudentsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printAllStudentsBtnActionPerformed(evt);
            }
        });

        jPanel15.setBackground(new java.awt.Color(0, 102, 102));
        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        jPanel15.setForeground(new java.awt.Color(0, 102, 102));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setBackground(new java.awt.Color(51, 0, 153));
        jLabel31.setFont(new java.awt.Font("Unispace", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(235, 252, 252));
        jLabel31.setText("Enter the ID of the student");
        jPanel15.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 2, 300, 40));

        searchTextField.setBackground(new java.awt.Color(235, 252, 252));
        searchTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextFieldActionPerformed(evt);
            }
        });
        jPanel15.add(searchTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 230, 40));

        SearchBtn.setFont(new java.awt.Font("Unispace", 0, 18)); // NOI18N
        SearchBtn.setForeground(new java.awt.Color(0, 102, 102));
        SearchBtn.setText("Search");
        SearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBtnActionPerformed(evt);
            }
        });
        jPanel15.add(SearchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 50, 200, 40));

        classCombo.setBackground(new java.awt.Color(235, 252, 252));

        refreshStudentBtn.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        refreshStudentBtn.setForeground(new java.awt.Color(0, 102, 102));
        refreshStudentBtn.setText("Refresh");
        refreshStudentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshStudentBtnActionPerformed(evt);
            }
        });

        backToDashBoardBtn.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        backToDashBoardBtn.setForeground(new java.awt.Color(0, 102, 102));
        backToDashBoardBtn.setText("Back");
        backToDashBoardBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToDashBoardBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(firstNameBox, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(lastNameBox, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(classCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(guardianNumberBox, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(disciplineMarksBox, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(dobBox, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addStudentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(updateStudentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(deleteStudentBtn)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addComponent(refreshStudentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(130, 130, 130)
                                .addComponent(printAllStudentsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(msg1, javax.swing.GroupLayout.PREFERRED_SIZE, 968, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backToDashBoardBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(msg1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backToDashBoardBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(refreshStudentBtn))
                            .addComponent(printAllStudentsBtn)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(6, 6, 6)
                        .addComponent(firstNameBox, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel9)
                        .addGap(6, 6, 6)
                        .addComponent(lastNameBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel7)
                        .addGap(6, 6, 6)
                        .addComponent(classCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel10)
                        .addGap(6, 6, 6)
                        .addComponent(guardianNumberBox, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel12)
                        .addGap(6, 6, 6)
                        .addComponent(disciplineMarksBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel11)
                        .addGap(6, 6, 6)
                        .addComponent(dobBox, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(addStudentBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(updateStudentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteStudentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(16, 16, 16))
        );

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addStudentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentBtnActionPerformed
        // Retrieve student information from GUI components
        String firstName = firstNameBox.getText();
        String lastName = lastNameBox.getText();
        String guardiansNumber = guardianNumberBox.getText();
        int disciplineMarks = Integer.parseInt(disciplineMarksBox.getText());
        String dateOfBirth = dobBox.getText();
        String selectedClass = (String) classCombo.getSelectedItem(); // Get the selected class from the JComboBox

        // JDBC connection parameters
        String url = "jdbc:postgresql://localhost:5432/displine_management_system_db";
        String user = "postgres";
        String password = "123";

        // SQL SELECT statement to check if a student with the same name exists
        String selectSql = "SELECT COUNT(*) FROM students WHERE first_name = ? AND last_name = ?";

        // SQL INSERT statement
        String insertSql = "INSERT INTO students (first_name, last_name, guardians_number, discipline_marks, date_of_birth, class_name) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = DriverManager.getConnection(url, user, password);
                PreparedStatement selectStmt = conn.prepareStatement(selectSql);
                PreparedStatement insertStmt = conn.prepareStatement(insertSql)) {
            // Check if a student with the same name already exists
            selectStmt.setString(1, firstName);
            selectStmt.setString(2, lastName);
            ResultSet rs = selectStmt.executeQuery();
            rs.next();
            int count = rs.getInt(1);
            rs.close();

            if (count > 0) {
                JOptionPane.showMessageDialog(this, "A student with the same name already exists!", "Error", JOptionPane.ERROR_MESSAGE);
                clearTextFields();
                return; // Exit method without executing the INSERT statement
            }

            // Set parameters for the prepared statement
            insertStmt.setString(1, firstName);
            insertStmt.setString(2, lastName);
            insertStmt.setString(3, guardiansNumber);
            insertStmt.setInt(4, disciplineMarks);
            insertStmt.setString(5, dateOfBirth);
            insertStmt.setString(6, selectedClass); // Set the selected class name

            // Execute the SQL statement
            int rowsAffected = insertStmt.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Student added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                clearTextFields();
            } else {
                JOptionPane.showMessageDialog(this, "Failed to add student!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addStudentBtnActionPerformed

    private void updateStudentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateStudentBtnActionPerformed
        // Retrieve the student ID entered in searchTextField
        int studentId = Integer.parseInt(searchTextField.getText());

        // Retrieve the updated student information from GUI components
        String updatedFirstName = firstNameBox.getText();
        String updatedLastName = lastNameBox.getText();
        String updatedGuardiansNumber = guardianNumberBox.getText();
        int updatedDisciplineMarks = Integer.parseInt(disciplineMarksBox.getText());
        String updatedDob = dobBox.getText();

        // JDBC connection parameters
        String url = "jdbc:postgresql://localhost:5432/displine_management_system_db";
        String user = "postgres";
        String password = "123";

        // SQL UPDATE statement to update student details
        String updateSql = "UPDATE students SET first_name = ?, last_name = ?, guardians_number = ?, discipline_marks = ?, date_of_birth = ? WHERE student_id = ?";

        try (Connection conn = DriverManager.getConnection(url, user, password);
                PreparedStatement statement = conn.prepareStatement(updateSql)) {
            // Set parameters for the prepared statement
            statement.setString(1, updatedFirstName);
            statement.setString(2, updatedLastName);
            statement.setString(3, updatedGuardiansNumber);
            statement.setInt(4, updatedDisciplineMarks);
            statement.setString(5, updatedDob);
            statement.setInt(6, studentId);

            // Execute the UPDATE query
            int rowsAffected = statement.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Student updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                clearTextFields();
            } else {
                JOptionPane.showMessageDialog(this, "Failed to update student!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_updateStudentBtnActionPerformed

    private void deleteStudentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteStudentBtnActionPerformed
        // Retrieve the student ID entered in searchTextField
        int studentId = Integer.parseInt(searchTextField.getText());
        
        // Confirm with the user before deleting
        int option = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this user?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (option != JOptionPane.YES_OPTION) {
            return; // Cancel deletion if user selects No
        }
        // JDBC connection parameters
        String url = "jdbc:postgresql://localhost:5432/displine_management_system_db";
        String user = "postgres";
        String password = "123";

        // SQL DELETE statement to delete a student
        String deleteSql = "DELETE FROM students WHERE student_id = ?";

        try (Connection conn = DriverManager.getConnection(url, user, password);
                PreparedStatement statement = conn.prepareStatement(deleteSql)) {
            // Set the student ID parameter for the prepared statement
            statement.setInt(1, studentId);

            // Execute the DELETE query
            int rowsAffected = statement.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Student deleted successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                // Clear GUI components after deletion
                clearTextFields();
            } else {
                JOptionPane.showMessageDialog(this, "Failed to delete student!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_deleteStudentBtnActionPerformed

    private void printAllStudentsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printAllStudentsBtnActionPerformed
       MessageFormat header = new MessageFormat("DISPLINE MANAGEMENT SYSTEM");
       MessageFormat footer = new MessageFormat("©25753__Maliki Ntwali");
       try
       {
           allStudentsTable.print(JTable.PrintMode.FIT_WIDTH,header,footer);
       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(null, e);
       }
    }//GEN-LAST:event_printAllStudentsBtnActionPerformed

    private void searchTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTextFieldActionPerformed

    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnActionPerformed
        // Retrieve the student ID entered in searchTextField
        int studentId = Integer.parseInt(searchTextField.getText());

        // JDBC connection parameters
        String url = "jdbc:postgresql://localhost:5432/displine_management_system_db";
        String user = "postgres";
        String password = "123";

        // SQL SELECT statement to retrieve student details by ID
        String selectSql = "SELECT * FROM students WHERE student_id = ?";

        try (Connection conn = DriverManager.getConnection(url, user, password);
                PreparedStatement statement = conn.prepareStatement(selectSql)) {
            // Set the student ID parameter for the prepared statement
            statement.setInt(1, studentId);

            // Execute the SELECT query
            ResultSet resultSet = statement.executeQuery();

            // Check if a student with the entered ID exists
            if (resultSet.next()) {
                // Display student details in GUI components
                firstNameBox.setText(resultSet.getString("first_name"));
                lastNameBox.setText(resultSet.getString("last_name"));
                guardianNumberBox.setText(resultSet.getString("guardians_number"));
                disciplineMarksBox.setText(String.valueOf(resultSet.getInt("discipline_marks")));
                dobBox.setText(resultSet.getString("date_of_birth"));
            } else {
                // If no student with the entered ID is found, display a message
                JOptionPane.showMessageDialog(this, "Student not found!", "Error", JOptionPane.ERROR_MESSAGE);
                // Clear GUI components
                firstNameBox.setText("");
                lastNameBox.setText("");
                guardianNumberBox.setText("");
                disciplineMarksBox.setText("");
                dobBox.setText("");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_SearchBtnActionPerformed

    private void refreshStudentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshStudentBtnActionPerformed
        // JDBC connection parameters
        String url = "jdbc:postgresql://localhost:5432/displine_management_system_db";
        String user = "postgres";
        String password = "123";

        // SQL SELECT statement to retrieve all student data
        String selectSql = "SELECT * FROM students";

        try (Connection conn = DriverManager.getConnection(url, user, password);
                Statement statement = conn.createStatement()) {
            // Execute the SELECT query
            ResultSet resultSet = statement.executeQuery(selectSql);

            // Create a new DefaultTableModel to hold the data
            DefaultTableModel model = new DefaultTableModel();

            // Add columns to the model
            model.addColumn("Student ID");
            model.addColumn("First Name");
            model.addColumn("Last Name");
            model.addColumn("Guardian's Number");
            model.addColumn("Discipline Marks");
            model.addColumn("Date of Birth");
            model.addColumn("Class Name");

            // Populate the model with data from the ResultSet
            while (resultSet.next()) {
                Object[] rowData = {
                    resultSet.getInt("student_id"),
                    resultSet.getString("first_name"),
                    resultSet.getString("last_name"),
                    resultSet.getString("guardians_number"),
                    resultSet.getInt("discipline_marks"),
                    resultSet.getString("date_of_birth"),
                    resultSet.getString("class_name")
                };
                model.addRow(rowData);
            }

            // Set the model to the jTable
            allStudentsTable.setModel(model);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_refreshStudentBtnActionPerformed

    private void backToDashBoardBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToDashBoardBtnActionPerformed
        Dashboard f = new Dashboard();
        f.show();
        this.dispose();
    }//GEN-LAST:event_backToDashBoardBtnActionPerformed
// Method to clear text fieldss

    private void clearTextFields() {
        firstNameBox.setText("");
        lastNameBox.setText("");
        guardianNumberBox.setText("");
        disciplineMarksBox.setText("");
        dobBox.setText("");
    }
    // Define a method to fetch class names from the database and populate the classCombo

    private void populateClassCombo() {
        // JDBC connection parameters
        String url = "jdbc:postgresql://localhost:5432/displine_management_system_db";
        String user = "postgres";
        String password = "123";

        // SQL SELECT statement to retrieve class names
        String selectSql = "SELECT class_name FROM class";

        try (Connection conn = DriverManager.getConnection(url, user, password);
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(selectSql)) {
            // Clear existing items in the combo box
            classCombo.removeAllItems();

            // Populate the combo box with class names
            while (resultSet.next()) {
                classCombo.addItem(resultSet.getString("class_name"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
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
            java.util.logging.Logger.getLogger(student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new student().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SearchBtn;
    private javax.swing.JButton addStudentBtn;
    private javax.swing.JTable allStudentsTable;
    private javax.swing.JButton backToDashBoardBtn;
    private javax.swing.JComboBox<String> classCombo;
    private javax.swing.JButton deleteStudentBtn;
    private javax.swing.JTextField disciplineMarksBox;
    private javax.swing.JTextField dobBox;
    private javax.swing.JTextField firstNameBox;
    private javax.swing.JTextField guardianNumberBox;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField lastNameBox;
    private javax.swing.JLabel msg1;
    private javax.swing.JButton printAllStudentsBtn;
    private javax.swing.JButton refreshStudentBtn;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JButton updateStudentBtn;
    // End of variables declaration//GEN-END:variables
}
