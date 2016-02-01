package com.springinaction.knights;

import java.io.PrintStream;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Minstrel {

	private PrintStream stream;

	public Minstrel(PrintStream stream) {
		this.stream = stream;
	}

	@Before(value="execution(* *.embarkOnQuest(..))")
	public void singBeforeQuest() {
		stream.println("Fa la la, the knight is so brave!");
	}

	@After(value="execution(* *.embarkOnQuest(..))")
	public void singAfterQuest() {
		stream.println("Tee hee hee, the brave knight " + "did embark on a quest!");
	}

}
