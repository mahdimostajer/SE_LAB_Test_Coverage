package com.unittest.codecoverage.samples;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class SpySampleTest {
	
	@Spy
	List<String> spyList = mock(ArrayList.class, withSettings().useConstructor().defaultAnswer(CALLS_REAL_METHODS));

	@Test
	@DisplayName("Verifies certain behavior happened at least once time.")
	public void whenUsingTheSpyAnnotation_thenObjectIsSpied() {
	    spyList.add("one");
	    spyList.add("two");

	    Mockito.verify(spyList).add("one");
	    Mockito.verify(spyList).add("two");

	    assertEquals(2, spyList.size());
	}
	
	@Test
	@DisplayName("Verifies certain behavior happened at least two times.")
	public void whenUsingTheSpyAnnotation_thenObjectIsSpiedMoreThanOneTime() {
		spyList.add("one");
		spyList.add("one");

	    Mockito.verify(spyList, times(2)).add("one");

	    assertEquals(2, spyList.size());
	}

}
