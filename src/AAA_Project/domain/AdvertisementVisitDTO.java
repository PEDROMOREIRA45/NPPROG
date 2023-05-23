package AAA_Project.domain;

import java.util.Date;
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
    private Date keepDate;
    private Request keepRequest;

    private Advertisement keepAd;




    public AdvertisementVisitDTO(double keepArea, double keepdistance, PropertyType keepPropertyType, String keepStreet, String keepZip, String keepState, String keepCity, String keepDistrict, List<String> keepPhotographs, double keepSalePrice, Date keepDate, Request keepRequest, Advertisement keepAd){
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
        this.keepDate =keepDate;
        this.keepRequest=keepRequest;
        this.keepAd=keepAd;

    }

    public double getKeepArea() {
        return keepArea;
    }

    public double getKeepdistance() {
        return keepdistance;
    }

    public PropertyType getKeepPropertyType() {
        return keepPropertyType;
    }

    public String getKeepStreet() {
        return keepStreet;
    }

    public String getKeepZip() {
        return keepZip;
    }

    public String getKeepState() {
        return keepState;
    }

    public String getKeepCity() {
        return keepCity;
    }

    public String getKeepDistrict() {
        return keepDistrict;
    }

    public List<String> getKeepPhotographs() {
        return keepPhotographs;
    }

    public double getKeepSalePrice() {
        return keepSalePrice;
    }

    public Date getKeepDate() {
        return keepDate;
    }

    public Request getKeepRequest() {
        return keepRequest;
    }

    public Advertisement getKeepAd() {
        return keepAd;
    }
}
