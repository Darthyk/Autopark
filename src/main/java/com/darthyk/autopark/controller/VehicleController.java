package com.darthyk.autopark.controller;

import com.darthyk.autopark.dto.VehicleDto;
import com.darthyk.autopark.service.VehicleService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/vehicles")
@CrossOrigin
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @GetMapping
    public List<VehicleDto> getAllVehicles() {
        return vehicleService.getAllVehicles();
    }

}
