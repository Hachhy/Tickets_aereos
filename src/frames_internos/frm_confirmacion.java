/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames_internos;

import Datos.p_reserva;
import Interface.Modulos;
import javax.swing.JOptionPane;

/**
 *
 * @author Jose
 */
public class frm_confirmacion extends javax.swing.JInternalFrame implements Modulos {

    boolean datos_completos = false;
    p_reserva reserva;

    public frm_confirmacion(p_reserva r) {
        initComponents();
        this.setSize(605, 444);
        this.setTitle("Verificar detalles de reserva");
        reserva = r;
        mostrar_detalles();
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TextoPre1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txta_detalles = new javax.swing.JTextArea();
        btnEnviar = new javax.swing.JButton();
        TextoPre2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        getContentPane().setLayout(null);

        TextoPre1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TextoPre1.setForeground(new java.awt.Color(0, 0, 0));
        TextoPre1.setText("Antes de continuar, vuelva a verificar los siguentes detalles que proporciono.");
        getContentPane().add(TextoPre1);
        TextoPre1.setBounds(0, 30, 588, 17);

        txta_detalles.setEditable(false);
        txta_detalles.setColumns(20);
        txta_detalles.setRows(5);
        txta_detalles.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LOS DETALLES PROPORCIONADOS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        jScrollPane1.setViewportView(txta_detalles);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 100, 536, 203);

        btnEnviar.setBackground(new java.awt.Color(0, 153, 0));
        btnEnviar.setForeground(new java.awt.Color(255, 255, 255));
        btnEnviar.setText("Si | Confirmar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEnviar);
        btnEnviar.setBounds(230, 350, 112, 43);

        TextoPre2.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        TextoPre2.setForeground(new java.awt.Color(0, 0, 0));
        TextoPre2.setText("Es posible que no se vuelva a imprimir el Ticket, por lo tanto los detalles que proporciono deben ser validos");
        getContentPane().add(TextoPre2);
        TextoPre2.setBounds(0, 50, 588, 25);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 76, 632, 10);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(-18, 325, 650, 10);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel1.setText("Confirmar detalles");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(230, 330, 120, 16);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
       this.datos_completos=true;
       JOptionPane.showMessageDialog(null,"Su Ticket ha sido registrado correctamente");
    }//GEN-LAST:event_btnEnviarActionPerformed

    public void mostrar_detalles() {
        txta_detalles.setText("");
        txta_detalles.append("\n * NOMBRES: "+reserva.getCliente().getNombre());
        txta_detalles.append("\n * DESTINO: "+reserva.getDetalle_reserva().getDestino());
        txta_detalles.append("\n * FECHA DE VIAJE: "+reserva.getFecha().getDia()+"/"+reserva.getFecha().getMes()+"/"+reserva.getFecha().getAno());
        txta_detalles.append("\n * CLASE DE VIAJE: "+reserva.getDetalle_reserva().getClase());
        txta_detalles.append("\n * NRO DE ASIENTOS: "+reserva.getDetalle_reserva().getAsientos());
        txta_detalles.append("\n * TIPO DE PAGO: "+reserva.getPago().getTipo_pago());
        txta_detalles.append("\n * TRANSACCION ID: "+reserva.getPago().getId_transaccion());
        txta_detalles.append("\n * CANTIDAD A PAGAR: : "+"S/."+reserva.getPago().getCant_pago());

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TextoPre1;
    private javax.swing.JLabel TextoPre2;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea txta_detalles;
    // End of variables declaration//GEN-END:variables

    public boolean esta_completo() {
        return datos_completos;
    }
}