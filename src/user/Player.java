package user;

public class Player {
	// holds player's name
	private String name; 
	// holds player's capital
	private double capital;
	// array with elements holding company names
	private String[] companyNames;
	// array with elements holding stock owned of companys in companyNames
	private int[] companyStock;
	// holds players total profits based on stocks
	private double totalProfit;
	
	Player(String name) {
		this.name = name;
		this.capital = 1000;
		this.companyNames = new String[10];
		this.companyStock = new int[10];
		this.totalProfit = 0;
		
	}
	
	/* buy stock from a company */
	public boolean buyCompanyStock(String companyName, int numStocksBought, double price){
		// check to see if stock from company is already owned
		
		return true;
	}
	
	/* sell owned stock of a company*/
	public boolean sellCompanyStock(String companyName, int numStocksSold, double price){
		return true;
	}
	
	

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the capital
	 */
	public double getCapital() {
		return capital;
	}

	/**
	 * @param capital the capital to set
	 */
	public void setCapital(double capital) {
		this.capital = capital;
	}

	/**
	 * @return the totalProfit
	 */
	public double getTotalProfit() {
		return totalProfit;
	}

	/**
	 * @param totalProfit the totalProfit to set
	 */
	public void setTotalProfit(double totalProfit) {
		this.totalProfit = totalProfit;
	}
	
	
}
