package com.iit.model;

import com.iit.model.enums.Sex;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by taras on 14.12.2016.
 */
@Data
@Entity
public class User extends BaseEntity {

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Date birthday;
    private String phoneNumber;     //+380-XX-XXX-XX-X
    private String homeNumber;      //+380-XX-XXX-XX-XX     (Львів код 32)
    private String workNumber;      //+380-XX-XXX-XX-XX.    (Львів код 32)
    private String skype;
    @Enumerated(EnumType.STRING)
    private Sex sex;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private List<Announcement> announcements = new ArrayList<>();

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "location_id")
    private Location location;

}
