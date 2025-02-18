package view;

import javax.swing.JOptionPane;

import Multi.Conta; 
 
public class ClassePrincipal
{
	 public static void main(String[] args)
	 {
         int A = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira um número para realizar a multiplicação"));
         int B = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira outro número para realizar a multiplicação"));
         int Resultado = 0;
         JOptionPane.showMessageDialog(null,"O resultado da multiplicação de " + A + " + " + B + " é: "+Conta.multiplica(A, B, Resultado));
     }
}