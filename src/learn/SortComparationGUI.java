/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learn;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.Timer;


/**
 *
 * @author cristiano
 */
public class SortComparationGUI extends javax.swing.JFrame {
    public SortComparationGUI() {
        initComponents();
    }

/**
     * Creates new form SortComparationGUI
     */
        /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        doSort = new javax.swing.JButton();
        sceltaSort = new javax.swing.JComboBox<>();
        txtElementi = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblTempo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        doSort.setText("Calcola");
        doSort.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doSortMouseClicked(evt);
            }
        });

        sceltaSort.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bubble sort", "Quick Sort", "Merge Sort", "Bitonic Sort", "Insertion Sort", "Selection Sort", "Shaker Sort", "Counting Sort", "Redix Sort", "Shell Sort" }));
        sceltaSort.setToolTipText("Choose sort method");
        sceltaSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sceltaSortActionPerformed(evt);
            }
        });

        txtElementi.setText("0");
        txtElementi.setToolTipText("Array dimension");
        txtElementi.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtElementiInputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        txtElementi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtElementiActionPerformed(evt);
            }
        });
        txtElementi.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtElementiPropertyChange(evt);
            }
        });

        jLabel1.setText("Elements");

        jLabel2.setText("Time");

        lblTempo.setText("10s");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(doSort))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTempo))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtElementi)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel1))
                                .addComponent(sceltaSort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 242, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtElementi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(49, 49, 49)
                .addComponent(sceltaSort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblTempo))
                .addGap(59, 59, 59)
                .addComponent(doSort)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtElementiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtElementiActionPerformed
        
    }//GEN-LAST:event_txtElementiActionPerformed

    private void sceltaSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sceltaSortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sceltaSortActionPerformed
int lista[];
    private void doSortMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doSortMouseClicked
        this.lista = new int [Integer.parseInt(txtElementi.getText())];
        Popola();
        long startTime = System.currentTimeMillis();
        switch((String)sceltaSort.getSelectedItem()){
            case "Bubble sort": break;
            case "Quick Sort": break;
            case "Merge Sort": break;
            case "Bitonic Sort": break;
            case "Insertion Sort": doInsertionSort(); break;
            case "Selection Sort": break;
            case "Shaker Sort": break;
            case "Counting Sort": break;
            case "Redix Sort": break;
            case "Shell Sort": break;
            //case "": break;
            //case "": break;
        }
        long tmp = System.currentTimeMillis();;
        long secondi = (tmp - startTime);
        JOptionPane.showMessageDialog(null, "Sort ordinato: \n"//+StampaLista()
                +"\nTempo impiegato: "+secondi+"ms"
                , "Concluso", JOptionPane.INFORMATION_MESSAGE);
        lblTempo.setText(Double.toString(secondi/1000)+"s");
    }//GEN-LAST:event_doSortMouseClicked

    private String StampaLista(){
        String tmp="";
        for (int i = 0; i < lista.length; i++) {
            tmp+=lista[i];
            tmp+="/";
        }
        return tmp;
    }
    private void txtElementiInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtElementiInputMethodTextChanged
          
    }//GEN-LAST:event_txtElementiInputMethodTextChanged

    private void txtElementiPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtElementiPropertyChange
        
    }//GEN-LAST:event_txtElementiPropertyChange

    private void Popola(){
                Random r = new Random();
                for (int i = 0; i < Integer.parseInt(txtElementi.getText()); i++)
                    lista [i] = r.nextInt(100);  
    }
    
    private void doInsertionSort() {
        int temp;
        for (int i = 1; i < lista.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(lista[j] < lista[j-1]){
                    temp = lista[j];
                    lista[j] = lista[j-1];
                    lista[j-1] = temp;
                }
            }
        }
    }

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
            java.util.logging.Logger.getLogger(SortComparationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SortComparationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SortComparationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SortComparationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SortComparationGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton doSort;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblTempo;
    private javax.swing.JComboBox<String> sceltaSort;
    private javax.swing.JTextField txtElementi;
    // End of variables declaration//GEN-END:variables
}
