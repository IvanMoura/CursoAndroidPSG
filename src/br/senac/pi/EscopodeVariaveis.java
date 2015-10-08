package br.senac.pi;

public class EscopodeVariaveis {

	public static void main(String[] args) {
		// Bloco1
		int i = 5;
		{
			int j = 0;
			System.out.println(i);
			j = 5 * i;
			System.out.println(j);

		}
		{
			System.out.println(i);
			{
				System.out.println(i);

			}

		}

	}

}
