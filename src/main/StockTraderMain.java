package main;

import market.*;

public class StockTraderMain {

	public static void main(String[] args) {
		// create company array
		Company[] company = new Company[Company.AllCompanyNames.length];
		for (int i = 0; i < Company.totalNumberOfCompanies; i++) {
			company[i] = new Company(Company.AllCompanyNames[i], 30, 20, 10,
					new InvisibleHand());
			System.out.println(company[i].toString());
		}
		
		/*for (int i = 0; i < 100; i++) {
			if (i % 4 == 0) {
				if (company.getMarketState() == InvisibleHand.State.NEUTRAL) {
					company.setMarketState(InvisibleHand.State.UP);
				} else if (company.getMarketState() == InvisibleHand.State.UP) {
					company.setMarketState(InvisibleHand.State.DOWN);
				} else if (company.getMarketState() == InvisibleHand.State.DOWN) {
					company.setMarketState(InvisibleHand.State.NEUTRAL);
				}
			}
			// System.out.print("The company is now " +
			// company.getHand().getMarketState());
			company.generateStockPrice();
			// System.out.println("\tStock price is " +
			// company.getStockPrice());
			System.out.println(company.getStockPrice());
		}*/

	}

}
