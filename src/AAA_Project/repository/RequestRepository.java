package AAA_Project.repository;

import AAA_Project.domain.*;

import java.util.ArrayList;
import java.util.List;

public class RequestRepository {
    private static final List<Request> request = new ArrayList<>();

    public static List<Request> getRequestList() {
        return List.copyOf(request);
    }

    public static void createNewRequestSale(Property newAllProperty, Person keepOwner, BusinessType keepBusinessType,
                                            Person keepAgent, double keepSalePrice) {
        Request newRequest = new Request(newAllProperty, keepOwner, keepBusinessType, keepAgent, keepSalePrice);
        request.add(newRequest);
    }

    public void createNewRequestRent(Property newAllProperty, Person keepOwner, BusinessType keepBusinessType,
                                     Person keepAgent, double keepRentPrice, int keepDuractionContract) {
        Request newRequest = new Request(newAllProperty, keepOwner, keepBusinessType, keepAgent, keepRentPrice,
                keepDuractionContract);
        request.add(newRequest);
    }

    public Request createSaleRequest(Property newAllProperty, Person keepOwner, BusinessType keepBusinessType,
                                     Person keepAgent, double keepSalePrice) {
        Request newRequest = new Request(newAllProperty, keepOwner, keepBusinessType, keepAgent, keepSalePrice);
        request.add(newRequest);
        return newRequest;
    }

    public Request createRentRequest(Property newAllProperty, Person keepOwner, BusinessType keepBusinessType,
                                     Person keepAgent, double keepRentPrice, int keepDuractionContract) {
        Request newRequest = new Request(newAllProperty, keepOwner, keepBusinessType, keepAgent, keepRentPrice,
                keepDuractionContract);
        request.add(newRequest);
        return newRequest;
    }
}
