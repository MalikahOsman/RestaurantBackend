package RestaurantSystem.model;

import org.springframework.hateoas.ResourceSupport;

/**
 * Created by Osman on 2016-09-01.
 */
public class ChefResource extends ResourceSupport {
    private Long resId;
    private String userName;
    private String password;

    public ChefResource() {
    }

    public ChefResource(Builder builder) {
        //this.resId = builder.resId;
        this.userName = builder.userName;
        this.password = builder.password;

    }


    public Long getResIdId() {
        return resId;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }


    public static class Builder{
        private Long resId;
        private String userName;
        private String password;

        public Builder resId(Long value)
        {
            this.resId = value;
            return this;

        }

        public Builder userName(String value)
        {
            this.userName = value;
            return this;

        }

        public Builder password(String value)
        {
            this.password = value;
            return this;

        }

        public Builder copy(ChefResource value) {
            //this.id = value.id;
            this.userName = value.userName;
            this.password = value.password;
            return this;
        }

        public ChefResource build()
        {
            return new ChefResource(this);
        }

    }


}
