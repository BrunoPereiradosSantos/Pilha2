package view;

import br.edu.fateczl.brunosantos.Pilha;

public class Principal {
	public static void main(String args[]) {
		Pilha p = new Pilha();
		p.push("a");
		p.push("b");
		try {
			String valor = p.pop();
			System.out.println("o valor removido é: " + valor);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			String topo = p.top();
			System.out.println("o topo é: " + topo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		int tam = p.size();
		System.out.println("o tamanho é: " + tam);
	}
}
