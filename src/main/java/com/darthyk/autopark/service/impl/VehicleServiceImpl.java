package com.darthyk.autopark.service.impl;

import com.darthyk.autopark.dto.VehicleDto;
import com.darthyk.autopark.model.Vehicle;
import com.darthyk.autopark.repository.VehicleRepository;
import com.darthyk.autopark.service.VehicleService;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@RequiredArgsConstructor
public class VehicleServiceImpl implements VehicleService {
    private VehicleRepository vehicleRepository;
    private ObjectMapper objectMapper;

    @Override public void createVehicle(VehicleDto dto) {
        vehicleRepository.save(objectMapper.convertValue(dto, Vehicle.class));
    }

    @Override public List<VehicleDto> getAllVehicles() {
        return vehicleRepository.findAll().stream()
                .map(vehicle -> objectMapper.convertValue(vehicle, VehicleDto.class))
                .collect(Collectors.toList());
    }

    @Override public VehicleDto getVehicle(Long id) {
        return objectMapper.convertValue(vehicleRepository.getById(id), VehicleDto.class);
    }

}
