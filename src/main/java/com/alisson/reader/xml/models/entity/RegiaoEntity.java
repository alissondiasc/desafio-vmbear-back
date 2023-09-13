package com.alisson.reader.xml.models.entity;

import com.alisson.reader.xml.models.RegiaoEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
@Builder
@AllArgsConstructor
@Table(name = "regiao")
public class RegiaoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @Column(nullable = false)
    private String geracao;

    @Column(nullable = false)
    private String compra;

    @Column
    private String precoMedio;

    @Column(nullable = false)
    private RegiaoEnum sigla;

    public RegiaoEntity() {
    }
}
