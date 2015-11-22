package com.example.joan.p03mathdice4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Lista_contenido {

    /**
     * Donde se guardan las entradas de la lista.
     */
    public static ArrayList<Lista_entrada> ENTRADAS_LISTA = new ArrayList<Lista_entrada>();

    /**
     * Donde se asigna el identificador a cada entrada de la lista
     */
    public static Map<String, Lista_entrada> ENTRADAS_LISTA_HASHMAP = new HashMap<String, Lista_entrada>();

    /**
     * Creamos estáticamente las entradas
     */
    static {
        aniadirEntrada(new Lista_entrada("0", R.drawable.ic_account_circle_white_24dp, "PERFIL"));
        aniadirEntrada(new Lista_entrada("1", R.drawable.ic_extension_white_24dp, "JUEGO"));
        aniadirEntrada(new Lista_entrada("2", R.drawable.ic_description_white_24dp, "INSTRUCIONES"));
        aniadirEntrada(new Lista_entrada("3", R.drawable.ic_info_white_24dp, "INFO"));
    }

    /** Añade una entrada a la lista
     * @param entrada Elemento que añadimos a la lista
     */
    private static void aniadirEntrada(Lista_entrada entrada) {
        ENTRADAS_LISTA.add(entrada);
        ENTRADAS_LISTA_HASHMAP.put(entrada.id, entrada);
    }

    /**
     * Representa una entrada del contenido de la lista
     */
    public static class Lista_entrada {
        public String id;
        public int idImagen;
        public String textoEncima;

        public Lista_entrada (String id, int idImagen, String textoEncima) {
            this.id = id;
            this.idImagen = idImagen;
            this.textoEncima = textoEncima;
        }
    }

}