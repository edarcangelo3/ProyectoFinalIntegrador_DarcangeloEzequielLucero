package com.edarcangelo3.edarcangelo3.Repository;

import com.edarcangelo3.edarcangelo3.Entity.Persona;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Long> {
    
}
