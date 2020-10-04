/*
Name: Jonathan Ton
Assignment, given a template, make it add, subtract, a command to find the total, toString, and clear the history and total
I will say what code I added to the template with a *
*/
package cse360assignment02;

public class AddingMachine {
  private int total;
  // *Added String History
  private String history;
  
  public void AddingMachine () {
    total = 0;  // not needed - included for clarity
    // *Added History
    history = "0";
  }
  
  public int getTotal () {
      // *Changes the 0 to total
    return total;
    // *Returns the Total
  }
  
  public void add (int value) {
      // *total addition and history incrementor
      total = total + value;
      // *Adds Total with value
      history = history + " + " + value;
      // *history string gets + value
  }

  public void subtract (int value) {
      // *total subtraction and history incrementor
      total = total - value;
      // *Adds Total with - value
      history = history + " - " + value;
      // *history string gets - value
  }

  public String toString () {
      // *changed the toString output from "" to history
    return history;
    // *gives history
  }

  public void clear() {
      // *put in total and history and set them both to 0 here
      total = 0;
      history = "0";
      // Sets total and history to 0
  }
}
// If the comments in canvas don't work.
// Username: jonton2k
// Password: cseCSE360
