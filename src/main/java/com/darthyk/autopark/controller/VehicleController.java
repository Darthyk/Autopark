package com.darthyk.autopark.controller;

import com.darthyk.autopark.dto.VehicleDto;
import com.darthyk.autopark.service.VehicleService;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/vehicle")
@RequiredArgsConstructor
@AllArgsConstructor
public class VehicleController {

    private VehicleService vehicleService;

    @PostMapping
    public String createVehicle(@RequestBody VehicleDto dto) {
        vehicleService.createVehicle(dto);
        return "OK";
    }

    @GetMapping("/{id}")
    public VehicleDto getVehicle(@PathVariable(name = "id") Long id) {
        return vehicleService.getVehicle(id);
    }

    @GetMapping("/all")
    public List<VehicleDto> getAllVehicles() {
        return vehicleService.getAllVehicles();
    }
}
