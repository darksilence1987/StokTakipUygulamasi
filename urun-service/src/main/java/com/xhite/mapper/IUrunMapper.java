package com.xhite.mapper;
import com.xhite.dto.requests.UrunEklemeRequestDto;
import com.xhite.dto.response.UrunResponseDto;
import com.xhite.rabbitMq.model.CreateStok;
import com.xhite.repository.entities.Urun;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.ArrayList;
import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IUrunMapper {
    IUrunMapper INSTANCE = Mappers.getMapper(IUrunMapper.class);
    Urun toUrun(final UrunEklemeRequestDto urunEklemeRequestDto);
    CreateStok toCreateStok(final UrunEklemeRequestDto urunEklemeRequestDto);
    ArrayList<UrunResponseDto> toUrunResponseDtoList(final ArrayList<Urun> urunList);
}