package main;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class Bigram {

	public static void main(String[] args) {
		HashMap<String, Integer> mapa = new HashMap<>();
		String string = "abbcceeeeeeabcc";
		Scanner IN = new Scanner(System.in);
		
		for(int i=1; i<string.length(); i++){
			if(!mapa.containsKey(string.substring(i-1, i+1)))
				mapa.put(string.substring(i-1, i+1), 1);
			else
				mapa.replace(string.substring(i-1, i+1), mapa.get(string.substring(i-1, i+1))+1);
		}
		
		for(Entry<String, Integer> entry : mapa.entrySet()){
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		String poruka = IN.nextLine();
		char sledece = ' ';
		
		for(int i=0; i<3; i++){
			int max = 0;
			for(Entry<String, Integer> entry : mapa.entrySet()){
				if(entry.getKey().charAt(0) == poruka.charAt(poruka.length()-1) && entry.getValue() > max){
					sledece = entry.getKey().charAt(1);
					max = entry.getValue();
				}
			}
			poruka = poruka + sledece;
		}
		
		System.out.println(poruka);
	}

}
