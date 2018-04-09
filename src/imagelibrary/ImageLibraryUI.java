/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imagelibrary;

import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;
import java.awt.image.BufferedImage;

/**
 *
 * @author Ibraheem Saleh
 */
public class ImageLibraryUI extends javax.swing.JFrame {

    BufferedImage leftImage;
    BufferedImage rightImage;
    /**
     * Creates new form ImageLibraryUI
     */
    public ImageLibraryUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        changeResolutionChooser = new javax.swing.JDialog();
        changeResolutionAcceptButton = new javax.swing.JButton();
        changeResolutionCancelButton = new javax.swing.JButton();
        interpolationMethodChoice = new java.awt.Choice();
        jLabel1 = new javax.swing.JLabel();
        changeResolutionWidth = new java.awt.TextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        changeResolutionHeight = new java.awt.TextField();
        changePixelDepthChooser = new javax.swing.JDialog();
        changePixelDepthAcceptButton = new javax.swing.JButton();
        changePixelDepthCancelButton = new javax.swing.JButton();
        changePixelDepthField = new java.awt.TextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        leftImageLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        rightImageLabel = new javax.swing.JLabel();
        acceptTransformationButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openImage = new javax.swing.JMenuItem();
        exit = new javax.swing.JMenuItem();
        transformMenu = new javax.swing.JMenu();
        changeResolutionMenu = new javax.swing.JMenuItem();
        changePixelDepthMenu = new javax.swing.JMenuItem();

        fileChooser.setCurrentDirectory(new File("./images"));

        changeResolutionChooser.setMinimumSize(new java.awt.Dimension(600, 300));

