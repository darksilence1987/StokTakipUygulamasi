package com.xhite.manager;

import com.xhite.rabbitMq.model.CreateStok;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import static com.xhite.constants.EndPoints.*;

@FeignClient(name = "stok-service",
        url= "http://localhost:8090"+VERSION+STOK_SERVICE,
        decode404 = true)
public interface StokServiceManager {

    @PostMapping(SAVE_STOK)
    ResponseEntity<Boolean> save(@RequestBody CreateStok createStok);

}