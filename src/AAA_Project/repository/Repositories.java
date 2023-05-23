package AAA_Project.repository;

public class Repositories {

    private static final Repositories instance = new Repositories();
    PersonRepository personRepository = new PersonRepository();
//    AuthenticationRepository authenticationRepository = new AuthenticationRepository();
    BusinessTypeRepository businessTypeRepository = new BusinessTypeRepository();
    PropertyTypeRepository propertyTypeRepository = new PropertyTypeRepository();
    StoreRepository storeRepository = new StoreRepository();
    AdvertisementRepository advertisementRepository = new AdvertisementRepository();
    RequestRepository requestRepository = new RequestRepository();
    SunExposureRepository sunExposureTypeRepository = new SunExposureRepository();
    PropertyRepository propertyRepository = new PropertyRepository();
    CommissionTypeRepository commissionTypeRepository = new CommissionTypeRepository();

    private Repositories() {
    }

    public static Repositories getInstance() {
        return instance;
    }

    public PersonRepository getPersonRepository() {
        return personRepository;
    }

//    public AuthenticationRepository getAuthenticationRepository() {
//        return authenticationRepository;
//    }

    public BusinessTypeRepository getBusinessTypeRepository() {
        return businessTypeRepository;
    }

    public PropertyTypeRepository getPropertyTypeRepository() {
        return propertyTypeRepository;
    }

    public StoreRepository getStoreRepository() {
        return storeRepository;
    }

    public AdvertisementRepository getAdvertisementRepository() {
        return advertisementRepository;
    }

    public RequestRepository getRequestRepository() {
        return requestRepository;
    }

    public SunExposureRepository getSunExposureTypeRepository() {
        return sunExposureTypeRepository;
    }

    public PropertyRepository getPropertyRepository() {
        return propertyRepository;
    }

    public CommissionTypeRepository getCommissionTypeRepository() {
        return commissionTypeRepository;
    }

}
