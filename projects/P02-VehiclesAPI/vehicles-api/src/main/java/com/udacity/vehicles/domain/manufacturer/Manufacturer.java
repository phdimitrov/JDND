package com.udacity.vehicles.domain.manufacturer;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 * Declares class to hold car manufacturer information.
 */
@Entity
@Getter @Setter
public class Manufacturer {

    @Id
    private Integer code;
    private String name;

    public Manufacturer() {
    }

    public Manufacturer(Integer code, String name) {
        this.code = code;
        this.name = name;
    }
}
