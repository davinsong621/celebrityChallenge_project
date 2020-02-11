package com.project.celebrityChallenge;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Properties;
import java.util.stream.Collectors;

import com.project.celebrityChallenge.model.Member;

/**
 * @author davinsongomez
 *
 */
public class App {
	
	private static final String STRING_YES = "yes";
	private static final String STRING_EMPTY = "Not Found";
	private static final String STRING_PATH = "resources/data.properties";

	public static void main(String[] args) {
		List<Member> teamList;
		try {
			// Load 5 members from file properties
			teamList = loadMembers();
			// Print the celebrity
			System.out.println("Celebrity : " + findCelebrity(teamList));
		} catch ( IOException log) {
			System.out.println("Error - "+log.getMessage()+ "Celebrity : " + STRING_EMPTY);
		}
	}
	
	private static List <Member> loadMembers() throws IOException{
		List<Member> listAux = new ArrayList<>();
		Properties prop = new Properties();
		Member aux;
		
		InputStream inputStream = App.class.getClassLoader().getResourceAsStream(STRING_PATH);
		 
		if (inputStream != null) {
			prop.load(inputStream);
		} else {
			throw new FileNotFoundException("property file '" + STRING_PATH + "' not found in the classpath");
		}
		for(int i=0;i<5;i++) {
			aux=new Member();
			// get the property value and set in new model
			aux.setName(prop.getProperty("name"+String.valueOf(i)));
			aux.setLastname(prop.getProperty("lastname"+String.valueOf(i)));
			aux.setRole(prop.getProperty("role"+String.valueOf(i)));
			aux.setKnowAnybody(prop.getProperty("knowAny"+String.valueOf(i)).toLowerCase().equals(STRING_YES));
			aux.setKnownPerson(prop.getProperty("knowPerson"+String.valueOf(i)));
			listAux.add(aux);
		}
		return listAux;
	}
	
	private static String findCelebrity(List<Member> listAux)
	{
		// Group by members that more know any person
		Map<String, Long> commonness = listAux.stream()
	            .collect(Collectors.groupingBy(Member::getKnownPerson, Collectors.counting()));
		// Find the max repetitions have 
	    Optional<String> mostCommon = commonness.entrySet().stream()
	            .max(Map.Entry.comparingByValue()).map(Map.Entry::getKey);
	    return mostCommon.orElse(STRING_EMPTY);
	}
	
}
