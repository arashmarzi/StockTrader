package user;

import java.io.*;

public class Player {
	// holds player's name
	private String name; 
	// holds player's capital
	private double capital;
	/* dynamic array with each element representing a company */
	private int[] numOfStocks; 
	/* dynamic array with each element representing a company */
	private String[] stockCompanies;
	// holds players total profits based on stocks
	private double totalProfit;
	
	public boolean buyCompanyStock(){
		
	}
	
	public boolean sellCompanyStock(){
		
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
	 * @return the numOfStocks
	 */
	public int[] getNumOfStocks() {
		return numOfStocks;
	}

	/**
	 * @param numOfStocks the numOfStocks to set
	 */
	public void setNumOfStocks(int[] numOfStocks) {
		this.numOfStocks = numOfStocks;
	}

	/**
	 * @return the stockCompanies
	 */
	public String[] getStockCompanies() {
		return stockCompanies;
	}

	/**
	 * @param stockCompanies the stockCompanies to set
	 */
	public void setStockCompanies(String[] stockCompanies) {
		this.stockCompanies = stockCompanies;
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
