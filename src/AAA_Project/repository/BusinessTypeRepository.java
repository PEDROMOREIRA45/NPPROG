package AAA_Project.repository;

import AAA_Project.domain.BusinessType;

import java.util.ArrayList;
import java.util.List;

public class BusinessTypeRepository {

    private final List<BusinessType> businessType = new ArrayList<>();

    /**
     * This method returns a defensive (immutable) copy of the list of business types.
     *
     * @return The list of business types.
     */

    public List<BusinessType> getBusinessTypeList() {
        return List.copyOf(businessType);
    }

    public void addBusinessType(String business){
        businessType.add(new BusinessType(business));
    }
}
