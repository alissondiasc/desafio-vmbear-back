package com.alisson.reader.xml.service;

import com.alisson.reader.xml.mappers.AgenteMapper;
import com.alisson.reader.xml.models.RegiaoEnum;
import com.alisson.reader.xml.models.entity.AgenteBodyEntity;
import com.alisson.reader.xml.models.entity.AgenteEntity;
import com.alisson.reader.xml.models.request.ReaderXmlRequest;
import com.alisson.reader.xml.repository.AgenteBodyRepository;
import com.alisson.reader.xml.repository.AgenteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AgenteService {

    private final AgenteMapper mapper;
    private final AgenteRepository repository;
    private final AgenteBodyRepository agenteBodyRepository;

    public void save(ReaderXmlRequest request) {
        AgenteEntity agenteEntity = mapper.toAgenteEntity(request);
        repository.save(agenteEntity);
    }

    public List<AgenteBodyEntity> findBySigla(RegiaoEnum regiaoEnum) {
        return agenteBodyRepository.findByRegiao_Sigla(regiaoEnum);
    }
}
