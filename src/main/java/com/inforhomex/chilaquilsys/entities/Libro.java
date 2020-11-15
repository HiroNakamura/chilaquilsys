package com.inforhomex.chilaquilsys.entities;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.Set;


@Table(name="libro")
@Entity(name="Libro")
public class Libro{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "titulo")
    private String titulo;
    @Column(name = "editorial")
    private String editorial;
    @Column(name = "paginas")
    private int paginas;
    @Column(name = "isbn")
    private String isbn;
    @Column(name = "autor")
    private String autor;

    public Libro(){}

    public Libro(int id, String titulo,String editorial,int paginas, String isbn, String autor){
        this.id = id;
        this.titulo = titulo;
        this.editorial = editorial;
        this.paginas = paginas;
        this.isbn = isbn;
        this.autor = autor;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public String getAutor(){
        return autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setEditorial(String editorial){
        this.editorial = editorial;
    }

    public String getEditorial(){
        return editorial;
    }


    public void setPaginas(int paginas){
        this.paginas = paginas;
    }

    public int getPaginas(){
        return paginas;
    }

    public void setIsbn(String isbn){
        this.isbn = isbn;
    }

    public String getIsbn(){
        return isbn;
    }


    @Override
    public String toString(){
        return "Libro{id: "+this.id+", titulo: "+this.titulo+", autor: "+this.autor+", editorail: "+this.editorial+", isbn: "+this.isbn+", paginas: "+this.paginas+"}";
    }

}