package questao_03;

import java.util.ArrayList;

public class Fatura {

	protected ArrayList<Item> listaDeItems;
	private double faturaTotal;
	
	public Fatura() {
		listaDeItems = new ArrayList<Item>();
	}
	public void addItemToFatura(Item item) {
		listaDeItems.add(item);
	}
	
	public double getValorFatura() {
		faturaTotal=0;
		for(int i=0;i<listaDeItems.size();i++) {
			faturaTotal+=(listaDeItems.get(i).getUnitPrice()*listaDeItems.get(i).getQuantidade());
		}
		return faturaTotal;
	}
	
	public double descontoFatura(double porcentagem) {
		faturaTotal-=(faturaTotal*porcentagem);
		return faturaTotal;
	}
}