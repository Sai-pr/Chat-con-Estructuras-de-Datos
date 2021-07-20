package interfaz;

import javax.swing.ImageIcon;
import eddSaiproG.PilaD;
import eddSaiproG.ColaD;
import eddSaiproG.Multilistas;
import eddSaiproG.Nodo;
import eddSaiproG.NodoMulti;

/**
 * @author SaiproG
 */
public class InterfazChat extends javax.swing.JDialog
{

    //Variables Globales. 
    private PilaD pila1 = new PilaD();
    private PilaD pila2 = new PilaD();
    private ColaD cola12 = new ColaD();
    String s = "";
    String person = "";
    public InterfazChat(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        System.out.println("Entro al contructor de FRAME");
        initComponents();
        jLabelEmisor2.setText(PantallaPrincipal.getSelectedPerso());
        jLabelFecha.setText("Fecha de conversacion: " + PantallaPrincipal.getSelectedFecha());
        btnBuscarE2.setToolTipText("Buscar de " + PantallaPrincipal.getSelectedPerso());
        btnBuscarE5.setToolTipText("Ver pila de mensajes de " + PantallaPrincipal.getSelectedPerso());
        person = PantallaPrincipal.getSelectedPerso();
        NodoMulti aux = Multilistas.buscar(PantallaPrincipal.getR(), PantallaPrincipal.getSelectedGrupo()).getAbj(); //Grupo.abj()
        if (aux != null)
        {
            NodoMulti aux2 = Multilistas.buscar(aux, PantallaPrincipal.getSelectedPerso()).getAbj(); //Persona.abj()
            if (aux2 != null)
            {
                NodoMulti aux3 = Multilistas.buscar(aux2, PantallaPrincipal.getSelectedFecha()).getAbj();
                if (aux3 != null) //Fecha.abj()
                {
                    pila1 = aux3.getPila1();
                    pila2 = aux3.getPila2();
                    cola12 = aux3.getCola12();
                    pila1.imprimir();
                    pila2.imprimir();
                    jTAE12.setText(cola12.imprimir());
                    cola12.imprimir();
                }
            }
        }
    }

