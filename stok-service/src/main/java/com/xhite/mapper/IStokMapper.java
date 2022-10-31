package com.xhite.mapper;
import com.xhite.dto.response.StokResponseDto;
import com.xhite.rabbitMq.model.CreateStok;
import com.xhite.repository.entities.Stok;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.ArrayList;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IStokMapper {
    IStokMapper INSTANCE = Mappers.getMapper(IStokMapper.class);
    Stok toStok(final CreateStok createStok);
    ArrayList<StokResponseDto> toStokResponseDtoList(final ArrayList<Stok> stokList);
}