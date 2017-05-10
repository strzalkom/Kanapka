package pl.sdacademy.utils;

public class TableUtils implements ITableUtils {

	/**
	 * Zamiana elementów w tablicy</br>
	 * i,j elementy od 0 do n, gdzie n to lenght table
	 * 
	 * @param i
	 * @param j
	 */
	@Override
	public void changeElement(Object[] table, int i, int j) {
		// TODO Proszę zrobić zamianę elementów w tablicy
		if ((i >= table.length) || (j >= table.length))
		{
			return;
		}
			
		Object tmp = table[i];
		table[i] = table[j];
		table[j] = tmp;

	}
		public void print(Object [] table){
			for(Object element: table ){			// 
				System.out.println(element);
			}
			
		}

}
