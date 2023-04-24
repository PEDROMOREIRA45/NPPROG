package AAA_Project;


import AAA_Project.Repositories.PropertyTypeEnum;
import AAA_Project.Repositories.SunExposureType;

public class Main {
    public static void main(String[] args) {
        House h1 = new House(PropertyTypeEnum.HOUSE,150.00,15.00,5,1,true,true,"Rua",99999,"Nevada","Las Vegas","Zoo", SunExposureType.NORTH);

        System.out.println(h1);

    }
}
