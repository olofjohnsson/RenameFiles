
package renamefiles;

import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author olojo5
 */
public class RenameFiles extends javax.swing.JFrame {
    JFileChooser chooser;
    String choosertitle;
    String path = "C:\\temp\\renamer";
    String stringToFind = "";
    String replacementString = "";

    /**
     * Creates new form RenameFiles
     */
    public RenameFiles() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser2 = new javax.swing.JFileChooser();
        jTextFieldFolderPath = new javax.swing.JTextField();
        jButtonRename = new javax.swing.JButton();
        jTextFieldStringToFind = new javax.swing.JTextField();
        jTextFieldReplacementString = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonRename.setText("Byt namn");
        jButtonRename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRenameActionPerformed(evt);
            }
        });

        jTextFieldStringToFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldStringToFindActionPerformed(evt);
            }
        });

        jLabel1.setText("Sträng som skall bytas ut");

        jLabel2.setText("Utbytessträng (kan lämnas tom)");

        jLabel3.setText("Sökväg");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextFieldFolderPath, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonRename)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldStringToFind, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jTextFieldReplacementString, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldStringToFind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldReplacementString, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldFolderPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonRename)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldStringToFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldStringToFindActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldStringToFindActionPerformed

    private void jButtonRenameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRenameActionPerformed
        path = jTextFieldFolderPath.getText();
        stringToFind = jTextFieldStringToFind.getText();
        replacementString = jTextFieldReplacementString.getText();
        File folder = new File(path);
        changeFilesOfFolder(folder, stringToFind, replacementString);
        
        
    }//GEN-LAST:event_jButtonRenameActionPerformed

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
            java.util.logging.Logger.getLogger(RenameFiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RenameFiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RenameFiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RenameFiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RenameFiles().setVisible(true);
            }
        });
    }
    
    public static void changeFilesOfFolder(File folder, String stringToFind, String replacementString) {
        File[] listOfFiles = folder.listFiles();

        if (listOfFiles != null) {
            int count = 1;
            for (int i = 0; i < listOfFiles.length; i++) {
                if (listOfFiles[i].isFile()) {
                    File f = new File(folder.getPath() + "/" + listOfFiles[i].getName());
                    String origName = listOfFiles[i].getName();
                    String newName;
                    newName = origName;
                    stringToFind = "(?i)"+stringToFind;
                    newName = newName.replaceAll(stringToFind, replacementString);
                    f.renameTo(new File(folder.getPath() + "/" + newName));
                    count++;                    
                } else if (listOfFiles[i].isDirectory()) {
                    changeFilesOfFolder(listOfFiles[i], stringToFind, replacementString);
                }
            }
        } else {
            System.out.println("Path without files");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRename;
    private javax.swing.JFileChooser jFileChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextFieldFolderPath;
    private javax.swing.JTextField jTextFieldReplacementString;
    private javax.swing.JTextField jTextFieldStringToFind;
    // End of variables declaration//GEN-END:variables
}
