package com.darthyk.autopark.dto;

import com.darthyk.autopark.model.Brand;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BrandDto {
    private String name;
    private Brand.VehicleType vehicleType;
    private Integer gasTank;
    private Integer carrying;
    private Integer loadCapacity;
    private List<VehicleDto> vehicles;
}
