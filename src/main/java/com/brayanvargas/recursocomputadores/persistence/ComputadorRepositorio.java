package com.brayanvargas.recursocomputadores.persistence;

import com.brayanvargas.recursocomputadores.domain.Computador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ComputadorRepositorio {

    @Autowired
    private ComputadorCRUD computadorCRUD;

    public List<Computador> getAll(){
        return (List<Computador>) computadorCRUD.findAll();
    }

    public List<Computador> getAllByMarca(String marca){
        return computadorCRUD.findAllByMarca(marca);
    }

}
