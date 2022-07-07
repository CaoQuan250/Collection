package Collection.Bai3;

public class City {
    private int cityID;
    private String name;

    public City(int cityID, String name) {
        this.cityID = cityID;
        this.name = name;
    }
    public int getCityID() {
        return cityID;
    }
    public void setCityID(int cityID) {
        this.cityID = cityID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void printName() {
        System.out.printf("%s\n",getName());
    }

    @Override
    public String toString() {
        return "ID: " + cityID + " - Name: " + name ;
    }

}
