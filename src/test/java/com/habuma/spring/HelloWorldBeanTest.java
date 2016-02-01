package com.habuma.spring;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class HelloWorldBeanTest {

	HelloWorldBean sut;

	@Test
	public void sayHello() {
		sut = new HelloWorldBean();
		assertEquals(sut.sayHello(), "Hello World");
	}
}
