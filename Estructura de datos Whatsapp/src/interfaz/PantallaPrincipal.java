/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import cjb.ci.CtrlInterfaz;
import eddSaiproG.ArbolBinario;
import eddSaiproG.Multilistas;
import eddSaiproG.NodoArb;
import eddSaiproG.NodoMulti;
import eddSaiproG.TablaHash;
import guardar.Guardar;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 * @author SaiproG
 */
public class PantallaPrincipal extends javax.swing.JFrame implements ActionListener
{

    /**
     * @param aSelectedFecha the selectedFecha to set
     */
    public static void setSelectedFecha(String aSelectedFecha)
    {
        selectedFecha = aSelectedFecha;
    }

    //Variables Globales
    private static String selectedGrupo = "";
    int indexSelectedGrupo;
    private static String selectedPerso = "";
    int indexSelectedPerso;
    private static String selectedFecha = "";
    int indexSelectedFecha;
    private static NodoMulti r = null;
    private static ArbolBinario hash[] = new ArbolBinario[27]; //TablaHash
    private static JButton arrayBtnGrupos[];
    private static JButton arrayBtnPerson[];
    JButton arrayBtnFechas[];
    Guardar gd = new Guardar();
    FileOutputStream archivoSali = null;
    FileInputStream archiEnt = null;
    UIManager uI = new UIManager();

