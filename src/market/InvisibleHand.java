package market;

import java.util.Random;


public class InvisibleHand {
	public enum State {
	    UP, DOWN, NEUTRAL; 
	}
	
	private State marketState;
	private Random generator;
	
	/**
	 * @param marketState
	 */
	public InvisibleHand() {
		this.marketState = State.NEUTRAL;
		generator = new Random(System.currentTimeMillis());
		
	}

	public double randomValueGen(){
		return generator.nextDouble();
	}
	
	/**
	 * @return the marketState
	 */
	public State getMarketState() {
		return marketState;
	}

	/**
	 * @param marketState the marketState to set
	 */
	public void setMarketState(State marketState) {
		this.marketState = marketState;
	}
}
