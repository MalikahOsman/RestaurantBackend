package RestaurantSystem.client;

import RestaurantSystem.domain.Chef;
import RestaurantSystem.services.ChefService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Set;

/**
 * Created by Osman on 2016-09-01.
 */
/*@RestController
public class ChefController {
    @Autowired
    private ChefService chefService;

    //----------------------  Create Chef  --------------------------//

    @RequestMapping(value = "/chef/", method = RequestMethod.POST) //, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> createChef(@RequestBody Chef chef, UriComponentsBuilder ucBuilder){
        chefService.create(chef);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/chef/{id}").buildAndExpand(chef.getId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);

    }

    //----------------------  Retrieve Single Chef  --------------------------//
    @RequestMapping(value = "/chef/{id}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Chef> getActors(@PathVariable("id") Long id){
        Chef chef = chefService.readById(id);
        if (chef==null){
            return new ResponseEntity<Chef>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Chef>(chef,HttpStatus.OK);
    }
    //----------------------  Retrieve All Chef  --------------------------//

    @RequestMapping(value = "/chef/", method = RequestMethod.GET)
    public ResponseEntity<Set<Chef>> getChef() {
        Set<Chef> chef = chefService.readAll();
        if(chef.isEmpty()){
            return new ResponseEntity<Set<Chef>>(HttpStatus.NO_CONTENT);// OR HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<Set<Chef>>(chef, HttpStatus.OK);
    }

    //----------------------  Update a Chef  --------------------------//
    @RequestMapping(value = "/chef/", method = RequestMethod.PUT)
    public ResponseEntity<Chef> updateChef(@PathVariable("id") Long id, @RequestBody Chef chef) {

        Chef currentChef = chefService.readById(id);

        if (currentChef==null) {
            return new ResponseEntity<Chef>(HttpStatus.NOT_FOUND);
        }

        Chef updatedChef = new Chef.Builder().copy(currentChef)
                .id(chef.getId())
                .userName(chef.getUserName())
                .password(chef.getPassword())
                .build();
        chefService.update(updatedChef);
        return new ResponseEntity<Chef>(updatedChef, HttpStatus.OK);
    }

    //----------------------  Delete a Chef  --------------------------//
    @RequestMapping(value = "/chef/", method = RequestMethod.DELETE)
    public ResponseEntity<Chef> deleteChef(@PathVariable("id") long id){
        Chef chef = chefService.readById(id);
        if (chef == null) {
            return new ResponseEntity<Chef>(HttpStatus.NOT_FOUND);
        }
        chefService.delete(chef);
        return new ResponseEntity<Chef>(HttpStatus.NO_CONTENT);
    }

}*/
