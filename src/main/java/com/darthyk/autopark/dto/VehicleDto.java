package com.darthyk.autopark.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class VehicleDto {
    private String name;
    private Integer price;
    private Integer enginePower;
    private Integer productionYear;
}
