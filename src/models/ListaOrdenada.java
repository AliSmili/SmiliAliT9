package models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

import exceptions.ElementNotAllowedException;
import exceptions.ListSizeOverflownException;

public class ListaOrdenada<T> extends ArrayList<T> {

	private final byte MAX_SIZE = 100;

	public ListaOrdenada(Comparator<T> comp) {
		super();
	}

	@Override
	public boolean add(T element) throws ElementNotAllowedException, ListSizeOverflownException {
		if (element != null) {
			
			if (this.size() <= MAX_SIZE) {
				return super.add(element);

			} else {
				throw new ListSizeOverflownException("La cola esta llena");
			}
		} else {
			throw new ElementNotAllowedException("No accepto valores nulos");
		}

	}

	public boolean addAll(Collection<? extends T> collection) throws ListSizeOverflownException, NullPointerException {
		if (collection != null) {
			if (collection.size() + this.size() < MAX_SIZE) {
				return super.addAll(collection);

			} else {
				throw new ListSizeOverflownException("La cola esta llena");
			}

		} else {
			throw new NullPointerException("No se aceptan valores nulos");
		}
	}

	public void reverse(List<? extends T> list) {

		list = new ArrayList<T>();
		if (this.size() >= 1) {
			super.sort((Comparator<? super T>) list);
			//Aqui me señala error
			//super.reverse(list);
		} else {
			throw new ListSizeOverflownException("La cola no puede vaciarse jamás ");
		}

	}

	public T min(Collection<? extends T> lista, Comparator<? super T> comp) {
		if (lista != null) {
			if (lista.size() + this.size() < MAX_SIZE) {
				return super.get(0);

			} else {
				throw new ListSizeOverflownException("La cola esta llena");
			}

		} else {
			throw new NullPointerException("No se aceptan valores nulos");
		}

	}

	public T max(Collection<? extends T> lista, Comparator<? super T> comp) {
		if (lista != null) {
			if (lista.size() + this.size() < MAX_SIZE) {
				return super.get(lista.size() - 1);

			} else {
				throw new ListSizeOverflownException("La cola esta llena");
			}

		} else {
			throw new NullPointerException("No se aceptan valores nulos");
		}

	}
	
	

}
