package exercicio2;

import java.util.List;
import java.util.Arrays;

public class Resultado {
	public static void main(String[] args) {
		 BubbleSort bs = new BubbleSort();
		 List<Integer> list = bs.sortear(Arrays.asList(5, 3, 2, 4, 7, 1, 0, 6));
		 System.out.println(list);
	}

}
