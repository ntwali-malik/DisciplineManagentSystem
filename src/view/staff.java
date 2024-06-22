package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
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
public class staff extends javax.swing.JFrame {

    /**
     * Creates new form staff
     */
    public staff() {
        initComponents();
        updateUserBtn.setVisible(false);
        deleteUserBtn.setVisible(false);
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
        jPanel20 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        staffSearchBox = new javax.swing.JTextField();
        staffSearchBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        addUserBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        deleteUserBtn = new javax.swing.JButton();
        passwordBox = new javax.swing.JPasswordField();
        fullNamesBox = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        emailBox = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        updateUserBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        refreshBtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        StaffTable = new javax.swing.JTable();
        backToDashboardBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        msg1.setBackground(new java.awt.Color(235, 252, 252));
        msg1.setFont(new java.awt.Font("Unispace", 1, 36)); // NOI18N
        msg1.setForeground(new java.awt.Color(235, 252, 252));
        msg1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        msg1.setText("STAFF");
        msg1.setAlignmentX(1.0F);
        msg1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(msg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1250, 69));

        jPanel20.setBackground(new java.awt.Color(0, 102, 102));
        jPanel20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true));
        jPanel20.setForeground(new java.awt.Color(0, 102, 102));

        jLabel33.setBackground(new java.awt.Color(51, 0, 153));
        jLabel33.setFont(new java.awt.Font("Unispace", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(235, 252, 252));
        jLabel33.setText("Enter the Id of the staff you want to search");

        staffSearchBox.setBackground(new java.awt.Color(235, 252, 252));
        staffSearchBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffSearchBoxActionPerformed(evt);
            }
        });

        staffSearchBtn.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        staffSearchBtn.setForeground(new java.awt.Color(0, 102, 102));
        staffSearchBtn.setText("Search");
        staffSearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffSearchBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addGap(0, 190, Short.MAX_VALUE))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(staffSearchBox)
                        .addGap(18, 18, 18)
                        .addComponent(staffSearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(staffSearchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(staffSearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 75, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        addUserBtn.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        addUserBtn.setForeground(new java.awt.Color(0, 102, 102));
        addUserBtn.setText("Add");
        addUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserBtnActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(51, 0, 153));
        jLabel7.setFont(new java.awt.Font("Unispace", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Full Names");

        deleteUserBtn.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        deleteUserBtn.setForeground(new java.awt.Color(0, 102, 102));
        deleteUserBtn.setText("Delete");
        deleteUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteUserBtnActionPerformed(evt);
            }
        });

        passwordBox.setBackground(new java.awt.Color(235, 252, 252));

        fullNamesBox.setBackground(new java.awt.Color(235, 252, 252));

        jComboBox1.setBackground(new java.awt.Color(235, 252, 252));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Teacher", " " }));

        jLabel10.setBackground(new java.awt.Color(51, 0, 153));
        jLabel10.setFont(new java.awt.Font("Unispace", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Role");

        jLabel8.setBackground(new java.awt.Color(51, 0, 153));
        jLabel8.setFont(new java.awt.Font("Unispace", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Email");

        emailBox.setBackground(new java.awt.Color(235, 252, 252));

        jLabel9.setBackground(new java.awt.Color(51, 0, 153));
        jLabel9.setFont(new java.awt.Font("Unispace", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Password");

        updateUserBtn.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        updateUserBtn.setForeground(new java.awt.Color(0, 102, 102));
        updateUserBtn.setText("Update");
        updateUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateUserBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(fullNamesBox, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(emailBox, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(passwordBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(addUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(updateUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deleteUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(6, 6, 6)
                .addComponent(fullNamesBox, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(6, 6, 6)
                .addComponent(emailBox, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(6, 6, 6)
                .addComponent(passwordBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(updateUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(deleteUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 221, -1, 500));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        refreshBtn.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        refreshBtn.setForeground(new java.awt.Color(0, 102, 102));
        refreshBtn.setText("Refresh");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });

        StaffTable.setBackground(new java.awt.Color(235, 252, 252));
        StaffTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(StaffTable);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(refreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addComponent(refreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(688, 221, 676, 500));

        backToDashboardBtn.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        backToDashboardBtn.setForeground(new java.awt.Color(0, 102, 102));
        backToDashboardBtn.setText("Back");
        backToDashboardBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToDashboardBtnActionPerformed(evt);
            }
        });
        jPanel1.add(backToDashboardBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1273, 0, 100, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1374, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void staffSearchBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffSearchBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_staffSearchBoxActionPerformed

    private void staffSearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffSearchBtnActionPerformed
        // Retrieve search criteria (ID) from the staffSearchBox
        String searchId = staffSearchBox.getText().trim();

        // Validate if the searchId is not empty
        if (searchId.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a user ID to search.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // JDBC connection parameters
        String url = "jdbc:postgresql://localhost:5432/displine_management_system_db";
        String user = "postgres";
        String password = "123";

        // SQL SELECT query to retrieve user information based on ID
        String selectSql = "SELECT * FROM users WHERE user_id = ?";

        try (Connection conn = DriverManager.getConnection(url, user, password);
                PreparedStatement statement = conn.prepareStatement(selectSql)) {

            // Set the ID parameter for the prepared statement
            statement.setInt(1, Integer.parseInt(searchId));

            // Execute the SQL query
            ResultSet rs = statement.executeQuery();

            // Check if a user with the entered ID exists
            if (rs.next()) {
                // Populate the text boxes and combo box with user information
                fullNamesBox.setText(rs.getString("fullnames"));
                emailBox.setText(rs.getString("email"));
                passwordBox.setText(rs.getString("password"));
                jComboBox1.setSelectedItem(rs.getString("role"));
                updateUserBtn.setVisible(true);
                deleteUserBtn.setVisible(true);
            } else {
                // User not found, display message to the user
                JOptionPane.showMessageDialog(this, "User with ID " + searchId + " not found.", "Search Result", JOptionPane.INFORMATION_MESSAGE);
                // Clear the text boxes and combo box
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid user ID. Please enter a valid numeric ID.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_staffSearchBtnActionPerformed

    private void addUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserBtnActionPerformed
        // Retrieve user information from GUI components
        String fullnames = fullNamesBox.getText(); // Assuming this is a JTextField for entering full names
        String email = emailBox.getText(); // Assuming this is a JTextField for entering email
        String pwd = new String(passwordBox.getPassword()); // Assuming this is a JPasswordField for entering password
        String role = jComboBox1.getSelectedItem().toString(); // Assuming this is a JComboBox for selecting the user role

        if (fullnames.isEmpty() || email.isEmpty() || pwd.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all required fields.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        // JDBC connection parameters
        String url = "jdbc:postgresql://localhost:5432/displine_management_system_db";
        String user = "postgres";
        String password = "123";

        // SQL INSERT query to add the user to the "users" table
        String insertSql = "INSERT INTO users (fullnames, email, password, role) VALUES (?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(url, user, password);
                PreparedStatement statement = conn.prepareStatement(insertSql)) {
            // Set parameters for the prepared statement
            statement.setString(1, fullnames);
            statement.setString(2, email);
            statement.setString(3, pwd);
            statement.setString(4, role);

            // Execute the INSERT query
            int rowsAffected = statement.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "User added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                clearTextFields(); // Assuming you have a method to clear the text fields after adding a user
            } else {
                JOptionPane.showMessageDialog(this, "Failed to add user!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addUserBtnActionPerformed

    private void updateUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateUserBtnActionPerformed
        // Retrieve user information from text boxes and combo box
        String fullnames = fullNamesBox.getText();
        String email = emailBox.getText();
        String pwd = passwordBox.getText();
        String role = jComboBox1.getSelectedItem().toString();

        // Validate if all required fields are filled
        if (fullnames.isEmpty() || email.isEmpty() || pwd.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all required fields.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // JDBC connection parameters
        String url = "jdbc:postgresql://localhost:5432/displine_management_system_db";
        String user = "postgres";
        String password = "123";

        // SQL UPDATE query to update user information in the "users" table
        String updateSql = "UPDATE users SET fullnames = ?, email = ?, password = ?, role = ? WHERE user_id = ?";

        try (Connection conn = DriverManager.getConnection(url, user, password);
                PreparedStatement statement = conn.prepareStatement(updateSql)) {

            // Set parameters for the prepared statement
            statement.setString(1, fullnames);
            statement.setString(2, email);
            statement.setString(3, pwd);
            statement.setString(4, role);
            statement.setInt(5, Integer.parseInt(staffSearchBox.getText()));

            // Execute the UPDATE query
            int rowsAffected = statement.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "User updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                // Optionally, clear the text boxes and combo box after update
                clearTextFields();
            } else {
                JOptionPane.showMessageDialog(this, "Failed to update user!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_updateUserBtnActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        // JDBC connection parameters
        String url = "jdbc:postgresql://localhost:5432/displine_management_system_db";
        String user = "postgres";
        String password = "123";

        // SQL SELECT query to retrieve all data from the "users" table
        String selectSql = "SELECT * FROM users";

        try (Connection conn = DriverManager.getConnection(url, user, password);
                PreparedStatement statement = conn.prepareStatement(selectSql);
                ResultSet rs = statement.executeQuery()) {

            // Clear existing data from the jTable
            DefaultTableModel model = (DefaultTableModel) StaffTable.getModel();
            model.setRowCount(0);

            // Set column titles
            model.setColumnIdentifiers(new Object[]{"User ID", "Full Names", "Email", "Role"});

            // Populate the jTable with the retrieved data
            while (rs.next()) {
                Object[] row = {
                    rs.getInt("user_id"),
                    rs.getString("fullnames"),
                    rs.getString("email"),
                    rs.getString("role")
                };
                model.addRow(row);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_refreshBtnActionPerformed

    private void deleteUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteUserBtnActionPerformed
        // Retrieve user ID from the search box
        String userId = staffSearchBox.getText().trim();

        // Validate if a user ID is provided
        if (userId.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a user ID to delete.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Confirm with the user before deleting
        int option = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this user?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (option != JOptionPane.YES_OPTION) {
            return; // Cancel deletion if user selects No
        }

        // JDBC connection parameters
        String url = "jdbc:postgresql://localhost:5432/displine_management_system_db";
        String user = "postgres";
        String password = "123";

        // SQL DELETE query to remove the user from the "users" table
        String deleteSql = "DELETE FROM users WHERE user_id = ?";

        try (Connection conn = DriverManager.getConnection(url, user, password);
                PreparedStatement statement = conn.prepareStatement(deleteSql)) {

            // Set the user ID parameter for the prepared statement
            statement.setInt(1, Integer.parseInt(userId));

            // Execute the DELETE query
            int rowsAffected = statement.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "User deleted successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                // Optionally, clear the text boxes and combo box after deletion
                clearTextFields();
            } else {
                JOptionPane.showMessageDialog(this, "Failed to delete user!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid user ID. Please enter a valid numeric ID.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_deleteUserBtnActionPerformed

    private void backToDashboardBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToDashboardBtnActionPerformed
        Dashboard f = new Dashboard();
        f.show();
        this.dispose();
    }//GEN-LAST:event_backToDashboardBtnActionPerformed

    private void clearTextFields() {
        fullNamesBox.setText(""); // Assuming this is the JTextField for full names
        emailBox.setText(""); // Assuming this is the JTextField for email
        passwordBox.setText(""); // Assuming this is the JPasswordField for password
        jComboBox1.setSelectedIndex(0); // Assuming this is the JComboBox for selecting the user role
        staffSearchBox.setText("");
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
            java.util.logging.Logger.getLogger(staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new staff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable StaffTable;
    private javax.swing.JButton addUserBtn;
    private javax.swing.JButton backToDashboardBtn;
    private javax.swing.JButton deleteUserBtn;
    private javax.swing.JTextField emailBox;
    private javax.swing.JTextField fullNamesBox;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel msg1;
    private javax.swing.JPasswordField passwordBox;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JTextField staffSearchBox;
    private javax.swing.JButton staffSearchBtn;
    private javax.swing.JButton updateUserBtn;
    // End of variables declaration//GEN-END:variables
}
