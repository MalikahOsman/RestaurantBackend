package RestaurantSystem.domain;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Osman on 2016-09-01.
 */
@Entity
public class Customer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String custName;
    private String custNum;

    public Customer() {
    }

    public Customer(Builder builder)
    {
        this.id = builder.id;
        this.custNum = builder.custNum;
        this.custName = builder.custName;
    }


//    public Customer(String custNum, String custName) {
//        this.custName = custName;
//        this.custNum = custNum;
//    }

    public static class Builder{
        private Long id;
        private String custNum;
        private String custName;

        public Builder(){}

        public Builder id(Long id)
        {
            this. id = id;
            return this;
        }

        public Builder custNum(String custNum)
        {
            this.custNum = custNum;
            return this;
        }

        public Builder custName(String custName)
        {
            this.custName = custName;
            return this;
        }

        public Builder copy(Customer value)
        {
            this.id = value.id;
            this.custNum = value.custNum;
            this.custName = value.custName;
            return this;
        }

        public Customer build()
        {
            return new Customer(this);
        }
    }


    public Long getId()
    {
        return id;
    }
    public String getCustName() {
        return custName;
    }

    public String getCustNum() {
        return custNum;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Customer customer = (Customer) o;
//
//        return id.equals(customer.id);
//
//    }
//
//    @Override
//    public int hashCode() {
//        return id.hashCode();
//    }
}
