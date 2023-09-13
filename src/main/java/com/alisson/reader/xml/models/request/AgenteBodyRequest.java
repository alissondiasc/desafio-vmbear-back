package com.alisson.reader.xml.models.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AgenteBodyRequest {
    private Integer codigo;
    private Date data;
    private List<RegiaoRequest> regiao;
}
