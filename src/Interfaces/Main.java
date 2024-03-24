package Interfaces;

import Dao.AccesoDatos;
import Models.Cuenta;
import Models.Movimiento;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        this.setSize(525, 660);
        estadoInicialControles();
    }
    String concepto = null;
    AccesoDatos accesoDatos = new AccesoDatos();
    Cuenta cuenta = new Cuenta();
    ArrayList<Movimiento> movimientoArrayList = new ArrayList();
    Movimiento movimiento = new Movimiento();

    public void limpiaMensaje() {
        txtArMensajes.setText("");
    }

    public void soloNumeros() {
        txtMontoRetiro.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                if (((caracter < '0' || caracter > '9')) && (caracter != KeyEvent.VK_BACK_SPACE)
                        && (caracter != '.' || txtMontoRetiro.getText().contains("."))) {

                    e.consume();

                }
                if (txtMontoRetiro.getText().length() > 5) {
                    e.consume();
                }
            }
        });
    }

    public void validaPassword() {
        if (jPass.getText().length() > 0) {
            lblMensajeInicial.setVisible(false);
        }
    }

    public void estadoInicialControles() {
        lblMensajeInicial.setText("ESCANEA TU TARJETA");
        jPssTarjeta.setText("");
        jPssTarjeta.requestFocus();
        txtArMensajes.setText("");
        jPass.setText("");
        btnSaldo.setEnabled(false);
        btnPagos.setEnabled(false);
        btnRetiro.setEnabled(false);
        btnMovimientos.setEnabled(false);
        jPass.setVisible(false);
        jPass.setEnabled(false);
        btnUno.setEnabled(false);
        btnDos.setEnabled(false);
        btnTres.setEnabled(false);
        btnCuatro.setEnabled(false);
        btnCinco.setEnabled(false);
        btnSeis.setEnabled(false);
        btnSiete.setEnabled(false);
        btnOcho.setEnabled(false);
        btnNueve.setEnabled(false);
        btnCero.setEnabled(false);
        btnAceptar.setEnabled(false);
        txtMontoRetiro.setVisible(false);
        lblAgua.setVisible(false);
        lblLuz.setVisible(false);
        lblTelefono.setVisible(false);
        lblInternet.setVisible(false);
        btnRetiroEfectivo.setVisible(false);
        btnConfirmarPago.setVisible(false);
    }

    public void habilitarBotones() {
        jPass.setVisible(true);
        jPass.setEnabled(true);
        btnUno.setEnabled(true);
        btnDos.setEnabled(true);
        btnTres.setEnabled(true);
        btnCuatro.setEnabled(true);
        btnCinco.setEnabled(true);
        btnSeis.setEnabled(true);
        btnSiete.setEnabled(true);
        btnOcho.setEnabled(true);
        btnNueve.setEnabled(true);
        btnCero.setEnabled(true);
        btnAceptar.setEnabled(true);
    }

    public void habilitaOpciones() {
        jPass.setText("");
        btnSaldo.setEnabled(true);
        btnRetiro.setEnabled(true);
        btnPagos.setEnabled(true);
        btnMovimientos.setEnabled(true);
    }

    public void desabilitarEfectivo() {
        btnRetiroEfectivo.setVisible(false);
        btnRetiroEfectivo.setEnabled(false);
        btnConfirmarPago.setVisible(false);
        btnConfirmarPago.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        btnSaldo = new javax.swing.JButton();
        btnRetiro = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPass = new javax.swing.JPasswordField();
        txtMontoRetiro = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        btnUno = new javax.swing.JButton();
        btnDos = new javax.swing.JButton();
        btnTres = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnCuatro = new javax.swing.JButton();
        btnCinco = new javax.swing.JButton();
        btnSeis = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnSiete = new javax.swing.JButton();
        btnOcho = new javax.swing.JButton();
        btnNueve = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        btn17 = new javax.swing.JButton();
        btnCero = new javax.swing.JButton();
        btn19 = new javax.swing.JButton();
        ContenedorPantalla = new javax.swing.JScrollPane();
        txtArMensajes = new javax.swing.JTextArea();
        lblTelefono = new javax.swing.JLabel();
        lblLuz = new javax.swing.JLabel();
        lblAgua = new javax.swing.JLabel();
        lblInternet = new javax.swing.JLabel();
        jPssTarjeta = new javax.swing.JPasswordField();
        lblMensajeInicial = new javax.swing.JLabel();
        btnMovimientos = new javax.swing.JButton();
        btnPagos = new javax.swing.JButton();
        btnRetiroEfectivo = new javax.swing.JButton();
        btnConfirmarPago = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSaldo.setBackground(new java.awt.Color(255, 255, 255));
        btnSaldo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSaldo.setForeground(new java.awt.Color(0, 0, 0));
        btnSaldo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/proximo.png"))); // NOI18N
        btnSaldo.setText("     SALDO");
        btnSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaldoActionPerformed(evt);
            }
        });

        btnRetiro.setBackground(new java.awt.Color(255, 255, 255));
        btnRetiro.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnRetiro.setForeground(new java.awt.Color(0, 0, 0));
        btnRetiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/proximo.png"))); // NOI18N
        btnRetiro.setText("     RETIRO");
        btnRetiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetiroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRetiro, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRetiro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel2.setFocusable(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPass.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(jPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 60));

        txtMontoRetiro.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txtMontoRetiro.setForeground(new java.awt.Color(0, 0, 0));
        txtMontoRetiro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(txtMontoRetiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 15, 90, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 120, 80));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnUno.setBackground(new java.awt.Color(0, 0, 0));
        btnUno.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnUno.setForeground(new java.awt.Color(255, 255, 255));
        btnUno.setText("1");
        btnUno.setPreferredSize(new java.awt.Dimension(105, 50));
        btnUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnoActionPerformed(evt);
            }
        });
        jPanel4.add(btnUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 9, 75, 45));

        btnDos.setBackground(new java.awt.Color(0, 0, 0));
        btnDos.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnDos.setForeground(new java.awt.Color(255, 255, 255));
        btnDos.setText("2");
        btnDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDosActionPerformed(evt);
            }
        });
        jPanel4.add(btnDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 9, 75, 45));

        btnTres.setBackground(new java.awt.Color(0, 0, 0));
        btnTres.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnTres.setForeground(new java.awt.Color(255, 255, 255));
        btnTres.setText("3");
        btnTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTresActionPerformed(evt);
            }
        });
        jPanel4.add(btnTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 9, 75, 45));

        btnCancelar.setBackground(new java.awt.Color(153, 0, 0));
        btnCancelar.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(0, 0, 0));
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel4.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 9, 90, 45));

        btnCuatro.setBackground(new java.awt.Color(0, 0, 0));
        btnCuatro.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnCuatro.setForeground(new java.awt.Color(255, 255, 255));
        btnCuatro.setText("4");
        btnCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuatroActionPerformed(evt);
            }
        });
        jPanel4.add(btnCuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 66, 75, 45));

        btnCinco.setBackground(new java.awt.Color(0, 0, 0));
        btnCinco.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnCinco.setForeground(new java.awt.Color(255, 255, 255));
        btnCinco.setText("5");
        btnCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCincoActionPerformed(evt);
            }
        });
        jPanel4.add(btnCinco, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 66, 75, 45));

        btnSeis.setBackground(new java.awt.Color(0, 0, 0));
        btnSeis.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnSeis.setForeground(new java.awt.Color(255, 255, 255));
        btnSeis.setText("6");
        btnSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeisActionPerformed(evt);
            }
        });
        jPanel4.add(btnSeis, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 66, 75, 45));

        btnLimpiar.setBackground(new java.awt.Color(204, 204, 0));
        btnLimpiar.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel4.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 66, 90, 45));

        btnSiete.setBackground(new java.awt.Color(0, 0, 0));
        btnSiete.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnSiete.setForeground(new java.awt.Color(255, 255, 255));
        btnSiete.setText("7");
        btnSiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSieteActionPerformed(evt);
            }
        });
        jPanel4.add(btnSiete, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 123, 75, 45));

        btnOcho.setBackground(new java.awt.Color(0, 0, 0));
        btnOcho.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnOcho.setForeground(new java.awt.Color(255, 255, 255));
        btnOcho.setText("8");
        btnOcho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOchoActionPerformed(evt);
            }
        });
        jPanel4.add(btnOcho, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 123, 75, 45));

        btnNueve.setBackground(new java.awt.Color(0, 0, 0));
        btnNueve.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnNueve.setForeground(new java.awt.Color(255, 255, 255));
        btnNueve.setText("9");
        btnNueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNueveActionPerformed(evt);
            }
        });
        jPanel4.add(btnNueve, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 123, 75, 45));

        btnAceptar.setBackground(new java.awt.Color(0, 173, 67));
        btnAceptar.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(0, 0, 0));
        btnAceptar.setText("ACEPTAR");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        jPanel4.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 123, 90, 45));

        btn17.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.add(btn17, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 180, 75, 45));

        btnCero.setBackground(new java.awt.Color(0, 0, 0));
        btnCero.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnCero.setForeground(new java.awt.Color(255, 255, 255));
        btnCero.setText("0");
        btnCero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCeroActionPerformed(evt);
            }
        });
        jPanel4.add(btnCero, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 180, 75, 45));

        btn19.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.add(btn19, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 180, 75, 45));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 410, 240));

        txtArMensajes.setColumns(20);
        txtArMensajes.setLineWrap(true);
        txtArMensajes.setRows(5);
        ContenedorPantalla.setViewportView(txtArMensajes);

        getContentPane().add(ContenedorPantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 40, 380, 183));

        lblTelefono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/telefono.png"))); // NOI18N
        lblTelefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTelefonoMouseClicked(evt);
            }
        });
        getContentPane().add(lblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 70, 70));

        lblLuz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/luz.png"))); // NOI18N
        lblLuz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLuzMouseClicked(evt);
            }
        });
        getContentPane().add(lblLuz, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 70, 70));

        lblAgua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agua.png"))); // NOI18N
        lblAgua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAguaMouseClicked(evt);
            }
        });
        getContentPane().add(lblAgua, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 70, 70));

        lblInternet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/internet.png"))); // NOI18N
        lblInternet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblInternetMouseClicked(evt);
            }
        });
        getContentPane().add(lblInternet, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 70, 70));

        jPssTarjeta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPssTarjetaKeyReleased(evt);
            }
        });
        getContentPane().add(jPssTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(529, 117, 0, -1));

        lblMensajeInicial.setBackground(new java.awt.Color(255, 255, 255));
        lblMensajeInicial.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        lblMensajeInicial.setForeground(new java.awt.Color(102, 0, 0));
        lblMensajeInicial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblMensajeInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 320, 30));

        btnMovimientos.setBackground(new java.awt.Color(255, 255, 255));
        btnMovimientos.setForeground(new java.awt.Color(0, 0, 0));
        btnMovimientos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/anterior.png"))); // NOI18N
        btnMovimientos.setText("MOVIMIENTOS");
        btnMovimientos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMovimientos.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnMovimientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMovimientosActionPerformed(evt);
            }
        });
        getContentPane().add(btnMovimientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, 150, 40));

        btnPagos.setBackground(new java.awt.Color(255, 255, 255));
        btnPagos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnPagos.setForeground(new java.awt.Color(0, 0, 0));
        btnPagos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/anterior.png"))); // NOI18N
        btnPagos.setText("PAGOS        ");
        btnPagos.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnPagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagosActionPerformed(evt);
            }
        });
        getContentPane().add(btnPagos, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 150, 40));

        btnRetiroEfectivo.setBackground(new java.awt.Color(51, 102, 0));
        btnRetiroEfectivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/efectivo.png"))); // NOI18N
        btnRetiroEfectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetiroEfectivoActionPerformed(evt);
            }
        });
        getContentPane().add(btnRetiroEfectivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(452, 170, 50, 50));

        btnConfirmarPago.setBackground(new java.awt.Color(51, 102, 0));
        btnConfirmarPago.setFont(new java.awt.Font("Dialog", 1, 9)); // NOI18N
        btnConfirmarPago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aceptar.png"))); // NOI18N
        btnConfirmarPago.setText("PAGAR");
        btnConfirmarPago.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConfirmarPago.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnConfirmarPago.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnConfirmarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarPagoActionPerformed(evt);
            }
        });
        getContentPane().add(btnConfirmarPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 60, 60));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private JFrame frame;

    private void jExitActionPerformed(java.awt.event.ActionEvent evt) {

        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Deseas Abandonar la Aplicación.",
                "Sistema Gestión de Préstamos",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            System.exit(0);
        }
        //---------------------------------------------------------------------
    }

    private void btnOchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOchoActionPerformed
        String Enternumber = jPass.getText() + "8";
        jPass.setText(Enternumber);
        txtMontoRetiro.setText(Enternumber);
        validaPassword();
    }//GEN-LAST:event_btnOchoActionPerformed

    private void btnNueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNueveActionPerformed
        String Enternumber = jPass.getText() + "9";
        jPass.setText(Enternumber);
        txtMontoRetiro.setText(Enternumber);
        validaPassword();
    }//GEN-LAST:event_btnNueveActionPerformed

    private void btnUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnoActionPerformed
        String Enternumber = jPass.getText() + "1";
        jPass.setText(Enternumber);
        txtMontoRetiro.setText(Enternumber);
        validaPassword();
    }//GEN-LAST:event_btnUnoActionPerformed

    private void btnDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDosActionPerformed
        String Enternumber = jPass.getText() + "2";
        jPass.setText(Enternumber);
        txtMontoRetiro.setText(Enternumber);
        validaPassword();
    }//GEN-LAST:event_btnDosActionPerformed

    private void btnTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTresActionPerformed
        String Enternumber = jPass.getText() + "3";
        jPass.setText(Enternumber);
        txtMontoRetiro.setText(Enternumber);
        validaPassword();
    }//GEN-LAST:event_btnTresActionPerformed

    private void btnCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuatroActionPerformed
        String Enternumber = jPass.getText() + "4";
        jPass.setText(Enternumber);
        txtMontoRetiro.setText(Enternumber);
        validaPassword();
    }//GEN-LAST:event_btnCuatroActionPerformed

    private void btnCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCincoActionPerformed
        String Enternumber = jPass.getText() + "5";
        jPass.setText(Enternumber);
        txtMontoRetiro.setText(Enternumber);
        validaPassword();
    }//GEN-LAST:event_btnCincoActionPerformed

    private void btnSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeisActionPerformed
        String Enternumber = jPass.getText() + "6";
        jPass.setText(Enternumber);
        txtMontoRetiro.setText(Enternumber);
        validaPassword();
    }//GEN-LAST:event_btnSeisActionPerformed

    private void btnSieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSieteActionPerformed
        String Enternumber = jPass.getText() + "7";
        jPass.setText(Enternumber);
        txtMontoRetiro.setText(Enternumber);
        validaPassword();
    }//GEN-LAST:event_btnSieteActionPerformed

    private void btnCeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCeroActionPerformed
        String Enternumber = jPass.getText() + "0";
        jPass.setText(Enternumber);
        txtMontoRetiro.setText(Enternumber);
        validaPassword();
    }//GEN-LAST:event_btnCeroActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        estadoInicialControles();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "¿Realmente deseas Salir?",
                "ATM Systems",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        cuenta = accesoDatos.ValidaCuenta(jPssTarjeta.getText(), jPass.getText());
        if ((cuenta.getTarjeta() != null) && (cuenta.getPin() != null)) {
            habilitaOpciones();
            lblMensajeInicial.setVisible(true);
            lblMensajeInicial.setText("** " + cuenta.getCliente().toUpperCase() + " **");
        } else {
            lblMensajeInicial.setVisible(true);
            lblMensajeInicial.setText("¡ .. DATOS INCORRECTOS .. !");
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnMovimientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMovimientosActionPerformed
        limpiaMensaje();
        desabilitarEfectivo();
        ContenedorPantalla.setVisible(true);
        ContenedorPantalla.setEnabled(true);
        txtArMensajes.setVisible(true);
        txtArMensajes.setEnabled(true);
        txtMontoRetiro.setText("");
        lblMensajeInicial.setText("");
        movimientoArrayList = accesoDatos.Movimientos(jPssTarjeta.getText());
        txtArMensajes.append("MOVIMIENTOS TARJETA : " + jPssTarjeta.getText().substring(0, 4) + "-XXXX-XXXX" + "\t(" + movimientoArrayList.size() + ")\n"
                + "FECHA\t" + "CONCEPTO     \t" + "CANTIDAD\n");
        for (int i = 0; i < movimientoArrayList.size(); i++) {
            txtArMensajes.append(movimientoArrayList.get(i).getFecha() + "\t"
                    + movimientoArrayList.get(i).getConcepto() + "\t"
                    + movimientoArrayList.get(i).getCantidad() + "\n"
            );
        }
    }//GEN-LAST:event_btnMovimientosActionPerformed

    private void btnRetiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetiroActionPerformed
        limpiaMensaje();
        soloNumeros();
        ContenedorPantalla.setVisible(true);
        ContenedorPantalla.setEnabled(true);
        txtArMensajes.setVisible(true);
        txtArMensajes.setEnabled(true);
        lblMensajeInicial.setVisible(true);
        lblMensajeInicial.setText("INGRESE MONTO A RETIRAR");
        txtMontoRetiro.setText("");
        txtMontoRetiro.setVisible(true);
        txtMontoRetiro.setEnabled(true);
        txtMontoRetiro.requestFocus();
        jPass.setVisible(false);
        jPass.setEnabled(false);
        btnRetiroEfectivo.setVisible(true);
        btnRetiroEfectivo.setEnabled(true);
    }//GEN-LAST:event_btnRetiroActionPerformed

    private void btnSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaldoActionPerformed
        limpiaMensaje();
        desabilitarEfectivo();
        ContenedorPantalla.setVisible(true);
        ContenedorPantalla.setEnabled(true);
        txtArMensajes.setVisible(true);
        txtArMensajes.setEnabled(true);
        txtMontoRetiro.setText("");
        lblMensajeInicial.setText("");
        cuenta = accesoDatos.buscaCuenta(jPssTarjeta.getText());

        txtArMensajes.append("HOLA " + cuenta.getCliente().toUpperCase() + "\n"
                + "Saldo De la Tarjeta\t$ " + cuenta.getSaldo());
    }//GEN-LAST:event_btnSaldoActionPerformed

    private void jPssTarjetaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPssTarjetaKeyReleased
        if (!jPssTarjeta.getText().isEmpty()) {
            if (jPssTarjeta.getText().length() >= 12) {
                jPass.requestFocus();
                habilitarBotones();
                lblMensajeInicial.setText("DIGITE SU PIN");
                validaPassword();
            }
        }
    }//GEN-LAST:event_jPssTarjetaKeyReleased

    private void btnPagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagosActionPerformed
        lblMensajeInicial.setText("ELIJA SERVICIO A PAGAR");
        desabilitarEfectivo();
        ContenedorPantalla.setVisible(false);
        ContenedorPantalla.setEnabled(false);
        txtMontoRetiro.setEnabled(true);
        txtMontoRetiro.setVisible(true);
        txtMontoRetiro.setText("");
        lblAgua.setVisible(true);
        lblLuz.setVisible(true);
        lblTelefono.setVisible(true);
        lblInternet.setVisible(true);
        lblAgua.setEnabled(true);
        lblLuz.setEnabled(true);
        lblTelefono.setEnabled(true);
        lblInternet.setEnabled(true);
        txtArMensajes.setVisible(false);
        txtArMensajes.setEnabled(false);
    }//GEN-LAST:event_btnPagosActionPerformed

    private void btnRetiroEfectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetiroEfectivoActionPerformed
        limpiaMensaje();
        if (cuenta.getSaldo() - Double.parseDouble(txtMontoRetiro.getText()) > 0) {
            lblMensajeInicial.setText("");
            movimiento.setIdTarjeta(jPssTarjeta.getText());
            movimiento.setConcepto("RETIRO DE EFECTIVO");
            movimiento.setCantidad(Double.parseDouble(txtMontoRetiro.getText()));
            String respuestaInsert = accesoDatos.registrarMovimiento(movimiento);
            if (respuestaInsert != null) {
                txtArMensajes.append(respuestaInsert + "\nRETIRE SU EFECTIVO .. ! ");
                desabilitarEfectivo();
            }
        } else if (cuenta.getSaldo() - Double.parseDouble(txtMontoRetiro.getText()) < 0) {
            lblMensajeInicial.setVisible(true);
            lblMensajeInicial.setText("SALDO INSUFICIENTE");
        }
        txtMontoRetiro.setText("");
    }//GEN-LAST:event_btnRetiroEfectivoActionPerformed

    private void lblTelefonoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTelefonoMouseClicked
        txtMontoRetiro.setText("500");
        btnConfirmarPago.setVisible(true);
        btnConfirmarPago.setEnabled(true);
        concepto = "TELEFONIA";
    }//GEN-LAST:event_lblTelefonoMouseClicked

    private void lblLuzMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLuzMouseClicked
        txtMontoRetiro.setText("300");
        btnConfirmarPago.setVisible(true);
        btnConfirmarPago.setEnabled(true);
        concepto = "ELECTRICIDAD";
    }//GEN-LAST:event_lblLuzMouseClicked

    private void lblAguaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAguaMouseClicked
        txtMontoRetiro.setText("200");
        btnConfirmarPago.setVisible(true);
        btnConfirmarPago.setEnabled(true);
        concepto = "AGUA POTABLE";
    }//GEN-LAST:event_lblAguaMouseClicked

    private void lblInternetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInternetMouseClicked
        txtMontoRetiro.setText("800");
        btnConfirmarPago.setVisible(true);
        btnConfirmarPago.setEnabled(true);
        concepto = "INTERNET";
    }//GEN-LAST:event_lblInternetMouseClicked

    private void btnConfirmarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarPagoActionPerformed
        if (cuenta.getSaldo() - Double.parseDouble(txtMontoRetiro.getText()) > 0) {
            lblMensajeInicial.setText("");
            movimiento.setIdTarjeta(jPssTarjeta.getText());
            movimiento.setConcepto(concepto);
            movimiento.setCantidad(Double.parseDouble(txtMontoRetiro.getText()));
            String respuestaInsert = accesoDatos.registrarMovimiento(movimiento);
            if (respuestaInsert != null) {
                desabilitarEfectivo();
            }
        } else if (cuenta.getSaldo() - Double.parseDouble(txtMontoRetiro.getText()) < 0) {
            lblMensajeInicial.setVisible(true);
            lblMensajeInicial.setText("SALDO INSUFICIENTE");
        }
        txtMontoRetiro.setText("");
    }//GEN-LAST:event_btnConfirmarPagoActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ContenedorPantalla;
    private javax.swing.JButton btn17;
    private javax.swing.JButton btn19;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCero;
    private javax.swing.JButton btnCinco;
    private javax.swing.JButton btnConfirmarPago;
    private javax.swing.JButton btnCuatro;
    private javax.swing.JButton btnDos;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMovimientos;
    private javax.swing.JButton btnNueve;
    private javax.swing.JButton btnOcho;
    private javax.swing.JButton btnPagos;
    private javax.swing.JButton btnRetiro;
    private javax.swing.JButton btnRetiroEfectivo;
    private javax.swing.JButton btnSaldo;
    private javax.swing.JButton btnSeis;
    private javax.swing.JButton btnSiete;
    private javax.swing.JButton btnTres;
    private javax.swing.JButton btnUno;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPass;
    private javax.swing.JPasswordField jPssTarjeta;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblAgua;
    private javax.swing.JLabel lblInternet;
    private javax.swing.JLabel lblLuz;
    private javax.swing.JLabel lblMensajeInicial;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JTextArea txtArMensajes;
    private javax.swing.JTextField txtMontoRetiro;
    // End of variables declaration//GEN-END:variables
}
