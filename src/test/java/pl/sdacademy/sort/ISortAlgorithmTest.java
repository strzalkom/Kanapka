package pl.sdacademy.sort;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ISortAlgorithmTest {

    ISortAlgorithm sortAlgorithm = null;
    int[] unSortedTable = { 1, 5, 87, 2, 4 };
    int[] sortedTableAsc = { 1, 2, 4, 5, 87 };
    int[] sortedTableDesc = { 87, 5, 4, 2, 1 };

    /**
     * Test sprawdzajacy czy tablica jest domyslnie posortowana rosnaco
     */
    @Test
    public void shouldSortArrayAscendingByDefault() {
	// given unSortedTable

	// when
	sortAlgorithm.sort(unSortedTable);

	// then

	assertTrue(isTableEqual(unSortedTable, sortedTableAsc));
    }

    /**
     * Ta metoda porównuje dwie tablice z warunków wejściowych z tablica
     * sortedTable
     * 
     * @param sortedTable
     * @return
     */
    private boolean isTableEqual(int[] tableToSort, int[] sortedTable) {
	boolean isAllElementEqual = true;
	int i = 0;
	while (isAllElementEqual) {
	    isAllElementEqual = tableToSort[i] == sortedTable[i];
	    i++;
	    if (!isAllElementEqual) {
		break;

	    }
	}
	return isAllElementEqual;
    }

    /**
     * Test sprawdzajacy czy tablica jest posortowana malejaco
     */
    @Test
    public void shouldSortArrayDependingOnTheOrder() {
	// given unSortedTable
	// ISortAlgorithm sortAlgorithm = null;

	// when
	sortAlgorithm.sort(unSortedTable, false);

	// then
	assertTrue(isTableEqual(unSortedTable, sortedTableDesc));
    }

    /**
     * Test sprawdzajacy czy posortowana tablica</br>
     * pozostanie posortowana po uzyciu metody sortujacej
     */
    @Test
    public void shouldLeaveSortedSortArrayUnchanged() {
	assertTrue(false);
    }

    /**
     * Test sprawdzajacy zrzucenie wyjatku w przypadku tablicy null
     */
    @Test
    public void shouldThrowExceptionIfArrayIsNull() {
	assertTrue(false);
    }

    /**
     * Test sprawdzajacy wykonania metody </br>
     * bez zrzucania wyjatku w przypadku tablicy pustej
     */
    @Test
    public void shouldNotThrowIfArrayIsZeroSize() {
	assertTrue(false);

    }

    /**
     * Test sprawdzajacy czy elementy tablicy sortuja się </br>
     * w przypadku gdy elementy nie sa unikalne czyli</br>
     * powtarzaja sie
     */
    @Test
    public void shouldSortIfElementsAreNotUnique() {
	assertTrue(false);

    }
}
