package Estructura;

import java.util.ArrayList;

public class ArregloDesaparecidos {
    private ArrayList<Desaparecidos> arreglo;

    public ArregloDesaparecidos() {
        arreglo = new ArrayList<Desaparecidos>();
    }

    public void agregar(Desaparecidos a) {
        arreglo.add(a);
    }

    public Desaparecidos obtener(int posicion) {
        return arreglo.get(posicion);
    }
    public int tamaño(){
        return arreglo.size();
    }
}

