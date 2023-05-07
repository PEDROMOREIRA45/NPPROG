package AAA_Project.repository;


import AAA_Project.domain.SunExposure;

import java.util.ArrayList;
import java.util.List;

public class SunExposureRepository {
    private final List<SunExposure> sunExposure = new ArrayList<>();
    public List<SunExposure> getSunExposureTypeList() {
        return List.copyOf(sunExposure);
    }

    public void addSunExposure(String exposure){
        sunExposure.add(new SunExposure(exposure));
    }
}
