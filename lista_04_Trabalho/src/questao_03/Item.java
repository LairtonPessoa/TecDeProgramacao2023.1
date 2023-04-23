package questao_03;

public final class Item {

	private int itemNumber;
	private String itemDescription;
	private int quantidade;
	private double unitPrice;
	
	public Item(int itemNumber, String itemDescription, int quantidade, double unitPrice) {
		if(quantidade<0)
			this.quantidade=0;
		else
			this.quantidade=quantidade;
		if(unitPrice<0)
			this.unitPrice=0.0;
		else
			this.unitPrice=unitPrice;
		this.itemNumber=itemNumber;
		this.itemDescription=itemDescription;
	}

	public int getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	
	
}
