package br.com.alunoonline.api.repository;

import br.com.alunoonline.api.model.Professor;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long>{

}
