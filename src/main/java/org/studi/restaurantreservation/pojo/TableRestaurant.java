package org.studi.restaurantreservation.pojo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
public class TableRestaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tableId;

    //une table dispose d'une liste de client
    @OneToMany(mappedBy = "tableRestaurant")
    private Set<Client> clientSet = new HashSet<>();

}
