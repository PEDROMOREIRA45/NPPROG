package AAA_Project.repository;

import AAA_Project.domain.CommissionType;

import java.util.ArrayList;
import java.util.List;

public class CommissionTypeRepository {
    private final List<CommissionType> commissionType = new ArrayList<>();

    /**
     * This method returns a defensive (immutable) copy of the list of commission
     * types.
     *
     * @return the list of commission types
     */
    public List<CommissionType> getCommissionTypeList() {
        return List.copyOf(commissionType);
    }

    /**
     * This method adds a new commission type
     *
     * @param commissionType
     */
    public void addCommissionType(String commissionType) {
        this.commissionType.add(new CommissionType(commissionType));
    }

}
