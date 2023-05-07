package AAA_Project.domain;

import AAA_Project.repository.AdvertisementRepository;
import AAA_Project.repository.PropertyRepository;
import AAA_Project.repository.RequestRepository;

import java.util.List;

public class AdvertisementListDTO {

    public List<Advertisement> advetisdmentList = List.copyOf(AdvertisementRepository.getAdvertisements());
    public List<Request> requestList = List.copyOf(RequestRepository.getRequestList());
    public List<Property> propertyList = List.copyOf(PropertyRepository.getProperties());
}
