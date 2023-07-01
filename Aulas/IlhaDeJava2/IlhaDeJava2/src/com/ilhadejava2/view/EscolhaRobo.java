package com.ilhadejava2.view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class EscolhaRobo extends JPanel {

	private RoboButton andadorButton;
	private RoboButton cavaloButton;
	private RoboButton bispoButton;
	private RoboButton desabilita;
    private int roboSelecionado;

	public EscolhaRobo(GameBoard board) {
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS)); // Definindo o layout como BoxLayout horizontal

        Icon iconAndador = new Icon("C:\\Users\\jpnno\\eclipse-workspace\\IlhaDeJava2\\src\\resources\\aluno.png", 30,
                30);

        andadorButton = new RoboButton(iconAndador, 1);
        cavaloButton = new RoboButton(iconAndador, 2);
        bispoButton = new RoboButton(iconAndador, 3);
        desabilita = new RoboButton(iconAndador, 4);
        desabilita.setBackground(Color.CYAN);
        JButton botaoDesabilita = new JButton();
        
        add(andadorButton);
        add(cavaloButton);
        add(bispoButton);
        

        // Adicionar um ActionListener aos botões
        ActionListener selecionarRoboListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RoboButton botaoSelecionado = (RoboButton) e.getSource();
                botaoSelecionado.setBackground(Color.YELLOW);
                roboSelecionado = botaoSelecionado.getId();
                System.out.println("Robô selecionado: " + roboSelecionado);
                
            }
        };
        
        
        andadorButton.addActionListener(selecionarRoboListener);
        cavaloButton.addActionListener(selecionarRoboListener);
        bispoButton.addActionListener(selecionarRoboListener);
    }
	
	
    public int getRoboSelecionado() {
        return roboSelecionado;
    }

}
