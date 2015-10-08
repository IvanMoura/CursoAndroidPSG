package br.senac.pi.poo;

public class Ferrari {

	public static void main(String[] args) {
		
		Carro c1=new Carro();
		
		c1.marca= "Ferrari";
		c1.modelo= "F448";
		c1.chassi="F347MU78";
		c1.ano= 2015;
		
		System.out.println("Marca: "+c1.marca);
		System.out.println("Modelo: "+c1.modelo);
		System.out.println("Ano: "+c1.ano);
		
		c1.partida();
		c1.acelerar();
		c1.parar();
		
		
		

		
		
	}

}
