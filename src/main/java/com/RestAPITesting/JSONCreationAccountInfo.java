package com.RestAPITesting;

import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;

public class JSONCreationAccountInfo {
	JSONObject jAccount = new JSONObject() ;
	JSONObject jPortfolio = new JSONObject() ;
	JSONObject jPortfolio2 = new JSONObject() ;
	JSONObject jHoldings = new JSONObject() ;
	JSONObject jSecurity = new JSONObject() ;
	
	JSONArray jAccountList = new JSONArray() ;
	JSONArray jPortfolioList = new JSONArray() ;
	JSONArray jHoldingsList = new JSONArray() ;
	JSONArray jSecurityList = new JSONArray() ;
	
	
	public  static void main(String [] args){
		JSONCreationAccountInfo j = new JSONCreationAccountInfo();
		j.createJSON();
	}
	
	public void createJSON(){
		jAccount.put("accountID", "1939");
		jAccount.put("accountName", "Baypond");
		jAccount.put("accountCurrency", "USD");
		jAccount.put("accountPrimaryManager", "Dheeraj");
		
		jPortfolio.put("portfolioID", "193901");
		jPortfolio.put("portfolioName", "Baypond equity");
		jPortfolio.put("portfolioCurrency", "USD");
		jPortfolio.put("portfolioPrimaryMamager", "Shalini");
		jPortfolio.put("portfolioType", "Equity");
		
		jPortfolio2.put("portfolioID", "193902");
		jPortfolio2.put("portfolioName", "Baypond Fixed Income");
		jPortfolio2.put("portfolioCurrency", "USD");
		jPortfolio2.put("portfolioPrimaryMamager", "Ishika");
		jPortfolio2.put("portfolioType", "Fixed Income");
				
		jPortfolioList.add(jPortfolio);
		jPortfolioList.add(jPortfolio2);	
		
		jAccount.put("portfolio", jPortfolioList);
		
		System.out.println(jAccount.toString());
		
	}
}
