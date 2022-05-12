/* Crie um programa e declare nele 3 variáveis numéricas int, inicializando-as com algum valor e obtenha a soma dessas variáveis e a 
média delas, imprimindo esses resultados na tela*/

class CBBAtividadePratica2 {
	public static void main(String[] args) {
		double nota1 = 8;
		double nota2 = 7;
		double nota3 = 9;
		
		double soma = nota1 + nota2 + nota3;
		double media = soma / 3;
		
		System.out.println("Nota 1: " + nota1);
		System.out.println("Nota 2: " + nota2);
		System.out.println("Nota 3: " + nota3);
		
		System.out.println("A soma das notas eh " + soma);
		System.out.println("A media eh " + media);
	}
}