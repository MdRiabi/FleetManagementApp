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
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date invoiceDate;

    @ManyToOne
    @JoinColumn(name="invoicestatusId", insertable=false, updatable=false)
    private InvoiceStatus invoiceStatus;
    private Integer invoicestatusId;

    @ManyToOne
    @JoinColumn(name="clientId", insertable=false, updatable=false)
    private Client client;
    private Integer clientId;

    private String remarks;


}