    public InterfazChat(java.awt.Dialog parent, boolean modal, NodoMulti atajo) //Se recibe el nodo de la persona.getAbj() para solo buscar la fecha
    {
        super(parent, modal);
        System.out.println("Entro al contructor de DIALOG");
        initComponents();
        jLabelEmisor2.setText(atajo.getArrb().getEtq());
        jLabelFecha.setText("Fecha de conversacion: " + atajo.getEtq());
        btnBuscarE2.setToolTipText("Buscar de " + atajo.getArrb().getEtq());
        btnBuscarE5.setToolTipText("Ver pila de mensajes de " + atajo.getArrb().getEtq());
        NodoMulti aux = atajo; //Grupo.abj()
        NodoMulti aux2 = Multilistas.buscar(aux, atajo.getEtq()).getAbj();
        person = atajo.getArrb().getEtq();
        if (aux2 != null) //Fecha.abj()
        {
            pila1 = aux2.getPila1();
            pila2 = aux2.getPila2();
            cola12 = aux2.getCola12();
            pila1.imprimir();
            pila2.imprimir();
            jTAE12.setText(cola12.imprimir());
            cola12.imprimir();
        }

    }
/*
    public InterfazChat(java.awt.Dialog parent, boolean modal)
    {
        super(parent, modal);
        initComponents();
        jLabelEmisor2.setText(PantallaPrincipal.getSelectedPerso());
        btnBuscarE2.setToolTipText("Buscar de " + PantallaPrincipal.getSelectedPerso());
        btnBuscarE5.setToolTipText("Ver pila de mensajes de " + PantallaPrincipal.getSelectedPerso());
        NodoMulti aux = Multilistas.buscar(PantallaPrincipal.getR(), PantallaPrincipal.getSelectedGrupo()).getAbj(); //Grupo.abj()
        if (aux != null)
        {
            NodoMulti aux2 = Multilistas.buscar(aux, PantallaPrincipal.getSelectedPerso()).getAbj(); //Persona.abj()
            if (aux2 != null)
            {
                NodoMulti aux3 = Multilistas.buscar(aux2, PantallaPrincipal.getSelectedFecha()).getAbj();
                if (aux3 != null) //Fecha.abj()
                {
                    pila1 = aux3.getPila1();
                    pila2 = aux3.getPila2();
                    cola12 = aux3.getCola12();
                    pila1.imprimir();
                    pila2.imprimir();
                    jTAE12.setText(cola12.imprimir());
                    cola12.imprimir();
                }
            }
        }
    }
*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnEnviarE1 = new javax.swing.JButton();
        jTFE1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnBuscarE1 = new javax.swing.JButton();
        btnBuscarE3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnEnviarE2 = new javax.swing.JButton();
        jTFE2 = new javax.swing.JTextField();
        jLabelEmisor2 = new javax.swing.JLabel();
        btnBuscarE2 = new javax.swing.JButton();
        btnBuscarE5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAE12 = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        btnMenuDesplegable = new javax.swing.JButton();
        panelMnuDesplegable = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabelFecha = new javax.swing.JLabel();

        jButton5.setText("jButton5");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Wasaa V2");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jPanel2.setBackground(new java.awt.Color(229, 226, 249));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        btnEnviarE1.setBackground(new java.awt.Color(255, 204, 153));
        btnEnviarE1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Enviar 32px.png"))); // NOI18N
        btnEnviarE1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnEnviarE1ActionPerformed(evt);
            }
        });

        jTFE1.setBackground(new java.awt.Color(255, 255, 204));
        jTFE1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTFE1.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                jTFE1KeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel1.setText("Usted     ");

        btnBuscarE1.setBackground(new java.awt.Color(0, 0, 0));
        btnBuscarE1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Buscar20x20.png"))); // NOI18N
        btnBuscarE1.setToolTipText("Buscar mensaje suyo.");
        btnBuscarE1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnBuscarE1ActionPerformed(evt);
            }
        });

        btnBuscarE3.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscarE3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/OjoMostrar.png"))); // NOI18N
        btnBuscarE3.setToolTipText("Ver pila de mensajes suyos.");
        btnBuscarE3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnBuscarE3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                        .addComponent(btnBuscarE1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTFE1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEnviarE1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarE3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(btnBuscarE3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarE1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTFE1)
                    .addComponent(btnEnviarE1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(229, 226, 249));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        btnEnviarE2.setBackground(new java.awt.Color(255, 204, 153));
        btnEnviarE2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Enviar 32px.png"))); // NOI18N
        btnEnviarE2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnEnviarE2ActionPerformed(evt);
            }
        });

        jTFE2.setBackground(new java.awt.Color(255, 255, 204));
        jTFE2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTFE2.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                jTFE2KeyPressed(evt);
            }
        });

        jLabelEmisor2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabelEmisor2.setText("Emisor 2");

        btnBuscarE2.setBackground(new java.awt.Color(0, 0, 0));
        btnBuscarE2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Buscar20x20.png"))); // NOI18N
        btnBuscarE2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnBuscarE2ActionPerformed(evt);
            }
        });

        btnBuscarE5.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscarE5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/OjoMostrar.png"))); // NOI18N
        btnBuscarE5.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnBuscarE5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jTFE2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEnviarE2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabelEmisor2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarE2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarE5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelEmisor2)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnBuscarE5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBuscarE2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTFE2)
                    .addComponent(btnEnviarE2))
                .addContainerGap())
        );

        jTAE12.setEditable(false);
        jTAE12.setBackground(new java.awt.Color(229, 226, 249));
        jTAE12.setColumns(20);
        jTAE12.setLineWrap(true);
        jTAE12.setRows(5);
        jTAE12.setWrapStyleWord(true);
        jTAE12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTAE12.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(jTAE12);

        jPanel4.setBackground(new java.awt.Color(255, 204, 204));

        btnMenuDesplegable.setBackground(new java.awt.Color(255, 255, 255));
        btnMenuDesplegable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/MenuMenos.png"))); // NOI18N
        btnMenuDesplegable.setToolTipText("Ocultar opciones.");
        btnMenuDesplegable.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnMenuDesplegableActionPerformed(evt);
            }
        });

        panelMnuDesplegable.setBackground(new java.awt.Color(255, 204, 204));
        panelMnuDesplegable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 153), 2));

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

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/OjoMostrar.png"))); // NOI18N
        jButton7.setToolTipText("Mostrar todo el chat.");
        jButton7.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Ordenar.png"))); // NOI18N
        jButton8.setToolTipText("Ordenar el chat.");
        jButton8.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMnuDesplegableLayout = new javax.swing.GroupLayout(panelMnuDesplegable);
        panelMnuDesplegable.setLayout(panelMnuDesplegableLayout);
        panelMnuDesplegableLayout.setHorizontalGroup(
            panelMnuDesplegableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMnuDesplegableLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMnuDesplegableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMnuDesplegableLayout.createSequentialGroup()
                        .addGroup(panelMnuDesplegableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelMnuDesplegableLayout.setVerticalGroup(
            panelMnuDesplegableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMnuDesplegableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton7)
                .addGap(18, 18, 18)
                .addComponent(jButton8)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(61, 61, 61))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelMnuDesplegable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMenuDesplegable, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMenuDesplegable, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelMnuDesplegable, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Unispace", 3, 14)); // NOI18N
        jLabel3.setText("Wasaa v2");

        jLabelFecha.setFont(new java.awt.Font("Unispace", 3, 14)); // NOI18N
        jLabelFecha.setText("Fecha de conversacion: dd-mm-AAAA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jLabelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(188, 188, 188)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(21, 21, 21))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelFecha)
                        .addGap(4, 4, 4)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuDesplegableActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnMenuDesplegableActionPerformed
    {//GEN-HEADEREND:event_btnMenuDesplegableActionPerformed
        if (btnMenuDesplegable.getToolTipText() == "Ocultar opciones.")
        {
            panelMnuDesplegable.setVisible(false);
            btnMenuDesplegable.setToolTipText("Mostrar opciones.");
            ImageIcon iconoMuestraMnuDesp = new ImageIcon("src/imagenes/Menu.png");
            btnMenuDesplegable.setIcon(iconoMuestraMnuDesp);

        } else
        {
            panelMnuDesplegable.setVisible(true);
            btnMenuDesplegable.setToolTipText("Ocultar opciones.");
            ImageIcon iconoOcultaMnuDesp = new ImageIcon("src/imagenes/MenuMenos.png");
            btnMenuDesplegable.setIcon(iconoOcultaMnuDesp);
        }
    }//GEN-LAST:event_btnMenuDesplegableActionPerformed

    private void btnEnviarE1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnEnviarE1ActionPerformed
    {//GEN-HEADEREND:event_btnEnviarE1ActionPerformed
        if (!(jTFE1.getText().isEmpty()))
        {
            getPila1().insertar("<USTED> " + jTFE1.getText());
            getCola12().insertar("<USTED> " + jTFE1.getText());
            s = getCola12().imprimir();
            System.out.println(s);
            jTAE12.setText(s);
        }
        jTFE1.setText("");
    }//GEN-LAST:event_btnEnviarE1ActionPerformed

    private void btnEnviarE2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnEnviarE2ActionPerformed
    {//GEN-HEADEREND:event_btnEnviarE2ActionPerformed

        if (!(jTFE2.getText().isEmpty()))
        {
            getPila2().insertar("< " + person.toUpperCase().trim() + "> " + jTFE2.getText());
            getCola12().insertar("<" + person.toUpperCase().trim() + "> " + jTFE2.getText());
            s = getCola12().imprimir();
            System.out.println(s);
            jTAE12.setText(s);
        }

        jTFE2.setText("");

    }//GEN-LAST:event_btnEnviarE2ActionPerformed

    private void btnBuscarE1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnBuscarE1ActionPerformed
    {//GEN-HEADEREND:event_btnBuscarE1ActionPerformed
        if (!(jTFE1.getText().isEmpty()))
        {
            s = getPila1().buscar(jTFE1.getText().toUpperCase());
            jTAE12.setText(s);
        }
    }//GEN-LAST:event_btnBuscarE1ActionPerformed

    private void btnBuscarE2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnBuscarE2ActionPerformed
    {//GEN-HEADEREND:event_btnBuscarE2ActionPerformed
        if (!(jTFE2.getText().isEmpty()))
        {
            s = getPila2().buscar(jTFE2.getText());
            jTAE12.setText(s);
        }
    }//GEN-LAST:event_btnBuscarE2ActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSalirActionPerformed
    {//GEN-HEADEREND:event_btnSalirActionPerformed
        //Inserción de conversacion a la multilista
        if (cola12.getFrente() != null)
        {
            NodoMulti n1 = new NodoMulti(null, "Mensaje");
            n1.setPila1(pila1);
            n1.setPila2(pila2);
            n1.setCola12(cola12);
            String etqs[] = new String[4];
            etqs[0] = PantallaPrincipal.getSelectedGrupo();
            etqs[1] = PantallaPrincipal.getSelectedPerso();
            etqs[2] = PantallaPrincipal.getSelectedFecha();
            etqs[3] = "Mensaje";
            NodoMulti g = Multilistas.buscar(PantallaPrincipal.getR(), PantallaPrincipal.getSelectedGrupo());
            NodoMulti p = Multilistas.buscar(g.getAbj(), PantallaPrincipal.getSelectedPerso());
            NodoMulti f = Multilistas.buscar(p.getAbj(), PantallaPrincipal.getSelectedFecha());
            Multilistas.insertar(PantallaPrincipal.getR(), n1, f, 0, etqs);
            NodoMulti aux = PantallaPrincipal.getR();
            String s = Multilistas.desp(aux, 0);
            System.out.println("Nodo  == \n" + s);
        }

        PantallaPrincipal.pnlPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void jTFE1KeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jTFE1KeyPressed
    {//GEN-HEADEREND:event_jTFE1KeyPressed
        if ('\n' == evt.getKeyChar())
        {
            btnEnviarE1ActionPerformed(null);
        }
    }//GEN-LAST:event_jTFE1KeyPressed

    private void jTFE2KeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jTFE2KeyPressed
    {//GEN-HEADEREND:event_jTFE2KeyPressed
        if ('\n' == evt.getKeyChar())
        {
            btnEnviarE2ActionPerformed(null);
        }
    }//GEN-LAST:event_jTFE2KeyPressed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton7ActionPerformed
    {//GEN-HEADEREND:event_jButton7ActionPerformed
        s = getCola12().imprimir();
        jTAE12.setText(s);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton8ActionPerformed
    {//GEN-HEADEREND:event_jButton8ActionPerformed
        Nodo n = getCola12().getFrente();
        ColaD c = new ColaD(); //Principal
        PilaD p1 = new PilaD();
        PilaD p2 = new PilaD();
        while (n != null)
        {
            c.insertar(n.getDato());
            n = n.getSig();
        }
        //Ordena la ColaD c
        p1.insertar(c.eliminar());
        if (c.getFrente() == null)
        {
            c.insertar(p1.eliminar());
        } else
        {
            while (c.getFrente() != null)
            {
                if (String.valueOf(c.getFrente().getDato()).compareTo(String.valueOf(p1.getTope().getDato())) < 0)
                {
                    p1.insertar(c.eliminar());
                } else
                {
                    while (p1.getTope() != null && String.valueOf(c.getFrente().getDato()).compareTo(String.valueOf(p1.getTope().getDato())) > 0)
                    {
                        p2.insertar(p1.eliminar());
                    }
                    p1.insertar(c.eliminar());
                }
                while (p2.getTope() != null)
                {
                    p1.insertar(p2.eliminar());
                }
            }
        }
        while (p1.getTope() != null)
        {
            c.insertar(p1.eliminar());
        }
        jTAE12.setText(c.imprimir());
    }//GEN-LAST:event_jButton8ActionPerformed

    private void btnBuscarE3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnBuscarE3ActionPerformed
    {//GEN-HEADEREND:event_btnBuscarE3ActionPerformed
        jTAE12.setText(getPila1().imprimir());
    }//GEN-LAST:event_btnBuscarE3ActionPerformed

    private void btnBuscarE5ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnBuscarE5ActionPerformed
    {//GEN-HEADEREND:event_btnBuscarE5ActionPerformed
        jTAE12.setText(getPila2().imprimir());
    }//GEN-LAST:event_btnBuscarE5ActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazChat.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(InterfazChat.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(InterfazChat.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(InterfazChat.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                InterfazChat dialog = new InterfazChat(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnBuscarE1;
    private javax.swing.JButton btnBuscarE2;
    private javax.swing.JButton btnBuscarE3;
    private javax.swing.JButton btnBuscarE5;
    private javax.swing.JButton btnEnviarE1;
    private javax.swing.JButton btnEnviarE2;
    private javax.swing.JButton btnMenuDesplegable;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelEmisor2;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTAE12;
    private javax.swing.JTextField jTFE1;
    private javax.swing.JTextField jTFE2;
    private javax.swing.JPanel panelMnuDesplegable;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the pila1
     */
    public PilaD getPila1()
    {
        return pila1;
    }

    /**
     * @param pila1 the pila1 to set
     */
    public void setPila1(PilaD pila1)
    {
        this.pila1 = pila1;
    }

    /**
     * @return the pila2
     */
    public PilaD getPila2()
    {
        return pila2;
    }

    /**
     * @param pila2 the pila2 to set
     */
    public void setPila2(PilaD pila2)
    {
        this.pila2 = pila2;
    }

    /**
     * @return the cola12
     */
    public ColaD getCola12()
    {
        return cola12;
    }

    /**
     * @param cola12 the cola12 to set
     */
    public void setCola12(ColaD cola12)
    {
        this.cola12 = cola12;
    }
}
