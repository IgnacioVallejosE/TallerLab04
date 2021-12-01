package Estructura;

import java.util.ArrayList;
import java.util.Scanner;

public class Desaparecidos {
    ArrayList<Persona> personas = new ArrayList<>();
    public void agregarDesaparecidos(){
     Scanner tec = new Scanner(System.in);
     String nombre = tec.next();
     String sexo = tec.next();
     int edad = tec.nextInt();
     Persona persona = new Persona();
      persona.setNombre(nombre);
      persona.setSexo(sexo);
      persona.setEdad(edad);
      personas.add(persona);
    }

    public void listaDesaparecidos(){
        System.out.println(personas);
        }
    }
