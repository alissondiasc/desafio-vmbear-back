package com.alisson.reader.xml.models.request;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
public class ReaderXmlRequest {

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<AgenteRequest> agente;
    private Double versao;
}
