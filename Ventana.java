/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyectojuegomemoria;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Erick
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
    }
    //Variables Para crear un nunmero random 
    Random rand = new Random();
    
    //Variable controladora global
    int turnos,encontradas,insignia;
    String comparador,botonTipo;
    JButton controlador;
    
    //declarar los modelos para los combobox
    DefaultComboBoxModel ModeloParejas = new DefaultComboBoxModel();
    DefaultComboBoxModel ModeloTipos = new DefaultComboBoxModel();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        BtnCambio = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaTop10 = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        txtContador = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtTurnos = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        PanelBtn = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Parejas = new javax.swing.JComboBox<>();
        Tipos = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel4.setText("Numero de parejas");

        BtnCambio.setText("Aplicar cambios");
        BtnCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCambioActionPerformed(evt);
            }
        });

        ListaTop10.setBackground(new java.awt.Color(255, 204, 255));
        ListaTop10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.lightGray, java.awt.Color.black, java.awt.Color.darkGray));
        ListaTop10.setForeground(new java.awt.Color(0, 0, 0));
        ListaTop10.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(ListaTop10);

        jLabel5.setText("Parejas encontradas");

        txtContador.setEditable(false);
        txtContador.setBackground(new java.awt.Color(255, 255, 255));
        txtContador.setText("0/10");

        jLabel1.setText("Numero de intentos:");

        txtTurnos.setEditable(false);
        txtTurnos.setBackground(new java.awt.Color(255, 255, 255));
        txtTurnos.setText("0");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Juego de memoria");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        PanelBtn.setBackground(new java.awt.Color(204, 255, 255));
        PanelBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.gray, java.awt.Color.lightGray, java.awt.Color.black, java.awt.Color.darkGray));
        PanelBtn.setRequestFocusEnabled(false);
        PanelBtn.setLayout(new java.awt.GridLayout(6, 5));

        jLabel3.setText("Numero de parejas");

        Parejas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        Tipos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Parejas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tipos, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(PanelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(233, 236, Short.MAX_VALUE)
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtContador, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(42, 42, 42)
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtTurnos, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(171, 171, 171)
                                    .addComponent(jLabel2))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3)
                                    .addComponent(jScrollPane1)
                                    .addComponent(BtnCambio, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                    .addComponent(jLabel4)))
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(Parejas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(Tipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(PanelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel3)
                    .addGap(38, 38, 38)
                    .addComponent(jLabel4)
                    .addGap(38, 38, 38)
                    .addComponent(BtnCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(82, 82, 82)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtTurnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(txtContador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCambioActionPerformed
        PanelBtn.removeAll();
        insignia=0;
        botonTipo=Tipos.getSelectedItem().toString();
        int ControladorParejas=Integer.parseInt(Parejas.getSelectedItem().toString());
        ArrayList<Integer> numeros = new ArrayList<>();

        encontradas=0;
        turnos=0;
        //al aceptar el boton inicializo las variables turnos y encontradas
        txtContador.setText(encontradas+"/"+ControladorParejas);
        txtTurnos.setText(turnos+"");
        //Actualizo el texfield de turnos y encontradas
        for (int i = 1; i <= ControladorParejas * 2; i++) {
            int numeroAleatorio;
            
            // Si ya tenemos dos instancias de este número, elige otro
            do {
                numeroAleatorio = rand.nextInt(ControladorParejas) + 1;
            } while (Collections.frequency(numeros, numeroAleatorio) >= 2);

            numeros.add(numeroAleatorio);
            Botones(numeroAleatorio,ControladorParejas);
        }
        PanelBtn.updateUI();//Al terminar todo se hace un refresh a la pantalla
    }//GEN-LAST:event_BtnCambioActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //Hacemos dos modelos de combobox y lo agregamos a su respectivo combo box
       ModeloParejas.addElement("10");
       ModeloParejas.addElement("11");
       ModeloParejas.addElement("12");
       ModeloParejas.addElement("13");
       ModeloParejas.addElement("14");
       ModeloParejas.addElement("15");
       Parejas.setModel(ModeloParejas);
       Parejas.setSelectedItem("10");
       
       ModeloTipos.addElement("Letras");
       ModeloTipos.addElement("Numeros");
       ModeloTipos.addElement("Imagenes");
       Tipos.setModel(ModeloTipos);
       Tipos.setSelectedItem("Numeros");
       //Anteriormente agregue los modelos del combobox a su respectivo combo box
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    public void Botones(int random, int parejas){
        Font font = new Font("Dialog", Font.PLAIN, 30);
        JButton btn= new JButton("↻");
        btn.setFont(font);
        btn.setBackground(Color.WHITE);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(botonTipo=="Numeros"){
                    btn.setText(random+"");
                }
                if(botonTipo=="Letras"){
                    char si= (char)(random+64);
                    btn.setText(si+"");
                }
                if(botonTipo=="Imagenes"){
                    btn.setText("No llego aun");
                }
                insignia++;
                btn.setForeground(Color.WHITE);
                btn.setBackground(Color.BLACK);
                btn.setEnabled(false);
                if(insignia==1){
                    comparador=btn.getText();
                    controlador=btn;
                }
                if(insignia==2){  
                    insignia=0;
                    turnos++;
                    
                    txtTurnos.setText(turnos+"");
                    if(btn.getText().equals(comparador)){
                        encontradas++;
                         JOptionPane.showMessageDialog(null, "Pareja encontrada");
                        PanelBtn.remove(controlador);
                        PanelBtn.remove(btn);
                        txtContador.setText(encontradas+"/"+parejas);
                        if(encontradas==parejas){
                            JOptionPane.showMessageDialog(null, "Juego terminado en "+turnos+" intentos");
                        }
                    }
                    else{
                         JOptionPane.showMessageDialog(null, "Sigue intentando");
                        btn.setText("↻");
                        controlador.setText("↻");
                        btn.setForeground(Color.BLACK);
                        btn.setBackground(Color.WHITE);
                        controlador.setForeground(Color.BLACK);
                        controlador.setBackground(Color.WHITE);
                        btn.setEnabled(true);
                        controlador.setEnabled(true);
                    }
                }
                PanelBtn.updateUI();
            }
        });
        PanelBtn.add(btn);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCambio;
    private javax.swing.JList<String> ListaTop10;
    private javax.swing.JPanel PanelBtn;
    private javax.swing.JComboBox<String> Parejas;
    private javax.swing.JComboBox<String> Tipos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtContador;
    private javax.swing.JTextField txtTurnos;
    // End of variables declaration//GEN-END:variables
}
