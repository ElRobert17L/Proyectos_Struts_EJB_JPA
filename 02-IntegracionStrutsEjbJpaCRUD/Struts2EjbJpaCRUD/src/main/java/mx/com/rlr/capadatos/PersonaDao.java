package mx.com.rlr.capadatos;

import java.util.List;
import mx.com.rlr.capadatos.domain.Persona;

public interface PersonaDao {
    
    void insertPersona(Persona persona);
    
    void updatePersona(Persona persona);
    
    void deletePersona(Persona persona);
    
    Persona findPersonaById(long idPersona);
    
    List<Persona> findAllPersonas();
    
    long contadorPersona();
    
    Persona getPersonaByEmail(Persona persona);
}
