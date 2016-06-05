package main;

import java.util.HashMap;
import java.util.Map.Entry;

public class Bigram {

	public static void main(String[] args) {
		HashMap<String, Integer> mapa = new HashMap<>();
		String string = "abbcceeeeeeabcc";
		
		for(int i=1; i<string.length(); i++){
			if(!mapa.containsKey(string.substring(i-1, i+1)))
				mapa.put(string.substring(i-1, i+1), 1);
			else
				mapa.replace(string.substring(i-1, i+1), mapa.get(string.substring(i-1, i+1))+1);
		}
		
		for(Entry<String, Integer> entry : mapa.entrySet()){
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

}
