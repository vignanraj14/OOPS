package COUNTRY;

import java.util.Arrays;

public class CountryInfoApp {

    public static void main(String[] args) {
    	CountryInfo india = new CountryInfo("India", "Delhi", new String[]{"Hyderabad", "Chennai", "Bombay"}, "Tiger");
        CountryInfo canada = new CountryInfo("Canada", "Ottawa", new String[]{"Toronto", "Vancouver", "Montreal"}, "Beaver");
        CountryInfo usa = new CountryInfo("United States", "WashingtonDc", new String[]{"New York", "Los Angeles", "Chicago"}, "Bald Eagle");
        
        System.out.println("India:");
        System.out.println("Capital: " + india.getCapital());
        System.out.println("Top Cities: " + Arrays.toString(india.getTopCities()));
        System.out.println("National Animal: " + india.getNationalAnimal());
        
        System.out.println("Canada:");
        System.out.println("Capital: " + canada.getCapital());
        System.out.println("Top Cities: " + Arrays.toString(canada.getTopCities()));
        System.out.println("National Animal: " + canada.getNationalAnimal());

        System.out.println("USA:");
        System.out.println("Capital: " + usa.getCapital());
        System.out.println("Top Cities: " + Arrays.toString(usa.getTopCities()));
        System.out.println("National Animal: " + usa.getNationalAnimal());
        
        
    }
}
