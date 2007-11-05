package edu.hawaii.stack;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import org.junit.Test;

/**
 * Test case for the Stack abstract data type, which checks to see that you can push three
 * objects onto the stack, then pop them off and get the exact same objects in the correct order.
 * This test also checks to see that popping an empty stack generates an exception.
 *
 * @author Philip Johnson
 * @version $Id: TestStack.java,v 1.6 2004/10/27 22:58:03 johnson Exp $
 */
public class TestStack {

  // Objects used for testing.
  private Integer one = Integer.valueOf(1);
  private Integer two = Integer.valueOf(2);
  private Integer three = Integer.valueOf(3);


  /**
   * Test normal stack push.
   *
   * @exception EmptyStackException If errors during stack processing.
   */
  @Test 
  public void testNormalOperation() throws EmptyStackException {
    Stack stack = new Stack();
    stack.push(one);
    stack.push(two);
    stack.push(three);
    assertEquals("Testing stack asArray", 3, stack.toArray().length);
    assertSame("Testing stack top of three", three, stack.top());
    assertSame("Testing stack pop of three", three, stack.pop());
    assertSame("Testing stack pop of two", two, stack.pop());
    assertSame("Testing stack pop of one", one, stack.pop());
    // Just invoke this method and make sure an exception isn't thrown.
  }


  /** Test illegal pop of empty stack. */
  @Test
  public void testIllegalPop() {
    Stack stack = new Stack();
    try {
      stack.pop();
      fail("Pop of empty stack did not generate exception.");
    }
    catch (EmptyStackException e) {
      // shouldn't get here.
    }
  }
}
