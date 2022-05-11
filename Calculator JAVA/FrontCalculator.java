public class FrontCalculator extends javax.swing.JFrame {
    
    /* Desenvolvido por Luã Leonardo.
     * LinkedIn - https://www.linkedin.com/in/luan-leonardo-development/
     */

    public FrontCalculator() {
        initComponents();
    }
 
 // Variáveis:   
 double value1, value2, result;
 String operation;
 boolean typed = false, dot = false;
 
 // Método para indentificar se algum número já foi digitado:
 public void TypedNumber(String number){
     
     if(typed == false){
         Display.setText(number);
         typed = true;
    // Se nenhum numero foi digitado o "0" será substituido.
     }
     
     else{
         Display.setText(Display.getText() + number);
     }
     
 }
 
 // Método para adicionar a operação matemática: 
 public void OperationUsed(String signal){
     
     value1 = Double.parseDouble(Display.getText());
     Display.setText("");
     operation = signal; 
     dot = false; // Reset do ponto, para poder ser usado na proxima operação.    
     
 }
 
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Display = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ButtonNine = new javax.swing.JButton();
        ButtonEqual = new javax.swing.JButton();
        ButtonPlus = new javax.swing.JButton();
        ButtonSix = new javax.swing.JButton();
        ButtonThree = new javax.swing.JButton();
        ButtonZero = new javax.swing.JButton();
        ButtonEight = new javax.swing.JButton();
        ButtonFive = new javax.swing.JButton();
        ButtonTwo = new javax.swing.JButton();
        ButtonSeven = new javax.swing.JButton();
        ButtonFour = new javax.swing.JButton();
        ButtonOne = new javax.swing.JButton();
        ButtonDot = new javax.swing.JButton();
        ButtonClear = new javax.swing.JButton();
        ButtonDivide = new javax.swing.JButton();
        ButtonLess = new javax.swing.JButton();
        ButtonMultiply = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        Display.setText("0");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(180, 180, 180));
        jLabel2.setText("Calculator");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Display, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Display, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        ButtonNine.setText("9");
        ButtonNine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonNineActionPerformed(evt);
            }
        });

        ButtonEqual.setBackground(new java.awt.Color(176, 229, 255));
        ButtonEqual.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ButtonEqual.setText("=");
        ButtonEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEqualActionPerformed(evt);
            }
        });

        ButtonPlus.setBackground(new java.awt.Color(255, 192, 192));
        ButtonPlus.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ButtonPlus.setText("+");
        ButtonPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPlusActionPerformed(evt);
            }
        });

        ButtonSix.setText("6");
        ButtonSix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSixActionPerformed(evt);
            }
        });

        ButtonThree.setText("3");
        ButtonThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonThreeActionPerformed(evt);
            }
        });

        ButtonZero.setText("0");
        ButtonZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonZeroActionPerformed(evt);
            }
        });

        ButtonEight.setText("8");
        ButtonEight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEightActionPerformed(evt);
            }
        });

        ButtonFive.setText("5");
        ButtonFive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonFiveActionPerformed(evt);
            }
        });

        ButtonTwo.setText("2");
        ButtonTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonTwoActionPerformed(evt);
            }
        });

        ButtonSeven.setText("7");
        ButtonSeven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSevenActionPerformed(evt);
            }
        });

        ButtonFour.setText("4");
        ButtonFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonFourActionPerformed(evt);
            }
        });

        ButtonOne.setText("1");
        ButtonOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonOneActionPerformed(evt);
            }
        });

        ButtonDot.setText(".");
        ButtonDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDotActionPerformed(evt);
            }
        });

        ButtonClear.setText("C");
        ButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonClearActionPerformed(evt);
            }
        });

        ButtonDivide.setText("/");
        ButtonDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDivideActionPerformed(evt);
            }
        });

        ButtonLess.setText("-");
        ButtonLess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLessActionPerformed(evt);
            }
        });

        ButtonMultiply.setText("X");
        ButtonMultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMultiplyActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel1.setText("                                  By Luã Leonardo DEV");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ButtonSix, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonNine, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonThree, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ButtonEight, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ButtonSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ButtonFive, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ButtonFour, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ButtonDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ButtonTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ButtonOne, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ButtonLess, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonZero, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ButtonDot, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonMultiply, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ButtonNine, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonEight, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ButtonSix, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonFive, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonFour, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ButtonThree, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonOne, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonLess, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ButtonZero, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonDot, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonMultiply, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonZeroActionPerformed
       TypedNumber("0");
    }//GEN-LAST:event_ButtonZeroActionPerformed

    private void ButtonOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonOneActionPerformed
        TypedNumber("1");
    }//GEN-LAST:event_ButtonOneActionPerformed

    private void ButtonTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonTwoActionPerformed
        TypedNumber("2");
    }//GEN-LAST:event_ButtonTwoActionPerformed

    private void ButtonThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonThreeActionPerformed
        TypedNumber("3");
    }//GEN-LAST:event_ButtonThreeActionPerformed

    private void ButtonFourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonFourActionPerformed
        TypedNumber("4");
    }//GEN-LAST:event_ButtonFourActionPerformed

    private void ButtonFiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonFiveActionPerformed
        TypedNumber("5");
    }//GEN-LAST:event_ButtonFiveActionPerformed

    private void ButtonSixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSixActionPerformed
        TypedNumber("6");
    }//GEN-LAST:event_ButtonSixActionPerformed

    private void ButtonSevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSevenActionPerformed
        TypedNumber("7");
    }//GEN-LAST:event_ButtonSevenActionPerformed

    private void ButtonEightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEightActionPerformed
        TypedNumber("8");
    }//GEN-LAST:event_ButtonEightActionPerformed

    private void ButtonNineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonNineActionPerformed
        TypedNumber("9");
    }//GEN-LAST:event_ButtonNineActionPerformed

    private void ButtonDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDotActionPerformed
        if(dot == false){
            
            Display.setText(Display.getText() + ".");
            dot = true;
        }
        else{
            
            Display.getText();
            
        }
        
        typed = true;
        
    }//GEN-LAST:event_ButtonDotActionPerformed

    private void ButtonPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPlusActionPerformed
        OperationUsed("1");
    }//GEN-LAST:event_ButtonPlusActionPerformed

    private void ButtonLessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLessActionPerformed
        OperationUsed("2");
    }//GEN-LAST:event_ButtonLessActionPerformed

    private void ButtonMultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMultiplyActionPerformed
        OperationUsed("3");
    }//GEN-LAST:event_ButtonMultiplyActionPerformed

    private void ButtonDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDivideActionPerformed
        OperationUsed("4");
    }//GEN-LAST:event_ButtonDivideActionPerformed

    private void ButtonEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEqualActionPerformed
        
        value2 = Double.parseDouble(Display.getText());
        
        /*  1- Somar
         *  2- Diminuir
         *  3- Multiplicar
         *  4- Dividir
         */
        
        switch(operation){
            
            case "1":
        
                result = (value1 + value2);
                Display.setText(String.valueOf(result));
                break;
            
            case "2":
                
                result = (value1 - value2);
                Display.setText(String.valueOf(result));
                break;    
                
            case "3":
                
                result = (value1 * value2);
                Display.setText(String.valueOf(result));
                break;
                
            case "4":
                
                result = (value1 / value2);
                Display.setText(String.valueOf(result));
                break;
                
        }
        
        /* Neste caso, o if esta identificando o resultado do display,
         * e, fará com que o ponto(".") não possa ser utilizado, podendo assim 
         * o resultado da operação anterior ser usado como "value1" em uma 
         * próxima operação:
         */ 
        
        if(result >= 0 || result < 0){
         
         Display.getText();
         dot = true; 
         
     }
    
        
        typed = false;
        
    }//GEN-LAST:event_ButtonEqualActionPerformed

    private void ButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonClearActionPerformed
        Display.setText("0");
        dot = false;
        typed = false;
    }//GEN-LAST:event_ButtonClearActionPerformed

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
            java.util.logging.Logger.getLogger(FrontCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrontCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrontCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrontCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrontCalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonClear;
    private javax.swing.JButton ButtonDivide;
    private javax.swing.JButton ButtonDot;
    private javax.swing.JButton ButtonEight;
    private javax.swing.JButton ButtonEqual;
    private javax.swing.JButton ButtonFive;
    private javax.swing.JButton ButtonFour;
    private javax.swing.JButton ButtonLess;
    private javax.swing.JButton ButtonMultiply;
    private javax.swing.JButton ButtonNine;
    private javax.swing.JButton ButtonOne;
    private javax.swing.JButton ButtonPlus;
    private javax.swing.JButton ButtonSeven;
    private javax.swing.JButton ButtonSix;
    private javax.swing.JButton ButtonThree;
    private javax.swing.JButton ButtonTwo;
    private javax.swing.JButton ButtonZero;
    private javax.swing.JTextField Display;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
