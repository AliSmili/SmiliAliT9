package main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import exceptions.ListSizeOverflownException;

import java.util.Comparator;
import models.ListaOrdenada;
import models.comparador;
public class pruebaListaOrdenada {

	public static void main(String[] args) throws ListSizeOverflownException {
		
		comparador comp = new comparador();
		List<Integer> miLista = new ListaOrdenada<Integer>(comp);
			
		
		miLista.add(23);
		miLista.add(43);
		miLista.add(7);
		miLista.add(2);
		miLista.add(1);
		
		/**
		 * Ordenamos primero y luego revertimos el orden con reverse
		 * 
		 */
		Collections.sort(miLista, comp);
		Collections.reverse(miLista);
		
		System.out.println(miLista);
		
	

}
}
