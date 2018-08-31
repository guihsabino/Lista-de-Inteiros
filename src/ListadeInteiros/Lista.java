package ListadeInteiros;

public class Lista {
	/**
	 * Classe que matém uma lista com locação estática na memoria
	 * 
	 * @author Sabino
	 * @version 14/08/2017
	 */
	private int dados[];
	private int tamanho;

	public Lista(int c) {
		dados = new int[c];
		tamanho = 0;
	}

	public void addInicio(int e) {
		// So serve pra dizer se ta errado
		if (tamanho == dados.length) {
			System.out.println("Erro! Encheu, jovem!");
			// Aqui comeca a brincadeira
		} else {
			for (int i = tamanho; i > 0; i--) {
				dados[i] = dados[i - 1];
			}
			dados[0] = e;
			tamanho++;
		}

	}

	public void addPosicao(int e, int p) {
		// So serve pra dizer se ta errado
		if (tamanho == dados.length) {
			System.out.println("Erro! Encheu, jovem!");
			// Aqui comeca a brincadeira
		} else {
			if (dados[p - 1] != 0) {
				for (int i = tamanho; i >= p; i--) {
					dados[i] = dados[i - 1];
				}
				dados[p - 1] = e;
				tamanho++;
			} else {
				dados[p - 1] = e;
				tamanho++;
			}
		}
	}

	public void addFinal(int e) {
		// So serve pra dizer se ta errado
		if (tamanho == dados.length) {
			System.out.println("Erro! Encheu, jovem!");
			// Aqui comeca a brincadeira
		} else {
			for (int i = tamanho; i >= 0; i++) {
				dados[i] = dados[i + 1];
			}
			dados[0] = e;
			tamanho--;
		}

	}

	public int removerInicio() {
		int aux = dados[0];
		// So serve pra dizer se ta errado
		if (tamanho == 0) {
			System.out.println("ERRO!Esta vazio, jovem!");
			// Aqui comeca a brincadeira
		} else {
			for (int i = 0; i < tamanho - 1; i++) {
				dados[i] = dados[i + 1];
				dados[i + 1] = 0;
			}
			tamanho--;

		}
		return aux;

	}

	public int removerFinal() {
		int aux = dados[tamanho - 1];
		// So serve pra dizer se ta errado
		if (tamanho == 0) {
			System.out.println("ERRO!Esta vazio, jovem!");
			// Aqui comeca a brincadeira
		} else {
			dados[tamanho - 1] = 0;
			tamanho--;

		}
		return aux;
	}

	public String removerPosicao(int p) {
		// So serve pra dizer se ta errado
		if (tamanho == 0) {
			System.out.println("ERRO!Esta vazio, jovem!");
			// Aqui comeca a brincadeira
		} else {
			if (dados[p - 1] != 0) {
				for (int i = p - 1; i < tamanho; i++) {
					dados[i] = dados[i + 1];
				}
				dados[p - 1] = dados[p];
				tamanho--;
			}
		}
		return null;
	}

	public String toString() {
		String r = "";
		for (int i = 0; i < tamanho; i++) {
			r = r + " " + dados[i];
		}
		r = r + "\n Quantidade de elementos: " + tamanho;
		return r;
	}
}
