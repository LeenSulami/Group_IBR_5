package cpit251;
public class City {

    private String Cityname;
    private String Section;
    private String Weather;

    public City() {
    }

    public City(String name, String s, String w) {
        Cityname = name;
        Section = s;
        Weather = w;
    }

    public String getCityname() {
        return Cityname;
    }

    public void setCityname(String name) {
        this.Cityname = name;
    }

    public String getSection() {
        return Section;
    }

    public void setSection(String s) {
        this.Section = s;
    }

    public String getWeather() {
        return Weather;
    }

    public void setWeather(String w) {
        this.Weather = w;
    }

    // Display City Information
    public String City() {
        return "----------------------"
                + "\n          City      "
                + "\n----------------------"
                + "\n- City Name: " + getCityname()
                + "\n- Section: " + getSection()
                + "\n- Weather: " + getWeather();
    }
}
