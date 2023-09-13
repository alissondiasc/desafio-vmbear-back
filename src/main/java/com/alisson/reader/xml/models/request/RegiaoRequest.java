package com.alisson.reader.xml.models.request;

import com.alisson.reader.xml.models.RegiaoEnum;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class RegiaoRequest {
    private GeracaoRequest geracao;
    private CompraRequest compra;
    private Object precoMedio;
    private RegiaoEnum sigla;
}
