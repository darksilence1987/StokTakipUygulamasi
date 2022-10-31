package com.xhite.service;

import com.xhite.dto.requests.UrunEklemeRequestDto;
import com.xhite.mapper.IUrunMapper;
//import com.xhite.rabbitMq.producer.CreateStokProducer;
import com.xhite.repository.IUrunRepository;
import com.xhite.repository.entities.Urun;
import com.xhite.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UrunService extends ServiceManager<Urun, Long> {
    private final IUrunRepository urunRepository;
    //private final CreateStokProducer createStokProducer;
    //public UrunService(IUrunRepository repository, CreateStokProducer createStokProducer) {
    //    super(repository);
    //    urunRepository = repository;
    //    this.createStokProducer = createStokProducer;
    //}
    public UrunService(IUrunRepository repository) {
        super(repository);
        urunRepository = repository;
    }
    public ArrayList<Urun> findAll()
    {
        return (ArrayList<Urun>) urunRepository.findAll();
    }
    public void urunKaydet(UrunEklemeRequestDto dto)
    {
        if(urunRepository.findOptionalByUrunAdi(dto.getUrunAdi()).isEmpty())
        {
            Urun urun = IUrunMapper.INSTANCE.toUrun(dto);
            urunRepository.save(urun);
            Long urunId = urun.getId();
            // createStokProducer.sendCreateStokMessage(IUrunMapper.INSTANCE.toStokBilgiDto(dto, urunId));
        }

    }
}
