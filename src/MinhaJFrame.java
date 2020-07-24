
public class MinhaJFrame extends javax.swing.JFrame {

    MinhaThread minhaThread1;
    MinhaThread minhaThread2;
    Thread t1;
    Thread t2;
    
    public MinhaJFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelThread1 = new javax.swing.JPanel();
        jButtonIniciarThread1 = new javax.swing.JButton();
        jButtonFinalizarThread1 = new javax.swing.JButton();
        jLabelThread1Processamento = new javax.swing.JLabel();
        jPanelThread2 = new javax.swing.JPanel();
        jButtonIniciarThread2 = new javax.swing.JButton();
        jButtonFinalizarThread2 = new javax.swing.JButton();
        jLabelThread2Processamento = new javax.swing.JLabel();
        jLabelThread1 = new javax.swing.JLabel();
        jLabelThread2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelThread1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelThread1.setToolTipText("");
        jPanelThread1.setPreferredSize(new java.awt.Dimension(170, 100));

        jButtonIniciarThread1.setText("Iniciar");
        jButtonIniciarThread1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciarThread1ActionPerformed(evt);
            }
        });

        jButtonFinalizarThread1.setText("Finalizar");
        jButtonFinalizarThread1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinalizarThread1ActionPerformed(evt);
            }
        });

        jLabelThread1Processamento.setText("Processamento...");

        javax.swing.GroupLayout jPanelThread1Layout = new javax.swing.GroupLayout(jPanelThread1);
        jPanelThread1.setLayout(jPanelThread1Layout);
        jPanelThread1Layout.setHorizontalGroup(
            jPanelThread1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelThread1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelThread1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelThread1Processamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelThread1Layout.createSequentialGroup()
                        .addComponent(jButtonIniciarThread1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonFinalizarThread1)
                        .addGap(0, 18, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelThread1Layout.setVerticalGroup(
            jPanelThread1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelThread1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanelThread1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonIniciarThread1)
                    .addComponent(jButtonFinalizarThread1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jLabelThread1Processamento, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        jPanelThread2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelThread2.setPreferredSize(new java.awt.Dimension(170, 100));

        jButtonIniciarThread2.setText("Iniciar");
        jButtonIniciarThread2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciarThread2ActionPerformed(evt);
            }
        });

        jButtonFinalizarThread2.setText("Finalizar");
        jButtonFinalizarThread2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinalizarThread2ActionPerformed(evt);
            }
        });

        jLabelThread2Processamento.setText("Processamento...");

        javax.swing.GroupLayout jPanelThread2Layout = new javax.swing.GroupLayout(jPanelThread2);
        jPanelThread2.setLayout(jPanelThread2Layout);
        jPanelThread2Layout.setHorizontalGroup(
            jPanelThread2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelThread2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelThread2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelThread2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonIniciarThread2)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonFinalizarThread2))
                    .addComponent(jLabelThread2Processamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelThread2Layout.setVerticalGroup(
            jPanelThread2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelThread2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanelThread2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonIniciarThread2)
                    .addComponent(jButtonFinalizarThread2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelThread2Processamento, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        jLabelThread1.setText("Thread 1");

        jLabelThread2.setText("Thread 2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelThread1)
                    .addComponent(jPanelThread1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelThread2)
                    .addComponent(jPanelThread2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabelThread1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelThread2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelThread2, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                    .addComponent(jPanelThread1, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonIniciarThread1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciarThread1ActionPerformed
        minhaThread1 = new MinhaThread(jLabelThread1Processamento);
        t1 = new Thread(minhaThread1, "Thread 1");
        t1.start();
    }//GEN-LAST:event_jButtonIniciarThread1ActionPerformed

    private void jButtonIniciarThread2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciarThread2ActionPerformed
        minhaThread2 = new MinhaThread(jLabelThread2Processamento);
        t2 = new Thread(minhaThread2, "Thread 2");
        t2.start();
    }//GEN-LAST:event_jButtonIniciarThread2ActionPerformed

    private void jButtonFinalizarThread1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinalizarThread1ActionPerformed
        t1.stop();
    }//GEN-LAST:event_jButtonFinalizarThread1ActionPerformed

    private void jButtonFinalizarThread2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinalizarThread2ActionPerformed
        t2.stop();
    }//GEN-LAST:event_jButtonFinalizarThread2ActionPerformed

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
            java.util.logging.Logger.getLogger(MinhaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MinhaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MinhaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MinhaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MinhaJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonFinalizarThread1;
    private javax.swing.JButton jButtonFinalizarThread2;
    private javax.swing.JButton jButtonIniciarThread1;
    private javax.swing.JButton jButtonIniciarThread2;
    private javax.swing.JLabel jLabelThread1;
    private javax.swing.JLabel jLabelThread1Processamento;
    private javax.swing.JLabel jLabelThread2;
    private javax.swing.JLabel jLabelThread2Processamento;
    private javax.swing.JPanel jPanelThread1;
    private javax.swing.JPanel jPanelThread2;
    // End of variables declaration//GEN-END:variables
}
