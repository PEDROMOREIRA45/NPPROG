package AAA_Project.domain;

import java.util.List;

public class AdvertisementVisitDTO {

    private double keepArea;
    private double keepdistance;
    private PropertyType keepPropertyType;
    private String keepStreet;
    private String keepZip;
    private String keepState;
    private String keepCity;
    private String keepDistrict;
    private List<String> keepPhotographs;
    private double keepSalePrice;



    public AdvertisementVisitDTO(double keepArea, double keepdistance, PropertyType keepPropertyType, String keepStreet, String keepZip, String keepState, String keepCity, String keepDistrict, List<String> keepPhotographs, double keepSalePrice){
        this.keepArea=keepArea;
        this.keepdistance =keepdistance;
        this.keepPropertyType =keepPropertyType;
        this.keepStreet =keepStreet;
        this.keepZip =keepZip;
        this.keepState =keepState;
        this.keepCity =keepCity;
        this.keepDistrict =keepDistrict;
        this.keepPhotographs =keepPhotographs;
        this.keepSalePrice =keepSalePrice;
    }



}
