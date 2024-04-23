/**
 *  Node
 */
public class Node {
  /**
   * the data that the node contains
   */
  int data;
  /**
   * pointer to the left node - which is smaller than the parent
   */
  Node left;
 
  /*
   * pointer to the right node - which is greater or equal to than the parent
   */
  Node right;

  /**
   *  Constructor that takes in data as a paramter and sets it to the instance variables
   * @param data
   */
  public Node(int data) {
    super();
    this.data = data;

  }
}
