/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.compressor_decompressor;

import COM_DECOM.COMPRESSOR;
import COM_DECOM.DECOMPRESSOR;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class AppFrame extends JFrame implements ActionListener {
    JButton compressButton;
    JButton decompressButton;
    AppFrame(){
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    compressButton=new JButton("SELECT FILE TO COMPRESS");
    compressButton.setBounds(20,100,200,30);
     compressButton.addActionListener(this);
    
    
     decompressButton=new JButton("SELECT FILE TO DECOMPRSS");
     decompressButton.setBounds(250,100,200,30);
     decompressButton.addActionListener(this);
     this.add(compressButton);
     this.add(decompressButton);
     this.setSize(100,500);
     this.getContentPane().setBackground(Color.GREEN);
     this.setVisible(true);
     
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==compressButton){
        JFileChooser filechooser=new JFileChooser();
        int response=filechooser.showSaveDialog(null);
        if(response==JFileChooser.APPROVE_OPTION){
        File file=new File(filechooser.getSelectedFile().getAbsolutePath());
        System.out.print(file);
        try{
        COMPRESSOR.method(file);
        }
        catch(Exception ee){
        JOptionPane.showMessageDialog(null, ee.toString());
        
        }
        }
        }
        
        if(e.getSource()==decompressButton){
         JFileChooser filechooser=new JFileChooser();
        int response=filechooser.showSaveDialog(null);
        if(response==JFileChooser.APPROVE_OPTION){
        File file=new File(filechooser.getSelectedFile().getAbsolutePath());
        System.out.print(file);
        try{
       DECOMPRESSOR.method(file);
        }
        catch(Exception ee){
        JOptionPane.showMessageDialog(null, ee.toString());
        
        }
        }
        
        }
    }
}
