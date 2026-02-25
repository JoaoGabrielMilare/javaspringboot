package com.joao.school.repositories;

import com.joao.school.models.AlunoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository <AlunoModel, Long> {
}
