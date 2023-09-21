// --== CS400 Fall 2022 Individual Red-Black Tree ==--
// Name: Jack Archibald
// Email: jwarchibald@wisc.edu
// Team: DT
// TA: Surabhi Gupta
// Lecturer: Florian Heimerl
// Notes to Grader:

import java.util.NoSuchElementException;
/**
 * implementation of this interface will create a sorted collection and RBT
 * 
 * @author Jack Archibald
 *
 * @param <T> generic data type
 */
public interface SortedCollectionInterface<T extends Comparable<T>>{

	/**
	 * Performs insertion into a binary search tree: adding the input data
	 * value to a new node in a leaf position within the tree. After inserting
	 * checks RBT balance and restructures if needed.
	 * 
	 * @param data to be added into this binary search tree
	 * @return true if the value was inserted, false if not
	 * @throws NullPointerException     when the provided data argument is null
	 * @throws IllegalArgumentException when the newNode and subtree contain equal
	 *                                  data references
	 */
    public boolean insert(T data) throws NullPointerException, IllegalArgumentException;

    /**
	 * Checks whether the tree contains the value *data*.
	 * 
	 * @param data the data value to test for
	 * @return true if *data* is in the tree, false if it is not in the tree
	 */
    public boolean contains(T data);

    /**
	 * Get the size of the tree (its number of nodes).
	 * 
	 * @return the number of nodes in the tree
	 */
    public int size();

    /**
	 * Method to check if the tree is empty (does not contain any node).
	 * 
	 * @return true of this.size() return 0, false if this.size() > 0
	 */
    public boolean isEmpty();
    
    /**
     * removes the node that is equal to the given node through the parameter,
     * once removed checks for RBT balance and restructures if needed
     * 
     * @param data 
     * @throws NullPointerException
     * @throws NoSuchElementException
     */
    public void remove(T data) throws NullPointerException, NoSuchElementException;

}
