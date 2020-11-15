package com.inforhomex.chilaquilsys.service.impl;

import com.inforhomex.chilaquilsys.entities.Libro;
import com.inforhomex.chilaquilsys.repository.LibroRestRepository;
import com.inforhomex.chilaquilsys.service.LibroRestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service("libroRestService")
public class LibroRestServiceImpl implements LibroRestService{

    @Autowired
    private LibroRestRepository libroRestRepository;

    @Override
    public List<Libro> getAllLibros() {
        return libroRestRepository.findAll();
    }
    
}