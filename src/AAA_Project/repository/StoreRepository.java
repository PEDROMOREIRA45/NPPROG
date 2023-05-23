package AAA_Project.repository;

import AAA_Project.domain.Employee;
import AAA_Project.domain.Store;

import java.util.ArrayList;
import java.util.List;

public class StoreRepository {

    private final List<Store> stores = new ArrayList<>();


    /**
     * This method returns a defensive (immutable) copy of the list of stores.
     *
     * @return The list of stores.
     */

    public List<Store> getStoresList() {
        return List.copyOf(stores);
    }

    // GET AGENT LIST
    public List<Employee> getAgentList(){
        List<Employee> storeAgentList = new ArrayList<>();
        for(Store store : stores){
            for(Employee employee : store.getEmployeeList()){
                if(employee.getRole().compareTo("AGENT")==0){
                    storeAgentList.add(employee);
                }
            }
        }
        return storeAgentList;
    }

    public boolean addEmployeeToStore(Employee employee, String storeID) {
        Boolean userWasAdded = false;
        for(Store store : stores){
            if(store.getIdStore().compareTo(storeID)==0){
                store.addEmployeeToStore(employee);
                userWasAdded = true;
            }
        }
        return userWasAdded;
    }

    public boolean addEmployeeToStores(Employee employee, List<String> storeIDs) {
        int i;
        int counter = 0;
        int storeListSize = storeIDs.size();
        for(Store store : stores){
            i = 0;
            while(i < storeListSize) {
                if (store.getIdStore().compareTo(storeIDs.get(i)) == 0) {
                    store.addEmployeeToStore(employee);
                    counter++;
                    i = storeListSize;
                }
                i++;
            }
        }
        if(counter == storeListSize){
            return true;
        }else{
            return false;
        }
    }

    public void createNewStore(String name, String emailAddress, int phoneNumber){
        Store store = new Store(name, emailAddress, phoneNumber);
        stores.add(store);
    }

    public void addNewStore(Store store){
        stores.add(store);
    }
}
