package com.darthyk.autopark.service;

import com.darthyk.autopark.dto.VehicleDto;
import java.util.List;

public interface VehicleService {
    void createVehicle(VehicleDto dto);

    List<VehicleDto> getAllVehicles();

    VehicleDto getVehicle(Long id);
}
