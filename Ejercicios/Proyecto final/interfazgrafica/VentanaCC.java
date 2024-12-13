package mx.udg.cucea.interfazgrafica;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import mx.udg.cucea.bancoapp.*;

public class VentanaCC extends javax.swing.JFrame {
    // Creamos una cuenta coriente
    CuentaCorriente cuenta  = new CuentaCorriente();
    
    // Variables
    private Menu m1; 
    boolean bandera = false;
    
    // Método constructor
    public VentanaCC() {
        initComponents();
        
        // Establecemos el título de la ventana
        setTitle("Cuenta corriente");
        
        // Establecemos la posición incial de la ventana
        setLocationRelativeTo(null);
        
        // Establecemos que el programa termine cuando se cierre la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Hacemos los campos de textos no editables
        txtNumCuenta.setEditable(false);
        txtNombreTitular.setEditable(false);
        txtCorreo.setEditable(false);
        txtLimiteCredito.setEditable(false);
        txtSaldo.setEditable(false);
        txtTipoCuenta.setEditable(false);
    }

    // Métodos getters
    public Menu getM1() {
        return m1;
    }

    // Métodos setters
    public void setM1(Menu m1) {
        this.m1 = m1;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnMostrarDatos = new javax.swing.JButton();
        txtLimiteCredito = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnCredito = new javax.swing.JButton();
        txtCredito = new javax.swing.JTextField();
        btnDepositar = new javax.swing.JButton();
        txtRetirar = new javax.swing.JTextField();
        txtDepositar = new javax.swing.JTextField();
        txtNumCuenta = new javax.swing.JTextField();
        txtTipoCuenta = new javax.swing.JTextField();
        txtNombreTitular = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        btnRetirar = new javax.swing.JButton();
        txtSaldo = new javax.swing.JTextField();
        btnRegresar = new javax.swing.JButton();
        btnCrearCuenta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setBounds(new java.awt.Rectangle(0, 0, 500, 561));
        setMaximumSize(new java.awt.Dimension(702, 518));
        setMinimumSize(new java.awt.Dimension(702, 518));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setMaximumSize(new java.awt.Dimension(702, 518));
        jPanel1.setMinimumSize(new java.awt.Dimension(702, 518));

        btnMostrarDatos.setBackground(java.awt.Color.darkGray);
        btnMostrarDatos.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        btnMostrarDatos.setForeground(new java.awt.Color(204, 204, 204));
        btnMostrarDatos.setText("Mostrar datos");
        btnMostrarDatos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMostrarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarDatosActionPerformed(evt);
            }
        });

        txtLimiteCredito.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtLimiteCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLimiteCreditoActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(java.awt.Color.darkGray);
        btnLimpiar.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(204, 204, 204));
        btnLimpiar.setText("Limpiar datos");
        btnLimpiar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLimpiar.setName(""); // NOI18N
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnCredito.setBackground(java.awt.Color.darkGray);
        btnCredito.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        btnCredito.setForeground(new java.awt.Color(204, 204, 204));
        btnCredito.setText("Solicitar crédito");
        btnCredito.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreditoActionPerformed(evt);
            }
        });

        txtCredito.setBackground(new java.awt.Color(102, 102, 102));
        txtCredito.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        txtCredito.setForeground(new java.awt.Color(204, 204, 204));
        txtCredito.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCredito.setBorder(null);
        txtCredito.setCaretColor(new java.awt.Color(255, 255, 255));
        txtCredito.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtCredito.setSelectionColor(new java.awt.Color(102, 102, 102));

        btnDepositar.setBackground(java.awt.Color.darkGray);
        btnDepositar.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        btnDepositar.setForeground(new java.awt.Color(204, 204, 204));
        btnDepositar.setText("Depositar");
        btnDepositar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositarActionPerformed(evt);
            }
        });

        txtRetirar.setBackground(new java.awt.Color(102, 102, 102));
        txtRetirar.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        txtRetirar.setForeground(new java.awt.Color(204, 204, 204));
        txtRetirar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRetirar.setBorder(null);
        txtRetirar.setCaretColor(new java.awt.Color(255, 255, 255));
        txtRetirar.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtRetirar.setSelectionColor(new java.awt.Color(102, 102, 102));

        txtDepositar.setBackground(new java.awt.Color(102, 102, 102));
        txtDepositar.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        txtDepositar.setForeground(new java.awt.Color(204, 204, 204));
        txtDepositar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDepositar.setBorder(null);
        txtDepositar.setCaretColor(new java.awt.Color(255, 255, 255));
        txtDepositar.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtDepositar.setSelectionColor(new java.awt.Color(102, 102, 102));

        txtNumCuenta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNumCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumCuentaActionPerformed(evt);
            }
        });

        txtTipoCuenta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTipoCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoCuentaActionPerformed(evt);
            }
        });

        txtNombreTitular.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNombreTitular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreTitularActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 25)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Banco App (Cuenta Corriente)");

        jLabel2.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Número de cuenta:");

        jLabel3.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Nombre del titular:");

        jLabel4.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Tipo de cuenta:");

        jLabel5.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Correo electrónico:");

        jLabel6.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Saldo:");

        jLabel8.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Límite de crédito:");

        txtCorreo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });

        btnRetirar.setBackground(java.awt.Color.darkGray);
        btnRetirar.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        btnRetirar.setForeground(new java.awt.Color(204, 204, 204));
        btnRetirar.setText("Retirar");
        btnRetirar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetirarActionPerformed(evt);
            }
        });

        txtSaldo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSaldoActionPerformed(evt);
            }
        });

        btnRegresar.setBackground(java.awt.Color.darkGray);
        btnRegresar.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(204, 204, 204));
        btnRegresar.setText("Regresar");
        btnRegresar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btnCrearCuenta.setBackground(java.awt.Color.darkGray);
        btnCrearCuenta.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        btnCrearCuenta.setForeground(new java.awt.Color(204, 204, 204));
        btnCrearCuenta.setText("Crear Cuenta");
        btnCrearCuenta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearCuentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnMostrarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDepositar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRetirar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtDepositar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRetirar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCredito, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txtCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3))
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtLimiteCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNumCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTipoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombreTitular, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(31, 31, 31))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(152, 152, 152))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtNumCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNombreTitular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTipoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLimiteCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(btnCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMostrarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDepositar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDepositar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRetirar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRetirar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Boton para mostrar datos de la cuenta
    private void btnMostrarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarDatosActionPerformed
        if (bandera == false){
            JOptionPane.showMessageDialog(null, "Error! Crea una cuenta primero");
        }
        else{
            // Asignamos el contenido de los atributos de la cuenta al campo de texto
            txtNumCuenta.setText(cuenta.getNumCuenta());
            txtNombreTitular.setText(cuenta.getNombreTitular());
            txtTipoCuenta.setText(cuenta.getTipoCuenta());
            txtCorreo.setText(cuenta.getCorreo());
            txtSaldo.setText("$" + String.valueOf(cuenta.getSaldo()));
            txtLimiteCredito.setText("$" + String.valueOf(cuenta.getLimiteDeCredito()));
        }
        
    }//GEN-LAST:event_btnMostrarDatosActionPerformed

    private void txtLimiteCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLimiteCreditoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLimiteCreditoActionPerformed

    // Boton para limpiar los datos de la cuenta presentada
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // Limpiamos las casillas de tecto
        txtNumCuenta.setText("");
        txtNombreTitular.setText("");
        txtTipoCuenta.setText("");
        txtCorreo.setText("");
        txtSaldo.setText("");
        txtLimiteCredito.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    // Boton para solicitar un crédito
    private void btnCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreditoActionPerformed
        if (bandera == true){
            try{
               // Pasamos el valor que está en el campo de texto al método solicitar crédito
               cuenta.solicitarCredito(Double.parseDouble(txtCredito.getText()));
            }
            catch(NumberFormatException e){
                // Bloque para atrapar cuando se ingresa algo que no es un numero
                JOptionPane.showMessageDialog(null, "Error! Valor ingresado no válido");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Error! Crea una cuenta primero");
        }
        
        txtCredito.setText("");
    }//GEN-LAST:event_btnCreditoActionPerformed

    // Boton para depositar dinero en la cuenta
    private void btnDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositarActionPerformed
        if(bandera == true){ // Si ya tengo una cuenta creada
            try{
               // Pasamos el valor que está en el campo de texto al método depositar
               cuenta.depositar(Double.parseDouble(txtDepositar.getText())); 
            }
            catch(NumberFormatException e){
                // Bloque para atrapar cuando se ingresa algo que no es un numero
                JOptionPane.showMessageDialog(null, "Error! Valor ingresado no válido");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Error! Crea una cuenta primero");
        }
        
        txtDepositar.setText("");
    }//GEN-LAST:event_btnDepositarActionPerformed

    private void txtNumCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumCuentaActionPerformed

    }//GEN-LAST:event_txtNumCuentaActionPerformed

    private void txtTipoCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoCuentaActionPerformed

    private void txtNombreTitularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreTitularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreTitularActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    // Boton para retirar dinero de la cuenta
    private void btnRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarActionPerformed
        if (bandera == true){
            try{
           // Pasamos el valor que está en el campo de texto al método retirar
           cuenta.retirar(Double.parseDouble(txtRetirar.getText()));
            }
            catch(NullPointerException e){
                JOptionPane.showMessageDialog(null, "Error! Crea una cuenta primero");
            }
            catch(NumberFormatException e){
                // Bloque para atrapar cuando se ingresa algo que no es un numero
                JOptionPane.showMessageDialog(null, "Error! Valor ingresado no válido");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Error! Crea una cuenta primero");
        }
        
        txtRetirar.setText("");
    }//GEN-LAST:event_btnRetirarActionPerformed

    private void txtSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSaldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSaldoActionPerformed

    // Botón para regresar al menú
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        m1.setVisible(true); // Hacemos el menú visible
        this.setVisible(false); // Ocultamos esta ventana
    }//GEN-LAST:event_btnRegresarActionPerformed
    
    // Boton para crear una cuenta corriente
    private void btnCrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearCuentaActionPerformed
        // Si todavía no se crea una cuenta
        if (bandera == false){
            cuenta.setNombreTitular(JOptionPane.showInputDialog("Ingrese su nombre: "));
            try{
               cuenta.setSaldo(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el saldo incial: ")));
            }
            catch(NumberFormatException e){ // Catch por si ingresan algo que no sea un número
                JOptionPane.showMessageDialog(null, "Error! Valor ingresado no válido. Se asignará un saldo de $0.0");
                cuenta.setSaldo(0.0);
            }
            
            cuenta.setNumCuenta("23489");
            cuenta.setLimiteDeCredito(3000.0);
            try{
                cuenta.setCorreo(cuenta.getNombreTitular().replaceAll("\\s", "").toLowerCase() + "01@gmail.com");
            }
            catch(NullPointerException e){
                cuenta.setCorreo( "usuario01@gmail.com");
            }
            
            bandera = true;
        }
        else{ // Si ya se creo una cuenta
            JOptionPane.showMessageDialog(null, "Error! Ya has creado una cuenta");
        }
        
    }//GEN-LAST:event_btnCrearCuentaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearCuenta;
    private javax.swing.JButton btnCredito;
    private javax.swing.JButton btnDepositar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMostrarDatos;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnRetirar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtCredito;
    private javax.swing.JTextField txtDepositar;
    private javax.swing.JTextField txtLimiteCredito;
    private javax.swing.JTextField txtNombreTitular;
    private javax.swing.JTextField txtNumCuenta;
    private javax.swing.JTextField txtRetirar;
    private javax.swing.JTextField txtSaldo;
    private javax.swing.JTextField txtTipoCuenta;
    // End of variables declaration//GEN-END:variables
} // Clase Ventana
