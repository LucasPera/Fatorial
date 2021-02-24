package br.com.fatorial;

public class Fatorial {

	public Integer exibirFatorial(Integer numero) {

		Integer fatorial;
		
		for (fatorial = 1; numero > 1; numero = numero - 1) {
			fatorial = fatorial * numero;
		}

		return fatorial;

	}

}
