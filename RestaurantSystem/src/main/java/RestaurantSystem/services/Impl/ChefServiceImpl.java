package RestaurantSystem.services.Impl;

import RestaurantSystem.domain.Chef;
import RestaurantSystem.repositories.ChefRepository;
import RestaurantSystem.services.ChefService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Osman on 2016-09-01.
 */
@Service
public class ChefServiceImpl implements ChefService {
    @Autowired
    ChefRepository chefRepo;

    @Override
    public Chef create(Chef entity)
    {
        return chefRepo.save(entity);
    }

    @Override
    public Chef readById(Long id) {
        return chefRepo.findOne(id);
    }

    @Override
    public Set<Chef> readAll()
    {
        Set<Chef> result = new HashSet<Chef>();
        while (chefRepo.findAll().iterator().hasNext()){
            result.add(chefRepo.findAll().iterator().next());
        }
        return result;
    }

    @Override
    public Chef update(Chef entity) {
        return chefRepo.save(entity);
    }

    @Override
    public void delete(Chef entity) {
        chefRepo.delete(entity);
    }
}
