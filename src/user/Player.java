package user;

import java.util.*;

public class Player {
	// holds player's name
	private String name; 
	// holds player's capital
	private double capital;
	/* dynamic array with each element representing a company */
	
	// holds players total profits based on stocks
	private double totalProfit;
	
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
