package Vistas;

import com.formdev.flatlaf.intellijthemes.FlatCarbonIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatSolarizedLightIJTheme;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class MiTiendaGUI extends javax.swing.JFrame {
       
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public MiTiendaGUI() {
        initComponents();
        setLocationRelativeTo(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        JP_Main = new javax.swing.JDesktopPane();
        MenuFlotante = new javax.swing.JMenuBar();
        JM_Almacen = new javax.swing.JMenu();
        MI_Almacen = new javax.swing.JMenuItem();
        JM_Elaboracion = new javax.swing.JMenu();
        MI_Elab = new javax.swing.JMenuItem();
        JM_Area_Comercial = new javax.swing.JMenu();
        MI_Ventas = new javax.swing.JMenuItem();
        MI_Pedidos = new javax.swing.JMenuItem();
        MI_Clientes = new javax.swing.JMenuItem();
        MI_Provedores = new javax.swing.JMenuItem();
        JM_Admin = new javax.swing.JMenu();
        MI_Caja = new javax.swing.JMenuItem();
        MI_Empleados = new javax.swing.JMenuItem();
        MI_Informes = new javax.swing.JMenuItem();
        JM_Temas = new javax.swing.JMenu();
        MI_Noche = new javax.swing.JMenuItem();
        MI_Dia = new javax.swing.JMenuItem();
        JM_Ayuda = new javax.swing.JMenu();
        MI_Ayuda = new javax.swing.JMenuItem();
        JM_Salir = new javax.swing.JMenu();
        MI_Salir = new javax.swing.JMenuItem();

        jLabel14.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("PACIENTE");

        jLabel40.setText("FECHA HORARIO COLOCACIÓN");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1100, 900));
        getContentPane().setLayout(new java.awt.FlowLayout());
        getContentPane().add(JP_Main);

        MenuFlotante.setAlignmentX(0.0F);
        MenuFlotante.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        MenuFlotante.setPreferredSize(new java.awt.Dimension(750, 35));

        JM_Almacen.setText("Almacén");
        JM_Almacen.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        MI_Almacen.setText("Stock");
        MI_Almacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_AlmacenActionPerformed(evt);
            }
        });
        JM_Almacen.add(MI_Almacen);

        MenuFlotante.add(JM_Almacen);

        JM_Elaboracion.setText("Elaboración");
        JM_Elaboracion.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        MI_Elab.setText("Recetas");
        MI_Elab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_ElabActionPerformed(evt);
            }
        });
        JM_Elaboracion.add(MI_Elab);

        MenuFlotante.add(JM_Elaboracion);

        JM_Area_Comercial.setText("Área Comercial");
        JM_Area_Comercial.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        MI_Ventas.setText("Ventas");
        MI_Ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_VentasActionPerformed(evt);
            }
        });
        JM_Area_Comercial.add(MI_Ventas);

        MI_Pedidos.setText("Pedidos");
        MI_Pedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_PedidosActionPerformed(evt);
            }
        });
        JM_Area_Comercial.add(MI_Pedidos);

        MI_Clientes.setText("Clientes");
        MI_Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_ClientesActionPerformed(evt);
            }
        });
        JM_Area_Comercial.add(MI_Clientes);

        MI_Provedores.setText("Provedores");
        MI_Provedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_ProvedoresActionPerformed(evt);
            }
        });
        JM_Area_Comercial.add(MI_Provedores);

        MenuFlotante.add(JM_Area_Comercial);

        JM_Admin.setText("Administración");
        JM_Admin.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        MI_Caja.setText("Caja");
        MI_Caja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_CajaActionPerformed(evt);
            }
        });
        JM_Admin.add(MI_Caja);

        MI_Empleados.setText("Empleados");
        MI_Empleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_EmpleadosActionPerformed(evt);
            }
        });
        JM_Admin.add(MI_Empleados);

        MI_Informes.setText("Informes");
        MI_Informes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_InformesActionPerformed(evt);
            }
        });
        JM_Admin.add(MI_Informes);

        MenuFlotante.add(JM_Admin);

        JM_Temas.setText("Temas");
        JM_Temas.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        MI_Noche.setText("Noche");
        MI_Noche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_NocheActionPerformed(evt);
            }
        });
        JM_Temas.add(MI_Noche);

        MI_Dia.setText("Día");
        MI_Dia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_DiaActionPerformed(evt);
            }
        });
        JM_Temas.add(MI_Dia);

        MenuFlotante.add(JM_Temas);

        JM_Ayuda.setText("Ayuda");
        JM_Ayuda.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        MI_Ayuda.setText("Información");
        MI_Ayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_AyudaActionPerformed(evt);
            }
        });
        JM_Ayuda.add(MI_Ayuda);

        MenuFlotante.add(JM_Ayuda);

        JM_Salir.setText("Salir");
        JM_Salir.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        MI_Salir.setText("Salir del programa");
        MI_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_SalirActionPerformed(evt);
            }
        });
        JM_Salir.add(MI_Salir);

        MenuFlotante.add(JM_Salir);

        setJMenuBar(MenuFlotante);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MI_AlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_AlmacenActionPerformed
        JP_Main.removeAll();
        JP_Main.repaint();
        StockGUI sg = new StockGUI();
        sg.setLocation((JP_Main.getWidth() - sg.getWidth()) / 2, (JP_Main.getHeight() - sg.getHeight()) / 2);
        sg.setVisible(true);
        JP_Main.add(sg);
        JP_Main.moveToFront(sg);
        sg.setMaximizable(true);
        sg.setClosable(true);
    }//GEN-LAST:event_MI_AlmacenActionPerformed

    private void MI_ElabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_ElabActionPerformed
        JP_Main.removeAll();
        JP_Main.repaint();
        RecetasGUI lg = new RecetasGUI();
        lg.setLocation((JP_Main.getWidth() - lg.getWidth()) / 2, (JP_Main.getHeight() - lg.getHeight()) / 2);
        lg.setVisible(true);
        JP_Main.add(lg);
        JP_Main.moveToFront(lg);
        lg.setMaximizable(true);
        lg.setClosable(true);
