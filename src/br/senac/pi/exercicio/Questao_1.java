package br.senac.pi.exercicio;



import javax.swing.JOptionPane;

public class Questao_1 {
public static void main(String[] args){
	int num_empregado=0;
	double media,salario=0, salario_total=0;;
	
	num_empregado=Integer.parseInt(JOptionPane.showInputDialog("Quantos empregados há na empressa?"));
	
	for(int i=1;i<=num_empregado;i++){
		salario=Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do "+i+" funcionário "));
	salario_total=salario_total+salario;
	}
	
	media=salario_total/num_empregado;
	JOptionPane.showMessageDialog(null,"Salário médio dos funcionários da empressa é "+media);
	
		
	
	
	
}
}
