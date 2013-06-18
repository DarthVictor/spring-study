package com.apress.prospring3.ch4;

public class BookwormOracle implements Oracle {

	private Encyclopedia encyclopedia;
	
	public void setEncyclopedia(Encyclopedia encyclopedia)
	{
		this.encyclopedia = encyclopedia;
	}
	
	
	public String defineMeaningOfLife() {
		return "Encyclopedias are a waste of money - use the Internet";
	}

}
