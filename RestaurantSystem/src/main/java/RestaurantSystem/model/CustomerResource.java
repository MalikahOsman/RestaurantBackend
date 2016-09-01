package RestaurantSystem.model;

import org.springframework.hateoas.ResourceSupport;

/**
 * Created by Osman on 2016-09-01.
 */
public class CustomerResource extends ResourceSupport {
    private Long resId;
    private String custNum;
    private String custName;

    private CustomerResource(){}

    public Long getResId()
    {
        return resId;
    }

    public String getCustNum()
    {
        return custNum;
    }

    public String getCustName() {return custName;}

    public CustomerResource(Builder builder)
    {
        this.custNum = builder.custNum;
        this.custName = builder.custName;
    }

    public static class Builder{
        private Long resId;
        private String custNum;
        private String custName;

        public Builder resId(Long resId)
        {
            this.resId = resId;
            return this;
        }

        public Builder custNum(String custNum)
        {
            this.custNum = custNum;
            return this;
        }

        public Builder custName(String custName)
        {
            this.custName = custNum;
            return this;
        }

        public Builder copy(CustomerResource value){
            this.custNum = value.custNum;
            this.custName = value.custName;
            return this;
        }

        public CustomerResource build()
        {
            return new CustomerResource(this);
        }

    }
}
