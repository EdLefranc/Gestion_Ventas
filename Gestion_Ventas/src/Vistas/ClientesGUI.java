package Vistas;


/**
 *
 * @author Ed Le Franc
 */
public class ClientesGUI extends javax.swing.JInternalFrame {
       
    /**
     * Creates new form Paciente
     */
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public ClientesGUI() {        
        initComponents();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 997, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 744, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void ocultarPacienteFrame() {
        this.setVisible(true);
    }
            
    /**
     * @param args the command line arguments
     */
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
