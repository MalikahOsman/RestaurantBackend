package RestaurantSystem.model;

import RestaurantSystem.domain.Chef;
import org.springframework.hateoas.ResourceSupport;

import java.util.List;

/**
 * Created by Osman on 2016-09-01.
 */
public class EmployeeResource extends ResourceSupport {
    private Long resId;
    private String empNum;
    private String empName;
    private String address;
    private String telephone;


    //private List<Chef> chefs;


    private EmployeeResource() {    }

    public EmployeeResource(Builder builder) {
//            this.resId = builder.resId;
        this.empNum = builder.empNum;
        this.empName = builder.empName;
        this.address = builder.address;
        this.telephone = builder.telephone;
    //    this.chefs = builder.chefs;
    }

    public Long getResId() {
        return resId;
    }

    public String getEmpNum() {
        return empNum;
    }

    public String getEmpName() {
        return empName;
    }

    public String getAddress() {
        return address;
    }

    public String getTelephone() {
        return telephone;
    }

//    public List<Chef> getChefs() {
//        return chefs;
//    }

    public static class Builder {
        private Long resId;
        private String empNum;
        private String empName;
        private String address;
        private String telephone;
       // private List<Chef> chefs;

        public Builder resId(Long resId) {
            this.resId = resId;
            return this;
        }

        public Builder empNum(String empNum) {
            this.empNum = empNum;
            return this;
        }

        public Builder empName(String empName) {
            this.empName = empName;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder telephone(String telephone) {
            this.telephone = telephone;
            return this;
        }

//        public Builder chefs(List<Chef> chefs) {
//            this.chefs = chefs;
//            return this;
//        }


        public Builder copy(EmployeeResource value) {
            //this.resId = value.resId;
            this.empNum = value.empNum;
            this.empName = value.empName;
            this.address = value.address;
            this.telephone = value.telephone;
        //    this.chefs = value.chefs;
            return this;
        }

        public EmployeeResource build() {
            return new EmployeeResource(this);
        }

    }
}
