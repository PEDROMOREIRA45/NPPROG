package AAA_Project.domain;

public class Location {

    /**
     * Shows the Location's Street
     */
    private String street;

    /**
     * Shows the Location's Zip Code
     */
    private String zip;

    /**
     * Shows the Location's State in USA
     */
    private String state;

    /**
     * Shows the Location's City
     */
    private String city;

    /**
     * Shows the Location's District
     */
    private String district;

    /**
     * Creates instance with
     *
     * @param street   Location's Street
     * @param zip      Location's Zip Code
     * @param state    Location's State in USA
     * @param city     Location's City
     * @param district Location's District
     */
    public Location(String street, String zip, String state, String city, String district) {
        if (!validateLocation(street, zip, state, city, district))
            throw new IllegalArgumentException("Location arguments are not valid, please try again.");
        this.street = street;
        this.zip = zip;
        this.state = state;
        this.city = city;
        this.district = district;
    }

    /**
     * validates user inputed location
     *
     * @param street   Location's Street
     * @param zip      Location's Zip Code
     * @param state    Location's State in USA
     * @param city     Location's City
     * @param district Location's District
     * @return wether the location is valid or not
     */
    private boolean validateLocation(String street, String zip, String state, String city, String district) {
        if (street == null || street == "")
            return false;
        if (state == null || state == "")
            return false;
        if (city == null || city == "")
            return false;
        if (district == null || district == "")
            return false;
        if (!validateZip(zip))
            return false;
        return true;
    }

    /**
     * Returns Location's Street
     *
     * @return Location's Street
     */
    public String getStreet() {
        return street;
    }

    /**
     * Returns Location's Zip Code
     *
     * @return Location's Zip Code
     */
    public String getZip() {
        return zip;
    }

    /**
     * Returns Location's State in USA
     *
     * @return Location's State in USA
     */
    public String getState() {
        return state;
    }

    /**
     * Returns Location's City
     *
     * @return Location's City
     */
    public String getCity() {
        return city;
    }

    /**
     * Returns Location's District
     *
     * @return Location's District
     */
    public String getDistrict() {
        return district;
    }

    /**
     * Validates zip code
     *
     * @param zip Location's Zip Code
     * @return true if it's valid, false otherwise
     */
    public static boolean validateZip(String zip) {
        int zipTester;
        if (zip.length() != 5)
            return false;
        try {
            zipTester = Integer.parseInt(zip);
        } catch (Exception e) {
            return false;
        }
        if (zipTester < 0)
            return false;
        return true;
    }
}
