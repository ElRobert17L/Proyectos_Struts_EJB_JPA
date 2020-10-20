package mx.com.rlr.capaservicio;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import mx.com.rlr.capadatos.PersonaDao;
import mx.com.rlr.capadatos.domain.Persona;

@Stateless
public class PersonaServiceImpl implements PersonaService {

    @Inject
    private PersonaDao personaDao;
    
    @Override
    public List<Persona> listarPersonas() {
        return personaDao.findAllPersonas();
    }

    @Override
    public Persona recuperarPersona(Persona persona) {
        return personaDao.findPersonaById(persona.getIdPersona());
    }

    @Override
    public void agregarPersona(Persona persona) {
        personaDao.insertPersona(persona);
    }

    @Override
    public void modificarPersona(Persona persona) {
        personaDao.updatePersona(persona);
    }

    @Override
    public void eliminarPersona(Persona persona) {
        personaDao.deletePersona(persona);
    }

    @Override
    public long contarPersonas() {
        return personaDao.contadorPersona();
    }
    
}
