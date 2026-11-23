package week_02;

import javax.swing.JOptionPane;

/**
 * PHẦN 3 - Menu chính của LAB 2: mở các form thực hành.
 */
public class frm_Menu extends javax.swing.JFrame {

    public frm_Menu() {
        initComponents();
        setLocationRelativeTo(null);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        lblTitle = new javax.swing.JLabel();
        lblSub = new javax.swing.JLabel();
        pnlGrid = new javax.swing.JPanel();
        btn_des = new javax.swing.JButton();
        btn_tripledes = new javax.swing.JButton();
        btn_aes = new javax.swing.JButton();
        btn_rc4 = new javax.swing.JButton();
        btn_twofish = new javax.swing.JButton();
        btn_aesctr = new javax.swing.JButton();
        btn_sql = new javax.swing.JButton();
        btn_history = new javax.swing.JButton();
        lblNote = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LAB 2 - Mã hóa đối xứng hiện đại");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        lblTitle.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 20)); // NOI18N
        lblTitle.setText("LAB 2 - MÃ HÓA ĐỐI XỨNG HIỆN ĐẠI");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 6, 4, 6);
        getContentPane().add(lblTitle, gridBagConstraints);
        lblSub.setText("Chọn một bài để mở form tương ứng:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 6, 4, 6);
        getContentPane().add(lblSub, gridBagConstraints);
        pnlGrid.setLayout(new java.awt.GridLayout(3, 3, 10, 8));
        btn_des.setText("2.1 DES");
        btn_des.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_desActionPerformed(evt);
            }
        });
        pnlGrid.add(btn_des);
        btn_tripledes.setText("2.2 TripleDES");
        btn_tripledes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tripledesActionPerformed(evt);
            }
        });
        pnlGrid.add(btn_tripledes);
        btn_aes.setText("2.3 AES + Login");
        btn_aes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aesActionPerformed(evt);
            }
        });
        pnlGrid.add(btn_aes);
        btn_rc4.setText("2.4 RC4");
        btn_rc4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_rc4ActionPerformed(evt);
            }
        });
        pnlGrid.add(btn_rc4);
        btn_twofish.setText("2.5 Twofish");
        btn_twofish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_twofishActionPerformed(evt);
            }
        });
        pnlGrid.add(btn_twofish);
        btn_aesctr.setText("2.6 Nâng cao - AES-CTR");
        btn_aesctr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aesctrActionPerformed(evt);
            }
        });
        pnlGrid.add(btn_aesctr);
        btn_sql.setText("Kết nối SQL Server");
        btn_sql.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sqlActionPerformed(evt);
            }
        });
        pnlGrid.add(btn_sql);
        btn_history.setText("Xem lịch sử");
        btn_history.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_historyActionPerformed(evt);
            }
        });
        pnlGrid.add(btn_history);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 6, 4, 6);
        getContentPane().add(pnlGrid, gridBagConstraints);
        lblNote.setText("Bài nâng cao 02 (AES-CBC) viết bằng Python: chạy tệp aes_cbc_gui.py.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 6, 4, 6);
        getContentPane().add(lblNote, gridBagConstraints);

        pack();
    }
    // </editor-fold>

    private void btn_desActionPerformed(java.awt.event.ActionEvent evt) {
        new frm_DES().setVisible(true);
    }
    private void btn_tripledesActionPerformed(java.awt.event.ActionEvent evt) {
        new frm_TripleDES().setVisible(true);
    }
    private void btn_aesActionPerformed(java.awt.event.ActionEvent evt) {
        new frm_AES().setVisible(true);
    }
    private void btn_rc4ActionPerformed(java.awt.event.ActionEvent evt) {
        new frm_RC4().setVisible(true);
    }
    private void btn_twofishActionPerformed(java.awt.event.ActionEvent evt) {
        new frm_Twofish().setVisible(true);
    }
    private void btn_aesctrActionPerformed(java.awt.event.ActionEvent evt) {
        new frm_AES_CTR().setVisible(true);
    }
    private void btn_sqlActionPerformed(java.awt.event.ActionEvent evt) {
        new frm_KetNoiSQL().setVisible(true);
    }
    private void btn_historyActionPerformed(java.awt.event.ActionEvent evt) {
        new frm_LichSu().setVisible(true);
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(frm_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btn_aes;
    private javax.swing.JButton btn_aesctr;
    private javax.swing.JButton btn_des;
    private javax.swing.JButton btn_history;
    private javax.swing.JButton btn_rc4;
    private javax.swing.JButton btn_sql;
    private javax.swing.JButton btn_tripledes;
    private javax.swing.JButton btn_twofish;
    private javax.swing.JLabel lblNote;
    private javax.swing.JLabel lblSub;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlGrid;
    // End of variables declaration
}
