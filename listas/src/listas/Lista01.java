package listas;

public class Lista01 {

	public static void main(String[] args) {
		int a=6, b=14;
		/*1) Verifique se A é maior que 10, se verdade imprima: "A > 10" e verifique
		se o A mais B é igual a 20, se verdade imprima: "A + B == 20". Caso a
		segunda afirmação não seja verdadeira, imprima: "número não válido".*/
		System.out.println("Questao 01");
		if(a>10){
			System.out.println("A > 10");
		}
		if(a+b==20){
			System.out.println("A + B == 20");
		}else{
			System.out.println("numero nao valido");
		}
		
		/*2) Verifique se A é menor que 10, se verdade imprima: "A < 10", e verifique
		se o A mais B é igual a 20, se verdade imprima: "A + B == 20". Caso
		nenhumas das afirmação não seja verdadeira, imprima: "número não
		válido", (obs: apenas uma impressão é permitida na saída do programa).*/
		System.out.println("\nQuestao 02");
		if(a<10){
			System.out.println("A < 10");
		}else if(a+b==20){
			System.out.println("A + B == 20");
		}else{
			System.out.println("numero nao valido");
		}
		
		/*3) Verifique se A é igual a 10, se verdade imprima: "A == 10", e verifique
		se o A mais B é igual a 20, se verdade imprima: "A + B == 20". verifique
		se o B é igual a 10, se verdade imprima: "B == 10", (obs: todas as três
		impressões são permitidas na saída do programa).*/
		System.out.println("\nQuestao 03");
		if(a==10) {
			System.out.println("A == 10");
		}
		if(a+b==20){
			System.out.println("A + B == 20");
		}
		if(b==10){
			System.out.println("B == 10");
		}
		
		/*4) Verifique se A é maior que 10 ou se A mais B é igual a 20, se verdade
		imprima: "número válido". Caso as afirmações não sejam verdadeiras,
		Verificar se A é igual B, caso verdade imprima: (A é igual B; A e B são
		diferentes de 10; A é menor que 10) caso não seja verdade imprima:
		"número não válido".*/
		System.out.println("\nQuestao 04");
		if(a>10 || a+b==20){
			System.out.println("numero valido");
		}else if(a==b){
			System.out.println("A eh igual B; A e B sao diferentes de 10; A eh menor que 10");
		}else {
			System.out.println("numero nao valido");
		}
		
		/*5) Verifique se A é maior que 10 ou se A mais B é igual a 20, se verdade
		imprima: "número válido". Caso as afirmações não sejam verdadeiras,
		imprima: "número não válido".*/
		System.out.println("\nQuestao 05");
		if(a>10 || a+b==20) {
			System.out.println("numero valido");
		}else{
			System.out.println("numero nao valido");
		}
		
		/*6) Verifique se A é maior que 10, se verdade imprima: "A > 10" caso não
		seja, imprima: "A <= 10". Verifique se A mais B é igual a 20, se
		verdadeiro, imprima: "A + B == 20”, caso não seja imprima: “A + B !=
		20”.*/
		System.out.println("\nQuestao 06");
		if(a>10){
			System.out.println("A > 10");
		}else{
			System.out.println("A <= 10");
		}
		if(a+b==20){
			System.out.println("A + B == 20");
		}else{
			System.out.println("A + B !=20");
		}
		
		/*7) Verifique se A é maior que 10 ou se o A mais B é igual a 20, caso sejam
		verdadeiras as afirmações imprima: "números válidos”. Caso a primeira
		afirmação não seja verdadeira, imprima: "número não válido".*/
		System.out.println("\nQuestao 07");
		if(a>10 || a+b==20) {
			System.out.println("numeros validos");
		}else{
			System.out.println("numeros nao validos");
		}
		
		/*8) Verifique se A é maior que 10, se verdade imprima: "A > 10" e verifique
		se A mais B é igual a 20, se verdadeiro, imprima: "A + B == 20” se não
		for verdade: imprima "número não válido.*/
		System.out.println("\nQuestao 08");
		if(a>10){
			System.out.println("A > 10");
		}
		if(a+b==20){
			System.out.println("A + B == 20");
		}else{
			System.out.println("numero nao valido ");
		}
		
		/*9) Verifique se A é maior que 10 e verifique se A mais B é igual a 20, se
		verdadeiro, imprima: "A + B == 20". Caso as afirmações não forem verdadeiras
		 imprima: "número não válido".*/
		System.out.println("\nQuestao 09");
		if(a>10 & a+b==20){
			System.out.println("A + B == 20");
		}else{
			System.out.println("numero nao valido");
		}
		
		/*10)Verifique se A é maior que 10 se não for imprima: "número menor que
		10". Verifique se A mais B é igual a 20 se não for verdade imprima
		"número diferente de 20".*/
		System.out.println("\nQuestao 10");
		if(!(a>10)){
			System.out.println("numero menor que 10");
		}
		if(!(a+b==20)) {
			System.out.println("numero diferente de 20");
		}
		
		/*11)Verifique se A é maior que 10 se não for verifique se A mais B é igual a
		20, imprima: "A + B == 20''. Caso A não seja maior que 10 e A mais B
		for diferente de 20, imprima: "número não válido".*/
		System.out.println("\nQuestao 11");
		if(!(a>10)){
			if(a+b==20){
				System.out.println("A + B == 20");
			}else {
				System.out.println("numero nao valido");
			}
		}
		
		/*12) Verifique se A é maior que 10 imprima: "A > 10" ou verifique se A mais
		B é igual a 20, imprima: "A + B == 20'', caso as afirmações não sejam
		verdadeiras, imprima: "números não válidos". Sejam as afirmações
		anteriores falsas ou verdadeiras imprima: “Sejam bem-vindos à
		disciplina de Técnicas de Programação”.*/
		System.out.println("\nQuestao 12");
		if(a>10){
			System.out.println("A > 10");
			if(a+b==20){
				System.out.println("A + B == 20");
			}else {
				System.out.println("numeros nao validos");
			}
		}else{
			System.out.println("numeros nao validos");
		}
		System.out.println("Sejam bem-vindos a disciplina de Tecnicas de Programacao");
		
		/*13) Verifique se A é maior que 10, se verdade imprima: "A > 10". Ainda,
		verifique se o A mais B é igual a 20, se verdade imprima: "A + B == 20”.
		Caso as afirmações não sejam verdadeiras, imprima: "números não
		válidos".*/
		System.out.println("\nQuestao 13");
		if(a>10){
			System.out.println("A > 10");
			if(a+b==20){
				System.out.println("A + B == 20");
			}else {
				System.out.println("numeros nao validos");
			}
		}else{
			System.out.println("numeros nao validos");
		}
		
	}

}
