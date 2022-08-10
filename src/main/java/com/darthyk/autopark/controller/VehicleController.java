package com.darthyk.autopark.controller;

import com.darthyk.autopark.dto.VehicleDto;
import com.darthyk.autopark.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehicleController {

    @Autowired
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

    @GetMapping("/vehicles")
    public String index(Model model) {
        model.addAttribute("vehicleList", vehicleService.getAllVehicles());
        return "index";
    }
}
