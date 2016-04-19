package model;

import java.text.NumberFormat;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

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
		
		
	}

}
