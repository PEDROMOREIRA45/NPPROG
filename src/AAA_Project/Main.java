package AAA_Project;


import AAA_Project.domain.*;
import AAA_Project.repository.AdvertisementRepository;
import AAA_Project.repository.PersonRepository;
import AAA_Project.repository.PropertyRepository;
import AAA_Project.repository.RequestRepository;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> photos = null;

        SunExposure n = new SunExposure("NORTH");
        PropertyType t1 = new PropertyType("HOUSE");
        PropertyType t2 = new PropertyType("APARTMENT");

//        BusinessType b2 = new BusinessType("LEASE");

        PropertyRepository.createNewHouseProperty(t1, 320, 15, photos, 2, 3, 3, "no equip", true, true, n, "rua", "12345", "State", "City", "District");
        PropertyRepository.createNewApartmentProperty(t2, 320, 15, photos, 2, 3, 2, "no equip", "Rua", "12345", "State", "City", "Districty");
        PropertyRepository.createNewProperty(t2, 320, 15, photos, "Rua", "12345", "State", "City", "Districty");

        PersonRepository.addEmployee("agent@gmail.com", "Luis", "123789456", "123456789", "123526347", "AGENT");
        PersonRepository.addPerson("client@gmail.com", "Margot", "123456789", "669933258", "668899523");
        PersonRepository.addPerson("owner@gmail.com", "Marie", "124556789", "669922258", "667799523");



//        CommissionType comm2 = new CommissionType("PERCENTAGE");

        //  FAZER REQUEST
        createNewRequest ();
        createNewRequest ();
        //CRIAR ADVERTISEMENT
        createNewAd ();
        createNewAd ();

        // Schedule Visit

        // SHOW Properties in Advertisement

        chooseAdvertisementFromList ()




        // create new list for visits

//        List<AdvertisementVisitDTO> advertisementListVisitDTO=null;




    }

    public static Property choosePropertyFromList (List<Property> properties) {
        Scanner sc = new Scanner(System.in);
        Property propertyChoice;
        System.out.println("\nview Properties");
        for (int i = 0; i < properties.size(); i++) {
            System.out.println((i + 1) + "-> " + properties.get(i).getArea() + " - " + properties.get(i).getDistance());
        }
        System.out.println("\nPlease select which property you want to choose:");
        int option = Integer.parseInt(sc.nextLine());
        propertyChoice = properties.get(option - 1);
        return propertyChoice;
    }
    public static Person chooseOwnerFromList (List<Person> persons) {
        Scanner sc = new Scanner(System.in);
        Person ownerChoice;
        persons = PersonRepository.getPersons();
        for (int i = 0; i < persons.size(); i++) {
            System.out.println((i + 1) + "-> " + persons.get(i).getEmail() + " - " + persons.get(i).getName());
        }
        System.out.println("\nPlease select which owner you want to choose:");
        int option = Integer.parseInt(sc.nextLine());
        ownerChoice = persons.get(option - 1);
        return ownerChoice;
    }
    public static Person chooseAgentFromList (List<Person> persons) {
        Scanner sc = new Scanner(System.in);
        Person agentChoice;
        persons = PersonRepository.getPersons();
        for (int i = 0; i < persons.size(); i++) {
            System.out.println((i + 1) + "-> " + persons.get(i).getEmail() + " - " + persons.get(i).getName());
        }
        System.out.println("\nPlease select which Agent you want to choose:");
        int option = Integer.parseInt(sc.nextLine());
        agentChoice = persons.get(option - 1);
        return agentChoice;
    }
    public static void createNewRequest (){
        List<Property> properties = PropertyRepository.getProperties();
        List<Person> persons = PersonRepository.getPersons();
        BusinessType b1 = new BusinessType("SAlE");
        // ESCOLHER A PROPRIEDADE
        Property keepProperty = choosePropertyFromList(properties);
        // ESCOLHER OWNER
        Person keepOwner = chooseOwnerFromList(persons);
        // ESCOLHER AGENT
        Person keepAgent = chooseAgentFromList(persons);
        RequestRepository.createNewRequestSale(keepProperty, keepOwner, b1, keepAgent, 120000);
    }
    public static Request chooseRequestFromList (List<Request> request) {
        Scanner sc = new Scanner(System.in);
        List<Request> requestList = RequestRepository.getRequestList();
        Request requestOption = null;
        for (int i = 0; i < requestList.size(); i++) {
            System.out.println((i + 1) + "-> " + requestList.get(i).getDate() + " - " + requestList.get(i).getProperty());
        }
        System.out.println("\nPlease select which request you want to choose:");
        int option = Integer.parseInt(sc.nextLine());
        requestOption = requestList.get(option - 1);
        return requestOption;
    }
    public static void createNewAd (){
        List <Request> requests = RequestRepository.getRequestList();
        CommissionType comm1 = new CommissionType("FIXED");
        Request keepRequest = chooseRequestFromList (requests);
        AdvertisementRepository.createNewAdvertisement(keepRequest, comm1, 150.00);
    }
    public static Advertisement chooseAdvertisementFromList (List<Advertisement> ads){
        Scanner sc = new Scanner(System.in);
        Advertisement adChoice;
//        ads = AdvertisementRepository.getAdvertisements();
        System.out.println("\nList of Property to Sale or Rent");
        for (int i = 0; i < ads.size(); i++) {
            Request keepRequest = ads.get(i).getRequest();
            double keepSalePrice = keepRequest.getSalePrice();
            Property keepProperty = keepRequest.getProperty();
            double keepArea = keepProperty.getArea();
            double keepdistance = keepProperty.getdistance();
            PropertyType keepPropertyType = keepProperty.getPropertyType();
            String keepStreet = keepProperty.getStreet();
            String keepZip = keepProperty.getZip();
            String keepState = keepProperty.getState();
            String keepCity = keepProperty.getCity();
            String keepDistrict = keepProperty.getDistrict();
            List<String> keepPhotographs = keepProperty.getPhotographs();

            System.out.println("\nPlease select which Advertisment you want to choose:");
            System.out.printf("Property %d\n area %f mts; Distance from Center: %f kms: \n" +
                            "Location: Street %s, State %s, City %s, District %s, ZIP Code: %s\n"
                    ,(i + 1),keepArea, keepdistance, keepStreet,keepState,keepCity,keepDistrict,keepZip);
            for (int j = 0; j < keepPhotographs.size(); j++){
                System.out.println(keepPhotographs.get(j));
            }
            System.out.println("Sale Price"+keepSalePrice);

        }
        System.out.println("\nPlease select which Advertisment you want to choose:");
        int option = Integer.parseInt(sc.nextLine());
        adChoice = ads.get(option - 1);
        return adChoice;
    }



    public void createNewVisit (){
        Scanner sc = new Scanner(System.in);
        Visit keepVisit;
        List <Advertisement> ads = AdvertisementRepository.getAdvertisements();
        Advertisement keepAd = chooseAdvertisementFromList(ads);

        // continue ask for data for the visit ...
        // verify is there is another schedule visit in that slot
        // show the conditios to validate
        // Schedule the visit


    }


}