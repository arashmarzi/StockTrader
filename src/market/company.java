package market;

public class Company {
	public static final String[] AllCompanyNames = {"Nuclear Energy Corp.", "Bay Steel Inc.", "Regional Mining", "AgriCorp Resources"};
	public static final String[] AllCompanySymbols = {"NEC", "BSI", "RMG", "ACR"};
	public static final int totalNumberOfCompanies = AllCompanyNames.length;
	private String name;
	private int totalStock;
	private int sellableStock;
	private double stockPrice;
	private InvisibleHand hand;

	/**
	 * @param name
	 * @param totalStock
	 * @param sellableStock
	 * @param stockPrice
	 * @param hand
	 */
	public Company(String name, int totalStock, int sellableStock,
			double stockPrice, InvisibleHand hand) {
		this.name = name;
		this.totalStock = totalStock;
		this.sellableStock = sellableStock;
		this.stockPrice = stockPrice;
		this.hand = hand;
	}

	public void generateStockPrice() {
		double newPrice = this.hand.randomValueGen();
		
		// must fine tune adjustment factors to be more practical; prevent immense exponential growth
		if (this.hand.getMarketState() == InvisibleHand.State.NEUTRAL) {
			double rand = this.hand.randomValueGen();
			if (rand % 2 == 0) {
				this.stockPrice -= this.stockPrice * 0.025;
			} else {
				this.stockPrice += this.stockPrice * 0.025;
			}
		} else if (this.hand.getMarketState() == InvisibleHand.State.DOWN
				&& this.stockPrice - newPrice >= 0) {
			this.stockPrice -= newPrice;
		} else if (this.hand.getMarketState() == InvisibleHand.State.UP) {
			this.stockPrice += newPrice;
		}
	}

	public InvisibleHand.State getMarketState(){
		return this.hand.getMarketState();
	}
	
	public void setMarketState(InvisibleHand.State state) {
		this.hand.setMarketState(state);
	}
	
	/**
	 * @return the hand
	 */
	public InvisibleHand getHand() {
		return hand;
	}

	/**
	 * @param hand
	 *            the hand to set
	 */
	public void setHand(InvisibleHand hand) {
		this.hand = hand;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the totalStock
	 */
	public int getTotalStock() {
		return totalStock;
	}

	/**
	 * @param totalStock
	 *            the totalStock to set
	 */
	public void setTotalStock(int totalStock) {
		this.totalStock = totalStock;
	}

	/**
	 * @return the sellableStock
	 */
	public int getSellableStock() {
		return sellableStock;
	}

	/**
	 * @param sellableStock
	 *            the sellableStock to set
	 */
	public void setSellableStock(int sellableStock) {
		this.sellableStock = sellableStock;
	}

	/**
	 * @return the stockPrice
	 */
	public double getStockPrice() {
		return stockPrice;
	}

	/**
	 * @param stockPrice
	 *            the stockPrice to set
	 */
	public void setStockPrice(double stockPrice) {
		this.stockPrice = stockPrice;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Company [name=" + name + ", totalStock=" + totalStock
				+ ", sellableStock=" + sellableStock + ", stockPrice="
				+ stockPrice + ", state=" + hand.getMarketState() + "]";
	}
	
	

}
