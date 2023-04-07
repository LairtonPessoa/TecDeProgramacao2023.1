package praticasEmAula;



public class Recursividade {
	
	public static int funcaoExponencial(int base, int expoente) {
		if(expoente==1)
			return base;
		return base*funcaoExponencial(base, expoente-1);
	}
	
	public static void main(String[] args) {
		System.out.println("10 elevado a 3="+funcaoExponencial(10, 3));
		
		//forma de criar um array, pois array não é tipo primitivo, e sim objeto
		int array[]=new int[10];
		array[0]=1;
		array[1]=12;
		array[2]=13;
		array[3]=1547;
		array[4]=1152;
		array[5]=1788;
		array[6]=5781;
		array[7]=21;
		array[8]=5;
		array[9]=0;

		for (int i = 0; i < array.length; i++) {
			System.out.println("posicao "+ i + " "+array[i]);
		}
	}

}
