/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vializadorimagensjava;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Administrador
 */
public class VisualizadorImagensJava extends Tela {

   private JLabel labelImagem;
    private JButton btnCarregar;
    private JButton btnLimpar;
    private ControleImagem controleImagem;
    
    
    
    
      public VisualizadorImagensJava() {
        // Configurações da janela
        setTitle("Visualizador de Imagens");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Inicialização dos componentes
        labelImagem = new JLabel();
        labelImagem.setHorizontalAlignment(JLabel.CENTER);
        labelImagem.setVerticalAlignment(JLabel.CENTER);

        btnCarregar = new JButton("Carregar Imagem");
        btnLimpar = new JButton("Limpar Imagem");
        controleImagem = new ControleImagem(labelImagem);

        // Painel de botões
        JPanel painelBotoes = new JPanel();
        painelBotoes.add(btnCarregar);
        painelBotoes.add(btnLimpar);

        // Adicionar componentes à janela
        add(labelImagem, BorderLayout.CENTER);
        add(painelBotoes, BorderLayout.SOUTH);

        // Ação do botão Carregar
        btnCarregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controleImagem.carregarImagem();
            }
        });

        // Ação do botão Limpar
        btnLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controleImagem.limparImagem();
            }
        });
    }
}
    
    

