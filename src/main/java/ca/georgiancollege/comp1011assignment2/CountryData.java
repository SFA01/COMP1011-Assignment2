package ca.georgiancollege.comp1011assignment2;

public class CountryData {

    //Here I am doing my private instance members
    private String Code;
    private String name;
    private String continent;
    private String region;
    private int population;

    //Here I am doing my constructions
    public CountryData(String code, String name, String continent, String region, int population) {
        setCode(code);
        setName(name);
        setContinent(continent);
        setRegion(region);
        setPopulation(population);
    }

    //Here I am doing my getters and setters
    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        this.Code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
