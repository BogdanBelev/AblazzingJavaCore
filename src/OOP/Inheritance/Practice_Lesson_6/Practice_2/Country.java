package OOP.Inheritance.Practice_Lesson_6.Practice_2;

public class Country {
    private final long numberOfPeople;
    private final String languageOfCountry;
    private final String continentOfCountry;

    public Country(long numberOfPeople, String languageOfCountry, String continentOfCountry) {
        this.numberOfPeople = numberOfPeople;
        this.languageOfCountry = languageOfCountry;
        this.continentOfCountry = continentOfCountry;
    }

    public long getNumberOfPeople() {
        return numberOfPeople;
    }

    public String getLanguageOfCountry() {
        return languageOfCountry;
    }

    public String getContinentOfCountry() {
        return continentOfCountry;
    }
}
