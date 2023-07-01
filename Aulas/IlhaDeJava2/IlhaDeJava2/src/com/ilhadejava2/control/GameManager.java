package com.ilhadejava2.control;
import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.ImageIcon;

import com.ilhadejava2.model.Aluno;
import com.ilhadejava2.model.Bug;
import com.ilhadejava2.view.GameBoard;

public class GameManager {
    public int alunoNum = 4;
    public int bugNum = 4;
    
	
  private int randomNumberBetween(int min, int max) {
      Random r;
      r = new Random();
      return r.nextInt((max - min) + 1) + min;
  }
  
	public void populateBoard(GameBoard board) {
      ArrayList<int[]> randomPositions = new ArrayList<int[]>();

      // Gera posições aleatórias para alunos e bugs
      for (int i = 1; i <= (this.alunoNum + this.bugNum); i++) {
          int[] randomCord = new int[3];
          randomCord[2] = (i <= this.alunoNum) ? 1 : 2; // Define o tipo (aluno ou bug)

          boolean sameCoord;
          do {
              randomCord[0] = randomNumberBetween(1, 8);
              randomCord[1] = randomNumberBetween(1, 8);
              sameCoord = false;

              // Verifica se a posição gerada já está ocupada
              for (int[] c : randomPositions) {
                  if (randomCord[0] == c[0] && randomCord[1] == c[1] ) {
                      sameCoord = true;
                      break;
                  }
              }
          } while (sameCoord);

          randomPositions.add(randomCord);
      }

      // Adiciona os alunos e bugs às posições geradas
      for (int[] position : randomPositions) {
          int targetX = position[0];
          int targetY = position[1];
          int targetType = position[2];

          if (targetType == 1) {
            Aluno novoAluno = new Aluno();
//            System.out.println(targetX +", "+targetY);
            board.getCell(targetX, targetY).setContent(novoAluno);
            board.getCell(targetX, targetY).Button.setIcon(novoAluno.getIcon());
            board.getCell(targetX, targetY).Button.setBackground(Color.YELLOW);
        } else if (targetType == 2) {
            Bug novoBug = new Bug();
//            System.out.println(targetX +", "+targetY);
            board.getCell(targetX, targetY).setContent(novoBug);
            board.getCell(targetX, targetY).Button.setIcon(novoBug.getIcon());
            board.getCell(targetX, targetY).Button.setBackground(Color.RED);
        }
          
      }
  }
	
}
