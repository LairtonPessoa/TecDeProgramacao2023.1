package questao_17;

public class Plano {

	protected String grade[][];
	private String simbolo1;
	private String simbolo2;
	
	public Plano() {
		grade = new String[3][3];
		
	}
	
	
	public String exibirPlano() {
		String aux="    y0\t   y1\t   y2\n";
		aux+="  \t|\t|\n";
		if(grade[0][0]!=null)
			aux+="x0   "+grade[0][0];
		else
			aux+="x0    ";
		if(grade[0][1]!=null)
			aux+="\t|   " + grade[0][1]+ "  ";
		else
			aux+="\t|      ";
		if(grade[0][2]!=null)
			aux+="\t|   " + grade[0][2] + "     \n";
		else
			aux+="\t|         \n";
		aux+="  \t|\t|\n";
		
		aux+="  ----------------------\n";
		aux+="  \t|\t|\n";
		if(grade[1][0]!=null)
			aux+="x1   "+grade[1][0];
		else
			aux+="x1    ";
		if(grade[1][1]!=null)
			aux+="\t|   " + grade[1][1]+ "  ";
		else
			aux+="\t|      ";
		if(grade[1][2]!=null)
			aux+="\t|   " + grade[1][2] + "     \n";
		else
			aux+="\t|         \n";
		aux+="  \t|\t|\n";
		
		aux+="  ----------------------\n";
		aux+="  \t|\t|\n";
		if(grade[2][0]!=null)
			aux+="x2   "+grade[2][0];
		else
			aux+="x2    ";
		if(grade[2][1]!=null)
			aux+="\t|   " + grade[2][1]+ "  ";
		else
			aux+="\t|      ";
		if(grade[2][2]!=null)
			aux+="\t|   " + grade[2][2] + "     \n";
		else
			aux+="\t|         \n";
		aux+="  \t|\t|\n";
		
		return aux;
	}

	public String getSimbolo1() {
		return simbolo1;
	}
	
	public void setSimbolo1(String simbolo1) {
		this.simbolo1=simbolo1;
	}

	public String getSimbolo2() {
		return simbolo2;
	}
	
	public void setSimbolo2(String simbolo2) {
		this.simbolo2=simbolo2;
	}

}
