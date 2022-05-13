package processing.sketches;

public class Castle {

    private String name;
    private int population;
    private String zipcode;
    private float area;
    private String landmark;
    private boolean isCapitol;
    private float latitude;
    private float longitude;

    public Castle(String name, int population, String zipcode, float area, String landmark, boolean isCapitol, float latitude, float longitude) {
        this.name = name;
        this.population = population;
        this.zipcode = zipcode;
        this.area = area;
        this.landmark = landmark;
        this.isCapitol = isCapitol;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public boolean isCapitol() {
        return isCapitol;
    }

    public void setCapitol(boolean capitol) {
        isCapitol = capitol;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }
}
