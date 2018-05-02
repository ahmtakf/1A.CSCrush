/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cscrush;

import javax.swing.ImageIcon;

/**
 *
 * @author berka
 */
public class InfoHelPanel extends javax.swing.JPanel {

    /**
     * Creates new form InfoHelPanel
     */
    public InfoHelPanel() {
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

        jLabel1 = new javax.swing.JLabel();
        backBI = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/images.png"))); // NOI18N
        jLabel1.setText("INFO & HELP");

        add(jLabel1);
        jLabel1.setBounds(300, 0, 360, 180);

        backBI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/back1.png"))); // NOI18N
        backBI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backBIMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backBIMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backBIMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                backBIMouseReleased(evt);
            }
        });
        add(backBI);
        backBI.setBounds(600, 610, 43, 41);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/qmark.jpg"))); // NOI18N
        add(jLabel3);
        jLabel3.setBounds(0, 0, 290, 200);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/howto.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2);
        jLabel2.setBounds(0, 200, 500, 470);
    }// </editor-fold>//GEN-END:initComponents

    private void backBIMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBIMouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("/icons/back2.png"));
        backBI.setIcon(II);
    }//GEN-LAST:event_backBIMouseEntered

    private void backBIMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBIMouseExited
        ImageIcon II = new ImageIcon(getClass().getResource("/icons/back1.png"));
        backBI.setIcon(II);
    }//GEN-LAST:event_backBIMouseExited

    private void backBIMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBIMousePressed
        ImageIcon II = new ImageIcon(getClass().getResource("/icons/back3.png"));
        backBI.setIcon(II);
    }//GEN-LAST:event_backBIMousePressed

    private void backBIMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBIMouseReleased
        GUIManager.manager.backToMainMenuPanel();
        ImageIcon II = new ImageIcon(getClass().getResource("/icons/back1.png"));
        backBI.setIcon(II);
    }//GEN-LAST:event_backBIMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backBI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
