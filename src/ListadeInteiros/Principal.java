package ListadeInteiros;

import javax.swing.JOptionPane;

/**
 * Classe utilizada como menu principal da lista
 * 
 * @author Sabino
 * @version 14/08/2017
 */
public class Principal {
	public static void main(String args[]) {
		Lista l1 = new Lista(4);
		// int e;
		int opc = 0;
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Menu:\n\n" 
					+ " 1- Adiciona inicio" + "\n 2- Adiciona Final"
					+ "\n 3- Adiciona em posicao especifica" + "\n 4- Remove Inicio" + "\n 5- Remove Final"
					+ "\n 6- Remove da posicao especifica" + "\n 7- Mostre o primeiro elemento"
					+ "\n 8- Mostre o ultimo elemento" + "\n 9- Mostra todos os elementos" + "\n 10- Sair"));
			switch (opc) {
			case 1:
				l1.addInicio(Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da primeira posicao: ")));
				break;

			case 2:
				l1.addFinal(Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para a ultima posicao: ")));
				break;

			case 3:
				l1.addPosicao(Integer.parseInt(JOptionPane.showInputDialog("Digite o valor que deseja adicionar: ")),
						Integer.parseInt(JOptionPane.showInputDialog("Digite a posicao que deseja adicionar: ")));
				break;

			case 4:
				JOptionPane.showConfirmDialog(null,"Remover: " + l1.removerInicio() + "?");
				JOptionPane.showMessageDialog(null,"Removido!");
				break;

			case 5:
				JOptionPane.showConfirmDialog(null, l1.removerFinal());
				break;

			case 6:
				l1.removerPosicao(JOptionPane.showConfirmDialog(null, "Digite o valor que deseja remover: "));
				break;

			case 7:
				// System.out.println("o inicio é: " + l1.addInicio(e) + "conforme digitado.");

			case 8:
				//System.out.println("o final é: " + l1.addFinal(e) + "conforme digitado.");

			case 9:
				JOptionPane.showMessageDialog(null, l1.toString());
				break;
			default:
				System.out.println("Opcao Invalida!");
				break;
			}
		} while (opc != 10);
	}
}
