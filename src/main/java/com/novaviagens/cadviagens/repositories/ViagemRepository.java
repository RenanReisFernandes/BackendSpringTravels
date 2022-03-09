package com.novaviagens.cadviagens.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.novaviagens.cadviagens.entities.Viagem;

@Repository
public interface ViagemRepository extends JpaRepository<Viagem, Long> {

}
