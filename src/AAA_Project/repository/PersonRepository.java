package AAA_Project.repository;

//import pt.ipp.isep.dei.esoft.project.application.controller.authorization.AuthenticationController;
import AAA_Project.domain.Employee;
import AAA_Project.domain.Location;
import AAA_Project.domain.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonRepository {

    private static final List<Person> persons = new ArrayList<>();

    public static void createNewAgent(Employee newEmployee) {
        persons.add(newEmployee);
    }

    /**
     * This method returns a defensive (immutable) copy of the list of business
     * types.
     *
     * @return The list of business types.
     */

    public static List<Person> getPersons() {
        return List.copyOf(persons);
    }

    public boolean addPersonWithLocation(String keepEmail, String keepName, String keepCitizenNumber, String keepTin, String keepPhoneNumber, String keepStreet, String keepZipCode, String keepStateUS, String keepCity, String keepDistrict) {
        try{
            Person person = new Person(keepName, keepEmail, Integer.parseInt(keepCitizenNumber), Integer.parseInt(keepTin),
                    Integer.parseInt(keepPhoneNumber),
                    new Location(keepStreet, keepZipCode, keepStateUS, keepCity, keepDistrict));

            if (exists(person))
                return false;
            persons.add(person);
            return true;
        }catch(IllegalArgumentException e){
            System.out.println(e);
            return false;
        }
    }

    public static boolean addPerson(String keepEmail, String keepName, String keepCitizenNumber, String keepTin,
                                    String keepPhoneNumber) {
        try{
            Person person = new Person(keepName, keepEmail, Integer.parseInt(keepCitizenNumber), Integer.parseInt(keepTin), Integer.parseInt(keepPhoneNumber));
            if (exists(person))
                return false;
            persons.add(person);
            return true;
        }catch(IllegalArgumentException e){
            System.out.println(e);
            return false;
        }
    }

    public static boolean addEmployee(String keepEmail, String keepName, String keepCitizenNumber, String keepTin, String keepPhoneNumber, String role) {
        try{
            Employee person = new Employee(keepName, keepEmail, Integer.parseInt(keepCitizenNumber), Integer.parseInt(keepTin), Integer.parseInt(keepPhoneNumber), role);
            if (exists(person))
                return false;
            persons.add(person);
            return true;
        }catch(IllegalArgumentException e){
            System.out.println(e);
            return false;
        }
    }

    public Employee addEmployeeWithLocation(String keepEmail, String keepName, String keepCitizenNumber, String keepTin, String keepPhoneNumber, String keepStreet, String keepZipCode, String keepStateUS, String keepCity, String keepDistrict, String role) {
        try{
            Employee person = new Employee(keepName, keepEmail, Integer.parseInt(keepCitizenNumber), Integer.parseInt(keepTin), Integer.parseInt(keepPhoneNumber), new Location(keepStreet, keepZipCode, keepStateUS, keepCity, keepDistrict), role);

            if (exists(person)) {
                return null;
            } else {
                persons.add(person);
                return person;
            }
        }catch(IllegalArgumentException e){
            System.out.println(e);
            return null;
        }

    }

    public static boolean exists(Person p) {
        for (Person person : persons) {
            if (person.getEmail().getEmail().equals(p.getEmail().getEmail()))
                return true;
        }
        return false;
    }

    public Person createPerson(String name, String email, int numberCitizen, int tin, int phoneNumber) {
        try{
            Person person = new Person(name, email, numberCitizen, tin, phoneNumber);
            return person;
        }catch(IllegalArgumentException e){
            System.out.println(e);
            return null;
        }

    }

    public Person findPerson(int numberCitizen) {
        for (Person person : persons) {
            if (person.getNumberCitizen() == numberCitizen)
                return person;
        }
        return null;
    }

    public Person getPersonByEmail(String keepOwnerEmail) {
        Person owner = null;
        for (Person person : persons) {
            String personEmail = String.valueOf(person.getEmail());
            if (keepOwnerEmail.compareTo(personEmail) == 0)
                owner = person;
        }
        return owner;
    }

//    public List<Employee> getAgentList() {
//        List<Employee> agentList = new ArrayList<>();
//        for (Person agent : persons) {
//            if (agent instanceof Employee && ((Employee) agent).getRole().equals(AuthenticationController.ROLE_AGENT)) {
//                agentList.add((Employee) agent);
//            }
//        }
//        return agentList;
//    }

    public List<Employee> getEmployeeList() {
        List<Employee> employeeList = new ArrayList<>();
        for (Person person : persons) {
            if (person instanceof Employee)
                employeeList.add((Employee) person);
        }
        return employeeList;
    }
}
