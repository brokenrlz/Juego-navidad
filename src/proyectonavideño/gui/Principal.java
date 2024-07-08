
package proyectonavideño.gui;

import javax.swing.JOptionPane;
import proyectonavideño.Logica.Controladora;

/**
 *
 * @author Juan
 */
public class Principal extends javax.swing.JFrame {

    Controladora  control = new Controladora();
    String emoji;
    String matriz[][]= new String [4][4];
    int cantEncontrados;
    
    
    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TxtCantidad = new javax.swing.JTextField();
        ButtonPapaNoel = new javax.swing.JButton();
        ButtonEstrella = new javax.swing.JButton();
        ButtonThree = new javax.swing.JButton();
        ButtonGift = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMatrizDibujada = new javax.swing.JTextArea();
        ResetButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtElegido = new javax.swing.JTextField();
        txtCantidades = new javax.swing.JTextField();
        txtEncontrados = new javax.swing.JTextField();
        txtResultado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setText("Adivinanza Navideña");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Ingrese la cantidad de veces que cree que aparecera su personaje");

        TxtCantidad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TxtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCantidadActionPerformed(evt);
            }
        });

        ButtonPapaNoel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ButtonPapaNoel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectonavideño/Imagenes/cat.png"))); // NOI18N
        ButtonPapaNoel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPapaNoelActionPerformed(evt);
            }
        });

        ButtonEstrella.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ButtonEstrella.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectonavideño/Imagenes/Dog.png"))); // NOI18N
        ButtonEstrella.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEstrellaActionPerformed(evt);
            }
        });

        ButtonThree.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ButtonThree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectonavideño/Imagenes/Eagle.png"))); // NOI18N
        ButtonThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonThreeActionPerformed(evt);
            }
        });

        ButtonGift.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ButtonGift.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectonavideño/Imagenes/fox.png"))); // NOI18N
        ButtonGift.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonGiftActionPerformed(evt);
            }
        });

        txtMatrizDibujada.setEditable(false);
        txtMatrizDibujada.setColumns(20);
        txtMatrizDibujada.setFont(new java.awt.Font("Segoe UI Emoji", 0, 48)); // NOI18N
        txtMatrizDibujada.setRows(5);
        jScrollPane1.setViewportView(txtMatrizDibujada);

        ResetButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ResetButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectonavideño/Imagenes/reset.png"))); // NOI18N
        ResetButton.setText("RESET");
        ResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Elegido: ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Cantidad: ");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Encontrados:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Resultado:");

        txtElegido.setEditable(false);
        txtElegido.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N

        txtCantidades.setEditable(false);

        txtEncontrados.setEditable(false);

        txtResultado.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtElegido, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantidades, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEncontrados, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtElegido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEncontrados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(175, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButtonGift, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(101, 101, 101)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(276, 276, 276)
                                .addComponent(ButtonPapaNoel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(124, 124, 124)
                                .addComponent(ButtonEstrella, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(ButtonThree, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(483, 483, 483)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(650, 650, 650)
                        .addComponent(TxtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(490, 490, 490)
                        .addComponent(ResetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(616, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(12, 12, 12)
                .addComponent(TxtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ButtonEstrella)
                                    .addComponent(ButtonGift))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(ButtonPapaNoel)
                                .addGap(1, 1, 1)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)))
                    .addComponent(ButtonThree))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ResetButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCantidadActionPerformed

    private void ButtonPapaNoelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPapaNoelActionPerformed
        emoji = "😺";
        completarDatos(emoji);
    }//GEN-LAST:event_ButtonPapaNoelActionPerformed

    private void ResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButtonActionPerformed
        TxtCantidad.setText("");
        txtElegido.setText("");
        txtResultado.setText("");
        txtMatrizDibujada.setText("");
        txtEncontrados.setText("");
        txtCantidades.setText("");
    }//GEN-LAST:event_ResetButtonActionPerformed

    private void ButtonEstrellaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEstrellaActionPerformed
        emoji = "🐶";
         completarDatos(emoji);
    }//GEN-LAST:event_ButtonEstrellaActionPerformed

    private void ButtonThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonThreeActionPerformed
            emoji = "🦅";
        completarDatos(emoji);

         
    }//GEN-LAST:event_ButtonThreeActionPerformed

    private void ButtonGiftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonGiftActionPerformed
              emoji = "🦊";
              completarDatos(emoji);
    }//GEN-LAST:event_ButtonGiftActionPerformed
    private void completarDatos(String emoji){
              int cantidad = Integer.parseInt(TxtCantidad.getText());
        if (cantidad >= 0 && cantidad <= 16) {

            matriz = control.GenerarMatriz();
            cantEncontrados = control.DeterminarCantidadEmoji(emoji, cantidad, matriz);
            txtEncontrados.setText(String.valueOf(cantEncontrados));

            txtElegido.setText(emoji);
            txtCantidades.setText(String.valueOf(cantidad));

            if (cantEncontrados == cantidad) {

                txtResultado.setText("ACERTO");
            } else {
                txtResultado.setText("FALLO");
                 TxtCantidad.setText("");
                  
            }
            DibujarMatriz(matriz);
        } else {

        }

    }

public void DibujarMatriz(String matriz[][]){
    
    for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 4; c++) {
                txtMatrizDibujada.setText(txtMatrizDibujada.getText()+ matriz[f][c] +" " );
                
            }
            txtMatrizDibujada.setText(txtMatrizDibujada.getText()+"\n");
    }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonEstrella;
    private javax.swing.JButton ButtonGift;
    private javax.swing.JButton ButtonPapaNoel;
    private javax.swing.JButton ButtonThree;
    private javax.swing.JButton ResetButton;
    private javax.swing.JTextField TxtCantidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCantidades;
    private javax.swing.JTextField txtElegido;
    private javax.swing.JTextField txtEncontrados;
    private javax.swing.JTextArea txtMatrizDibujada;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}
