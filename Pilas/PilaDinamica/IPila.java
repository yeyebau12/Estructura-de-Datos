package PilaDinamica;

/**
 * @author Yerson Bautista
 * @version 1.0
 * @since 2023-10-01
 * 
 *        Interface that defines the operations for a stack.
 *        This interface is part of a dynamic stack management system.
 */
public interface IPila {

    /**
     * Checks if the stack is empty.
     * 
     * @return true if the stack is empty, false otherwise.
     */
    public boolean isEmpty();

    /**
     * Pushes an element onto the stack.
     * 
     * @param data the data to be pushed onto the stack.
     * @return Void
     */
    public void push(int data);

    /**
     * Pops an element from the stack.
     * 
     * @return the data of the popped element.
     */
    public int pop();

    /**
     * Peeks at the top element of the stack without removing it.
     * 
     * @return the data of the top element.
     */
    public int peek();

    /**
     * Gets the size of the stack.
     * 
     * @return the number of elements in the stack.
     */
    public int getSize();

    /**
     * Clears the stack by removing all elements.
     */
    public void clear();

}
