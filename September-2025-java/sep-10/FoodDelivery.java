class FoodDelivery{

	private String itemName;
	private double price;
	private String category;
	
	public void setItemName(String itemName){
			this.itemName = itemName;
	}
	
	public void setPrice(double price){
		if(price > 0.0){
			this.price = price ;
		}
		else{
			System.err.println("kindly provide correct Value");
			System.exit(0);
		}
		
	}
	
	public void setCategory(String category){
		
			this.category = category;
			
	}
	
	
	public String getItemName(){
		return itemName;
	}
	
	public double getPrice(){
		return price;
	}
	
	public String getCategory(){
			return category;
	}
	
	
}

