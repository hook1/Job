package com.iit.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

/**
 * Created by taras on 14.12.2016.
 */
@Data
@Entity
public class Announcement extends BaseEntity {

    private String header;
    private String description;
    private String bodyes;
    private Date date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "announcement_id")
    private User user;

}
