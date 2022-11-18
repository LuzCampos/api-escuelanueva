/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.apiescuelanueva.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.apiescuelanueva.entity.ParentescoEntity;
import pe.com.apiescuelanueva.repository.ParentescoRepository;

/**
 *
 * @author bruce 002
 */
//permite definir la clase como un servicio
@Service
public class ParentescoServiceImpl implements ParentescoService{

       //inyectar dependencias
    @Autowired
    private ParentescoRepository parentescorepository;

    @Override
    public List<ParentescoEntity> findAll() {
        return parentescorepository.findAll();
    }

    @Override
    public List<ParentescoEntity> findAllCustom() {
        return parentescorepository.findAllCustom();
    }

    @Override
    public Optional<ParentescoEntity> findById(Long id) {
        return parentescorepository.findById(id);
    }

    @Override
    public ParentescoEntity add(ParentescoEntity p) {
        return parentescorepository.save(p);
    }

    @Override
    public ParentescoEntity update(ParentescoEntity p) {
        ParentescoEntity objparentesco=parentescorepository.getById(p.getCodigo());
        BeanUtils.copyProperties(p, objparentesco);
        return parentescorepository.save(objparentesco);
    }

    @Override
    public ParentescoEntity delete(ParentescoEntity p) {
        ParentescoEntity objparentesco=parentescorepository.getById(p.getCodigo());
        objparentesco.setEstado(false);
        return parentescorepository.save(objparentesco);
    }
    
}
