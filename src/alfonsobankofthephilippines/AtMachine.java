/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfonsobankofthephilippines;

import java.awt.Font;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author junie
 */
public class AtMachine extends javax.swing.JFrame {
  
    public AtMachine() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton7 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        labelBalance = new javax.swing.JLabel();
        labelReceipt = new javax.swing.JLabel();
        labelWithdraw = new javax.swing.JLabel();
        labelDeposit = new javax.swing.JLabel();
        labelDisplay = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        btnBalance = new javax.swing.JButton();
        btnWithdraw = new javax.swing.JButton();
        btnDeposit = new javax.swing.JButton();
        btnReceipt = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textReceipt = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        button0 = new javax.swing.JButton();
        button1 = new javax.swing.JButton();
        button2 = new javax.swing.JButton();
        button3 = new javax.swing.JButton();
        button4 = new javax.swing.JButton();
        button5 = new javax.swing.JButton();
        button6 = new javax.swing.JButton();
        button9 = new javax.swing.JButton();
        button8 = new javax.swing.JButton();
        button7 = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        enterButton2 = new javax.swing.JButton();
        enterButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        passwordButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jButton7.setText("jButton1");

        jButton10.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alfonso Bank of the Philippines | Welcome");
        setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\junie\\Downloads\\atm-1.1s-135px.png"));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 10));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelBalance.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        labelBalance.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelBalance.setText("Balance");
        jPanel4.add(labelBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 50, 30));

        labelReceipt.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        labelReceipt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelReceipt.setText("receipt");
        jPanel4.add(labelReceipt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 50, 30));

        labelWithdraw.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        labelWithdraw.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelWithdraw.setText("Withdraw");
        jPanel4.add(labelWithdraw, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 50, 30));

        labelDeposit.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        labelDeposit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDeposit.setText("Deposit");
        jPanel4.add(labelDeposit, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 50, 30));

        labelDisplay.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelDisplay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDisplay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jPanel4.add(labelDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 310, 130));

        userLabel.setBackground(new java.awt.Color(255, 51, 51));
        userLabel.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        userLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userLabel.setToolTipText("");
        userLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel4.add(userLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 200, 30));

        btnBalance.setText("SELECT");
        btnBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBalanceActionPerformed(evt);
            }
        });
        jPanel4.add(btnBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 90, 50));

        btnWithdraw.setText("SELECT");
        btnWithdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWithdrawActionPerformed(evt);
            }
        });
        jPanel4.add(btnWithdraw, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 90, 50));

        btnDeposit.setText("SELECT");
        btnDeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositActionPerformed(evt);
            }
        });
        jPanel4.add(btnDeposit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 90, 50));

        btnReceipt.setText("SELECT");
        btnReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReceiptActionPerformed(evt);
            }
        });
        jPanel4.add(btnReceipt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 90, 50));

        jPanel5.setBackground(new java.awt.Color(153, 255, 153));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 310, 130));

        jPanel6.setBackground(new java.awt.Color(153, 255, 153));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 200, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 560, 180));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 600, 190));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textReceipt.setColumns(20);
        textReceipt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        textReceipt.setRows(5);
        jScrollPane1.setViewportView(textReceipt);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 300));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, -1, 300));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        button0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/numbers/zero.png"))); // NOI18N
        button0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button0ActionPerformed(evt);
            }
        });
        jPanel3.add(button0, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 100, 60));

        button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/numbers/one.png"))); // NOI18N
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        jPanel3.add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 60));

        button2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/numbers/two.png"))); // NOI18N
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        jPanel3.add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 100, 60));

        button3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/numbers/three.png"))); // NOI18N
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });
        jPanel3.add(button3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 100, 60));

        button4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/numbers/four.png"))); // NOI18N
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });
        jPanel3.add(button4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 100, 60));

        button5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/numbers/five.png"))); // NOI18N
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });
        jPanel3.add(button5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 100, 60));

        button6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/numbers/six.png"))); // NOI18N
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });
        jPanel3.add(button6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 100, 60));

        button9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/numbers/nine.png"))); // NOI18N
        button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button9ActionPerformed(evt);
            }
        });
        jPanel3.add(button9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 100, -1));

        button8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/numbers/eight.png"))); // NOI18N
        button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button8ActionPerformed(evt);
            }
        });
        jPanel3.add(button8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 100, 60));

        button7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/numbers/seven.png"))); // NOI18N
        button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button7ActionPerformed(evt);
            }
        });
        jPanel3.add(button7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 100, 60));

        clearButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/numbers/clear.png"))); // NOI18N
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        jPanel3.add(clearButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 110, 60));

        enterButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/numbers/enter.png"))); // NOI18N
        enterButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(enterButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 110, 60));

        enterButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/numbers/enter.png"))); // NOI18N
        enterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterButtonActionPerformed(evt);
            }
        });
        jPanel3.add(enterButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 110, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gif/Glitch-27706.gif"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 300));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 380, 300));

        jPanel7.setBackground(new java.awt.Color(51, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        passwordButton.setBackground(new java.awt.Color(0, 204, 51));
        passwordButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        passwordButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/key-1.1s-93px.png"))); // NOI18N
        passwordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordButtonActionPerformed(evt);
            }
        });
        jPanel7.add(passwordButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 80));

        logoutButton.setBackground(new java.awt.Color(153, 153, 153));
        logoutButton.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        logoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/insert card-1.3s-101px (1).png"))); // NOI18N
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });
        jPanel7.add(logoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 70, 80));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gif/Number-44361.gif"))); // NOI18N
        jPanel7.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 190));

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, 90, 190));

        setSize(new java.awt.Dimension(737, 562));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
         String numberEntered = labelDisplay.getText() +"2";
       Font newFont = new Font("Tahoma", Font.BOLD, 38);
       labelDisplay.setFont(newFont);
       labelDisplay.setText(numberEntered); 
    }//GEN-LAST:event_button2ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        String numberEntered = labelDisplay.getText() +"4";
       Font newFont = new Font("Tahoma", Font.BOLD, 38);
       labelDisplay.setFont(newFont);
       labelDisplay.setText(numberEntered);
    }//GEN-LAST:event_button4ActionPerformed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
       String numberEntered = labelDisplay.getText() +"5";
       Font newFont = new Font("Tahoma", Font.BOLD, 38);
       labelDisplay.setFont(newFont);
       labelDisplay.setText(numberEntered);
    }//GEN-LAST:event_button5ActionPerformed

    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
        String numberEntered = labelDisplay.getText() +"6";
       Font newFont = new Font("Tahoma", Font.BOLD, 38);
       labelDisplay.setFont(newFont);
       labelDisplay.setText(numberEntered);
    }//GEN-LAST:event_button6ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        String numberEntered = labelDisplay.getText() +"1";
       Font newFont = new Font("Tahoma", Font.BOLD, 38);
       labelDisplay.setFont(newFont);
       labelDisplay.setText(numberEntered);      
    }//GEN-LAST:event_button1ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        String numberEntered = labelDisplay.getText() +"3";
       Font newFont = new Font("Tahoma", Font.BOLD, 38);
       labelDisplay.setFont(newFont);
       labelDisplay.setText(numberEntered);
    }//GEN-LAST:event_button3ActionPerformed

    private void button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button7ActionPerformed
       String numberEntered = labelDisplay.getText() +"7";
       Font newFont = new Font("Tahoma", Font.BOLD, 38);
       labelDisplay.setFont(newFont);
       labelDisplay.setText(numberEntered);
    }//GEN-LAST:event_button7ActionPerformed

    private void button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button8ActionPerformed
        String numberEntered = labelDisplay.getText() +"8";
       Font newFont = new Font("Tahoma", Font.BOLD, 38);
       labelDisplay.setFont(newFont);
       labelDisplay.setText(numberEntered);
    }//GEN-LAST:event_button8ActionPerformed

    private void button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button9ActionPerformed
       String numberEntered = labelDisplay.getText() +"9";
       Font newFont = new Font("Tahoma", Font.BOLD, 38);
       labelDisplay.setFont(newFont);
       labelDisplay.setText(numberEntered);
    }//GEN-LAST:event_button9ActionPerformed

    private void button0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button0ActionPerformed
       String numberEntered = labelDisplay.getText() +"0";
       Font newFont = new Font("Tahoma", Font.BOLD, 38);
       labelDisplay.setFont(newFont);
       labelDisplay.setText(numberEntered);
    }//GEN-LAST:event_button0ActionPerformed

    private void enterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterButtonActionPerformed
       String card = userLabel.getText();
       String withdraw = labelDisplay.getText();
        int reference = 932785 + (int) (Math.random()*5678);
        Calendar dateNtime = Calendar.getInstance();
                    dateNtime.getTime();
                    SimpleDateFormat time = new SimpleDateFormat("HH:mm");
                    time.format(dateNtime.getTime());
                    SimpleDateFormat date = new SimpleDateFormat("dd:mm:yyyy");
                    date.format(dateNtime.getTime());
        try{
                String sql = "SELECT balance FROM card_number WHERE card = '" +card+"' ";
                Connection conn = DataBaseConn.getConnection();
                
                Statement statement = conn.prepareStatement(sql);
                ResultSet result = statement.executeQuery(sql);
                
                if(result.next()){
                    String balance = result.getString(1);
                    int toInt = Integer.parseInt(balance);
                    int toInt2 = Integer.parseInt(withdraw);
                    if(toInt >= toInt2){
                     if(Validation.toUpdateWithdraw(toInt,toInt2, card).equals("done"))
                         labelDisplay.setText("Thank you!");
                          textReceipt.append("\tAlfonso Bank of the Philippines\n" +
                            "Reference number:\t\t\t " +reference+
                            "\n==============================================\t " +
                            "\nRemaining Balance:\t\t\t " +Validation.getBalance(card)+ " Php" +
                            "\nWithdraw:\t\t\t " +withdraw+ " Php"      +
                            "\n==============================================\t " +
                            "\nDate: " +date.format(dateNtime.getTime())+
                            "\t\tTime: " +time.format(dateNtime.getTime())+
                            "\n\n\t\tThant you\n");
                }else {
                    Font newFont = new Font("Tahoma", Font.BOLD, 12);
                    labelDisplay.setFont(newFont);
                    labelDisplay.setText("pls see your remaining balance");
                    button1.setEnabled(false);
                    button2.setEnabled(false);
                    button3.setEnabled(false);
                    button4.setEnabled(false);
                    button5.setEnabled(false);
                    button6.setEnabled(false);
                    button7.setEnabled(false);
                    button8.setEnabled(false);
                    button9.setEnabled(false);
                    button0.setEnabled(false);
                    enterButton2.setEnabled(false);
                    enterButton.setEnabled(false);
                    
                    }
                }
                
            }catch(Exception e){
                    Font newFont = new Font("Tahoma", Font.BOLD, 12);
                    labelDisplay.setFont(newFont);
                    labelDisplay.setText("pls see your remaining balance");
                    button1.setEnabled(false);
                    button2.setEnabled(false);
                    button3.setEnabled(false);
                    button4.setEnabled(false);
                    button5.setEnabled(false);
                    button6.setEnabled(false);
                    button7.setEnabled(false);
                    button8.setEnabled(false);
                    button9.setEnabled(false);
                    button0.setEnabled(false);
                    enterButton2.setEnabled(false);
                    enterButton.setEnabled(false);
        }
    }//GEN-LAST:event_enterButtonActionPerformed
    
    private void passwordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordButtonActionPerformed
        String passwordEntered = labelDisplay.getText();
        if(Validation.validation1(passwordEntered)){
            try{
                String sql = "SELECT card FROM card_number WHERE password = '" +passwordEntered+"' ";
                Connection conn = DataBaseConn.getConnection();
                
                Statement statement = conn.prepareStatement(sql);
                ResultSet result = statement.executeQuery(sql);
                
                if(result.next()){
                    String card = result.getString(1);
                    userLabel.setText(card);
                }
                
            }catch(Exception e){
                System.out.println(e);
        }
            
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
            button0.setEnabled(false);
            clearButton.setEnabled(false);
            logoutButton.setEnabled(true);
            passwordButton.setEnabled(false);
            btnBalance.setEnabled(true);
            labelDisplay.setText("Welcome!");
            labelBalance.setVisible(true);
            labelWithdraw.setVisible(true);
            btnWithdraw.setEnabled(true);
            btnDeposit.setEnabled(true);
            btnReceipt.setEnabled(true);
            labelDeposit.setVisible(true);
            labelReceipt.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(AtMachine.this, "Who are you?","Login Error!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_passwordButtonActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        textReceipt.setEnabled(false);
        logoutButton.setEnabled(false);
        enterButton.setEnabled(false);
        enterButton2.setEnabled(false);
        btnBalance.setEnabled(false);
        btnWithdraw.setEnabled(false);
        btnDeposit.setEnabled(false);
        btnReceipt.setEnabled(false);
        labelBalance.setVisible(false);
        labelWithdraw.setVisible(false);
        labelDeposit.setVisible(false);
        labelReceipt.setVisible(false);
        
    }//GEN-LAST:event_formWindowActivated

    private void btnWithdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWithdrawActionPerformed
            textReceipt.setText("");
            labelDisplay.setText("");
            button1.setEnabled(true);
            button2.setEnabled(true);
            button3.setEnabled(true);
            button4.setEnabled(true);
            button5.setEnabled(true);
            button6.setEnabled(true);
            button7.setEnabled(true);
            button8.setEnabled(true);
            button9.setEnabled(true);
            button0.setEnabled(true);
            btnBalance.setEnabled(true);
            labelBalance.setVisible(true);
            labelWithdraw.setVisible(false);
            btnWithdraw.setEnabled(false);
            labelDeposit.setVisible(true);
            btnDeposit.setEnabled(true);
            clearButton.setEnabled(true);
            enterButton2.setVisible(false);
            enterButton2.setEnabled(false);
            enterButton.setEnabled(true);
            enterButton.setVisible(true);

            
    }//GEN-LAST:event_btnWithdrawActionPerformed

    private void btnBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBalanceActionPerformed
        String cardEntry = userLabel.getText();
        Font newFont = new Font("Tahoma", Font.BOLD, 38);
        labelDisplay.setFont(newFont);
        
        try{
                String sql = "SELECT balance FROM card_number WHERE card = '" +cardEntry+"' ";
                Connection conn = DataBaseConn.getConnection();
                
                Statement statement = conn.prepareStatement(sql);
                ResultSet result = statement.executeQuery(sql);
                if(result.next()){
                    String balance = result.getString(1);
                    labelDisplay.setText("Php "+balance);
                }
                
            }catch(Exception e){
                System.out.println(e);
        }
            enterButton2.setEnabled(false);
            enterButton.setEnabled(false);
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
            button0.setEnabled(false);
            btnBalance.setEnabled(false);
            labelBalance.setVisible(false);
            clearButton.setEnabled(false);
            labelWithdraw.setVisible(true);
            btnWithdraw.setEnabled(true);
            labelDeposit.setVisible(true);
            btnDeposit.setEnabled(true);
            
    }//GEN-LAST:event_btnBalanceActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        labelDisplay.setText("");
        
    }//GEN-LAST:event_clearButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
       JOptionPane.showMessageDialog(null, "press ok to exit","You're about to remove your card!", JOptionPane.OK_OPTION);
           ATM.main(new String[]{});
           this.dispose();
       
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void btnDepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositActionPerformed
            enterButton2.setVisible(true);
            enterButton2.setEnabled(true);
            enterButton.setEnabled(false);
            enterButton.setVisible(false);
            textReceipt.setText("");
            labelDisplay.setText("");
            enterButton.setEnabled(true);
            button1.setEnabled(true);
            button2.setEnabled(true);
            button3.setEnabled(true);
            button4.setEnabled(true);
            button5.setEnabled(true);
            button6.setEnabled(true);
            button7.setEnabled(true);
            button8.setEnabled(true);
            button9.setEnabled(true);
            button0.setEnabled(true);
            btnBalance.setEnabled(true);
            labelBalance.setVisible(true);
            labelWithdraw.setVisible(true);
            btnWithdraw.setEnabled(true);
            labelDeposit.setVisible(false);
            btnDeposit.setEnabled(false);
            clearButton.setEnabled(true);
    }//GEN-LAST:event_btnDepositActionPerformed

    private void enterButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterButton2ActionPerformed
        String card = userLabel.getText();
        String Deposit = labelDisplay.getText();
        int reference = 932785 + (int) (Math.random()*5678);
        Calendar dateNtime = Calendar.getInstance();
                dateNtime.getTime();
                SimpleDateFormat time = new SimpleDateFormat("HH:mm");
                time.format(dateNtime.getTime());
                SimpleDateFormat date = new SimpleDateFormat("dd:mm:yyyy");
                date.format(dateNtime.getTime());
               try{
                       String sql = "SELECT balance FROM card_number WHERE card = '" +card+"' ";
                       Connection conn = DataBaseConn.getConnection();

                       Statement statement = conn.prepareStatement(sql);
                       ResultSet result = statement.executeQuery(sql);

                       if(result.next()){
                           String balance = result.getString(1);
                           int toInt = Integer.parseInt(balance);
                           int toInt2 = Integer.parseInt(Deposit);
                           if(toInt2 >= 100){
                            if(Validation.toUpdateDeposit(toInt,toInt2, card).equals("done"))
                                labelDisplay.setText("Thank you!");
                                 textReceipt.append("\tAlfonso Bank of the Philippines\n" +
                                   "Reference number:\t\t\t " +reference+
                                   "\n==============================================\t " +
                                   "\nBalance:\t\t\t " +Validation.getBalance(card)+ " Php" +
                                   "\nDeposited:\t\t\t " +Deposit+ " Php"      +
                                   "\n==============================================\t " +
                                   "\nDate: " +date.format(dateNtime.getTime())+
                                   "\t\tTime: " +time.format(dateNtime.getTime())+
                                   "\n\n\t\tThant you\n");
                       }else {
                           labelDisplay.setText("");
                           }
                       }

                   }catch(Exception e){
                           labelDisplay.setText("");
               }
    }//GEN-LAST:event_enterButton2ActionPerformed

    private void btnReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReceiptActionPerformed
        String isText = textReceipt.getText();
        if(!isText.equals("")){
        try{
            textReceipt.print();
        }catch(Exception e){
            System.out.println(e);
        }
        }else{
            System.out.println("no text");
        }
        ATM.main(new String[]{});
        this.dispose();
    }//GEN-LAST:event_btnReceiptActionPerformed

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
            java.util.logging.Logger.getLogger(AtMachine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AtMachine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AtMachine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AtMachine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AtMachine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBalance;
    private javax.swing.JButton btnDeposit;
    private javax.swing.JButton btnReceipt;
    private javax.swing.JButton btnWithdraw;
    private javax.swing.JButton button0;
    private javax.swing.JButton button1;
    private javax.swing.JButton button2;
    private javax.swing.JButton button3;
    private javax.swing.JButton button4;
    private javax.swing.JButton button5;
    private javax.swing.JButton button6;
    private javax.swing.JButton button7;
    private javax.swing.JButton button8;
    private javax.swing.JButton button9;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton enterButton;
    private javax.swing.JButton enterButton2;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelBalance;
    private javax.swing.JLabel labelDeposit;
    private javax.swing.JLabel labelDisplay;
    private javax.swing.JLabel labelReceipt;
    private javax.swing.JLabel labelWithdraw;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton passwordButton;
    private javax.swing.JTextArea textReceipt;
    private javax.swing.JLabel userLabel;
    // End of variables declaration//GEN-END:variables
}
