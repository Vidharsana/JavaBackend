package com.test;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class CollectionsTest {

	@Test
	public void testListOgNumbers() {
		List<Integer> listNum = Arrays.asList(10,20,30,40,50,60);
		List<Integer> expctData = Arrays.asList(10,20,30,40,50,60);
		//assertEquals(expctData, listNum);
		//assertThat(listNum, is(expctData));
		//assertThat(listNum, hasItems(20));
		//assertThat(listNum.size(), is(6));
		//assertThat(listNum, IsEmptyCollection.empty());		
	}
	public void testCollectionObjects() {
		List<fruits> listActual = Arrays.asList(new fruits("banana",5),
				                                 new fruits("apple",30),
				                                 new fruits("orange",50));
		assertThat(listActual, hasItems(new fruits("orange",50)));
		
	}
}
