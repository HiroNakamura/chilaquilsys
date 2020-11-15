package com.inforhomex.chilaquilsys.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.inforhomex.chilaquilsys.entities.Libro;
import com.inforhomex.chilaquilsys.service.LibroRestService;
import java.util.List;

@RestController
@RequestMapping("/chilaquilsys")
public class ChilaquilRestController{

    @Autowired
    @Qualifier("libroRestService")
    private LibroRestService libroRestService;


    //http://localhost:8090/chilaquilsys/index
    @GetMapping("/index")
    public String index(){
        return "Chilaquilsys Activo !!";
    }

     //http://localhost:8090/chilaquilsys/libros
     @GetMapping("/libros")
     @CrossOrigin(origins = "http://localhost:4200")
     public List<Libro> getLibros() {
         return libroRestService.getAllLibros();
     }



}