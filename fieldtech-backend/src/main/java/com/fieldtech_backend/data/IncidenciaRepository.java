package com.fieldtech_backend.data; 
 
import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository;
import com.fieldtech_backend.domain.Incidencia;

import java.util.List; 
 
@Repository 
public interface IncidenciaRepository extends JpaRepository<Incidencia, Long> { 
   List<Incidencia> findByTecnicoCodigoOrderByFechaReporteDesc(String codigo);
}