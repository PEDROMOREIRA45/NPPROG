package AAA_Project.controller;

import AAA_Project.domain.PropertyType;
import AAA_Project.repository.PropertyTypeRepository;
import AAA_Project.repository.Repositories;

import java.util.List;

public class ScheduleVisitController {


    private Repositories repositories;

    private PropertyTypeRepository propertyTypeRepository;


    public List<PropertyType> getPropertyTypeList() {
        return propertyTypeRepository.getPropertyTypesList();
    }


}
