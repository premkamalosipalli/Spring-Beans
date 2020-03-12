package com.spring.springdemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomFortuneService implements FortuneService {
	
	private Random random=new Random();
	
	private String[] data= {"this is data for random fortune 1","this is data for random fortune 2","this is random fortune 3"};
	
	/*private String fileName="/Users/premk/eclipse-workspace/spring_demo/src/randomtext";
	

	List<String> randomFortune=new ArrayList<String>();
	
	Random random=new Random();
	public RandomFortuneService() {
		try {
			BufferedReader reader=new BufferedReader(new FileReader(fileName));
			String line;
			while((line=reader.readLine())!=null) {
				randomFortune.add(line);
			}
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
	
	@Override
	public String getFortune() {
		
		//int index=random.nextInt(randomFortune.size());
		//String randomline=randomFortune.get(index);
		//return randomline;
		
		int index=random.nextInt(data.length);
		String theFortune=data[index];
		return theFortune;
		
	}
	
	public String destroy() {
		return "this is destroy scope";
		}

}
