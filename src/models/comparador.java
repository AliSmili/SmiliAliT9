package models;
import java.util.Comparator;

	public class comparador implements Comparator<Integer>{
		@Override
		//De mayoy a menor
		public int compare(Integer p1, Integer p2){				 

			if(p1 > p2) return 1;
			if(p1 < p2) return -1;
			return 0;


}

}
