package ch05.quiz;

/**
 * Name:Trader
 * Desc :
 * Developer :82108
 * Date : 2019-06-07
 * Time : 오후 10:19
 */
public class Trader {
    private final String name;
    private final String city;

    public Trader(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String
    toString() {
        return "Trader{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
