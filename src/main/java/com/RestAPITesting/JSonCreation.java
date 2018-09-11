package com.RestAPITesting;

import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;

public class JSonCreation {
	
	JSONArray jArr = new JSONArray();
	JSONObject jObj = new JSONObject() ;
	
	public  static void main(String [] args){
		JSonCreation j = new JSonCreation();
		j.createJSON();
	}
	
	public void createJSON(){
		jArr.add("Java");
		jArr.add("C++");
		jArr.add("Python");

		jObj.put("firstname", "dheeraj");
		jObj.put("lastname", "gupta");
		jObj.put("courses", jArr);
		
		System.out.println(jObj.toString());
	
	
	}

}
