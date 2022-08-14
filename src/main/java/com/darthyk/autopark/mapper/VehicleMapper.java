package com.darthyk.autopark.mapper;

import com.darthyk.autopark.dto.VehicleDto;
import com.darthyk.autopark.model.Vehicle;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(uses = BrandMapper.class,
        componentModel = MappingConstants.ComponentModel.SPRING,
        injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface VehicleMapper {
    Vehicle fromDtoToEntity(VehicleDto dto);
    VehicleDto fromEntityToDto(Vehicle entity);
}
