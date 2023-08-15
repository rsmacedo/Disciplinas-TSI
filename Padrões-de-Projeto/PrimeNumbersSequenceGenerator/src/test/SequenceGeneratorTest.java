package test;

import SequenceGenerator.SequenceGenerator;

public abstract class SequenceGeneratorTest {

	protected final SequenceGenerator generator;

	public SequenceGeneratorTest(SequenceGenerator generator) {
		this.generator = generator;
	}

	public abstract void test();

}