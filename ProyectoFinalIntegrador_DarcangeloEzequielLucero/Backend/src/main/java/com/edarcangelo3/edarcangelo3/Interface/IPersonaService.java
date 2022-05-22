package com.edarcangelo3.edarcangelo3.Interface;

import com.edarcangelo3.edarcangelo3.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    //Para que traiga una lista de personas 
    public List<Persona> getPersona();
    
    //Para que guarde un objeto de tipo persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto pero lo buscamos por ID
    public void deletePersona(Long id);
    
    //Para que busque una persona por ID
    public Persona findPersona(Long id);
    
}
