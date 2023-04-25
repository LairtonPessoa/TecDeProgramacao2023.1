package questao_04;

public class Produto {

	private String name;
	private float price;
	private int quantity;
	protected boolean isSold;
	
	public Produto(String name, double price) {
		this.name=name;
		if(price<=100) {
			this.price=(float) price;
		}else if(price>100 && price<=200){
			this.price=(float) (price*0.9);
		}else if(price>200 && price <=500) {
			this.price=(float) (price*0.8);
		}else if(price>500) {
			this.price=(float) (price*0.75);
		}
		isSold=false;
	}
	
	public void comprarProduto(Produto produto, int quantity) {
		this.quantity=quantity;
		produto.isSold=true;
		
		System.out.println(produto.name + "     \t" + produto.quantity + " x " + produto.price + " = " + produto.quantity*produto.price);
	}
	
	
	
}
