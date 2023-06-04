package com.priv;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Persona persona = new Persona();
        persona.setEdad(30);
        persona.setNombre("Marcos");
        persona.setTelefono(1234567);
        System.out.println( "Nombre:" + persona.getNombre() );
        System.out.println( "Edad:" + persona.getEdad() );
        System.out.println( "Telefono:" + persona.getTelefono() );
        

    }
}
