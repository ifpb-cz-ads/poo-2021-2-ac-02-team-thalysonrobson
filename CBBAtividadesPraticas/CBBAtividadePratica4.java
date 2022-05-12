/* Crie um programa que elabore o orçamento de uma construtora 
para o cálculo do valor total de construção de uma piscina. O valor 
total será dado pela cubagem da piscina (metros cúbicos) multiplicada por R$100,00, 
que é o preço do metro cúbico construído de piscina. Faça a simulação dos cálculos no 
programa para ver se está tudo funcionando corretamente. */

class CBBAtividadePratica4 {
	public static void main(String[] args) {		
		double largura = 3;
		double comprimento = 6;
		double altura = 1.30;
		double preco = 100;
		
		double metrosCubicos = largura * comprimento * altura;
		double precoTotal = metrosCubicos * preco;
		
		System.out.println("Largura(m): " + largura + "\nComprimento(m): " + comprimento + "\nAltura(m): " + altura + "\nPreco por metro cubico(R$): " + preco);
		System.out.printf("\nArea: %.2fm", metrosCubicos);
		System.out.printf("\nPreco total: %.2fR$", precoTotal);
	}
}