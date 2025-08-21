/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import dao.PersonaDAO;
import modelo.Persona;

/**
 *
 * @author herra
 */
public class OperacionesHibernateJPA {
    public static void main(String[] args) {
        try (PersonaDAO personaDao = new PersonaDAO()){
            // 1. Caso listar
            personaDao.imprimirPersonas();
            
            // 2. Caso insertar
            /**
            Persona persona = new Persona();
            persona.setNombre("Carlos");
            persona.setApellido("Lara");
            persona.setEmail("clara@gmail.com");
            persona.setTelefono("7412528963");
            persona.setSaldo(4578.48);
            
            personaDao.insertar(persona);
            */
            
            // 3. Caso actualizar
           /**
            Persona persona = new Persona();
            persona.setIdPersona(73);
            
            persona = personaDao.buscarPersonaPorId(persona);
            System.out.println("Persona encontrada: " + persona);
            
            
            //persona.setNombre("Carlos");
            persona.setApellido("Esparza2");
            persona.setEmail("cesparza@gmail.com");
            //persona.setTelefono("7412528963");
            
            personaDao.modificar(persona);
            personaDao.imprimirPersonas();
           */
           
           
            // 4. Caso eliminar
            /**
            Persona persona = new Persona();
            persona.setIdPersona(73);
             
            persona = personaDao.buscarPersonaPorId(persona);
            System.out.println("Persona encontrada: " + persona);
            
            personaDao.eliminar(persona);
            personaDao.imprimirPersonas();
            */
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
