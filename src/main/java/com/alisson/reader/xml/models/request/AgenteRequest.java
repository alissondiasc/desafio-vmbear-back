package com.alisson.reader.xml.models.request;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Getter
@NoArgsConstructor
public class AgenteRequest {
    private Integer codigo;
    private Date data;
    private RegiaoRequest regiao;
}
