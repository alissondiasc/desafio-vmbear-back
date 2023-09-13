package com.alisson.reader.xml.mappers;

import com.alisson.reader.xml.models.entity.AgenteBodyEntity;
import com.alisson.reader.xml.models.entity.AgenteEntity;
import com.alisson.reader.xml.models.entity.RegiaoEntity;
import com.alisson.reader.xml.models.request.AgenteRequest;
import com.alisson.reader.xml.models.request.ReaderXmlRequest;
import com.alisson.reader.xml.models.request.RegiaoRequest;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class AgenteMapper {

    public AgenteEntity toAgenteEntity(ReaderXmlRequest request) {
        if (request == null) return null;

        AgenteEntity agenteEntity = AgenteEntity.builder()
                .versao(request.getVersao())
                .agentes(toAgentesBodyEntity(request.getAgente())).build();
        return agenteEntity;
    }

    private List<AgenteBodyEntity> toAgentesBodyEntity(List<AgenteRequest> agenteRequests) {
        if (agenteRequests == null || agenteRequests.isEmpty()) return Collections.emptyList();
        return agenteRequests.stream().map(this::toAgenteBodyEntity).collect(Collectors.toList());
    }

    private AgenteBodyEntity toAgenteBodyEntity(AgenteRequest agenteRequest) {
        if (agenteRequest == null) return null;
        AgenteBodyEntity agenteBodyEntity = AgenteBodyEntity.builder()
                .regiao(toRegiaoEntity(agenteRequest.getRegiao()))
                .data(agenteRequest.getData())
                .codigo(agenteRequest.getCodigo()).build();
        return agenteBodyEntity;
    }

    private RegiaoEntity toRegiaoEntity(RegiaoRequest request) {

        if (request == null) return null;

        RegiaoEntity regiaoEntity = RegiaoEntity.builder()
                .sigla(request.getSigla())
                .geracao(request.getGeracao().getValor())
                .compra(request.getCompra().getValor())
                .build();

        return regiaoEntity;

    }
}
