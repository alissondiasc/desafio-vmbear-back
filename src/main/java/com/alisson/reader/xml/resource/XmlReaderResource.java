package com.alisson.reader.xml.resource;

import com.alisson.reader.xml.models.request.ReaderXmlRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Slf4j
public class XmlReaderResource {

    @PostMapping(
            path = "create",
            consumes = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE}
    )
    public ResponseEntity readerXml(@RequestBody ReaderXmlRequest readerXmlRequest) {

        readerXmlRequest.getAgente().forEach(agenteRequest -> System.out.println("Codigo agente recebido: " + agenteRequest.getCodigo()));

        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
