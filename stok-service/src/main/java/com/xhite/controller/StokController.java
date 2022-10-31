package com.xhite.controller;

import com.xhite.dto.response.StokResponseDto;
import com.xhite.mapper.IStokMapper;
import com.xhite.rabbitMq.model.CreateStok;
import com.xhite.service.StokService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

import static com.xhite.constants.EndPoints.*;

@RestController
@RequestMapping(VERSION+STOK_SERVICE)
public class StokController {
    private final StokService stokService;
    public StokController(StokService stokService) {
        this.stokService = stokService;
    }
    @PostMapping(FIND_ALL)
    public ResponseEntity<ArrayList<StokResponseDto>> findAll() {
        return ResponseEntity.ok(IStokMapper.INSTANCE.toStokResponseDtoList(stokService.findAll()));
    }
    @PostMapping(SAVE_STOK)
    public void saveStok(CreateStok createStok){
        stokService.stokKaydet(createStok);
    }
}
