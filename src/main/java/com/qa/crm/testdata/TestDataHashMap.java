package com.qa.crm.testdata;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestDataHashMap {

	public List<HashMap<String, String>> getDatafromHashMap() throws IOException
	{
		
		String data=Files.readString(Paths.get("E:\\seleniumframework\\src\\main\\java\\com\\qa\\crm\\testdata\\datafromhashmap.json"));
		
		ObjectMapper om=new ObjectMapper();
		TypeReference<List<HashMap<String,String>>> type=new TypeReference<List<HashMap<String,String>>>() {
		};
		List<HashMap<String, String>> data1=om.readValue(data,  type);
		
		return data1;
	}
	
}