        changeResolutionAcceptButton.setText("Accept");
        changeResolutionAcceptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeResolutionAcceptButtonActionPerformed(evt);
            }
        });

        changeResolutionCancelButton.setText("Close");
        changeResolutionCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeResolutionCancelButtonActionPerformed(evt);
            }
        });

        interpolationMethodChoice.add("Nearest Neighbor");
        interpolationMethodChoice.add("Linear");
        interpolationMethodChoice.add("Bilinear");
        interpolationMethodChoice.select("Linear");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Select Interpolation Method:");

        changeResolutionWidth.setMinimumSize(new java.awt.Dimension(100, 20));
        changeResolutionWidth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeResolutionWidthActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Input New Image Width (px):");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Change Resolution Menu");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Input New Image Height (px):");

        changeResolutionHeight.setMinimumSize(new java.awt.Dimension(100, 20));
        changeResolutionHeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeResolutionHeightActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout changeResolutionChooserLayout = new javax.swing.GroupLayout(changeResolutionChooser.getContentPane());
        changeResolutionChooser.getContentPane().setLayout(changeResolutionChooserLayout);
        changeResolutionChooserLayout.setHorizontalGroup(
            changeResolutionChooserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changeResolutionChooserLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(changeResolutionChooserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(changeResolutionChooserLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(27, 27, 27))
                    .addGroup(changeResolutionChooserLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(changeResolutionChooserLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(changeResolutionChooserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(interpolationMethodChoice, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(changeResolutionChooserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(changeResolutionWidth, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(changeResolutionHeight, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, 57))
            .addGroup(changeResolutionChooserLayout.createSequentialGroup()
                .addGroup(changeResolutionChooserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(changeResolutionChooserLayout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jLabel3))
                    .addGroup(changeResolutionChooserLayout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(changeResolutionAcceptButton)
                        .addGap(29, 29, 29)
                        .addComponent(changeResolutionCancelButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        changeResolutionChooserLayout.setVerticalGroup(
            changeResolutionChooserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changeResolutionChooserLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(changeResolutionChooserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(changeResolutionWidth, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(26, 26, 26)
                .addGroup(changeResolutionChooserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(changeResolutionHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(24, 24, 24)
                .addGroup(changeResolutionChooserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(interpolationMethodChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(28, 28, 28)
                .addGroup(changeResolutionChooserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(changeResolutionAcceptButton)
                    .addComponent(changeResolutionCancelButton))
                .addContainerGap())
        );

        changePixelDepthChooser.setMinimumSize(new java.awt.Dimension(600, 300));

        changePixelDepthAcceptButton.setText("Accept");
        changePixelDepthAcceptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePixelDepthAcceptButtonActionPerformed(evt);
            }
        });

        changePixelDepthCancelButton.setText("Close");
        changePixelDepthCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePixelDepthCancelButtonActionPerformed(evt);
            }
        });

        changePixelDepthField.setMinimumSize(new java.awt.Dimension(100, 20));
        changePixelDepthField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePixelDepthFieldActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Input New Pixel Depth (bits):");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Change Pixel Depth Menu");

        javax.swing.GroupLayout changePixelDepthChooserLayout = new javax.swing.GroupLayout(changePixelDepthChooser.getContentPane());
        changePixelDepthChooser.getContentPane().setLayout(changePixelDepthChooserLayout);
        changePixelDepthChooserLayout.setHorizontalGroup(
            changePixelDepthChooserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changePixelDepthChooserLayout.createSequentialGroup()
                .addGroup(changePixelDepthChooserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(changePixelDepthChooserLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(changePixelDepthAcceptButton)
                        .addGap(87, 87, 87)
                        .addComponent(changePixelDepthCancelButton))
                    .addGroup(changePixelDepthChooserLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(changePixelDepthChooserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(changePixelDepthChooserLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(changePixelDepthField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        changePixelDepthChooserLayout.setVerticalGroup(
            changePixelDepthChooserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changePixelDepthChooserLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(changePixelDepthChooserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(changePixelDepthField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(36, 36, 36)
                .addGroup(changePixelDepthChooserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(changePixelDepthAcceptButton)
                    .addComponent(changePixelDepthCancelButton))
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(leftImageLabel);
        leftImageLabel.setHorizontalAlignment(javax.swing.JLabel.CENTER);
        leftImageLabel.setVerticalAlignment(javax.swing.JLabel.CENTER);

        jScrollPane2.setViewportView(rightImageLabel);
        rightImageLabel.setHorizontalAlignment(javax.swing.JLabel.CENTER);
        rightImageLabel.setVerticalAlignment(javax.swing.JLabel.CENTER);

        acceptTransformationButton.setText("Accept Transformation");
        acceptTransformationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptTransformationButtonActionPerformed(evt);
            }
        });

        fileMenu.setText("File");

        openImage.setText("Open Image");
        openImage.setToolTipText("");
        openImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openImageActionPerformed(evt);
            }
        });
        fileMenu.add(openImage);
        openImage.getAccessibleContext().setAccessibleName("openImageMenu");

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        fileMenu.add(exit);

        jMenuBar1.add(fileMenu);
        fileMenu.getAccessibleContext().setAccessibleDescription("");

        transformMenu.setText("Transform");
        transformMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transformMenuActionPerformed(evt);
            }
        });

        changeResolutionMenu.setText("Change Resolution");
        changeResolutionMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeResolutionMenuActionPerformed(evt);
            }
        });
        transformMenu.add(changeResolutionMenu);

        changePixelDepthMenu.setText("Change Pixel Depth");
        changePixelDepthMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePixelDepthMenuActionPerformed(evt);
            }
        });
        transformMenu.add(changePixelDepthMenu);

        jMenuBar1.add(transformMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(acceptTransformationButton)
                .addGap(455, 455, 455))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE))
                .addGap(23, 23, 23)
                .addComponent(acceptTransformationButton))
        );

        acceptTransformationButton.getAccessibleContext().setAccessibleName("acceptButton");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void acceptTransformationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptTransformationButtonActionPerformed
        leftImage = ImageLibrary.deepCopy(rightImage);
        leftImageLabel.setIcon(new javax.swing.ImageIcon(leftImage));
    }//GEN-LAST:event_acceptTransformationButtonActionPerformed

    private void transformMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transformMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transformMenuActionPerformed

    private void openImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openImageActionPerformed
        int returnVal = fileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try {
                leftImage = ImageLibrary.loadGrayscaleImage(fileChooser.getSelectedFile());
                rightImage = ImageLibrary.loadGrayscaleImage(fileChooser.getSelectedFile());
                leftImageLabel.setIcon(new javax.swing.ImageIcon(leftImage));
                rightImageLabel.setIcon(new javax.swing.ImageIcon(rightImage));
              // What to do with the file, e.g. display it in a TextArea
              //textarea.read( new FileReader( file.getAbsolutePath() ), null );
            } catch (Exception ex) {
              System.out.println("problem accessing file"+file.getAbsolutePath());
            }
        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_openImageActionPerformed

    private void changeResolutionMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeResolutionMenuActionPerformed
        if(leftImage != null){
            changeResolutionWidth.setText(leftImage.getWidth()+"");
            changeResolutionHeight.setText(leftImage.getHeight()+"");
        }
        changeResolutionChooser.setVisible(true);
    }//GEN-LAST:event_changeResolutionMenuActionPerformed

    private void changeResolutionCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeResolutionCancelButtonActionPerformed
        changeResolutionChooser.setVisible(false);
    }//GEN-LAST:event_changeResolutionCancelButtonActionPerformed

    private void changeResolutionWidthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeResolutionWidthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_changeResolutionWidthActionPerformed

    private void changeResolutionHeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeResolutionHeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_changeResolutionHeightActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void changeResolutionAcceptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeResolutionAcceptButtonActionPerformed
        int newWidth = Integer.parseInt(changeResolutionWidth.getText());
        int newHeight = Integer.parseInt(changeResolutionHeight.getText());
        switch (interpolationMethodChoice.getSelectedItem()){
            case "Nearest Neighbor":
                rightImage = ImageLibrary.nearestNeighborInterpolation(leftImage,newWidth,newHeight);
                rightImageLabel.setIcon(new javax.swing.ImageIcon(rightImage));
                //changeResolutionChooser.setVisible(false);
                break;
            case "Linear":
                rightImage = ImageLibrary.linearInterpolation(leftImage,newWidth,newHeight);
                rightImageLabel.setIcon(new javax.swing.ImageIcon(rightImage));
                break;
            case "Bilinear":
                rightImage = ImageLibrary.bilinearInterpolation(leftImage,newWidth,newHeight);
                rightImageLabel.setIcon(new javax.swing.ImageIcon(rightImage));
                break;
            default:
                break;
        }
    }//GEN-LAST:event_changeResolutionAcceptButtonActionPerformed

    private void changePixelDepthAcceptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePixelDepthAcceptButtonActionPerformed
        int newDepth = Integer.parseInt(changePixelDepthField.getText());
        rightImage = ImageLibrary.setPixelDepth(leftImage, newDepth);
        rightImageLabel.setIcon(new javax.swing.ImageIcon(rightImage));
    }//GEN-LAST:event_changePixelDepthAcceptButtonActionPerformed

    private void changePixelDepthCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePixelDepthCancelButtonActionPerformed
        changePixelDepthChooser.setVisible(false);
    }//GEN-LAST:event_changePixelDepthCancelButtonActionPerformed

    private void changePixelDepthFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePixelDepthFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_changePixelDepthFieldActionPerformed

    private void changePixelDepthMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePixelDepthMenuActionPerformed
        changePixelDepthChooser.setVisible(true);
    }//GEN-LAST:event_changePixelDepthMenuActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws Exception {
        javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
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
            java.util.logging.Logger.getLogger(ImageLibraryUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ImageLibraryUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ImageLibraryUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ImageLibraryUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ImageLibraryUI().setVisible(true);
            }
        });
        System.out.println("HELLO222");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptTransformationButton;
    private javax.swing.JButton changePixelDepthAcceptButton;
    private javax.swing.JButton changePixelDepthCancelButton;
    private javax.swing.JDialog changePixelDepthChooser;
    private java.awt.TextField changePixelDepthField;
    private javax.swing.JMenuItem changePixelDepthMenu;
    private javax.swing.JButton changeResolutionAcceptButton;
    private javax.swing.JButton changeResolutionCancelButton;
    private javax.swing.JDialog changeResolutionChooser;
    private java.awt.TextField changeResolutionHeight;
    private javax.swing.JMenuItem changeResolutionMenu;
    private java.awt.TextField changeResolutionWidth;
    private javax.swing.JMenuItem exit;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JMenu fileMenu;
    private java.awt.Choice interpolationMethodChoice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel leftImageLabel;
    private javax.swing.JMenuItem openImage;
    private javax.swing.JLabel rightImageLabel;
    private javax.swing.JMenu transformMenu;
    // End of variables declaration//GEN-END:variables
}