//        lg.accionIFLaboratorio();
    }//GEN-LAST:event_MI_ElabActionPerformed

    private void MI_VentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_VentasActionPerformed
        JP_Main.removeAll();
        JP_Main.repaint();
        VentasGUI vg = new VentasGUI();
        vg.setLocation((JP_Main.getWidth() - vg.getWidth()) / 2, (JP_Main.getHeight() - vg.getHeight()) / 2);
        vg.setVisible(true);
        JP_Main.add(vg);
        JP_Main.moveToFront(vg);
        vg.setMaximizable(true);
        vg.setClosable(true);
//        vg.accionIFTurnos();
    }//GEN-LAST:event_MI_VentasActionPerformed

    private void MI_CajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_CajaActionPerformed

        JP_Main.removeAll();
        JP_Main.repaint();
        CajaGUI tg = new CajaGUI();
        tg.setLocation((JP_Main.getWidth() - tg.getWidth()) / 2, (JP_Main.getHeight() - tg.getHeight()) / 2);
        tg.setVisible(true);
        JP_Main.add(tg);
        JP_Main.moveToFront(tg);
        tg.setMaximizable(true);
        tg.setClosable(true);
//        tg.accionIFTurnos();
    }//GEN-LAST:event_MI_CajaActionPerformed

    private void MI_ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_ClientesActionPerformed
        JP_Main.removeAll();
        JP_Main.repaint();
        ClientesGUI cg = new ClientesGUI();
        cg.setLocation((JP_Main.getWidth() - cg.getWidth()) / 2, (JP_Main.getHeight() - cg.getHeight()) / 2);
        cg.setVisible(true);
        JP_Main.add(cg);
        JP_Main.moveToFront(cg);
        cg.setMaximizable(true);
        cg.setClosable(true);
    }//GEN-LAST:event_MI_ClientesActionPerformed

    private void MI_NocheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_NocheActionPerformed
        try {
            UIManager.setLookAndFeel(new FlatCarbonIJTheme()); // Cambiar al tema diurno
            SwingUtilities.updateComponentTreeUI(MiTiendaGUI.this);

            //jTextArea1.setForeground(new java.awt.Color(0, 255, 0));//se le cambia color area si el tema es seleccinado
            //MiTiendaGUI.JDC_VencimientoVacuna.setForeground(Color.blue);
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        } catch (NullPointerException enp){

        }

    }//GEN-LAST:event_MI_NocheActionPerformed

    private void MI_DiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_DiaActionPerformed
        try {
            UIManager.setLookAndFeel(new FlatSolarizedLightIJTheme()); // Cambiar al tema diurno
            SwingUtilities.updateComponentTreeUI(MiTiendaGUI.this);

            //jTextArea1.setForeground(new java.awt.Color(0, 39, 114));//se le cambia color area si el tema es seleccinado
            //MiTiendaGUI.JDC_VencimientoVacuna.setForeground(Color.white);

        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        } catch (NullPointerException enp){

        }
    }//GEN-LAST:event_MI_DiaActionPerformed

    private void MI_AyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_AyudaActionPerformed
        JP_Main.removeAll();
        JP_Main.repaint();
        AyudaGUI ag = new AyudaGUI();
        ag.setLocation((JP_Main.getWidth() - ag.getWidth()) / 2, (JP_Main.getHeight() - ag.getHeight()) / 2);
        ag.setVisible(true);
        JP_Main.add(ag);
        JP_Main.moveToFront(ag);
        ag.setMaximizable(true);
        ag.setClosable(true);
    }//GEN-LAST:event_MI_AyudaActionPerformed

    private void MI_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_SalirActionPerformed
        int confirm = JOptionPane.showConfirmDialog(
            this,
            "¿Estás seguro de que quieres cerrar la aplicación?",
            "Confirmar Cierre",
            JOptionPane.YES_NO_OPTION
        );

        if (confirm == JOptionPane.YES_OPTION) {
            // Cierra la aplicación
            System.exit(0);
        }
    }//GEN-LAST:event_MI_SalirActionPerformed

    private void MI_PedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_PedidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MI_PedidosActionPerformed

    private void MI_EmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_EmpleadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MI_EmpleadosActionPerformed

    private void MI_ProvedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_ProvedoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MI_ProvedoresActionPerformed

    private void MI_InformesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_InformesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MI_InformesActionPerformed
                                     
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//
//        FlatCarbonIJTheme.setup();
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(() -> {
//            new VacunarGUI().setVisible(true);
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu JM_Admin;
    private javax.swing.JMenu JM_Almacen;
    private javax.swing.JMenu JM_Area_Comercial;
    private javax.swing.JMenu JM_Ayuda;
    private javax.swing.JMenu JM_Elaboracion;
    private javax.swing.JMenu JM_Salir;
    private javax.swing.JMenu JM_Temas;
    private javax.swing.JDesktopPane JP_Main;
    private javax.swing.JMenuItem MI_Almacen;
    private javax.swing.JMenuItem MI_Ayuda;
    private javax.swing.JMenuItem MI_Caja;
    private javax.swing.JMenuItem MI_Clientes;
    public static javax.swing.JMenuItem MI_Dia;
    private javax.swing.JMenuItem MI_Elab;
    private javax.swing.JMenuItem MI_Empleados;
    private javax.swing.JMenuItem MI_Informes;
    public static javax.swing.JMenuItem MI_Noche;
    private javax.swing.JMenuItem MI_Pedidos;
    private javax.swing.JMenuItem MI_Provedores;
    private javax.swing.JMenuItem MI_Salir;
    private javax.swing.JMenuItem MI_Ventas;
    private javax.swing.JMenuBar MenuFlotante;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel40;
    // End of variables declaration//GEN-END:variables
    
}
