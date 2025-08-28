package sumitframework.basepackage;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReeadData {

	public static List<HashMap<String, String>> readData(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File s= new File("E:\\seleniumframework\\data.json");
		
		byte[] bytes=Files.readAllBytes(Paths.get("E:\\seleniumframework\\data.json"));
		
		String ts=new String(bytes);
		ObjectMapper om=new ObjectMapper();
		TypeReference<List<HashMap<String,String>>> type=new TypeReference<List<HashMap<String,String>>>() {
		};
		List<HashMap<String, String>> listmap=om.readValue(ts, type);
		
		return listmap;
		

	}
	
	

}
