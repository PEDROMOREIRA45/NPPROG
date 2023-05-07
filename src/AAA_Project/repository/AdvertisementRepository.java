package AAA_Project.repository;

import AAA_Project.domain.*;

import java.util.ArrayList;
import java.util.List;

public class AdvertisementRepository {
    private static List<Advertisement> advertisements = new ArrayList<>();

    public static Advertisement createNewAdvertisement(Request request, CommissionType commissionType, double commissionValue) {
        Advertisement newAdvertisement = new Advertisement(request, commissionType, commissionValue);
        advertisements.add(newAdvertisement);
        return newAdvertisement;
    }

    public static List<Advertisement> getAdvertisements() {
        return advertisements;
    }
}
