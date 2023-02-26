package com.RiabyTheGenuis.fleetapp.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    private String name;
    @ManyToOne
    @JoinColumn(name="vehicletypeId", insertable=false, updatable=false)
    private VehicleType vehicleType;
    private Integer vehicletypeId;

    private String vehicleNumber;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date registrationDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date acquisitionDate;
    private String description;

    @ManyToOne
    @JoinColumn(name="vehiclemakeId", insertable=false, updatable=false)
    private VehicleMake vehicleMake;
    private Integer vehiclemakeId;

    private String power;
    private String fuelCapacity;
    @ManyToOne
    @JoinColumn(name="vehiclestatusId", insertable=false, updatable=false)
    private VehicleStatus vehicleStatus;
    private Integer vehiclestatusId;

    private String netWeight;

    @ManyToOne
    @JoinColumn(name="employeeId", insertable=false, updatable=false)
    private Employee inCharge;
    private Integer employeeId;

    @ManyToOne
    @JoinColumn(name="vehiclemodelId", insertable=false, updatable=false)
    private VehicleModel vehicleModel;
    private Integer vehiclemodelId;

    @ManyToOne
    @JoinColumn(name="locationId", insertable=false, updatable=false)
    private Location currentLocation;
    private Integer locationId;

    private String remarks;

}
