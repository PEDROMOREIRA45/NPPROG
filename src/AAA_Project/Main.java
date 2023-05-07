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
        Scanner sc = new Scanner(System.in);

        List<String> photos = null;



        SunExposure n = new SunExposure("NORTH");
        PropertyType t1 = new PropertyType("HOUSE");
        PropertyType t2 = new PropertyType("APARTMENT");
        BusinessType b1 = new BusinessType("SAlE");
        BusinessType b2 = new BusinessType("LEASE");

        PropertyRepository.createNewHouseProperty(t1, 320, 15, photos, 2, 3, 3, "no equip", true, true, n, "rua", "12345", "State", "City", "District");
        PropertyRepository.createNewApartmentProperty(t2, 320, 15, photos, 2, 3, 2, "no equip", "Rua", "12345", "State", "City", "Districty");
        PropertyRepository.createNewProperty(t2, 320, 15, photos, "Rua", "12345", "State", "City", "Districty");

        PersonRepository.addEmployee("agent@gmail.com","Luis","123789456","123456789","123526347","AGENT");
        PersonRepository.addPerson("client@gmail.com","Margot","123456789","669933258","668899523");
        PersonRepository.addPerson("owner@gmail.com","Marie","124556789","669922258","667799523");

        CommissionType comm1 = new CommissionType("FIXED");
        CommissionType comm2 = new CommissionType("PERCENTAGE");

        //  FAZER REQUEST
        //  ESCOLHER A PROPRIEDADE
        Property keepProperty=null;

        List<Property> properties = PropertyRepository.getProperties();

        System.out.println("\nview Properties");
        for (int i = 0; i < properties.size(); i++) {
            System.out.println((i + 1) + "-> " + properties.get(i).getArea() + " - " + properties.get(i).getDistance());
        }
        System.out.println("\nPlease select which property you want to choose:");
        int option;
        option = Integer.parseInt(sc.nextLine());
        keepProperty = properties.get(option - 1);

        // ESCOLHER OWNER
        Person keepOwner=null;
        Person keepAgent=null;
        List<Person> persons = PersonRepository.getPersons();
        for (int i = 0; i < persons.size(); i++) {
            System.out.println((i + 1) + "-> " + persons.get(i).getEmail() + " - " + persons.get(i).getName());
        }
        System.out.println("\nPlease select which owner you want to choose:");

        option = Integer.parseInt(sc.nextLine());
        keepOwner = persons.get(option - 1);

        // ESCOLHER AGENT
        for (int i = 0; i < persons.size(); i++) {
            System.out.println((i + 1) + "-> " + persons.get(i).getEmail() + " - " + persons.get(i).getName());
        }
        System.out.println("\nPlease select which owner you want to choose:");
        option = Integer.parseInt(sc.nextLine());
        keepAgent = persons.get(option - 1);

        //CRIAR REQUEST
        RequestRepository.createNewRequestSale(keepProperty,keepOwner,b1,keepAgent,120000);

        //CRIAR ADVERTISEMENT
        List<Request> requestList = RequestRepository.getRequestList();
        Request keepRequest=null;
        for (int i = 0; i < requestList.size(); i++) {
            System.out.println((i + 1) + "-> " + requestList.get(i).getDate() + " - " + requestList.get(i).getProperty());
        }
        System.out.println("\nPlease select which owner you want to choose:");
        option = Integer.parseInt(sc.nextLine());
        keepRequest = requestList.get(option - 1);

        AdvertisementRepository.createNewAdvertisement(keepRequest, comm1,150.00 );




        List<Request> requestListVisit;

//            for(int i=0;i< requestList.size();i++){
//                RequestDTO r = new RequestDTO()
//
//            }

        }

}