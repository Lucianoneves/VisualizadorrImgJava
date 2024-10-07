/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vializadorimagensjava;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;

/**
 *
 * @author Administrador
 */
class ControleImagem {

  private JLabel labelImagem;

    public ControleImagem(JLabel labelImagem) {
        this.labelImagem = labelImagem;

       JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Selecione uma imagem");
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home") + "/Pictures"));

        // Filtro de extensão de arquivos para mostrar apenas imagens
        fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Imagens", "jpg", "jpeg", "png", "bmp", "gif"));

        int retorno = fileChooser.showOpenDialog(null);
        if (retorno == JFileChooser.APPROVE_OPTION) {
            File arquivoSelecionado = fileChooser.getSelectedFile();
            ImageIcon icone = new ImageIcon(arquivoSelecionado.getPath());
            Image imagem = icone.getImage().getScaledInstance(labelImagem.getWidth(), labelImagem.getHeight(), Image.SCALE_SMOOTH);
            labelImagem.setIcon(new ImageIcon(imagem));
        }
    }

    public void limparImagem() {
        labelImagem.setIcon(null);
    }

    void carregarImagem() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}