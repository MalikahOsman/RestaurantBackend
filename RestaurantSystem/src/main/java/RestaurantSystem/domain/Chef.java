package RestaurantSystem.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Osman on 2016-09-01.
 */
@Entity
public class Chef implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String userName;
    private String password;

    public Chef() {
    }

    public Chef(Builder builder) {
        this.id = builder.id;
        this.userName = builder.userName;
        this.password = builder.password;

    }


    public Long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }


    public static class Builder{
        private Long id;
        private String userName;
        private String password;

        public Builder(){}

        public Builder id(Long value)
        {
            this.id = value;
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

        public Builder copy(Chef value) {
            this.id = value.id;
            this.userName = value.userName;
            this.password = value.password;
            return this;
        }

        public Chef build()
        {
            return new Chef(this);
        }

    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Chef chef = (Chef) o;
//
//        return id.equals(chef.id);
//
//    }
//
//    @Override
//    public int hashCode() {
//        return id != null ? id.hashCode() : 0;
//    }
}
