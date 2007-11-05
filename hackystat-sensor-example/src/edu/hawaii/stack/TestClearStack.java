package edu.hawaii.stack;

import static org.junit.Assert.assertSame;

import org.junit.Test; 
import java.util.ArrayList;

/**
 * Test case for the ClearStack abstract data type, which checks to see that a ClearStack
 * containing three elements can be iterated through and that this iteration retrieves the
 * elements in the correct order. 
 *
 * @author Philip Johnson
 */
public class TestClearStack {

  // Objects used for testing.
  private Integer one = Integer.valueOf(1);
  private Integer two = Integer.valueOf(2);
  private Integer three = Integer.valueOf(3);

  /**
   * Test the ClearStack iterator.
   */
  @Test
  public void testNormalOperation() {
    ClearStack stack = new ClearStack();
    stack.push(one);
    stack.push(two);
    stack.push(three);
    ArrayList<Object> list = new ArrayList<Object>();
    // Go through the elements in the stack and save them in an ArrayList.
    for (Object element : stack) {
      list.add(element);
    }
    // Now check to see they were there and in the right order.
    assertSame("Testing ClearStack[0]", one, list.get(0));
    assertSame("Testing ClearStack[1]", two, list.get(1));
    assertSame("Testing ClearStack[2]", three, list.get(2));
  }
}
