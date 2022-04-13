/*
 * testSelectionSort.java
 *
* To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

import java.util.Arrays;
import org.junit.Test;

public class testSelectionSort {
	@Test
	public void test() {
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
	}
	
	SelectionSort s = new SelectionSort();

    public void testMixed(){

        int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = -9;
        arr[2] = -7;
        arr[3] = -3;
        arr[4] = -2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -9;
        Sortedarr[1] = -8;
        Sortedarr[2] = -7;
        Sortedarr[3] = -3;
        Sortedarr[4] = -2;

        int[] result = s.basicSelectionSort(arr);
        assert Arrays.equals(result, Sortedarr);

    }

    public void testDuplicates(){

        int[] arr = new int[5];
        arr[0] = -9;
        arr[1] = -8;
        arr[2] = -9;
        arr[3] = -2;
        arr[4] = -8;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -9;
        Sortedarr[1] = -9;
        Sortedarr[2] = -8;
        Sortedarr[3] = -8;
        Sortedarr[4] = -2;

        int[] result = s.basicSelectionSort(arr);
        assert Arrays.equals(result, Sortedarr);

    }


}
