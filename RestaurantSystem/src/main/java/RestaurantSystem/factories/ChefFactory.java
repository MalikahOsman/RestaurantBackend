package RestaurantSystem.factories;

import RestaurantSystem.domain.Chef;

/**
 * Created by Osman on 2016-09-01.
 */
public class ChefFactory {
    //public ChefFactory(){}

    public static Chef getChef(Long id, String username, String password) {
        Chef chef = new Chef
                .Builder()
                .id(id)
                .userName(username)
                .password(password)
                .build();
        return chef;
    }
}
