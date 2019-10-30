package com.practicaljava.lesson27;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StockQuoteGenerator  {
	private ArrayList<String> stocks = new ArrayList<>();
	
	private Random randomGenerator = new Random();
	
	public StockQuoteGenerator(){
		stocks.add("AAPL");
		stocks.add("MSFT");
		stocks.add("YAHOO");
		stocks.add("AMZN");
	}
	
	public String getPrice (String symbol){
		double price;
		
		if(stocks.indexOf(symbol.toUpperCase()) !=-1){
			price = randomGenerator.nextDouble();
			return "" + price;
		}else{
			return "Stock symbol is not supported";
		}
	}
	
	public List<String> getSymbols(){
		return stocks;
	
}
}
