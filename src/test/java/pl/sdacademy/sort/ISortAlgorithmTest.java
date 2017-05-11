package pl.sdacademy.sort;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ISortAlgorithmTest {

    @Test
    public void shouldSortArrayAscendingByDefault() {
	// given
	ISortAlgorithm sortAlgorithm = null;
	int[] tableToSort = { 1, 5, 87, 2, 4 };
	int[] sortedTable = { 1, 2, 4, 5, 87 };

	// when
	sortAlgorithm.sort(tableToSort);

	// then
	boolean isAllElementEqual = true;
	int i = 0;
	while (isAllElementEqual) {
	    isAllElementEqual = tableToSort[i] == sortedTable[i];
	    i++;
	    if (!isAllElementEqual) {
		break;

	    }
	}

	assertTrue(isAllElementEqual);
    }

    @Test
    public void shouldSortArrayDependingOnTheOrder() {
	// given
	ISortAlgorithm sortAlgorithm = null;
	int[] tableToSort = { 1, 5, 87, 2, 4 };
	int[] sortedTable = {};

	// when
	sortAlgorithm.sort(tableToSort);

	// then
	assertTrue(false);
    }

}
