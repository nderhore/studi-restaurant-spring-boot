package org.studi.restaurantreservation.ws;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.studi.restaurantreservation.pojo.Plat;
import org.studi.restaurantreservation.service.ClientService;
import org.studi.restaurantreservation.service.PlatService;

import java.util.List;

@RestController
@RequestMapping("/plat")
public class PlatWs {

    @Autowired
    private PlatService platService;

    @GetMapping
    public List<Plat> getAllPlat(){
        return platService.getAllPlat();
    }

    @GetMapping("/{id}")
    public Plat getPlatById( @PathVariable("id") Long id){
        return platService.getPlatById(id);
    }

    @DeleteMapping("/{id}")
    public void deletePlatById(@PathVariable("id") Long id){
        platService.deletePlatById(id);
    }

    // création
    @PostMapping
    public void createPlat(@RequestBody Plat plat){
        platService.createPlat(plat);
    }

    //mise à jour
    @PutMapping("/{id}")
    public void updatePlatById(@RequestBody Plat plat,
                               @PathVariable("id") Long id){
        platService.updatePlatById(id,plat);
    }





}
