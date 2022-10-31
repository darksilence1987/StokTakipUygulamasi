package controller;

import com.xhite.dto.requests.UrunEklemeRequestDto;
import com.xhite.dto.response.UrunResponseDto;
import com.xhite.mapper.IUrunMapper;
import com.xhite.repository.entities.Urun;
import com.xhite.service.UrunService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

import static com.xhite.constants.EndPoints.*;

@RestController
@RequestMapping(VERSION+URUN_SERVICE)
public class UrunController {
    private final UrunService urunService;
    public UrunController(UrunService urunService) {
        this.urunService = urunService;
    }
    @PostMapping(FIND_ALL)
    public ResponseEntity<ArrayList<UrunResponseDto>> findAll(){
        return ResponseEntity.ok(IUrunMapper.INSTANCE.toUrunResponseDtoList((ArrayList<Urun>) urunService.findAll()));
    }
    @PostMapping(SAVE_URUN)
    public void saveUrun(UrunEklemeRequestDto urunEklemeRequestDto){
        urunService.urunKaydet(urunEklemeRequestDto);
    }
}
