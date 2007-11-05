package edu.hawaii.stack;

import java.util.Iterator;

/**
 * Implements a "clear" stack ADT, in the sense that you can use an iterator
 * to see the internal contents of the stack.
 * ClearStack is also a Bean with a read-only attributes called "iterator" and "top".
 *
 * @author Philip Johnson 
 * @version $Id: ClearStack.java,v 1.5 2004/10/27 02:41:57 johnson Exp $
 */
public class ClearStack extends Stack implements Iterable<Object> {

  /**
   * Returns an iterator over this Stack.
   * @return An Iterator over this stack.
   */
  public Iterator<Object> iterator() {
    return this.elements.iterator();
  }

  /**
   * Gets the top attribute of the ClearStack object.
   *
   * @return The top value.
   * @exception EmptyStackException If the stack is empty.
   */
  public Object getTop() throws EmptyStackException {
    return this.top();
  }
}
