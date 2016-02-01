package com.springinaction.knights;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.testng.annotations.Test;

public class BraveKnightTest {

	@Test
	public void embarkOnQuest() {
		Quest mockQuest = mock(Quest.class);
		Knight knight = new BraveKnight(mockQuest);
		knight.embarkOnQuest();
		verify(mockQuest, times(1)).embark();
	}
}
