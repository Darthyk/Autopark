package com.darthyk.autopark.service.impl;

import com.darthyk.autopark.dto.VehicleDto;
import com.darthyk.autopark.mapper.VehicleMapper;
import com.darthyk.autopark.repository.VehicleRepository;
import com.darthyk.autopark.service.VehicleService;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleServiceImpl implements VehicleService {
    @Autowired
    private VehicleRepository vehicleRepository;
    @Autowired
    private VehicleMapper vehicleMapper;

    @Override public void createVehicle(VehicleDto dto) {
        vehicleRepository.save(vehicleMapper.fromDtoToEntity(dto));
    }

    @Override public List<VehicleDto> getAllVehicles() {
        return vehicleRepository.findAll().stream()
                .map(vehicleMapper::fromEntityToDto)
                .collect(Collectors.toList());
    }

    @Override public VehicleDto getVehicle(Long id) {
        return vehicleMapper.fromEntityToDto(vehicleRepository.getById(id));
    }

}
