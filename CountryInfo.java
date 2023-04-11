package COUNTRY;

import java.util.Arrays;

public class CountryInfo {
    private String country;
    private String capital;
    private String[] topCities;
    private String nationalAnimal;

    public CountryInfo(String country, String capital, String[] topCities, String nationalAnimal) {
        this.country = country;
        this.capital = capital;
        this.topCities = topCities;
        this.nationalAnimal = nationalAnimal;
    }

    public String getCountry() {
        return country;
    }

    public String getCapital() {
        return capital;
    }

    public String[] getTopCities() {
        return topCities;
    }

    public String getNationalAnimal() {
        return nationalAnimal;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setTopCities(String[] topCities) {
        this.topCities = topCities;
    }

    public void setNationalAnimal(String nationalAnimal) {
        this.nationalAnimal = nationalAnimal;
    }

    @Override
    public String toString() {
        return "CountryInfo{" +
                "country='" + country + '\'' +
                ", capital='" + capital + '\'' +
                ", topCities=" + Arrays.toString(topCities) +
                ", nationalAnimal='" + nationalAnimal + '\'' +
                '}';
    }
}
