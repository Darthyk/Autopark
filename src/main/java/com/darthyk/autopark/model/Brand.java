package com.darthyk.autopark.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "brand")
@Getter
@Setter
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "vehicle_type")
    @Enumerated(EnumType.STRING)
    private VehicleType vehicleType;

    @Column(name = "gas_tank")
    private Integer gasTank;

    @Column(name = "carrying")
    private Integer carrying;

    @Column(name = "load_capacity")
    private Integer loadCapacity;

    @OneToMany(mappedBy = "brand", fetch = FetchType.EAGER)
    private List<Vehicle> vehicleList;

    public enum VehicleType {
        PASSENGER_CAR,
        TRUCK,
        BUS
    }
}
