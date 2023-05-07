package AAA_Project.ui;

import AAA_Project.controller.ScheduleVisitController;
import AAA_Project.controller.SubmitPropertyController;
import AAA_Project.domain.*;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ScheduleVisitUI {
    Scanner sc = new Scanner(System.in);

    private ScheduleVisitController controller;

    private PropertyType keepPropertyType;

    //  ESCOLHER UMA PROPRIEDADE
    //  keepPropertyType

    public void listAndChoosePropertyType() {
        List<PropertyType> propertyType = controller.getPropertyTypeList();
        int i = 0;
        int option = 0;
        System.out.println("Choose Type of Property:");
        for (PropertyType property : propertyType) {
            System.out.println((++i) + " - " + property.getDescription());
        }
        option = Integer.parseInt(sc.nextLine());
        if ((option == 1) || (option == 2) || (option == 3)) {
            switch (option) {
                case 1:
                    for (PropertyType type : propertyType) {
                        if (type.getDescription().equals("LAND")) {
                            keepPropertyType = type;
                        }
                    }
                    break;
                case 2:
                    for (PropertyType type : propertyType) {
                        if (type.getDescription().equals("APARTMENT")) {
                            keepPropertyType = type;
                        }
                    }
                    break;
                case 3:
                    for (PropertyType type : propertyType) {
                        if (type.getDescription().equals("HOUSE")) {
                            keepPropertyType = type;
                        }
                    }
                    break;
            }
        } else {
            System.out.println("Option not correct. Choose again");
            option = Integer.parseInt(sc.nextLine());
        }
    }

    //  ESCOLHER UMA PROPRIEDADE
    // ENCONTRAR UMA LISTA DE ANUNCIOS






}
