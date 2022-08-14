package com.darthyk.autopark.mapper;

import com.darthyk.autopark.dto.BrandDto;
import com.darthyk.autopark.model.Brand;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(uses = VehicleMapper.class,
        componentModel = MappingConstants.ComponentModel.SPRING,
        injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface BrandMapper {

    Brand fromDtoToEntity(BrandDto dto);
    BrandDto fromEntityToDto(Brand entity);
}
