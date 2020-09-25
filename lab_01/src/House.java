public class House {
    int id;
    int apartment_number;
    int area;
    int level;
    int number_of_rooms;
    String street;
    String building_type;
    int lifetime_in_years;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getApartment_number() {
        return apartment_number;
    }

    public void setApartment_number(int apartment_number) {
        this.apartment_number = apartment_number;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getNumber_of_rooms() {
        return number_of_rooms;
    }

    public void setNumber_of_rooms(int number_of_rooms) {
        this.number_of_rooms = number_of_rooms;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuilding_type() {
        return building_type;
    }

    public void setBuilding_type(String building_type) {
        this.building_type = building_type;
    }

    public int getLifetime_in_years() {
        return lifetime_in_years;
    }

    public void setLifetime_in_years(int lifetime_in_years) {
        this.lifetime_in_years = lifetime_in_years;
    }

    public House(int id, int apartment_number, int area, int level,
                 int number_of_rooms, String street, String building_type, int lifetime_in_years)
    {
        this.id = id;
        this.apartment_number = apartment_number;
        this.area = area;
        this.level = level;
        this.number_of_rooms = number_of_rooms;
        this.street = street;
        this.building_type = building_type;
        this.lifetime_in_years = lifetime_in_years;
    }

    @Override
    public String toString() {
        return "House {" +
                "id= " + id +
                ", apartment_number= " + apartment_number  +
                ", area= " + area +
                ", level= " + level +
                ", number_of_rooms= " + number_of_rooms +
                ", street= " + street +
                ", building_type =" + building_type +
                ", lifetime_in_years= " + lifetime_in_years +
                '}';
    }
};


