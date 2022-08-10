package com.darthyk.autopark.controller;

import com.darthyk.autopark.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @GetMapping({"/","/vehicles"})
    public String vehicles(Model model) {
        model.addAttribute("vehicleList", vehicleService.getAllVehicles());
        return "index";
    }
}
