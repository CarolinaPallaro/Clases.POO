package com.DH.composite;

import com.DH.composite.Modelo.Hoja;
import com.DH.composite.Modelo.HojaCompuesta;

public class MainApp {
    public static void main(String[] args) {

        // 1)
        // No tienen descripcion xq el constructor está vacio (es un boceto)
        Hoja elementoUno = new Hoja();
        Hoja elementoDos = new Hoja();


        // 2)
        // Acá seteo dos espacios combinables, y abajo le agrego los elementos/hojas que quiera queden
        // combinados en ese espacio preparado.
        HojaCompuesta generoUnaComposicionDeHojas = new HojaCompuesta();
        HojaCompuesta generoOtraComposicionDeHojas = new HojaCompuesta();


        // Entonces arriba generé primero dos hojas, una y una (paso 1)
        // Despues generé dos "espacios/contenedores" para almacenar/combinar (paso 2)

        generoUnaComposicionDeHojas.AgregoElementosEnUnaComposicion(elementoUno);
        generoUnaComposicionDeHojas.AgregoElementosEnUnaComposicion(elementoDos);
        // Y al espacio generado en el paso 2, le agrego los elementos que quiera del paso 1


        // Y aca genero el famoso combo de los combos
        // En un espacio compuesto generado, almaceno un elemento
        // compuesto(generoUnaComposicionDeHojas) junto con elementos simples
        generoOtraComposicionDeHojas.AgregoElementosEnUnaComposicion(generoUnaComposicionDeHojas);
        generoOtraComposicionDeHojas.AgregoElementosEnUnaComposicion(elementoUno);
        generoUnaComposicionDeHojas.AgregoElementosEnUnaComposicion(elementoDos);


        
    }
}