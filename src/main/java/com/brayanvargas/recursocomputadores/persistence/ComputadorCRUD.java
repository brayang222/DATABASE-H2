package com.brayanvargas.recursocomputadores.persistence;

import com.brayanvargas.recursocomputadores.domain.Computador;
import org.springframework.data.repository.CrudRepository;

public interface ComputadorCRUD extends CrudRepository<Computador, Integer> {

}
