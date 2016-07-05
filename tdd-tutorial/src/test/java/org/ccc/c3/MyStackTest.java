package org.ccc.c3;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class MyStackTest {

	private MyStack stack = new MyStack(5);
	
	@Test
	public void testPushANumber() {
		stack.push(5l);
		assertThat(stack.peek(), is(5l));
	}
	
	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void testPushPassedTheLimit() {
		stack = new MyStack(2);
		stack.push(1l);
		stack.push(2l);
		stack.push(3l);
	}
	
	@Test
	public void testPop() {
		stack.push(5l);
		long res = stack.pop();
		assertThat(res, is(5l));
	}

}
