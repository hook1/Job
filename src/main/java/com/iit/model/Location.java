package com.iit.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;

/**
 * Created by taras on 07.11.2016.
 */
@Entity
@Data
public class Location extends BaseEntity {
    private String country;
    private String region;
    private String area;
    private String city;
    private String streat;
    private int building;
    private String building_addidationaly;
    private int level;
    private int offise;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "location")
    private User user;
}