    public PantallaPrincipal()
    {
        //uI.put("Panel.background", Color.WHITE);
        //uI.put("OptionPane.background", Color.WHITE);

        UIManager.put("Button.background", Color.WHITE);

        initComponents();
        jScrollPane1.setPreferredSize(new Dimension(245, 300));
        jScrollPane2.setPreferredSize(new Dimension(245, 300));
        jScrollPane3.setPreferredSize(new Dimension(245, 300));

        jTFPersonas.setEnabled(false);
        jTFFechas.setEnabled(false);
        //Principal
        jPnlGrupos.removeAll();
        jScrollPane1.setViewportView(jPnlGrupos);
        jPnlPersonas.removeAll();
        jScrollPane2.setViewportView(jPnlPersonas);
        jPnlFechas.removeAll();
        jScrollPane3.setViewportView(jPnlFechas);
        //Cargado de archivos
        try
        {
            archiEnt = new FileInputStream("archivoBin.dat");
            ObjectInputStream recargaGd = new ObjectInputStream(archiEnt);
            gd = (Guardar) recargaGd.readObject();
        } catch (FileNotFoundException ex)
        {
            System.out.println("No se econtró el archivo.");
        } catch (IOException | ClassNotFoundException ex)
        {
        }
        r = gd.getR();
        setHash(gd.getArbR());
        if (r != null)
        {
            despBtnGrupos();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        pnlPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPnlGrupos = new javax.swing.JPanel();
        btnEliminarGrupo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPnlPersonas = new javax.swing.JPanel();
        btnEliminarPersona = new javax.swing.JButton();
        btnMover = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPnlFechas = new javax.swing.JPanel();
        btnEliminarFecha = new javax.swing.JButton();
        btnChats = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jTFGrupos = new javax.swing.JTextField();
        jTFPersonas = new javax.swing.JTextField();
        jTFFechas = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabelError = new javax.swing.JLabel();
        jLabelContadorG = new javax.swing.JLabel();
        jLabelContadorP = new javax.swing.JLabel();
        jLabelContadorF = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);

        pnlPrincipal.setBackground(new java.awt.Color(255, 204, 204));
        pnlPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setText("Grupos");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel2.setText("Personas");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel3.setText("Fechas");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPnlGrupos.setBackground(new java.awt.Color(204, 250, 153));
        jPnlGrupos.setPreferredSize(new java.awt.Dimension(243, 29));

        btnEliminarGrupo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Ico Eliminar.png"))); // NOI18N
        btnEliminarGrupo.setToolTipText("");
        btnEliminarGrupo.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnEliminarGrupoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPnlGruposLayout = new javax.swing.GroupLayout(jPnlGrupos);
        jPnlGrupos.setLayout(jPnlGruposLayout);
        jPnlGruposLayout.setHorizontalGroup(
            jPnlGruposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnlGruposLayout.createSequentialGroup()
                .addContainerGap(301, Short.MAX_VALUE)
                .addComponent(btnEliminarGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPnlGruposLayout.setVerticalGroup(
            jPnlGruposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlGruposLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEliminarGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(362, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPnlGrupos);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPnlPersonas.setBackground(new java.awt.Color(204, 204, 255));
        jPnlPersonas.setPreferredSize(new java.awt.Dimension(226, 295));

        btnEliminarPersona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Ico Eliminar.png"))); // NOI18N
        btnEliminarPersona.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnEliminarPersonaActionPerformed(evt);
            }
        });

        btnMover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Mover.png"))); // NOI18N
        btnMover.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnMoverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPnlPersonasLayout = new javax.swing.GroupLayout(jPnlPersonas);
        jPnlPersonas.setLayout(jPnlPersonasLayout);
        jPnlPersonasLayout.setHorizontalGroup(
            jPnlPersonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnlPersonasLayout.createSequentialGroup()
                .addContainerGap(301, Short.MAX_VALUE)
                .addComponent(btnMover, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPnlPersonasLayout.setVerticalGroup(
            jPnlPersonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlPersonasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPnlPersonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnMover, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(362, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPnlPersonas);

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPnlFechas.setBackground(new java.awt.Color(204, 255, 255));
        jPnlFechas.setPreferredSize(new java.awt.Dimension(243, 290));

        btnEliminarFecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Ico Eliminar.png"))); // NOI18N
        btnEliminarFecha.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnEliminarFechaActionPerformed(evt);
            }
        });

        btnChats.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/chats.png"))); // NOI18N
        btnChats.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnChatsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPnlFechasLayout = new javax.swing.GroupLayout(jPnlFechas);
        jPnlFechas.setLayout(jPnlFechasLayout);
        jPnlFechasLayout.setHorizontalGroup(
            jPnlFechasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnlFechasLayout.createSequentialGroup()
                .addContainerGap(172, Short.MAX_VALUE)
                .addComponent(btnChats, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPnlFechasLayout.setVerticalGroup(
            jPnlFechasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlFechasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPnlFechasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminarFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChats, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(357, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(jPnlFechas);

        btnSalir.setBackground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Salir.png"))); // NOI18N
        btnSalir.setToolTipText("Salir del Programa y guardar los mensajes.");
        btnSalir.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSalirActionPerformed(evt);
            }
        });

        jTFGrupos.setText("Nombre del grupo.");
        jTFGrupos.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                jTFGruposFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                jTFGruposFocusLost(evt);
            }
        });
        jTFGrupos.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                jTFGruposKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                jTFGruposKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                jTFGruposKeyTyped(evt);
            }
        });

        jTFPersonas.setText("Nombre de la persona.");
        jTFPersonas.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                jTFPersonasFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                jTFPersonasFocusLost(evt);
            }
        });
        jTFPersonas.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jTFPersonasActionPerformed(evt);
            }
        });
        jTFPersonas.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                jTFPersonasKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                jTFPersonasKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                jTFPersonasKeyTyped(evt);
            }
        });

        jTFFechas.setText("dd-MM-aaaa");
        jTFFechas.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                jTFFechasFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                jTFFechasFocusLost(evt);
            }
        });
        jTFFechas.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                jTFFechasKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                jTFFechasKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                jTFFechasKeyTyped(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Buscar20x20.png"))); // NOI18N
        btnBuscar.setToolTipText("Busqueda de personas");
        btnBuscar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabelError.setBackground(new java.awt.Color(255, 255, 255));
        jLabelError.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabelError.setForeground(new java.awt.Color(255, 51, 51));
        jLabelError.setText("Escriba un nombre para agregar a los grupos.");

        jLabelContadorG.setFont(new java.awt.Font("Arial Black", 3, 10)); // NOI18N
        jLabelContadorG.setText("[0/30]");

        jLabelContadorP.setFont(new java.awt.Font("Arial Black", 3, 10)); // NOI18N
        jLabelContadorP.setText("[0/30]");

        jLabelContadorF.setFont(new java.awt.Font("Arial Black", 3, 10)); // NOI18N
        jLabelContadorF.setText("[0/10]");

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jTFGrupos, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelContadorG, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTFPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelContadorP, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabelError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFFechas, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelContadorF, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addComponent(btnSalir)
                        .addGap(42, 42, 42)
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFFechas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelContadorF))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                        .addGap(32, 32, 32))
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTFGrupos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelContadorG))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jTFPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabelContadorP))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelError, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public boolean existe(NodoMulti n, String cad)
    {
        boolean b = false;
        while (n != null)
        {
            if (n.getEtq().toUpperCase().trim().equals(cad.toUpperCase().trim()))
            {
                b = true;
                break;
            }
            n = n.getSig();
        }
        return b;
    }

    static int x = 30, y = 30, an = 240, al = 35, anF = 110;


    private void jTFGruposKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jTFGruposKeyPressed
    {//GEN-HEADEREND:event_jTFGruposKeyPressed
        jTFGrupos.setTransferHandler(null);
        if (evt.getKeyChar() == '\n')
        {
            gruposAccion();
        }
    }//GEN-LAST:event_jTFGruposKeyPressed

    private void jTFPersonasActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jTFPersonasActionPerformed
    {//GEN-HEADEREND:event_jTFPersonasActionPerformed

    }//GEN-LAST:event_jTFPersonasActionPerformed

    private void jTFPersonasKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jTFPersonasKeyPressed
    {//GEN-HEADEREND:event_jTFPersonasKeyPressed
        jTFPersonas.setTransferHandler(null);
        if (evt.getKeyChar() == '\n')
        {
            personasAccion();
        }
    }//GEN-LAST:event_jTFPersonasKeyPressed

    private void jTFFechasKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jTFFechasKeyPressed
    {//GEN-HEADEREND:event_jTFFechasKeyPressed
        jTFFechas.setTransferHandler(null);
        if (evt.getKeyChar() == '\n')
        {
            fechasAccion();
        }
    }//GEN-LAST:event_jTFFechasKeyPressed


    private void btnEliminarGrupoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnEliminarGrupoActionPerformed
    {//GEN-HEADEREND:event_btnEliminarGrupoActionPerformed
        //Proceso de eliminar
        /*int opc = JOptionPane.showConfirmDialog(this, "¿Esta seguro que desea eliminar \nel grupo <" + selectedGrupo.toUpperCase() + "> junto a todas sus personas y conversaciones?");*/
        int opc = JOptionPane.showConfirmDialog(this, "¿Esta seguro que desea eliminar \nel grupo <" + selectedGrupo.toUpperCase() + "> junto a todas sus personas y conversaciones?",
                "Confirme que desea eliminar", 0, 0);
        if (opc == 0)
        {
            NodoMulti arr[] = new NodoMulti[2];
            String etq[] = new String[1];
            etq[0] = getArrayBtnGrupos()[indexSelectedGrupo].getText();
            indexSelectedGrupo = 0;
            selectedGrupo = "";
            arr = Multilistas.eliminar(getR(), 0, etq, arr);
            setR(arr[0]);
            despBtnGrupos();
            arr[1] = arr[1].getAbj();
            while (arr[1] != null)
            {
                setHash(TablaHash.eliminar(getHash(), arr[1].getEtq()));
                arr[1] = arr[1].getSig();
            }
        }
    }//GEN-LAST:event_btnEliminarGrupoActionPerformed

    private void btnEliminarPersonaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnEliminarPersonaActionPerformed
    {//GEN-HEADEREND:event_btnEliminarPersonaActionPerformed

        /*int opc = JOptionPane.showConfirmDialog(this, "¿Esta seguro que desea eliminar \nla persona <" + selectedPerso.toUpperCase()
                + "> \ndel grupo <" + selectedGrupo.toUpperCase() + "> junto a todas sus conversaciones?");*/
        int ii = JOptionPane.showConfirmDialog(this, "¿Esta seguro que desea eliminar \nla persona <" + selectedPerso.toUpperCase()
                + "> \ndel grupo <" + selectedGrupo.toUpperCase() + "> junto a todas sus conversaciones?",
                "Confirme que desea eliminar", 0, 0);
        if (ii == 0)
        {
            NodoMulti arr[] = new NodoMulti[2];
            String etq[] = new String[2];
            etq[0] = getArrayBtnGrupos()[indexSelectedGrupo].getText();
            etq[1] = getArrayBtnPerson()[indexSelectedPerso].getText();
            indexSelectedPerso = 0;
            selectedPerso = "";
            arr = Multilistas.eliminar(getR(), 0, etq, arr);
            setR(arr[0]);
            setHash(TablaHash.eliminar(hash, etq[1]));
            despBtnPersonas();
        }
    }//GEN-LAST:event_btnEliminarPersonaActionPerformed

    private void btnEliminarFechaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnEliminarFechaActionPerformed
    {//GEN-HEADEREND:event_btnEliminarFechaActionPerformed
        /*int opc = JOptionPane.showConfirmDialog(this, "¿Esta seguro que desea eliminar \nlas conversaciones de la fecha <" + selectedFecha.toUpperCase() + "> "
                + "\nde la persona <" + selectedPerso.toUpperCase() + "> del grupo <" + selectedGrupo + ">?");*/
        int opc = JOptionPane.showConfirmDialog(this, "¿Esta seguro que desea eliminar \nlas conversaciones de la fecha <" + selectedFecha.toUpperCase() + "> "
                + "\nde la persona <" + selectedPerso.toUpperCase() + "> del grupo <" + selectedGrupo + ">?",
                "Confirme que desea eliminar", 0, 0);
        if (opc == 0)
        {
            NodoMulti arr[] = new NodoMulti[2];
            String etq[] = new String[3];
            etq[0] = getArrayBtnGrupos()[indexSelectedGrupo].getText();
            etq[1] = getArrayBtnPerson()[indexSelectedPerso].getText();
            etq[2] = arrayBtnFechas[indexSelectedFecha].getText();
            indexSelectedFecha = 0;
            setSelectedFecha("");
            arr = Multilistas.eliminar(getR(), 0, etq, arr);
            setR(arr[0]);
            despBtnFechas();
        }
    }//GEN-LAST:event_btnEliminarFechaActionPerformed

    private void btnChatsActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnChatsActionPerformed
    {//GEN-HEADEREND:event_btnChatsActionPerformed
        InterfazChat pantalluki = new InterfazChat(this, true); // ------> Aqui llamare a R y pondre las conversaciones
        pantalluki.setLocationRelativeTo(this);
        pantalluki.setVisible(true);
    }//GEN-LAST:event_btnChatsActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSalirActionPerformed
    {//GEN-HEADEREND:event_btnSalirActionPerformed
        gd.setR(r);
        gd.setArbR(hash);
        try
        {
            archivoSali = new FileOutputStream("archivoBin.dat");
            ObjectOutputStream oOS = new ObjectOutputStream(archivoSali);
            oOS.writeObject(gd);
        } catch (FileNotFoundException ex)
        {
            Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex)
        {
            Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } finally
        {
            try
            {
                archivoSali.close();
            } catch (IOException ex)
            {
                Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void jTFGruposKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jTFGruposKeyTyped
    {//GEN-HEADEREND:event_jTFGruposKeyTyped
        jTFGrupos.setTransferHandler(null);
        if ((!Character.isLetter(evt.getKeyChar()) && !(evt.getKeyChar() == KeyEvent.VK_SPACE)) || jTFGrupos.getText().length() > 29)
        {
            if (!Character.isLetter(evt.getKeyChar()) && !(evt.getKeyChar() == KeyEvent.VK_SPACE))
            {
                jLabelError.setText("Ingrese solo letras.");
            }
            if (jTFGrupos.getText().length() > 29)
            {
                jLabelError.setText("Ha excedido el limite de 30 letras.");
            }
            if (evt.getKeyChar() == KeyEvent.VK_BACK_SPACE || evt.getKeyChar() == KeyEvent.VK_ENTER)
            {
                if (jTFGrupos.getText().trim().isEmpty() && evt.getKeyChar() == KeyEvent.VK_ENTER)
                {
                    jLabelError.setText("Escriba un nombre para agregar a los grupos.");
                } else
                {
                    jLabelError.setText("");
                }
            }
            evt.consume();
        } else
        {
            jLabelError.setText("");
        }
    }//GEN-LAST:event_jTFGruposKeyTyped

    private void jTFPersonasKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jTFPersonasKeyTyped
    {//GEN-HEADEREND:event_jTFPersonasKeyTyped
        jTFPersonas.setTransferHandler(null);
        if ((!Character.isLetter(evt.getKeyChar()) && !(evt.getKeyChar() == KeyEvent.VK_SPACE)) || jTFPersonas.getText().length() > 29)
        {
            if (!Character.isLetter(evt.getKeyChar()) && !(evt.getKeyChar() == KeyEvent.VK_SPACE))
            {
                jLabelError.setText("Ingrese solo letras.");
            }
            if (jTFPersonas.getText().length() > 29)
            {
                jLabelError.setText("Ha excedido el limite de 30 letras.");
            }
            if (evt.getKeyChar() == KeyEvent.VK_BACK_SPACE || evt.getKeyChar() == KeyEvent.VK_ENTER)
            {
                if (jTFPersonas.getText().trim().isEmpty() && evt.getKeyChar() == KeyEvent.VK_ENTER)
                {
                    jLabelError.setText("Escriba un nombre para agregar a los personas de " + getSelectedGrupo() + ".");
                } else
                {
                    jLabelError.setText("");
                }
            }
            evt.consume();
        } else
        {
            jLabelError.setText("");
        }

        /*jTFPersonas.setTransferHandler(null);
        if ((!Character.isLetter(evt.getKeyChar()) && !(evt.getKeyChar() == KeyEvent.VK_SPACE)) || jTFPersonas.getText().length() > 29)
        {
            if (!Character.isLetter(evt.getKeyChar()) && !(evt.getKeyChar() == KeyEvent.VK_SPACE))
            {
                jLabelError.setText("Ingrese solo letras.");
            }
            if (jTFPersonas.getText().length() > 29)
            {
                jLabelError.setText("Ha excedido el limite de 30 letras.");
            }
            if (evt.getKeyChar() == KeyEvent.VK_BACK_SPACE || evt.getKeyChar() == KeyEvent.VK_ENTER)
            {
                jLabelError.setText("");
            }
            evt.consume();
        } else
        {
            jLabelError.setText("");
        }*/
    }//GEN-LAST:event_jTFPersonasKeyTyped

    private void jTFFechasKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jTFFechasKeyTyped
    {//GEN-HEADEREND:event_jTFFechasKeyTyped
        jTFFechas.setTransferHandler(null);
        if ((!Character.isDigit(evt.getKeyChar()) && evt.getKeyChar() != '-') || (jTFFechas.getText().length() > 9))
        {
            if (!Character.isDigit(evt.getKeyChar()) && evt.getKeyChar() != '-')
            {
                jLabelError.setText("Ingrese solo numeros.");
            }
            if (jTFFechas.getText().length() > 9)
            {
                jLabelError.setText("Solo 8 numeros y 2 -.");
            }
            if (evt.getKeyChar() == KeyEvent.VK_BACK_SPACE || evt.getKeyChar() == KeyEvent.VK_ENTER)
            {
                jLabelError.setText("");
            }
            evt.consume();
        } else
        {
            jLabelError.setText("");
        }

    }//GEN-LAST:event_jTFFechasKeyTyped

    private void btnMoverActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnMoverActionPerformed
    {//GEN-HEADEREND:event_btnMoverActionPerformed

        if (arrayBtnGrupos.length > 1)
        {
            // PantallaPrincipal.pnlPrincipal.setVisible(false);
            jPnlPersonas.removeAll();
            despBtnGrupos();
            InterfazMov obj = new InterfazMov(this, true);

            //Ya se elimino de la multilista, asi que hay que eliminar 
            //del arbol e insertarlo con su nuevo hilo
            setHash(TablaHash.eliminar(hash, getSelectedPerso()));

            //busco al nodo persona en multilista 
            //insertado correctamente para hilarlo
            NodoMulti a = Multilistas.buscar(getR(), getSelectedGrupo());
            a = a.getAbj();
            NodoMulti aa = Multilistas.buscar(a, getSelectedPerso());

            NodoArb n = new NodoArb(getSelectedPerso(), null);//Nodo con el hilo
            n.setHilo(aa);

            setHash(TablaHash.inserta(getHash(), n));
            obj.setVisible(true);
        } else
        {
            JOptionPane.showMessageDialog(this, "Imposible mover, agregue mas grupos.");
        }

    }//GEN-LAST:event_btnMoverActionPerformed


    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnBuscarActionPerformed
    {//GEN-HEADEREND:event_btnBuscarActionPerformed
        NodoMulti aux = getR();
        boolean b = false;
        while (aux != null)
        {
            if (aux.getAbj() != null)
            {
                b = true;
                break;
            } else
            {
                aux = aux.getSig();
                System.out.println("No hay datos.");
            }
        }
        if (b)
        {
            InterfazBusq obj = new InterfazBusq(this, true);
            obj.setVisible(true);
        } else
        {
            JOptionPane.showMessageDialog(this, "No hay ninguna persona registrada en ningun grupo.");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void jTFFechasFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_jTFFechasFocusGained
    {//GEN-HEADEREND:event_jTFFechasFocusGained
        jTFFechas.setText("");
    }//GEN-LAST:event_jTFFechasFocusGained

    private void jTFFechasFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_jTFFechasFocusLost
    {//GEN-HEADEREND:event_jTFFechasFocusLost
        jTFFechas.setText("dd-MM-aaaa");
    }//GEN-LAST:event_jTFFechasFocusLost

    private void jTFGruposFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_jTFGruposFocusGained
    {//GEN-HEADEREND:event_jTFGruposFocusGained
        jTFGrupos.setText("");
    }//GEN-LAST:event_jTFGruposFocusGained

    private void jTFGruposFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_jTFGruposFocusLost
    {//GEN-HEADEREND:event_jTFGruposFocusLost

        jTFGrupos.setText("Nombre del grupo.");
    }//GEN-LAST:event_jTFGruposFocusLost

    private void jTFPersonasFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_jTFPersonasFocusLost
    {//GEN-HEADEREND:event_jTFPersonasFocusLost
        jTFPersonas.setText("Nombre de la persona.");
    }//GEN-LAST:event_jTFPersonasFocusLost

    private void jTFPersonasFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_jTFPersonasFocusGained
    {//GEN-HEADEREND:event_jTFPersonasFocusGained
        jTFPersonas.setText("");
    }//GEN-LAST:event_jTFPersonasFocusGained

    private void jTFGruposKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jTFGruposKeyReleased
    {//GEN-HEADEREND:event_jTFGruposKeyReleased
        jLabelContadorG.setText("[" + jTFGrupos.getText().length() + "/30]");
    }//GEN-LAST:event_jTFGruposKeyReleased

    private void jTFPersonasKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jTFPersonasKeyReleased
    {//GEN-HEADEREND:event_jTFPersonasKeyReleased
        jLabelContadorP.setText("[" + jTFPersonas.getText().length() + "/30]");
    }//GEN-LAST:event_jTFPersonasKeyReleased

    private void jTFFechasKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jTFFechasKeyReleased
    {//GEN-HEADEREND:event_jTFFechasKeyReleased
        jLabelContadorF.setText("[" + jTFFechas.getText().length() + "/10]");
    }//GEN-LAST:event_jTFFechasKeyReleased

    public void fechasAccion()
    {
        if (!jTFFechas.getText().isEmpty())
        {
            if (Pattern.matches("^([0-2][0-9]|3[0-1])(\\-)(0[1-9]|1[0-2])\\2(2\\d{3})$", jTFFechas.getText()))
            {
                NodoMulti b = Multilistas.buscar(getR(), getSelectedGrupo()).getAbj();
                NodoMulti bb = Multilistas.buscar(b, getSelectedPerso()).getAbj();
                if (!jTFFechas.getText().isEmpty() && !existe(bb, jTFFechas.getText()))
                {
                    //Inserción a Multilista
                    String etqs[] = new String[3];
                    etqs[0] = getSelectedGrupo();
                    etqs[1] = getSelectedPerso();
                    etqs[2] = jTFFechas.getText();
                    ///////////////////////////////////////////////////////////////////////
                    NodoMulti newFecha = new NodoMulti(null, jTFFechas.getText());
                    NodoMulti a = Multilistas.buscar(getR(), getSelectedGrupo()).getAbj();
                    NodoMulti aa = Multilistas.buscar(a, etqs[1]);
                    setR(Multilistas.insertar(getR(), newFecha, aa, 0, etqs));
                    ////////////////////////////////////////////////////////////////////////
                    //Despliegue de Multilista (Para verificar que se insertó (CONSOLA))
                    etqs[0] = Multilistas.desp(getR(), 0);
                    System.out.println(etqs[0]);
                    despBtnFechas();
                    jTFFechas.setText("");
                    setSelectedFecha("");
                } else
                {
                    if (!jTFFechas.getText().isEmpty())
                    {
                        JOptionPane.showMessageDialog(null, "La fecha " + jTFFechas.getText().toUpperCase() + " ya existe.");
                    }
                }
            } else
            {
                JOptionPane.showMessageDialog(this, "Formato de fecha dd-MM-AAAA no valido.\nFechas deben ser del año 2000 en adelante.");
            }
        }
    }

    public void personasAccion()
    {
        jLabelError.setText("");
        NodoMulti b = Multilistas.buscar(getR(), getSelectedGrupo()).getAbj();
        if (!jTFPersonas.getText().isEmpty() && !jTFPersonas.getText().equals("Nombre de la persona."))
        {
            //Verifica que sea valido el nombre
            System.out.println("busqueda == " + TablaHash.busqueda(getHash(), jTFPersonas.getText()));
            //==null no existe !=null existe
            if (TablaHash.busqueda(getHash(), jTFPersonas.getText()) != null || jTFPersonas.getText().equals("Nombre de la persona."))
            {
                if (jTFPersonas.getText().equals("Nombre de la persona."))
                {
                    jLabelError.setText("Escriba un nombre para agregar personas al grupo de" + getSelectedGrupo() + ".");
                } else
                {
                    jLabelError.setText("");
                }
                if (!jTFPersonas.getText().isEmpty() && !jTFPersonas.getText().equals("Nombre de la persona.") && jTFPersonas.getText() != null)
                {
                    JOptionPane.showMessageDialog(this, "La persona '" + jTFPersonas.getText()
                            + "' ya existe en este u otro grupo, ingrese otro nombre.", "Persona repetida", 0);
                }
            } else
            {
                char c[] = jTFPersonas.getText().toUpperCase().toCharArray();
                int ascii = (int) c[0] - 65;
                if (ascii == 144)
                {
                    ascii = 26;
                }
                boolean e = (ascii >= 0 && ascii <= 27) ? true : false;
                System.out.println("ascii == " + ascii);
                System.out.println("Si se puede insertar a arbol '" + c[0] + "'");
                System.out.println("jtf && e == " + (!jTFPersonas.getText().isEmpty() && e));
                System.out.println("jtf vacio?? == " + jTFPersonas.getText().isEmpty());
                System.out.println("e == " + e);
                System.out.println("''" + ascii + "'' == " + e);
                if (!jTFPersonas.getText().isEmpty() && e)
                {
                    //Inserción a Multilista
                    String etqs[] = new String[2];
                    etqs[0] = getSelectedGrupo();
                    etqs[1] = jTFPersonas.getText();

                    NodoMulti newPers = new NodoMulti(null, jTFPersonas.getText());
                    NodoMulti arrb = Multilistas.buscar(getR(), getSelectedGrupo());
                    setR(Multilistas.insertar(getR(), newPers, arrb, 0, etqs));

                    NodoArb n = new NodoArb(etqs[1], null);//Nodo con el hilo
                    n.setHilo(newPers);

                    setHash(TablaHash.inserta(getHash(), n));

                    System.out.println("n.getEtq() == " + n.getEtq());
                    System.out.println("n.getHilo() == " + n.getHilo().getEtq());
                    System.out.println("n.getHilo.getArrb == " + n.getHilo().getArrb().getEtq());

                    //Despliegue de Multilista (Para verificar que se insertó (CONSOLA))
                    etqs[0] = Multilistas.desp(getR(), 0);
                    System.out.println(etqs[0]);
                    despBtnPersonas();
                    jTFPersonas.setText("");
                    selectedPerso = "";
                }
            }
        }
    }

    public void gruposAccion()
    {
        jLabelError.setText("");

        boolean b = false; //Comprueba que inicie con letras
        char cc = ' ';
        try
        {
            char c = jTFGrupos.getText().toUpperCase().charAt(0); //Comprueba que inicie con letras
            cc = c;
            if (Character.isLetter(c))
            {
                b = true;
            }
        } catch (Exception e)
        {
            System.out.println("Nombre del grupo no puede iniciar con '" + cc + "'");
        }

        if (!jTFGrupos.getText().trim().isEmpty() && !existe(r, jTFGrupos.getText()) && !jTFGrupos.getText().equals("Nombre del grupo.") && b)
        {
            //Principal
            jPnlPersonas.removeAll();
            jScrollPane2.setViewportView(jPnlPersonas);
            jPnlFechas.removeAll();
            jScrollPane3.setViewportView(jPnlFechas);
            jTFPersonas.setEnabled(false);
            jTFFechas.setEnabled(false);
            //Inserción a Multilista
            String etqs[] = new String[1];
            etqs[0] = jTFGrupos.getText();
            NodoMulti newGrupo = new NodoMulti(null, jTFGrupos.getText());
            setR(Multilistas.insertar(getR(), newGrupo, null, 0, etqs));
            //Despliegue de Multilista (Para verificar que se insertó (CONSOLA))
            etqs[0] = Multilistas.desp(getR(), 0);
            System.out.println(etqs[0]);
            //Despliega los botones GRUPOS
            despBtnGrupos();
            jTFGrupos.setText("");
            selectedGrupo = "";
        } else
        {
            if (!jTFGrupos.getText().isEmpty() && !jTFGrupos.getText().equals("Nombre del grupo.") && existe(r, jTFGrupos.getText()))
            {
                JOptionPane.showMessageDialog(null, "El grupo " + jTFGrupos.getText().toUpperCase() + " ya existe.");
            }
        }
    }

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
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new PantallaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnChats;
    public static javax.swing.JButton btnEliminarFecha;
    private javax.swing.JButton btnEliminarGrupo;
    private javax.swing.JButton btnEliminarPersona;
    private javax.swing.JButton btnMover;
    public static javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelContadorF;
    private javax.swing.JLabel jLabelContadorG;
    private javax.swing.JLabel jLabelContadorP;
    private javax.swing.JLabel jLabelError;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JPanel jPnlFechas;
    public static javax.swing.JPanel jPnlGrupos;
    public static javax.swing.JPanel jPnlPersonas;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JScrollPane jScrollPane3;
    public static javax.swing.JTextField jTFFechas;
    public static javax.swing.JTextField jTFGrupos;
    public static javax.swing.JTextField jTFPersonas;
    public static javax.swing.JPanel pnlPrincipal;
    // End of variables declaration//GEN-END:variables

    public void despBtnGrupos()
    {
        //Principal
        jPnlGrupos.removeAll();
        jScrollPane1.setViewportView(jPnlGrupos);
        //PrincipalPersonas
        jPnlPersonas.removeAll();
        jPnlPersonas.setPreferredSize(new Dimension(245, 250));
        jPnlPersonas.setBounds(0, 0, an, al);
        jTFPersonas.setEnabled(false);
        jScrollPane2.setViewportView(jPnlPersonas);
        //PrincipalFechas
        jPnlFechas.removeAll();
        jPnlPersonas.setBounds(0, 0, an, al);
        jTFFechas.setEnabled(false);
        jScrollPane3.setViewportView(jPnlFechas);
        //Desplegado
        NodoMulti aux = getR();
        int t = 0;
        while (aux != null)
        {
            t++;
            aux = aux.getSig();
        }
        setArrayBtnGrupos(new JButton[t]);
        aux = getR();
        int i = 0;
        while (aux != null)
        {
            getArrayBtnGrupos()[i] = new JButton();
            getArrayBtnGrupos()[i].setBounds(x, y, an, al);
            getArrayBtnGrupos()[i].setText(aux.getEtq());
            getArrayBtnGrupos()[i].setBackground(Color.white);
            getArrayBtnGrupos()[i].addActionListener(this);
            jPnlGrupos.add(getArrayBtnGrupos()[i]);
            aux = aux.getSig();
            y += 45;
            i++;
        }
        if (getArrayBtnGrupos().length > 5)
        {
            jPnlGrupos.setPreferredSize(new Dimension(245, 300 + (45 * (getArrayBtnGrupos().length - 5))));
        } else
        {
            jPnlGrupos.setPreferredSize(new Dimension(245, 250));
        }
        y = 30;
        CtrlInterfaz.selecciona(jTFGrupos);
    }

    public static void despMover()
    {
        jPnlFechas.setPreferredSize(new Dimension(245, 250));
        //PrincipalPersona
        jPnlPersonas.removeAll();
        jTFPersonas.setEnabled(true);
        jScrollPane2.setViewportView(jPnlPersonas);
        //PrincipalFecha
        jPnlFechas.removeAll();
        jPnlPersonas.setPreferredSize(new Dimension(245, 250));
        //jPnlPersonas.setBounds(0, 0, an, al);
        jTFFechas.setEnabled(false);
        jPnlFechas.setPreferredSize(new Dimension(245, 250));
        jScrollPane3.setViewportView(jPnlFechas);
        //Desplegado
        NodoMulti aux = Multilistas.buscar(getR(), getSelectedGrupo()).getAbj();
        if (aux != null)
        {
            int t = 0;
            NodoMulti aux2 = aux;
            while (aux2 != null)
            {
                t++;
                aux2 = aux2.getSig();
            }
            setArrayBtnPerson(new JButton[t]);
            int i = 0;
            while (aux != null)
            {
                getArrayBtnPerson()[i] = new JButton();
                getArrayBtnPerson()[i].setBounds(x, y, an, al);
                getArrayBtnPerson()[i].setText(aux.getEtq());
                getArrayBtnPerson()[i].setBackground(Color.white);
                jPnlPersonas.add(getArrayBtnPerson()[i]);
                aux = aux.getSig();
                y += 45;
                i++;
            }
            if (getArrayBtnPerson().length > 5)
            {
                jPnlPersonas.setPreferredSize(new Dimension(245, 300 + (45 * (getArrayBtnPerson().length - 5))));
            } else
            {
                jPnlPersonas.setPreferredSize(new Dimension(245, 250));
            }
            y = 30;
            CtrlInterfaz.selecciona(jTFPersonas);
        }
    }

    public void despBtnPersonas()
    {

        jPnlFechas.setPreferredSize(new Dimension(245, 250));
        //PrincipalPersona
        jPnlPersonas.removeAll();
        jTFPersonas.setEnabled(true);
        jScrollPane2.setViewportView(jPnlPersonas);
        //PrincipalFecha
        jPnlFechas.removeAll();
        jPnlPersonas.setPreferredSize(new Dimension(245, 250));
        //jPnlPersonas.setBounds(0, 0, an, al);
        jTFFechas.setEnabled(false);
        jPnlFechas.setPreferredSize(new Dimension(245, 250));
        jScrollPane3.setViewportView(jPnlFechas);
        //Desplegado
        NodoMulti aux = Multilistas.buscar(getR(), getSelectedGrupo()).getAbj();
        if (aux != null)
        {
            int t = 0;
            NodoMulti aux2 = aux;
            while (aux2 != null)
            {
                t++;
                aux2 = aux2.getSig();
            }
            setArrayBtnPerson(new JButton[t]);
            int i = 0;
            while (aux != null)
            {
                getArrayBtnPerson()[i] = new JButton();
                getArrayBtnPerson()[i].setBounds(x, y, an, al);
                getArrayBtnPerson()[i].setText(aux.getEtq());
                getArrayBtnPerson()[i].setBackground(Color.white);
                getArrayBtnPerson()[i].addActionListener(this);
                jPnlPersonas.add(getArrayBtnPerson()[i]);
                aux = aux.getSig();
                y += 45;
                i++;
            }
            if (getArrayBtnPerson().length > 5)
            {
                jPnlPersonas.setPreferredSize(new Dimension(245, 300 + (45 * (getArrayBtnPerson().length - 5))));
            } else
            {
                jPnlPersonas.setPreferredSize(new Dimension(245, 250));
            }
            y = 30;
            CtrlInterfaz.selecciona(jTFPersonas);
        }
    }

    public void despBtnFechas()
    {
        CtrlInterfaz.selecciona(jTFFechas);
        //Principal
        jPnlFechas.removeAll();
        jPnlFechas.setPreferredSize(new Dimension(245, 250));
        jScrollPane3.setViewportView(jPnlFechas);
        NodoMulti aux = Multilistas.buscar(getR(), getSelectedGrupo()).getAbj();
        if (aux != null)
        {
            NodoMulti aux2 = Multilistas.buscar(aux, getSelectedPerso()).getAbj();
            if (aux2 != null)
            {
                int t = 0;
                NodoMulti aux3 = aux2;
                while (aux3 != null)
                {
                    t++;
                    aux3 = aux3.getSig();
                }
                arrayBtnFechas = new JButton[t];
                int j = 0;
                while (aux2 != null)
                {
                    arrayBtnFechas[j] = new JButton();
                    arrayBtnFechas[j].setBounds(x, y, anF, al);
                    arrayBtnFechas[j].setText(aux2.getEtq());
                    arrayBtnFechas[j].setBackground(Color.white);
                    arrayBtnFechas[j].addActionListener(this);
                    jPnlFechas.add(arrayBtnFechas[j]);
                    aux2 = aux2.getSig();
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
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae)
    {
        jLabelError.setText("");
        try
        {
            for (int i = 0; i < getArrayBtnGrupos().length; i++)
            {
                if (ae.getSource().equals(getArrayBtnGrupos()[i]))
                {
                    selectedGrupo = getArrayBtnGrupos()[i].getText();
                    jLabelError.setText("Escriba un nombre para agregar personas al grupo de " + getSelectedGrupo() + ".");
                    indexSelectedGrupo = i;
                    btnEliminarGrupo.setBounds(280, getArrayBtnGrupos()[indexSelectedGrupo].getY(), 27, 27);
                    btnEliminarGrupo.setToolTipText("Eliminar grupo <" + getArrayBtnGrupos()[indexSelectedGrupo].getText() + "> y todos sus personas y fechas.");
                    jPnlGrupos.add(btnEliminarGrupo);
                    jScrollPane1.setViewportView(jPnlGrupos);
                    //Despliegue de los botones
                    //Cambio de color de los botones
                    //1.- Ponemos los botones en .GRAY
                    for (int j = 0; j < getArrayBtnGrupos().length; j++)
                    {
                        getArrayBtnGrupos()[j].setBackground(Color.white);
                    }
                    //2.- Ponemos el color shidox
                    getArrayBtnGrupos()[i].setBackground(new Color(255, 204, 153)); //[204,250,153]
                    despBtnPersonas();
                }
            }
        } catch (Exception e)
        {
        }

        try
        {
            for (int k = 0; k < getArrayBtnPerson().length; k++)
            {
                if (ae.getSource().equals(getArrayBtnPerson()[k]))
                {
                    jTFFechas.setEnabled(true);
                    selectedPerso = getArrayBtnPerson()[k].getText();
                    indexSelectedPerso = k;
                    jScrollPane2.setViewportView(jPnlPersonas);
                    btnEliminarPersona.setBounds(280, getArrayBtnPerson()[indexSelectedPerso].getY(), 27, 27);
                    btnEliminarPersona.setToolTipText("Eliminar persona <" + getArrayBtnPerson()[indexSelectedPerso].getText() + "> y todas sus fechas.");
                    jPnlPersonas.add(btnEliminarPersona);
                    btnMover.setBounds(309, getArrayBtnPerson()[indexSelectedPerso].getY(), 27, 27);
                    btnMover.setToolTipText("Mover <" + getArrayBtnPerson()[indexSelectedPerso].getText().toUpperCase() + "> a otro grupo.");
                    jPnlPersonas.add(btnMover);
                    for (int j = 0; j < getArrayBtnPerson().length; j++)
                    {
                        getArrayBtnPerson()[j].setBackground(Color.white);
                    }
                    getArrayBtnPerson()[k].setBackground(new Color(255, 204, 153)); //[204,204,255]
                    despBtnFechas();
                    jTFFechas.setEnabled(true);
                }

            }
        } catch (Exception e)
        {
        }

        try
        {
            for (int l = 0; l < arrayBtnFechas.length; l++)
            {
                if (ae.getSource().equals(arrayBtnFechas[l]))
                {
                    setSelectedFecha(arrayBtnFechas[l].getText());
                    indexSelectedFecha = l;
                    jScrollPane3.setViewportView(jPnlFechas);
                    //Boton eliminar
                    btnEliminarFecha.setBounds(151 + 30, arrayBtnFechas[indexSelectedFecha].getY(), 27, 27);
                    btnEliminarFecha.setToolTipText("Eliminar fecha <" + arrayBtnFechas[indexSelectedFecha].getText() + "> y todas sus conversaciones.");
                    jPnlFechas.add(btnEliminarFecha);
                    //Boton chats
                    btnChats.setBounds(151, arrayBtnFechas[indexSelectedFecha].getY(), 30, 30);
                    btnChats.setToolTipText("Abrir chats de <" + arrayBtnFechas[indexSelectedFecha].getText() + ">");
                    jPnlFechas.add(btnChats);
                    for (int i = 0; i < arrayBtnFechas.length; i++)
                    {
                        arrayBtnFechas[i].setBackground(Color.white);
                    }
                    arrayBtnFechas[l].setBackground(new Color(255, 204, 153)); //[204,255,255]
                }
            }
        } catch (Exception e)
        {
        }
    }

    /**
     * @return the r
     */
    public static NodoMulti getR()
    {
        return r;
    }

    /**
     * @param aR the r to set
     */
    public static void setR(NodoMulti aR)
    {
        r = aR;
    }

    /**
     * @return the selectedGrupo
     */
    public static String getSelectedGrupo()
    {
        return selectedGrupo;
    }

    /**
     * @return the selectedPerso
     */
    public static String getSelectedPerso()
    {
        return selectedPerso;
    }

    /**
     * @return the selectedFecha
     */
    public static String getSelectedFecha()
    {
        return selectedFecha;
    }

    /**
     * @return the arrayBtnGrupos
     */
    public static JButton[] getArrayBtnGrupos()
    {
        return arrayBtnGrupos;
    }

    /**
     * @param aArrayBtnGrupos the arrayBtnGrupos to set
     */
    public static void setArrayBtnGrupos(JButton[] aArrayBtnGrupos)
    {
        arrayBtnGrupos = aArrayBtnGrupos;
    }

    /**
     * @return the arrayBtnPerson
     */
    public static JButton[] getArrayBtnPerson()
    {
        return arrayBtnPerson;
    }

    /**
     * @param aArrayBtnPerson the arrayBtnPerson to set
     */
    public static void setArrayBtnPerson(JButton[] aArrayBtnPerson)
    {
        arrayBtnPerson = aArrayBtnPerson;
    }

    public void difuminadoSalir()
    {
        float f = (float) 1.0;
        for (int i = 1; i <= 7; i++)
        {
            this.setOpacity(f);
            f = (float) (f - 0.1);
            try
            {
                Thread.sleep(15);
            } catch (InterruptedException ex)
            {
            }
        }
    }

    public void difuminadoEntar()
    {
        float f = 0.3f;
        for (int i = 1; i <= 7; i++)
        {

            f = (float) (0.1) + f;
            if (f == 1.0000001f)
            {
                f = 1.f;
            }
            this.setOpacity(f);

            try
            {
                Thread.sleep(15);
            } catch (InterruptedException ex)
            {
            }
        }
    }

    public static ArbolBinario[] getHash()
    {
        return hash;
    }

    public static void setHash(ArbolBinario[] aHash)
    {
        hash = aHash;
    }
}
