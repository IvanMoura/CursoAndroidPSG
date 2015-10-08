package br.senac.pi.exercicio;

import javax.swing.JOptionPane;

public class questao_4 {
	public static void main(String[] args) {

        double novo_salario = 0;
       

        String nome = JOptionPane.showInputDialog("Digite seu nome:");
        String cargo = JOptionPane.showInputDialog("Digite seu cargo:");
        Double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salário:"));

        switch (cargo) {
            case "Gerente":
                novo_salario = salario * 1.15;
                JOptionPane.showMessageDialog(null, "Novo salário do gerente " + nome + " é: " + novo_salario);
                break;
            case "coodenador":
                novo_salario = salario * 1.10;
                JOptionPane.showMessageDialog(null, "Novo salário do coodenador " + nome + " é: " + novo_salario);
                break;
            case "supervisor":
                novo_salario = salario * 1.08;
                JOptionPane.showMessageDialog(null, "Novo salário do supervisor " + nome + " é: " + novo_salario);
            default:
                System.out.println("Cargo não cadastrado");
                break;
        }
	}
	
}
