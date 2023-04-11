package COUNTRY;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

	public class CountryInfoUnitTest {
	    
	    @Test
	    public void testGetCapital() {
	        CountryInfo canada = new CountryInfo("Canada", "Ottawa", new String[]{"Toronto", "Vancouver", "Montreal"}, "Beaver");
	        assertEquals("Ottawa", canada.getCapital());
	    }
	    
	    @Test
	    public void testGetTopCities() {
	        CountryInfo usa = new CountryInfo("United States", "Washington D.C.", new String[]{"New York", "Los Angeles", "Chicago"}, "Bald Eagle");
	        assertArrayEquals(new String[]{"New York", "Los Angeles", "Chicago"}, usa.getTopCities());
	    }
	    
	    @Test
	    public void testGetgetNationalAnimal() {
	        CountryInfo india = new CountryInfo("India", "Delhi", new String[]{"Hyderabad", "Chennai", "Bombay"}, "Tiger");
	        assertEquals("Tiger", india.getNationalAnimal());
	    }
	  
	}

