package com.generation.lojadegame.repository;

import com.generation.lojadegame.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    public List<Categoria> findAllByTipoContainingIgnoreCase(String tipo);
}
