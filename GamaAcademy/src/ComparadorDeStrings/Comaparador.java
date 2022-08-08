package ComparadorDeStrings;

public class Comaparador {

	public static void main(String[] args) {

		String s1, s2;

		// A condi��o abaixo dara "iguais" pois ocupam o mesmo espa�o de memoria, assim
		// comparando o valor corretamente
		s1 = "Oi tudo bem?";
		s2 = "Oi tudo bem?";

		// Objetos
		// A condi��o abaixo dara "diferente" pois ocupam diferentes espa�os da memoria,
		// assim a compara��o da diferente - gerenciamento de memoria
//		s1 = new String("Oi tudo bem?");
//		s2 = new String("Oi tudo bem?");
		
		// eu nao estou comparando conteudos...eu estou comparando se s1 e s2 apontam
		// para a mesma regi�o da mem�ria
//		if (s1 == s2) { 
//			System.out.println("iguais");
//		} else {
//			System.out.println("diferentes");
//		}

		if (s1 == s2) {
			System.out.println("mesmo endere�o de memoria");
		} else {
			System.out.println("diferentes endere�o de memoria");
		}
		
		
		
		// Como comparar conteudo -  comparar objetos
		if(s1.equals(s2)) {
			System.out.println("Conteudo iguais");
		}else {
			System.out.println("Conteudos diferentes");
		}
		
		// strings nao sao alteraveis, elas sao imutaveis
		// quando altera um conteudo de um tipo string automaticamente o java cria uma nova area (espa�o de memoria) pra ela
		s2 = "Agora vai!!!";
		System.out.println(s1);
		System.out.println(s2);
		
	}

}
