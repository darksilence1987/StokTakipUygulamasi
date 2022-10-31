package com.xhite.service;

import com.xhite.mapper.IStokMapper;
import com.xhite.rabbitMq.model.CreateStok;
import com.xhite.repository.IStokRepository;
import com.xhite.repository.entities.Stok;
import com.xhite.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class StokService extends ServiceManager<Stok, Long> {
    public final IStokRepository stokRepository;
    public StokService(IStokRepository repository) {
        super(repository);
        stokRepository = repository;
    }
    public Stok findOptionalByUrunIdAndDepoKonumu(Long urunId, String depoKonumu)
    {
        return stokRepository.findOptionalByUrunIdAndDepoKonumu(urunId, depoKonumu).orElse(null);
    }
    public ArrayList<Stok> findAll()
    {
        return (ArrayList<Stok>) stokRepository.findAll();
    }
    public void stokKaydet(CreateStok createStok)
    {
        Stok stok = stokRepository.findOptionalByUrunIdAndDepoKonumu(createStok.getUrunId(), createStok.getDepoKonumu()).orElse(null);
        if(stok == null)
        {
            stokRepository.save(IStokMapper.INSTANCE.toStok(createStok));
        }
        else
        {
            stok.setStokMiktari(stok.getStokMiktari() + createStok.getStokMiktari());
            stokRepository.save(stok);
        }
    }
}