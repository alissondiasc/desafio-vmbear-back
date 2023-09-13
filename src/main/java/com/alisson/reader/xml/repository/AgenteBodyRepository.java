package com.alisson.reader.xml.repository;

import com.alisson.reader.xml.models.RegiaoEnum;
import com.alisson.reader.xml.models.entity.AgenteBodyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AgenteBodyRepository extends JpaRepository<AgenteBodyEntity, Long> {

    List<AgenteBodyEntity> findByRegiao_Sigla(RegiaoEnum sigla);
}
