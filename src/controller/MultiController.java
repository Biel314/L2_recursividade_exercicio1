package controller;

public class MultiController {

	public MultiController() {
		super();
	}

	public int multiplicacao(int n1, int n2) {
		//A condicao de parada ocorre quando o numero de repeticoes acaba, ou melhor, quando
		// n2 se torna 1.
		if(n2 == 1) {
			return n1;
		// multiplicacao de 0 por qualquer numero é 0;
		} else if (n1 == 0 || n2 == 0) {
			return 0;
		//A chamada ocorre enquanto n2 for maior q 1, por exemplo: 5x4, vai repetir o 5 e soma-lo 4 vezes
		} else {
			return n1 + multiplicacao(n1, n2-1);
		}
	}
	
}
