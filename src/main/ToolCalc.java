/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author Jordan
 */
public class ToolCalc extends javax.swing.JFrame {
    /*m_toolType
     * 1 = drills
     * 2 = endmills
     */
    private int m_toolType  = 1;
    
    /*m_tool (unused my endmill panel
     * 1 = drill
     * 2 = centerdrill
     * 3 = countersink
     * 4 = counterbore
     * 5 = reamer
     */
    private int m_tool      = 1;
    
    /*m_toolDim
     * 1 = normal picture
     * 2 = diameter
     * 3 = flutes (only for endmills)
     */
    private int m_toolDim   = 1;
    
    /**
     * Creates new form ToolCalc
     */
    public ToolCalc() {
        initComponents();
        m_init();
    }
    
    private void m_init(){
        btnDrill.setSelected(true);
        showMainPicture();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        container = new javax.swing.JTabbedPane();
        panelDrills = new javax.swing.JPanel();
        LabelDrillDia = new javax.swing.JLabel();
        FieldDrillDia = new javax.swing.JTextField();
        panelDrillCycle = new javax.swing.JPanel();
        btnDrill = new javax.swing.JRadioButton();
        btnReamer = new javax.swing.JRadioButton();
        btnCounterbore = new javax.swing.JRadioButton();
        btnCountersink = new javax.swing.JRadioButton();
        btnCenterDrill = new javax.swing.JRadioButton();
        LabelDrillCycle = new javax.swing.JLabel();
        panelEndmills = new javax.swing.JPanel();
        LabeMillDia = new javax.swing.JLabel();
        FieldMillDia = new javax.swing.JTextField();
        picture = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        LabelInitialRpm = new javax.swing.JLabel();
        FieldInitialRpm = new javax.swing.JTextField();
        LabelFixedRpm = new javax.swing.JLabel();
        FieldFixedRpm = new javax.swing.JTextField();
        LabelCalculations = new javax.swing.JLabel();
        LabelFeedRate = new javax.swing.JLabel();
        FieldFeedRate = new javax.swing.JTextField();
        LabelPlungeRate = new javax.swing.JLabel();
        FieldPlungeRate = new javax.swing.JTextField();
        BtnCalculate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tool Speed Calculator");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        container.setFocusable(false);

        panelDrills.setFocusable(false);
        panelDrills.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                panelDrillsComponentShown(evt);
            }
        });

        LabelDrillDia.setText("Tool Diameter (Inches)");

        FieldDrillDia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FieldDrillDiaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                FieldDrillDiaFocusLost(evt);
            }
        });

        panelDrillCycle.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelDrillCycle.setFocusable(false);

        btnDrill.setText("Drill");
        btnDrill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDrillActionPerformed(evt);
            }
        });

        btnReamer.setText("Reamer");
        btnReamer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReamerActionPerformed(evt);
            }
        });

        btnCounterbore.setText("Counterbore");
        btnCounterbore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCounterboreActionPerformed(evt);
            }
        });

        btnCountersink.setText("Countersink");
        btnCountersink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCountersinkActionPerformed(evt);
            }
        });

        btnCenterDrill.setText("Center Drill");
        btnCenterDrill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCenterDrillActionPerformed(evt);
            }
        });

        LabelDrillCycle.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LabelDrillCycle.setText("Drill Path");
        LabelDrillCycle.setToolTipText("");

        javax.swing.GroupLayout panelDrillCycleLayout = new javax.swing.GroupLayout(panelDrillCycle);
        panelDrillCycle.setLayout(panelDrillCycleLayout);
        panelDrillCycleLayout.setHorizontalGroup(
            panelDrillCycleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDrillCycleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDrillCycleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReamer)
                    .addComponent(btnDrill)
                    .addComponent(btnCounterbore)
                    .addComponent(btnCenterDrill)
                    .addGroup(panelDrillCycleLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(LabelDrillCycle))
                    .addComponent(btnCountersink))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        panelDrillCycleLayout.setVerticalGroup(
            panelDrillCycleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDrillCycleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelDrillCycle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCenterDrill)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCountersink)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCounterbore)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReamer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDrill)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout panelDrillsLayout = new javax.swing.GroupLayout(panelDrills);
        panelDrills.setLayout(panelDrillsLayout);
        panelDrillsLayout.setHorizontalGroup(
            panelDrillsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDrillsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelDrillDia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FieldDrillDia, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDrillCycle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelDrillsLayout.setVerticalGroup(
            panelDrillsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDrillsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDrillsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelDrillCycle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelDrillsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LabelDrillDia)
                        .addComponent(FieldDrillDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        container.addTab("Drill Bit", panelDrills);

        panelEndmills.setFocusable(false);
        panelEndmills.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                panelEndmillsComponentShown(evt);
            }
        });

        LabeMillDia.setText("Tool Diameter (Inches)");

        FieldMillDia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FieldMillDiaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                FieldMillDiaFocusLost(evt);
            }
        });

        javax.swing.GroupLayout panelEndmillsLayout = new javax.swing.GroupLayout(panelEndmills);
        panelEndmills.setLayout(panelEndmillsLayout);
        panelEndmillsLayout.setHorizontalGroup(
            panelEndmillsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEndmillsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabeMillDia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FieldMillDia, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                .addGap(146, 146, 146))
        );
        panelEndmillsLayout.setVerticalGroup(
            panelEndmillsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEndmillsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEndmillsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabeMillDia)
                    .addComponent(FieldMillDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(147, Short.MAX_VALUE))
        );

        container.addTab("End Mills", panelEndmills);

        picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/Plain.jpg"))); // NOI18N
        picture.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        picture.setFocusable(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Tool Calulator");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel3.setText("v1.0");

        jLabel4.setText("by: Jordan Jones");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        LabelInitialRpm.setText("Initial Spindle Speed");

        FieldInitialRpm.setEditable(false);

        LabelFixedRpm.setText("Fixed Spindle Speed");

        FieldFixedRpm.setEditable(false);

        LabelCalculations.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LabelCalculations.setText("Final Values");

        LabelFeedRate.setText("Feed Rate");

        FieldFeedRate.setEditable(false);

        LabelPlungeRate.setText("Plunge Rate");

        FieldPlungeRate.setEditable(false);
        FieldPlungeRate.setToolTipText("");

        BtnCalculate.setText("Calculate");
        BtnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculate(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LabelInitialRpm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FieldInitialRpm))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelFixedRpm)
                            .addComponent(LabelCalculations)
                            .addComponent(LabelFeedRate)
                            .addComponent(LabelPlungeRate))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FieldFixedRpm)
                                    .addComponent(FieldFeedRate)
                                    .addComponent(FieldPlungeRate)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtnCalculate)
                                .addGap(11, 11, 11)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelCalculations)
                    .addComponent(BtnCalculate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelInitialRpm)
                    .addComponent(FieldInitialRpm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelFixedRpm)
                    .addComponent(FieldFixedRpm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelFeedRate)
                    .addComponent(FieldFeedRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelPlungeRate)
                    .addComponent(FieldPlungeRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(container)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(picture, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(picture, javax.swing.GroupLayout.PREFERRED_SIZE, 201, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(container, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCounterboreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCounterboreActionPerformed
        m_tool = 4;
        btnCenterDrill  .setSelected(false);
        btnCountersink  .setSelected(false);
        btnReamer       .setSelected(false);
        if(!btnCounterbore.isSelected()){
            btnDrill    .setSelected(true);
            m_tool = 1;
        }else{
            btnDrill    .setSelected(false);
        }
        showMainPicture();
    }//GEN-LAST:event_btnCounterboreActionPerformed

    private void btnCenterDrillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCenterDrillActionPerformed
        m_tool = 2;
        btnCountersink  .setSelected(false);
        btnReamer       .setSelected(false);
        btnCounterbore  .setSelected(false);
        if(!btnCenterDrill.isSelected()){
            btnDrill    .setSelected(true);
            m_tool = 1;
        }else{
            btnDrill    .setSelected(false);
        }
        showMainPicture();
    }//GEN-LAST:event_btnCenterDrillActionPerformed

    private void btnCountersinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCountersinkActionPerformed
        m_tool = 3;
        btnCenterDrill  .setSelected(false);
        btnReamer       .setSelected(false);
        btnCounterbore  .setSelected(false);
        if(!btnCountersink.isSelected()){
            btnDrill    .setSelected(true);
            m_tool = 1;
        }else{
            btnDrill    .setSelected(false);
        }
        showMainPicture();
    }//GEN-LAST:event_btnCountersinkActionPerformed

    private void btnReamerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReamerActionPerformed
        m_tool = 5;
        btnCenterDrill  .setSelected(false);
        btnCountersink  .setSelected(false);
        btnCounterbore  .setSelected(false);
        if(!btnReamer.isSelected()){
            btnDrill    .setSelected(true);
            m_tool = 1;
        }else{
            btnDrill    .setSelected(false);
        }
        showMainPicture();
    }//GEN-LAST:event_btnReamerActionPerformed

    private void btnDrillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDrillActionPerformed
        btnCenterDrill  .setSelected(false);
        btnCountersink  .setSelected(false);
        btnReamer       .setSelected(false);
        btnCounterbore  .setSelected(false);
        btnDrill        .setSelected(true);
        m_tool = 1;
        showMainPicture();
    }//GEN-LAST:event_btnDrillActionPerformed

    private void panelDrillsComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_panelDrillsComponentShown
        m_toolType = 1;
        showMainPicture();
        FieldPlungeRate.setEnabled(false);
    }//GEN-LAST:event_panelDrillsComponentShown

    private void panelEndmillsComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_panelEndmillsComponentShown
        m_toolType = 2;
        FieldPlungeRate.setEnabled(true);
        showMainPicture();
    }//GEN-LAST:event_panelEndmillsComponentShown

    private void calculate(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculate
        
    }//GEN-LAST:event_calculate

    private void FieldDrillDiaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FieldDrillDiaFocusGained
        m_toolDim   = 2;
        showMainPicture();
    }//GEN-LAST:event_FieldDrillDiaFocusGained

    private void FieldDrillDiaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FieldDrillDiaFocusLost
        m_toolDim  = 1;
        showMainPicture();
    }//GEN-LAST:event_FieldDrillDiaFocusLost

    private void FieldMillDiaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FieldMillDiaFocusGained
        m_toolDim   = 2;
        showMainPicture();
    }//GEN-LAST:event_FieldMillDiaFocusGained

    private void FieldMillDiaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FieldMillDiaFocusLost
        m_toolDim  = 1;
        showMainPicture();
    }//GEN-LAST:event_FieldMillDiaFocusLost

    private void showMainPicture(){
        if(1 == m_toolType){
            if(1 == m_tool){
                if(2 == m_toolDim){
                    picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/drill/DiaDrill.jpg")));                    
                }else{
                    picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/drill/PlainDrill.jpg")));
                }
            }else if(2 == m_tool){
                if(2 == m_toolDim){
                    picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/centerdrill/DiaCenterdrill.jpg")));
                }else{
                    picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/centerdrill/PlainCenterdrill.jpg")));
                }
            }else if(3 == m_tool){
                if(2 == m_toolDim){
                    picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/countersink/DiaCountersink.jpg")));
                }else{
                    picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/countersink/PlainCountersink.jpg")));
                }
            }else if(4 == m_tool){
                if(2 == m_toolDim){
                    picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/counterbore/DiaCounterbore.jpg")));
                }else{
                    picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/counterbore/PlainCounterbore.jpg")));
                }
            }else if(5 == m_tool){
                if(2 == m_toolDim){
                    picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/reamer/DiaReamer.jpg")));
                }else{
                    picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/reamer/PlainReamer.jpg")));
                }
            }
        }else{
            if(2 == m_toolDim){
                picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/endmill/DiaEndmill.jpg")));
            }else if(3 == m_toolDim){
                picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/endmill/FlutesEndmill.jpg")));
            }else{
                picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/endmill/PlainEndmill.jpg")));
            }
        }
    }
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
            java.util.logging.Logger.getLogger(ToolCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ToolCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ToolCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ToolCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        final ToolCalc mainPanel = new ToolCalc();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 mainPanel.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCalculate;
    private javax.swing.JTextField FieldDrillDia;
    private javax.swing.JTextField FieldFeedRate;
    private javax.swing.JTextField FieldFixedRpm;
    private javax.swing.JTextField FieldInitialRpm;
    private javax.swing.JTextField FieldMillDia;
    private javax.swing.JTextField FieldPlungeRate;
    private javax.swing.JLabel LabeMillDia;
    private javax.swing.JLabel LabelCalculations;
    private javax.swing.JLabel LabelDrillCycle;
    private javax.swing.JLabel LabelDrillDia;
    private javax.swing.JLabel LabelFeedRate;
    private javax.swing.JLabel LabelFixedRpm;
    private javax.swing.JLabel LabelInitialRpm;
    private javax.swing.JLabel LabelPlungeRate;
    private javax.swing.JRadioButton btnCenterDrill;
    private javax.swing.JRadioButton btnCounterbore;
    private javax.swing.JRadioButton btnCountersink;
    private javax.swing.JRadioButton btnDrill;
    private javax.swing.JRadioButton btnReamer;
    private javax.swing.JTabbedPane container;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelDrillCycle;
    private javax.swing.JPanel panelDrills;
    private javax.swing.JPanel panelEndmills;
    private javax.swing.JLabel picture;
    // End of variables declaration//GEN-END:variables
}
