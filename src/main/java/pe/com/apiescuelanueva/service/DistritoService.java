package pe.com.apiescuelanueva.service;

import java.util.List;
import java.util.Optional;
import pe.com.apiescuelanueva.entity.DistritoEntity;

public interface DistritoService {
    List<DistritoEntity> findAll();
    List<DistritoEntity> findAllCustom();
    Optional<DistritoEntity> findById(Long id);
    DistritoEntity add(DistritoEntity d);
    DistritoEntity update(DistritoEntity d);
    DistritoEntity delete(DistritoEntity d);
}
