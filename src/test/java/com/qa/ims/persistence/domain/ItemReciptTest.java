package com.qa.ims.persistence.domain;

import org.junit.jupiter.api.Test;

import nl.jqno.equalsverifier.EqualsVerifier;

public class ItemReciptTest {
	@Test
	public void testEquals() {
		EqualsVerifier.simple().forClass(ItemRecipt.class).verify();
	}


}
