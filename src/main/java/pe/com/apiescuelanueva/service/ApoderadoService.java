/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.apiescuelanueva.service;

import java.util.List;
import java.util.Optional;
import pe.com.apiescuelanueva.entity.ApoderadoEntity;

/**
 *
 * @author bruce 002
 */
public interface ApoderadoService {
    List<ApoderadoEntity> findAll();
    List<ApoderadoEntity> findAllCustom();
    Optional<ApoderadoEntity> findById(Long id);
    ApoderadoEntity add(ApoderadoEntity a);
    ApoderadoEntity update(ApoderadoEntity a);
    ApoderadoEntity delete(ApoderadoEntity a);
}
