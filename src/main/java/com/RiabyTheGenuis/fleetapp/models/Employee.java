package com.RiabyTheGenuis.fleetapp.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
@Data
@EqualsAndHashCode(callSuper=false)
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")

public class Employee extends  Person{

    @ManyToOne
    @JoinColumn(name="employeetypeId", insertable=false, updatable=false)
    private EmployeeType employeeType;
    private Integer employeetypeId;
    private String photo;
    private String username;

    @ManyToOne
    @JoinColumn(name="jobtitleId", insertable=false, updatable=false)
    private JobTitle jobTitle;
    private Integer jobtitleId;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date hireDate;
}
