
package com.xhu.JPanels;
import com.xhu.panel.myPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.*;



public class myFrame extends JFrame {
    public static int chooseIndex = 0;
    public myFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnDelete = new JButton();
        jLabel1 = new JLabel();
        BtnModify = new javax.swing.JButton();
        BtnInsert = new JButton();
        BtnSearch = new JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        myPanel = new myPanel();
        methodList = new javax.swing.JComboBox<>();
//        myPanel.getAlignmentX()

        methodList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                chooseIndex = methodList.getSelectedIndex();
                System.out.println(methodList.getSelectedIndex());
                myPanel.repaint();
            }
        });

        setTitle("口罩生产任务管理系统");
        BtnDelete.setText("删除生产任务");

        jLabel1.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        jLabel1.setText("口罩任务");
        jLabel1.setHorizontalTextPosition(JLabel.CENTER);

        BtnModify.setText("修改产任务");

        BtnInsert.setText("插入生产任务");
        BtnInsert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnInsertMouseClicked(evt);
            }
        });
        BtnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnSearchMouseClicked(evt);
            }
        });
        BtnModify.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnModifyMouseClicked(evt);
            }
        });
        BtnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnDeleteMouseClicked(evt);
            }
        });
        BtnSearch.setText("搜索生产任务");

        jScrollPane2.setViewportBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        myPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout myPanelLayout = new javax.swing.GroupLayout(myPanel);
        myPanel.setLayout(myPanelLayout);
        myPanelLayout.setHorizontalGroup(
            myPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 626, Short.MAX_VALUE)
        );
        myPanelLayout.setVerticalGroup(
            myPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        methodList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "顺序存储", "单向链表存储", "双向链表存储", "单向循环链表存储", "双向循环链表存储", "双向循环链表存储1" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(myPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(BtnModify, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnInsert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(methodList, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(myPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(methodList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(BtnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(BtnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(BtnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(BtnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        jLabel1.setVerticalTextPosition(JLabel.BOTTOM);

        pack();
    }// </editor-fold>//GEN-END:initComponents



    private void BtnInsertMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnInsertMouseClicked
        
        insertMsg im = new insertMsg();
        im.setTitle("插入口罩任务数据");
        im.setVisible(true);
        im.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        im.setLocationRelativeTo(null);
    }//GEN-LAST:event_BtnInsertMouseClicked
    private void BtnModifyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnInsertMouseClicked

        modifyMsg mm = new modifyMsg();
        mm.setTitle("修改口罩任务数据");
        mm.setVisible(true);
        mm.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        mm.setLocationRelativeTo(null);
    }//GEN-LAST:event_BtnInsertMouseClicked

    private void BtnSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnInsertMouseClicked

        searchMsg sm = new searchMsg();
        sm.setTitle("搜索口罩任务数据");
        sm.setVisible(true);
        sm.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        sm.setLocationRelativeTo(null);
    }//GEN-LAST:event_BtnInsertMouseClicked
    private void BtnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnInsertMouseClicked

        delMsg dm = new delMsg();
        dm.setTitle("删除口罩任务数据");
        dm.setVisible(true);
        dm.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        dm.setLocationRelativeTo(null);

    }//GEN-LAST:event_BtnInsertMouseClicked

//    public static void main(String args[]) {
//
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (Exception ex) {
//
//        }
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                myFrame myframe = new myFrame();
//                myframe.setVisible(true);
//                myframe.setLocationRelativeTo(null);
//                myframe.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
//
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnDelete;
    private javax.swing.JButton BtnInsert;
    private javax.swing.JButton BtnModify;
    private javax.swing.JButton BtnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> methodList;
    public static javax.swing.JPanel myPanel = null;
    // End of variables declaration//GEN-END:variables
}
