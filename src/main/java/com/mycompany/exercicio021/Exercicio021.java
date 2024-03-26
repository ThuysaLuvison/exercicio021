/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio021;

import javax.swing.JOptionPane;

public class Exercicio021 {

    public static void main(String[] args) {
        int N;
        N = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de N: "));
        int fatorial = 1;
        int contador = 1;
        while (contador <= N) {
            fatorial *= contador;
            contador++;
        }
        JOptionPane.showMessageDialog(null, "O fatorial de " +N+ " é:" +fatorial); 
        }
}