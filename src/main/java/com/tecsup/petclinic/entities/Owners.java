package com.tecsup.petclinic.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity(name="owners")
@Table(name="owners")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Owners {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name = "address")
    private String address;

    @Column(name="city")
    private String city;

    @Column(name="telephone")
    private String telephone;






}
