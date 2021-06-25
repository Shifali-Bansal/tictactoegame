
package tictactoe;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class tictac extends javax.swing.JFrame {

    int a=2;
    int b[]=new int[10];
    int p1[]=new int[10];
    int p2[]=new int[10];
    
    public tictac() {
        initComponents();
        int b[]={0,0,0,0,0,0,0,0,0};
        int p1[]={0,0,0,0,0,0,0,0,0};
        int p2[]={0,0,0,0,0,0,0,0,0};
    }
    int ab()
    {
        if(p1[0]==1&&p1[1]==1&&p1[2]==1)
            return 1;
        if(p1[3]==1&&p1[4]==1&&p1[5]==1)
            return 1;
        if(p1[6]==1&&p1[7]==1&&p1[8]==1)
            return 1;
        if(p1[0]==1&&p1[3]==1&&p1[6]==1)
            return 1;
        if(p1[1]==1&&p1[4]==1&&p1[7]==1)
            return 1;
        if(p1[2]==1&&p1[5]==1&&p1[8]==1)
            return 1;
        if(p1[0]==1&&p1[4]==1&&p1[8]==1)
            return 1;
        if(p1[2]==1&&p1[4]==1&&p1[6]==1)
            return 1;
        
        return 0;
    }
    int cd()
    {
         if(p2[0]==1&&p2[1]==1&&p2[2]==1)
            return 1;
        if(p2[3]==1&&p2[4]==1&&p2[5]==1)
            return 1;
        if(p2[6]==1&&p2[7]==1&&p2[8]==1)
            return 1;
        if(p2[0]==1&&p2[3]==1&&p2[6]==1)
            return 1;
        if(p2[1]==1&&p2[4]==1&&p2[7]==1)
            return 1;
        if(p2[2]==1&&p2[5]==1&&p2[8]==1)
            return 1;
        if(p2[0]==1&&p2[4]==1&&p2[8]==1)
            return 1;
        if(p2[2]==1&&p2[4]==1&&p2[6]==1)
            return 1;
        return 0;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton10.setText("play again");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, Short.MAX_VALUE)
                                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        if(b[5]==0)
        {
         if(a%2==0)
                {
                    a++;
                    jButton6.setText("X");
                    b[5]=1;
                    p1[5]=1;
                    int r1,r2;
                    r1=ab();
                    r2=cd();
                    if(r1==1)
                    {
                      JOptionPane.showMessageDialog(rootPane, "player1 won");
                    }
                    if(r2==1)
                    {
                        JOptionPane.showMessageDialog(rootPane, "player2 won");
                    }
                    
                }
        else
        {
            a++;
            jButton6.setText("0");
            b[5]=1;
             p2[5]=1;
             int r1,r2;
                    r1=ab();
                    r2=cd();
                    if(r1==1)
                    {
                      JOptionPane.showMessageDialog(rootPane, "player1 won");
                    }
                    if(r2==1)
                    {
                        JOptionPane.showMessageDialog(rootPane, "player2 won");
                    }
        }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "error");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(b[1]==0)
        {
        if(a%2==0)
                {
                    a++;
                    jButton2.setText("X");
                    b[1]=1;
                     p1[1]=1;
                     int r1,r2;
                    r1=ab();
                    r2=cd();
                    if(r1==1)
                    {
                      JOptionPane.showMessageDialog(rootPane, "player1 won");
                    }
                    if(r2==1)
                    {
                        JOptionPane.showMessageDialog(rootPane, "player2 won");
                    }
                }
        else
        {
            a++;
            jButton2.setText("0");
            b[1]=1;
             p2[1]=1;
             int r1,r2;
                    r1=ab();
                    r2=cd();
                    if(r1==1)
                    {
                      JOptionPane.showMessageDialog(rootPane, "player1 won");
                    }
                    if(r2==1)
                    {
                        JOptionPane.showMessageDialog(rootPane, "player2 won");
                    }
        }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "error");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(b[0]==0)
        {
          if(a%2==0)
                {
                    a++;
                    jButton1.setText("X");
                    b[0]=1;
                    p1[0]=1;
                    int r1,r2;
                    r1=ab();
                    r2=cd();
                    if(r1==1)
                    {
                      JOptionPane.showMessageDialog(rootPane, "player1 won");
                    }
                    if(r2==1)
                    {
                        JOptionPane.showMessageDialog(rootPane, "player2 won");
                    }
                }
        else
        {
            a++;
            jButton1.setText("0");
            b[0]=1;
            p2[0]=1;
            int r1,r2;
                    r1=ab();
                    r2=cd();
                    if(r1==1)
                    {
                      JOptionPane.showMessageDialog(rootPane, "player1 won");
                    }
                    if(r2==1)
                    {
                        JOptionPane.showMessageDialog(rootPane, "player2 won");
                    }
        }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "error");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(b[2]==0)
        {
        if(a%2==0)
                {
                    a++;
                    jButton3.setText("X");
                    b[2]=1;
                     p1[2]=1;
                     int r1,r2;
                    r1=ab();
                    r2=cd();
                    if(r1==1)
                    {
                      JOptionPane.showMessageDialog(rootPane, "player1 won");
                    }
                    if(r2==1)
                    {
                        JOptionPane.showMessageDialog(rootPane, "player2 won");
                    }
                }
        else
        {
            a++;
            jButton3.setText("0");
            b[2]=1;
             p2[2]=1;
             int r1,r2;
                    r1=ab();
                    r2=cd();
                    if(r1==1)
                    {
                      JOptionPane.showMessageDialog(rootPane, "player1 won");
                    }
                    if(r2==1)
                    {
                        JOptionPane.showMessageDialog(rootPane, "player2 won");
                    }
        }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "error");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if(b[3]==0)
        {
         if(a%2==0)
                {
                    a++;
                    jButton4.setText("X");
                    b[3]=1;
                    p1[3]=1;
                    int r1,r2;
                    r1=ab();
                    r2=cd();
                    if(r1==1)
                    {
                      JOptionPane.showMessageDialog(rootPane, "player1 won");
                    }
                    if(r2==1)
                    {
                        JOptionPane.showMessageDialog(rootPane, "player2 won");
                    }
                }
        else
        {
            a++;
            jButton4.setText("0");
            b[3]=1;
            p2[3]=1;
            int r1,r2;
                    r1=ab();
                    r2=cd();
                    if(r1==1)
                    {
                      JOptionPane.showMessageDialog(rootPane, "player1 won");
                    }
                    if(r2==1)
                    {
                        JOptionPane.showMessageDialog(rootPane, "player2 won");
                    }
        }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "error");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        if(b[4]==0)
        {
        if(a%2==0)
                {
                    a++;
                    jButton5.setText("X");
                    b[4]=1;
                    p1[4]=1;
                    int r1,r2;
                    r1=ab();
                    r2=cd();
                    if(r1==1)
                    {
                      JOptionPane.showMessageDialog(rootPane, "player1 won");
                    }
                    if(r2==1)
                    {
                        JOptionPane.showMessageDialog(rootPane, "player2 won");
                    }
                }
        else
        {
            a++;
            jButton5.setText("0");
            b[4]=1;
            p2[4]=1;
            int r1,r2;
                    r1=ab();
                    r2=cd();
                    if(r1==1)
                    {
                      JOptionPane.showMessageDialog(rootPane, "player1 won");
                    }
                    if(r2==1)
                    {
                        JOptionPane.showMessageDialog(rootPane, "player2 won");
                    }
        }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "error");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        if(b[6]==0)
        {
         if(a%2==0)
                {
                    a++;
                    jButton7.setText("X");
                    b[6]=1;
                    p1[6]=1;
                    int r1,r2;
                    r1=ab();
                    r2=cd();
                    if(r1==1)
                    {
                      JOptionPane.showMessageDialog(rootPane, "player1 won");
                    }
                    if(r2==1)
                    {
                        JOptionPane.showMessageDialog(rootPane, "player2 won");
                    }
                }
        else
        {
            a++;
            jButton7.setText("0");
            b[6]=1;
            p2[6]=1;
            int r1,r2;
                    r1=ab();
                    r2=cd();
                    if(r1==1)
                    {
                      JOptionPane.showMessageDialog(rootPane, "player1 won");
                    }
                    if(r2==1)
                    {
                        JOptionPane.showMessageDialog(rootPane, "player2 won");
                    }
        }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "error");
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        if(b[7]==0)
        {
         if(a%2==0)
                {
                    a++;
                    jButton8.setText("X");
                    b[7]=1;
                     p1[7]=1;
                     int r1,r2;
                    r1=ab();
                    r2=cd();
                    if(r1==1)
                    {
                      JOptionPane.showMessageDialog(rootPane, "player1 won");
                    }
                    if(r2==1)
                    {
                        JOptionPane.showMessageDialog(rootPane, "player2 won");
                    }
                }
        else
        {
            a++;
            jButton8.setText("0");
            b[7]=1;
             p2[7]=1;
             int r1,r2;
                    r1=ab();
                    r2=cd();
                    if(r1==1)
                    {
                      JOptionPane.showMessageDialog(rootPane, "player1 won");
                    }
                    if(r2==1)
                    {
                        JOptionPane.showMessageDialog(rootPane, "player2 won");
                    }
        }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "error");
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        if(b[8]==0)
        {
         if(a%2==0)
                {
                    a++;
                    jButton9.setText("X");
                    b[8]=1;
                     p1[8]=1;
                     int r1,r2;
                    r1=ab();
                    r2=cd();
                    if(r1==1)
                    {
                      JOptionPane.showMessageDialog(rootPane, "player1 won");
                    }
                    if(r2==1)
                    {
                        JOptionPane.showMessageDialog(rootPane, "player2 won");
                    }
                }
        else
        {
            a++;
            jButton9.setText("0");
            b[8]=1;
             p2[8]=1;
             int r1,r2;
                    r1=ab();
                    r2=cd();
                    if(r1==1)
                    {
                      JOptionPane.showMessageDialog(rootPane, "player1 won");
                    }
                    if(r2==1)
                    {
                        JOptionPane.showMessageDialog(rootPane, "player2 won");
                    }
        }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "error");
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        jButton1.setText(" ");
        jButton2.setText(" ");
        jButton3.setText(" ");
        jButton4.setText(" ");
        jButton5.setText(" ");
        jButton6.setText(" ");
        jButton8.setText(" ");
        jButton9.setText(" ");
        jButton7.setText(" ");
        
    }//GEN-LAST:event_jButton10ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tictac().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    // End of variables declaration//GEN-END:variables
}
