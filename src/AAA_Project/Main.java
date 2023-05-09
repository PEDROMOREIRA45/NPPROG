package AAA_Project;


import AAA_Project.domain.*;
import AAA_Project.repository.AdvertisementRepository;
import AAA_Project.repository.PersonRepository;
import AAA_Project.repository.PropertyRepository;
import AAA_Project.repository.RequestRepository;
import AAA_Project.utils.Email;

import java.util.*;

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
        createNewRequest();
        createNewRequest();
        //CRIAR ADVERTISEMENT
        createNewAd();
        createNewAd();

        // Schedule Visit

        // SHOW Properties in Advertisement

        createNewVisit();


        // create new list for visits

//        List<AdvertisementVisitDTO> advertisementListVisitDTO=null;


    }


    public static Property choosePropertyFromList(List<Property> properties) {
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

    public static Person chooseOwnerFromList(List<Person> persons) {
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

    public static Person chooseAgentFromList(List<Person> persons) {
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

    public static void createNewRequest() {
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

    public static Request chooseRequestFromList(List<Request> request) {
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

    public static void createNewAd() {
        List<Request> requests = RequestRepository.getRequestList();
        CommissionType comm1 = new CommissionType("FIXED");
        Request keepRequest = chooseRequestFromList(requests);
        AdvertisementRepository.createNewAdvertisement(keepRequest, comm1, 150.00);
    }


    public static Advertisement chooseAdvertisementFromList(List<Advertisement> ads) {
        Advertisement adVisitChoice;
        List<AdvertisementVisitDTO> keepAdVisitList = createNewAdvertAllInformationList(ads);
        List<AdvertisementVisitDTO> keepAdVisitListSortedByDate = sortAdVisitListByDate(keepAdVisitList);
        displayAdVisitList(keepAdVisitListSortedByDate);
        adVisitChoice = chooseFromList(keepAdVisitListSortedByDate);
        return adVisitChoice;
    }

    public static List<AdvertisementVisitDTO> createNewAdvertAllInformationList(List<Advertisement> ads) {
        List<AdvertisementVisitDTO> adsVisitList = new ArrayList<AdvertisementVisitDTO>();
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
            Date keepDate = ads.get(i).getDate();
            Advertisement keepAd = ads.get(i);
            AdvertisementVisitDTO adsVisit = new AdvertisementVisitDTO(keepArea, keepdistance, keepPropertyType,
                    keepStreet, keepZip, keepState, keepCity, keepDistrict, keepPhotographs, keepSalePrice, keepDate, keepRequest, keepAd);
            adsVisitList.add(adsVisit);
        }
        return adsVisitList;
    }

    public static List<AdvertisementVisitDTO> sortAdVisitListByDate(List<AdvertisementVisitDTO> adsVisitList) {
        Comparator<AdvertisementVisitDTO> c1 = new Comparator<AdvertisementVisitDTO>() {
            public int compare(AdvertisementVisitDTO a1, AdvertisementVisitDTO a2) {
                Date d1 = a1.getKeepDate();
                Date d2 = a2.getKeepDate();

                if (d1.compareTo(d2) < 0) {
                    return -1;
                } else if (d1.compareTo(d2) > 0) {
                    return 1;
                } else {
                    return 0;
                }
            }
        };
        Collections.sort(adsVisitList, c1);
        return adsVisitList;
    }

    public static void displayAdVisitList(List<AdvertisementVisitDTO> adsVisitList) {
        for (int i = 0; i < adsVisitList.size(); i++) {
            Request keepRequest = adsVisitList.get(i).getKeepRequest();
            double keepSalePrice = keepRequest.getSalePrice();
            Property keepProperty = keepRequest.getProperty();
            double keepArea = keepProperty.getArea();
            double keepdistance = keepProperty.getdistance();
            String keepStreet = keepProperty.getStreet();
            String keepZip = keepProperty.getZip();
            String keepState = keepProperty.getState();
            String keepCity = keepProperty.getCity();
            String keepDistrict = keepProperty.getDistrict();
            List<String> keepPhotographs = keepProperty.getPhotographs();
            System.out.println("\nPlease select which Advertisment you want to choose:");
            System.out.printf("Property %d\n area %f mts; Distance from Center: %f kms: \n" +
                            "Location: Street %s, State %s, City %s, District %s, ZIP Code: %s\n"
                    , (i + 1), keepArea, keepdistance, keepStreet, keepState, keepCity, keepDistrict, keepZip);
            for (int j = 0; j < keepPhotographs.size(); j++) {
                System.out.println(keepPhotographs.get(j));
                System.out.println("Sale Price: " + keepSalePrice);
            }
        }
    }

    public static Advertisement chooseFromList(List<AdvertisementVisitDTO> ads) {
        Scanner sc = new Scanner(System.in);
        AdvertisementVisitDTO ad = null;
        Advertisement adChoice = null;
        System.out.println("\nPlease select which Advertisment you want to choose:");
        int option = Integer.parseInt(sc.nextLine());
        ad = ads.get(option - 1);
        adChoice = ad.getKeepAd();
        return adChoice;
    }

    public static Visit scheduleVisit(Advertisement ad) {
        Scanner sc = new Scanner(System.in);
        Email email= new Email("client@gmail.com");
        boolean valid;
        int visitYear=0, visitMonth=0, visitDay=0, visitHour=0;
        List<Visit> visits = ad.getVisits();
        do {
            System.out.println("Year");
            int keepYear = Integer.parseInt(sc.nextLine());
            System.out.println("Month");
            int keepMonth = Integer.parseInt(sc.nextLine());
            System.out.println("Day");
            int keepDay = Integer.parseInt(sc.nextLine());
            System.out.println("Hour");
            int keepHour = Integer.parseInt(sc.nextLine());
            valid = true;
            for (int i = 0; i < visits.size(); i++) {
                int year = visits.get(i).getYear();
                int month = visits.get(i).getMonth();
                int day = visits.get(i).getDay();
                int hour = visits.get(i).getHour();
                if ((keepYear == year) && (keepMonth == month) && (keepDay == day) && (keepHour == hour)) {
                    valid = false;
                }
            }
            if (valid == false){
                System.out.println("This time is ocuppied please choose new time:");
            }
            else {
                visitYear=keepYear; visitMonth=keepMonth; visitDay=keepDay; visitHour=keepHour;
            }
        } while (valid == false);
        return new Visit(visitYear,visitMonth,visitDay,visitHour,email);
    }


    public static void createNewVisit() {
        Scanner sc = new Scanner(System.in);
        Visit keepVisit;
        List<Advertisement> ads = AdvertisementRepository.getAdvertisements();
        Advertisement keepAd = chooseAdvertisementFromList(ads);
        keepVisit = scheduleVisit(keepAd);

        // show the conditios to validate
        // Schedule the visit (create new visit)
        // confirmation of operation sucess

    }


}