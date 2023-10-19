package com.parsing.jsontoxml;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.XML;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class App 
{
    public static void main( String[] args ) throws IOException, ParseException
    {
    	JSONParser parser = new JSONParser();
			JSONObject jsonObject =(JSONObject) parser.parse(new FileReader("json\\data.json"));
			String jsonString = JSONObject.toJSONString(jsonObject);
			String xmlString = XML.toString(jsonString,"employeeDetails");
			
			FileWriter writer = new FileWriter("xmldata.xml");
			writer.write(xmlString);
			System.out.println("writing in file");
			writer.close();
			System.out.println("completed");
    }
}
