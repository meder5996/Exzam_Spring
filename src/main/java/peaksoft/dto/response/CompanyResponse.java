package peaksoft.dto.response;

import lombok.Getter;
import lombok.Setter;
import peaksoft.entity.Course;

@Getter
@Setter
public class CompanyResponse {

    private Long id;
    private String companyName;
    private String locatedCountry;

}
