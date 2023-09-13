package com.alisson.reader.xml.models.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Builder
@AllArgsConstructor
@Table(name = "agente_body")
public class AgenteBodyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, insertable = false, updatable = false)
    private Long id;

    @Column(nullable = false)
    private Integer codigo;

    @Column(nullable = false)
    private Date data;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "regiao", referencedColumnName = "id")
    private RegiaoEntity regiao;

    public AgenteBodyEntity() {
    }
}
