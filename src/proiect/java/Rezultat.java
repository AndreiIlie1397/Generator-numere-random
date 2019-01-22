package proiect.java;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Rezultat extends javax.swing.JFrame {

    private String textt;

    public Rezultat() {
        initComponents();
    }

    public Rezultat(int n, int s, int d, BaseGenerator generator) {
        initComponents();
        if (generator.functie() == 1) {
            this.setTitle("Rezultat 1");
              text1.setEditable(false);
            try (FileWriter fw = new FileWriter("Output1.txt", true);
                    BufferedWriter bw = new BufferedWriter(fw);
                    PrintWriter out = new PrintWriter(bw)) {
                if (n <= 0 || s > d || s == d) {
                    text1.setText("Incercati inca o data, respectand urmatoarele conditii:\n \n"
                            + "       1. Toate campurile trebuie sa aiba continut \n"
                            + "       2. Numarul de numere trebuie sa fie mai mare decat 0 \n"
                            + "       3. Capatul din stanga trebuie sa fie mai mic decat capatul din dreapta\n"
                            + "       4. Capatul din stanga nu trebuie sa fie egal cu capatul din dreapta\n"
                            + "       5. Valorile introduse trebuie sa fie numere intregi");
                } else {
                    out.println("Afisez " + n + " numere intregi random intre " + s + " si " + d + ":");
                    String numbersGen = generator.numbersGenerated(n);
                    out.print(numbersGen);
                    text1.setText(numbersGen);
                    textt = text1.getText();
                    out.println("\n");
                }
            }  catch​(IOException e) {
            } finally {
                if (out != null​) {
                    out.close();
                }
            }
        }
        if (generator.functie() == 2) {
             this.setTitle("Rezultat 2");
             text1.setEditable(false);
            try (FileWriter fw = new FileWriter("Output2.txt", true);
                    BufferedWriter bw = new BufferedWriter(fw);
                    PrintWriter out = new PrintWriter(bw)) {
                if (n <= 0 || s > d || s == d) {
                    text1.setText("Incercati inca o data, respectand urmatoarele conditii:\n \n"
                            + "       1. Toate campurile trebuie sa aiba continut \n"
                            + "       2. Numarul de numere trebuie sa fie mai mare decat 0 \n"
                            + "       3. Capatul din stanga trebuie sa fie mai mic decat capatul din dreapta\n"
                            + "       4. Capatul din stanga nu trebuie sa fie egal cu capatul din dreapta\n"
                            + "       5. Valorile introduse trebuie sa fie numere intregi");
                } else {
                    out.println("Afisez " + n + " numere prime random intre " + s + " si " + d + ":");
                    String numbersGen = generator.numbersGenerated(n);
                    out.print(numbersGen);
                    text1.setText(numbersGen);
                    textt = text1.getText();
                    out.println("\n");
                }
            }  catch​(IOException e) {
            } finally {
                if (out != null​) {
                    out.close();
                }
            }
        }
        if (generator.functie() == 3) {
             this.setTitle("Rezultat 3");
             text1.setEditable(false);
            try (FileWriter fw = new FileWriter("Output3.txt", true);
                    BufferedWriter bw = new BufferedWriter(fw);
                    PrintWriter out = new PrintWriter(bw)) {
                if (n <= 0 || s > d || s == d) {
                    text1.setText("Incercati inca o data, respectand urmatoarele conditii:\n \n"
                            + "       1. Toate campurile trebuie sa aiba continut \n"
                            + "       2. Numarul de numere trebuie sa fie mai mare decat 0 \n"
                            + "       3. Capatul din stanga trebuie sa fie mai mic decat capatul din dreapta\n"
                            + "       4. Capatul din stanga nu trebuie sa fie egal cu capatul din dreapta\n"
                            + "       5. Valorile introduse trebuie sa fie numere intregi\n");
                } else {
                    out.println("Afisez " + n + " numere binare random intre " + s + " si " + d + ":");
                    String numbersGen = generator.numbersGenerated(n);
                    out.print(numbersGen);
                    text1.setText(numbersGen);
                    textt = text1.getText();
                    out.println("\n");

                }
            }  catch​(IOException e) {
            } finally {
                if (out != null​) {
                    out.close();
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        text1 = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Rezultat");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Numerele generate sunt:");
        jLabel1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 550, 30));

        text1.setColumns(20);
        text1.setRows(5);
        jScrollPane1.setViewportView(text1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 440, 140));

        jButton4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton4.setText("Meniu principal");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, -1, -1));

        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setText("Salveaza");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 100, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagini/5.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setPreferredSize(new java.awt.Dimension(10, 10));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.setVisible(false);
        GeneratorInterface g = new GeneratorInterface();
        g.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jLabel1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel1AncestorAdded

    }//GEN-LAST:event_jLabel1AncestorAdded

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Text Files(*.txt)", "txt");
        JFileChooser f = new JFileChooser(new File("C://"));
        f.setFileFilter(filter);
        f.setCurrentDirectory(new File(System.getProperty("user.home")));
        f.setDialogTitle("Save a file");
        if (f.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            File file = f.getSelectedFile();
            try {
                try (BufferedWriter fw = new BufferedWriter(new FileWriter(file))) {
                    fw.write(textt);
                }
            } catch (IOException ex) {
                Logger.getLogger(Rezultat.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Rezultat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Rezultat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea text1;
    // End of variables declaration//GEN-END:variables
}
