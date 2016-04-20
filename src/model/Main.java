package model;

import java.text.NumberFormat;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		Locale usa = Locale.US;
		Locale uk = Locale.UK;
		Locale def = Locale.FRANCE;
		
		Set<Locale> locales = new HashSet<Locale>();
		Set<NumberFormat> numForm = new HashSet<NumberFormat>();
		Set<NumberFormat> currForm = new HashSet<NumberFormat>();
		
		
		
		locales.add(usa);
		locales.add(uk);
		locales.add(def);
		
		for (Locale loc : locales) {
			numForm.add(NumberFormat.getNumberInstance(loc));
			currForm.add(NumberFormat.getCurrencyInstance(loc));
		}
		
		
		double amount = 4548.15;
		double percent = .74;
		
		for (NumberFormat nf : currForm) {
			System.out.println(nf.format(amount));
		}
		
		
		String pattern1 = "[Hh]ello";
		String pattern2 = pattern1+"(\\s?|(\\s\\w*))";
		
		
		String patternMatricule = "[1-9OTQM]-[A-Z]{3}-[0-9]{3}";
		
		
		//String[] plaques = {"1-AAA-123", "1-AAA-1234", "Q-AAA-123", "Q-AaA-123", " 1-AAA-143"}
		
		String patPostCode = "(B-)?[1-9][0-9]{3}\\s(\\w+-?)+";
		String[] postcodes = {"B-1030 Sch dfd", "B-1030 Sch", "10325 gtrr", "1030 sint-jost-ten-noode", " 1-AAA-143"};
		Pattern pattCompiled = Pattern.compile(patPostCode);
		for (String st : postcodes) {
			System.out.print(st+": ");
			System.out.println(pattCompiled.matcher(st).matches());
			
		}
		
		String patName = "([A-Z][a-zéèùàç]+[\\s-]?){1,3}";
		String patBirthdate = "[0-3][0-9]-[01][0-9]-[12][089][0-9]{2}";
		String[] names =  {"Stéphane Van Erp 14-01-1970" ,
				"Eric Cantona 24-05-1966",
				"Paul-Henry Spaak 25-01-1899",
				"Erica Cantona Hayek 02-12-1975"
		};
		
		
		
		
		pattCompiled = Pattern.compile(patName+patBirthdate);
		for (String st : names) {
			System.out.print(st+": ");
			System.out.println(pattCompiled.matcher(st).matches()); }
	
	
	}

}
