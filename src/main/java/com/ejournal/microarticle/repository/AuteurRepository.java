package com.ejournal.microarticle.repository;

import com.ejournal.microarticle.entity.Auteur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuteurRepository extends JpaRepository<Auteur, Long> {
}
