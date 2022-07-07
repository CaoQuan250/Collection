package Collection.Bai3;



import java.util.*;

public class CityList {
    private List<City> cities;

    public CityList(){
        this.cities = new ArrayList<>();
    }

    public void add(City city){
        this.cities.add(city);
    }

    public void sort(){
        cities.sort(Comparator.comparingInt(City::getCityID));
        cities.forEach(System.out::println);
    }
    public void show(){
        this.cities.forEach(o -> System.out.println(o.toString()));
    }

    public void remove(){
        cities.removeIf(city -> city.getCityID() % 2 != 0);
    }
}
