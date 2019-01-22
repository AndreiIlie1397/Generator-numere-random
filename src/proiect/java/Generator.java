package proiect.java;

import static java.lang.Integer.parseInt;

public class Generator extends javax.swing.JFrame {

    public Generator() {
        initComponents();
    }

    public Generator(BaseGenerator generator) {
        initComponents();
        this.generator = generator;
    }

    private Boolean verificare(String x) {
        int j = 0;
        boolean b = false;
        String sir = x;
        if (x.length() == 1) {
            {b = Character.isDigit(x.charAt(0));
            if(b==false)
                return b;}
        } else if (x.charAt(0) == '-' || x.charAt(0) == '+') {
            for (int i = 1; i < x.length(); i++) {
                b = Character.isDigit(x.charAt(i));
                if(b==false)
                return b;
            }
        } else {
            for (int i = 0; i < x.length(); i++) {
                b = Character.isDigit(x.charAt(i));
                if(b==false)
                return b;
            }
        }
        return b;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nr = new javax.swing.JTextField();
        st = new javax.swing.JTextField();
        dr = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Generator");
        setAlwaysOnTop(true);
        setSize(new java.awt.Dimension(400, 300));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Numarul de numere");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 280, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("Capat stanga");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 280, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("Capat dreapta");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 280, -1));

        nr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nrActionPerformed(evt);
            }
        });
        getContentPane().add(nr, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 100, -1));

        st.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stActionPerformed(evt);
            }
        });
        getContentPane().add(st, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 100, -1));

        dr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drActionPerformed(evt);
            }
        });
        getContentPane().add(dr, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 100, -1));

        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setText("Meniu principal");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 320, 150, -1));

        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setText("Genereaza");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 130, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagini/3.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        jLabel5.setToolTipText("");
        jLabel5.setPreferredSize(new java.awt.Dimension(10, 10));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nrActionPerformed

    private void stActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stActionPerformed

    private void drActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String n, s, d;
        n = nr.getText();
        s = st.getText();
        d = dr.getText();
        if ((nr.getText() == null) || (nr.getText().equals("")) || (st.getText() == null)
                || (st.getText().equals("")) || (dr.getText() == null) || (dr.getText().equals(""))
                || (verificare(n) == false) || (verificare(s) == false) || (verificare(d) == false)
                || (parseInt(s) >= parseInt(d))) {
            this.setVisible(false);
            Rezultat r1 = new Rezultat(0, 0, 0, generator);
            r1.setVisible(true);
        } else {
            this.setVisible(false);
            generator.setA(parseInt(s));
            generator.setB(parseInt(d));
            generator.setN(parseInt(n));
            Rezultat r = new Rezultat(parseInt(n), parseInt(s), parseInt(d), generator);
            r.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        GeneratorInterface g = new GeneratorInterface();
        g.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private BaseGenerator generator;

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Generator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Generator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dr;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nr;
    private javax.swing.JTextField st;
    // End of variables declaration//GEN-END:variables
}
