/**
 * Project Wonderland
 *
 * Copyright (c) 2004-2009, Sun Microsystems, Inc., All Rights Reserved
 *
 * Redistributions in source code form must reproduce the above
 * copyright and this condition.
 *
 * The contents of this file are subject to the GNU General Public
 * License, Version 2 (the "License"); you may not use this file
 * except in compliance with the License. A copy of the License is
 * available at http://www.opensource.org/licenses/gpl-license.php.
 *
 * Sun designates this particular file as subject to the "Classpath" 
 * exception as provided by Sun in the License file that accompanied 
 * this code.
 */
package org.jdesktop.wonderland.modules.artimport.client.jme;

import java.io.File;
import java.text.MessageFormat;
import java.util.ResourceBundle;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author paulby
 * @author  Ronny Standtke <ronny.standtke@fhnw.ch>
 */
public class ModuleManagerUI extends javax.swing.JFrame {

    private static final ResourceBundle BUNDLE = ResourceBundle.getBundle(
            "org/jdesktop/wonderland/modules/artimport/client/jme/resources/Bundle");
    private File parentDir = null;
    private JFileChooser fc = new JFileChooser();

    /** Creates new form ModuleManagerUI */
    public ModuleManagerUI() {
        initComponents();

        parentDirButtonActionPerformed(null);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        parentDirGroup = new javax.swing.ButtonGroup();
        createModulePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        moduleNameTF = new javax.swing.JTextField();
        parentDirTF = new javax.swing.JTextField();
        chooseDirB = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        toolsDirCB = new javax.swing.JCheckBox();
        worldDirCB = new javax.swing.JCheckBox();
        foundationDirCB = new javax.swing.JCheckBox();
        samplesDirCB = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        commonPackageCB = new javax.swing.JCheckBox();
        serverPackageCB = new javax.swing.JCheckBox();
        clientPackageCB = new javax.swing.JCheckBox();
        artCB = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        moduleDescriptionTF = new javax.swing.JTextField();
        createModuleB = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("org/jdesktop/wonderland/modules/artimport/client/jme/resources/Bundle"); // NOI18N
        setTitle(bundle.getString("ModuleManagerUI.title")); // NOI18N
        setResizable(false);

        createModulePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("ModuleManagerUI.createModulePanel.border.title"))); // NOI18N

        jLabel1.setText(bundle.getString("ModuleManagerUI.jLabel1.text")); // NOI18N

        jLabel2.setText(bundle.getString("ModuleManagerUI.jLabel2.text")); // NOI18N

        moduleNameTF.setText(bundle.getString("ModuleManagerUI.moduleNameTF.text")); // NOI18N
        moduleNameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moduleNameTFActionPerformed(evt);
            }
        });

        parentDirTF.setEnabled(false);
        parentDirTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parentDirTFActionPerformed(evt);
            }
        });

        chooseDirB.setText(bundle.getString("ModuleManagerUI.chooseDirB.text")); // NOI18N
        chooseDirB.setEnabled(false);
        chooseDirB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseDirBActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("ModuleManagerUI.jPanel2.border.title"))); // NOI18N

        parentDirGroup.add(toolsDirCB);
        toolsDirCB.setText(bundle.getString("ModuleManagerUI.toolsDirCB.text")); // NOI18N
        toolsDirCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parentDirButtonActionPerformed(evt);
            }
        });

        parentDirGroup.add(worldDirCB);
        worldDirCB.setSelected(true);
        worldDirCB.setText(bundle.getString("ModuleManagerUI.worldDirCB.text")); // NOI18N
        worldDirCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parentDirButtonActionPerformed(evt);
            }
        });

        parentDirGroup.add(foundationDirCB);
        foundationDirCB.setText(bundle.getString("ModuleManagerUI.foundationDirCB.text")); // NOI18N
        foundationDirCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parentDirButtonActionPerformed(evt);
            }
        });

        parentDirGroup.add(samplesDirCB);
        samplesDirCB.setText(bundle.getString("ModuleManagerUI.samplesDirCB.text")); // NOI18N
        samplesDirCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parentDirButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(toolsDirCB)
                    .add(worldDirCB)
                    .add(foundationDirCB)
                    .add(samplesDirCB))
                .addContainerGap(289, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(toolsDirCB)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(worldDirCB)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(foundationDirCB)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(samplesDirCB)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        commonPackageCB.setSelected(true);
        commonPackageCB.setText(bundle.getString("ModuleManagerUI.commonPackageCB.text")); // NOI18N
        commonPackageCB.setEnabled(false);

        serverPackageCB.setSelected(true);
        serverPackageCB.setText(bundle.getString("ModuleManagerUI.serverPackageCB.text")); // NOI18N

        clientPackageCB.setSelected(true);
        clientPackageCB.setText(bundle.getString("ModuleManagerUI.clientPackageCB.text")); // NOI18N

        artCB.setText(bundle.getString("ModuleManagerUI.artCB.text")); // NOI18N
        artCB.setToolTipText(bundle.getString("ModuleManagerUI.artCB.toolTipText")); // NOI18N

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .add(artCB)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(serverPackageCB)
                    .add(commonPackageCB)
                    .add(clientPackageCB))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(artCB)
                    .add(clientPackageCB))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(commonPackageCB)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(serverPackageCB)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setText(bundle.getString("ModuleManagerUI.jLabel3.text")); // NOI18N

        moduleDescriptionTF.setText(bundle.getString("ModuleManagerUI.moduleDescriptionTF.text")); // NOI18N

        org.jdesktop.layout.GroupLayout createModulePanelLayout = new org.jdesktop.layout.GroupLayout(createModulePanel);
        createModulePanel.setLayout(createModulePanelLayout);
        createModulePanelLayout.setHorizontalGroup(
            createModulePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(createModulePanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(createModulePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel2)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel3)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel1))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(createModulePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(createModulePanelLayout.createSequentialGroup()
                        .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, createModulePanelLayout.createSequentialGroup()
                        .add(createModulePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, createModulePanelLayout.createSequentialGroup()
                                .add(createModulePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(moduleNameTF, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 135, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(parentDirTF, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(chooseDirB))
                            .add(org.jdesktop.layout.GroupLayout.LEADING, createModulePanelLayout.createSequentialGroup()
                                .add(moduleDescriptionTF, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)))
                        .add(0, 0, 0))))
        );
        createModulePanelLayout.setVerticalGroup(
            createModulePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(createModulePanelLayout.createSequentialGroup()
                .add(createModulePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(moduleNameTF, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel1))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(createModulePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel3)
                    .add(moduleDescriptionTF, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(createModulePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(createModulePanelLayout.createSequentialGroup()
                        .add(createModulePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(parentDirTF, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(chooseDirB))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jLabel2))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        createModuleB.setText(bundle.getString("ModuleManagerUI.createModuleB.text")); // NOI18N
        createModuleB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createModuleBActionPerformed(evt);
            }
        });

        cancelButton.setText(bundle.getString("ModuleManagerUI.cancelButton.text")); // NOI18N
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(createModulePanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(cancelButton)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(createModuleB)
                        .add(121, 121, 121))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(createModulePanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(cancelButton)
                    .add(createModuleB))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createModuleBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createModuleBActionPerformed
        ModuleSourceManager mgr = new ModuleSourceManager();

        mgr.createModule(moduleNameTF.getText(), moduleDescriptionTF.getText(),
                parentDir, artCB.isSelected(), clientPackageCB.isSelected(),
                serverPackageCB.isSelected());

        String message = BUNDLE.getString("Module_Created_In_Directory");
        message = MessageFormat.format(message, parentDir);
        JOptionPane.showMessageDialog(this, message);
    }//GEN-LAST:event_createModuleBActionPerformed

    private void chooseDirBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseDirBActionPerformed
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int returnVal = fc.showOpenDialog(this);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            parentDir = fc.getSelectedFile();
            parentDirTF.setText(parentDir.getAbsolutePath());
        }

}//GEN-LAST:event_chooseDirBActionPerformed

    private void parentDirTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parentDirTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_parentDirTFActionPerformed

    private void parentDirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parentDirButtonActionPerformed

        String dir;

        if (toolsDirCB.isSelected()) {
            dir = "tools";
        } else if (worldDirCB.isSelected()) {
            dir = "world";
        } else if (foundationDirCB.isSelected()) {
            dir = "foundation";
        } else if (samplesDirCB.isSelected()) {
            dir = "samples";
        } else {
            Logger.getAnonymousLogger().severe(
                    "Unknown directory selection, assuming world");
            dir = "world";
        }

        File defaultDir = new File(".." + File.separatorChar + "modules" +
                File.separatorChar + dir);
        if (defaultDir.exists()) {
            fc.setCurrentDirectory(defaultDir);
            parentDirTF.setText(defaultDir.getAbsolutePath());
            parentDir = defaultDir;
        }

    }//GEN-LAST:event_parentDirButtonActionPerformed

    private void moduleNameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moduleNameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_moduleNameTFActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_cancelButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ModuleManagerUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox artCB;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton chooseDirB;
    private javax.swing.JCheckBox clientPackageCB;
    private javax.swing.JCheckBox commonPackageCB;
    private javax.swing.JButton createModuleB;
    private javax.swing.JPanel createModulePanel;
    private javax.swing.JCheckBox foundationDirCB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField moduleDescriptionTF;
    private javax.swing.JTextField moduleNameTF;
    private javax.swing.ButtonGroup parentDirGroup;
    private javax.swing.JTextField parentDirTF;
    private javax.swing.JCheckBox samplesDirCB;
    private javax.swing.JCheckBox serverPackageCB;
    private javax.swing.JCheckBox toolsDirCB;
    private javax.swing.JCheckBox worldDirCB;
    // End of variables declaration//GEN-END:variables
}
