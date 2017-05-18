package pl.sdacademy.search.sandbox;

 import static org.junit.Assert.assertTrue;
 
 import org.junit.Before;
 import org.junit.Test;
 
 import pl.sdacademy.utils.TableUtils;
 
 public class ISearchAlgoritmTest {
     int invalidIndex;
     int[] randomArray;
     int[] sortedArray;
     int[] emptyArray;
     
     ISearchAlgorithm searchAlgorithm;
     TableUtils tableUtils;
 
     @Before
     public void setUp() {
    invalidIndex = -1;
 	randomArray = new int[] { 23, 1, 53, 7, 98, 3, 2 };
 	sortedArray = new int [] {1,23,33,44,55,66,77,88,99};
 	emptyArray = new int [0];
 	tableUtils = new TableUtils();
 	searchAlgorithm = new NaiveSearchAlgorithm();
     }
 
     
     @Test
     public void shouldFindElementInArray() {
 	// given
 	
 	// when
 	int receicedResult = searchAlgorithm.search(randomArray, valueToFind);
 
 	// then
 	boolean result = (receicedResult == expectedResult);
 
 	assertTrue("Can't find element = " + valueToFind + " in values: " + tableUtils.print(randomArray), result);
     }
 
     @Test
     public void shouldFindElementInSortedArray() {
    	  boolean result = shouldFindElementInArray(23,1, sortedArray);
    	  assertTrue("Can't find element = " + 23 + " in values: " + tableUtils.print(sortedArray), result);
 
 
     }
 
     @Test
     public void shouldReturnInvalidIndexIfElementNotPresent() {
int searchResult = searchAlgorithm.search(randomArray, 31);
 
 	assertTrue("Invalid index doesn't exist", searchResult < 0 );
     }
 
     @Test
     public void shouldReturnInvalidIndexIfArrayLenghtIsZero() {
  
     int receivedResult = searchAlgorithm.search(emptyArray, 2);
     
 	assertTrue("Array is empty", receivedResult < 0);
     }
 
     @Test
     public void shouldThrowIfArrayIsNull() {
     boolean hasThrow = false; 
     int[] array = null; 
     int value = 4; 
     try {
		searchAlgorithm.search(array, value);
	} catch (Exception e) {
		// TODO: handle exception
	hasThrow = true;
	
	}
 	assertTrue("It doesn't throw exeption",hasThrow);
     }
 }