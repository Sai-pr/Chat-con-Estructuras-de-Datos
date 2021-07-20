/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import eddSaiproG.NodoArb;
import eddSaiproG.NodoMulti;
import eddSaiproG.TablaHash;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.text.TabableView;

/**
 * @author SaiproG
 */
public class InterfazBusq extends javax.swing.JDialog implements ActionListener
{

    //Variables globales
    JButton[] arrayBtnFechas;
    private String selectedFecha;
    NodoMulti atajo;
    static int x = 60, y = 30, an = 120, al = 35;
    private String PersonaBuscada;
    String fechaSeleccionada;
    /**
     * Creates new form InterfazBusq
     */
    public InterfazBusq(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        jTFBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPnlFechas = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        jLabelGrupo = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jLabelFechas = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelPersona = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 6, true));

        jTFBuscar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTFBuscar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jTFBuscarActionPerformed(evt);
            }
        });
        jTFBuscar.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                jTFBuscarKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                jTFBuscarKeyTyped(evt);
            }
        });

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPnlFechas.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jPnlFechasLayout = new javax.swing.GroupLayout(jPnlFechas);
        jPnlFechas.setLayout(jPnlFechasLayout);
        jPnlFechasLayout.setHorizontalGroup(
            jPnlFechasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 248, Short.MAX_VALUE)
        );
        jPnlFechasLayout.setVerticalGroup(
            jPnlFechasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPnlFechas);

        btnBuscar.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabelGrupo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelGrupo.setText("Ubicacion: (Grupo)");

        btnSalir.setBackground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Salir.png"))); // NOI18N
        btnSalir.setToolTipText("Regresar.");
        btnSalir.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSalirActionPerformed(evt);
            }
        });

        jLabelFechas.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelFechas.setText("Fechas:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Busqueda de personas:");

        jLabelPersona.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelPersona.setText("Persona:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelGrupo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jTFBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabelFechas))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabelPersona, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jTFBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelGrupo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelPersona)
                .addGap(13, 13, 13)
                .addComponent(jLabelFechas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTFBuscarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jTFBuscarActionPerformed
    {//GEN-HEADEREND:event_jTFBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFBuscarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnBuscarActionPerformed
    {//GEN-HEADEREND:event_btnBuscarActionPerformed
        if (!jTFBuscar.getText().isEmpty())
        {
            System.out.println("jTFbBuscar.getText() == " + "'" + jTFBuscar.getText() + "'.");  
            NodoArb busq = TablaHash.busqueda(PantallaPrincipal.getHash(), jTFBuscar.getText());    
            //Extraigo a la persona.
            if (busq != null)
            {
                NodoMulti persona = busq.getHilo();
                atajo = persona;
                despBtnFechas(persona);
                jLabelGrupo.setText("Ubicación: " + persona.getArrb().getEtq());
                jLabelPersona.setText("Persona: " + persona.getEtq());
                PersonaBuscada=jTFBuscar.getText();
            } else
            {
                jLabelGrupo.setText("Ubicacion: No Existe.");
                jLabelPersona.setText("Persona: No existe.");
                jLabelFechas.setText("No existen fechas.");
                jPnlFechas.removeAll();
                jScrollPane1.setViewportView(jPnlFechas);
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    public void despBtnFechas(NodoMulti persona)
    {
        //Extraigo las fechas.
        NodoMulti fechas = persona.getAbj();

        if (fechas != null)
        {
            jPnlFechas.removeAll();

            int t = 0;
            NodoMulti aux = fechas;
            while (aux != null)
            {
                t++;
                aux = aux.getSig();
            }
            arrayBtnFechas = new JButton[t];
            int j = 0;
            while (fechas != null)
            {
                arrayBtnFechas[j] = new JButton();
                arrayBtnFechas[j].setBounds(x, y, an, al);
                arrayBtnFechas[j].setText(fechas.getEtq());
                arrayBtnFechas[j].setBackground(Color.white);
                arrayBtnFechas[j].addActionListener(this);
                jPnlFechas.add(arrayBtnFechas[j]);
                fechas = fechas.getSig();
                y += 45;
                j++;
            }
            if (arrayBtnFechas.length > 5)
            {
                jPnlFechas.setPreferredSize(new Dimension(245, 300 + (45 * (arrayBtnFechas.length - 5))));
            } else
            {
                jPnlFechas.setPreferredSize(new Dimension(245, 250));
            }
            y = 30;
            jScrollPane1.setViewportView(jPnlFechas);
            jTFBuscar.setText("");
            jLabelFechas.setText("Fechas encontradas:");
        } else
        {
            jLabelFechas.setText("Sin fechas.");
        }
    }

    private void jTFBuscarKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jTFBuscarKeyPressed
    {//GEN-HEADEREND:event_jTFBuscarKeyPressed
        jTFBuscar.setTransferHandler(null);
        if (evt.getKeyChar() == '\n')
        {
            btnBuscarActionPerformed(null);
        }
    }//GEN-LAST:event_jTFBuscarKeyPressed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSalirActionPerformed
    {//GEN-HEADEREND:event_btnSalirActionPerformed
        PantallaPrincipal.pnlPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void jTFBuscarKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jTFBuscarKeyTyped
    {//GEN-HEADEREND:event_jTFBuscarKeyTyped
        jTFBuscar.setTransferHandler(null);

        if ((!Character.isLetter(evt.getKeyChar()) && !(evt.getKeyChar() == KeyEvent.VK_SPACE)) || jTFBuscar.getText().length() > 29)
        {
            if (evt.getKeyChar() == KeyEvent.VK_BACK_SPACE /*|| evt.getKeyChar() == KeyEvent.VK_ENTER*/)
            {
                jLabelGrupo.setText("Ubicacion: (Grupo)");
                jLabelPersona.setText("Persona:");
                jLabelFechas.setText("Fechas:");
                jPnlFechas.removeAll();
                jScrollPane1.setViewportView(jPnlFechas);
            }
            evt.consume();
        }
    }//GEN-LAST:event_jTFBuscarKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(InterfazBusq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(InterfazBusq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(InterfazBusq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(InterfazBusq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                InterfazBusq dialog = new InterfazBusq(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter()
                {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e)
                    {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelFechas;
    private javax.swing.JLabel jLabelGrupo;
    private javax.swing.JLabel jLabelPersona;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPnlFechas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFBuscar;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent ae)
    {
        try
        {
            for (int l = 0; l < arrayBtnFechas.length; l++)
            {
                if (ae.getSource().equals(arrayBtnFechas[l]))
                {
                    setSelectedFecha(arrayBtnFechas[l].getText());
                    //PantallaPrincipal.setSelectedFecha(selectedFecha);
                    jScrollPane1.setViewportView(jPnlFechas);
                    for (int i = 0; i < arrayBtnFechas.length; i++)
                    {
                        arrayBtnFechas[i].setBackground(Color.white);
                    }
                    arrayBtnFechas[l].setBackground(new Color(204, 255, 255)); //[204,255,255]
                    InterfazChat pantalluki = new InterfazChat(this, true, atajo.getAbj()); // ------> Aqui llamare a R y pondre las conversaciones
                    pantalluki.setLocationRelativeTo(this);
                    pantalluki.setVisible(true);
                }
            }
        } catch (Exception e)
        {
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the PersonaBuscada
     */
    public String getPersonaBuscada()
    {
        return PersonaBuscada;
    }

    /**
     * @return the selectedFecha
     */
    public String getSelectedFecha()
    {
        return selectedFecha;
    }

    /**
     * @param selectedFecha the selectedFecha to set
     */
    public void setSelectedFecha(String selectedFecha)
    {
        this.selectedFecha = selectedFecha;
    }

}
