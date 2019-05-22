package edu.cnm.deepdive;

/**
 * Exercises (as a simple console application) the methods of the {@link FizzBuzz} class.
 *
 * @author Denelle Britton Linebarger &amp; Deep Dive Coding Java+Android Cohort 7.
 * @version 1.0.0
 */
public class Main {

  private Main() {}

  /**
   * Computes and displays the fizz buzz values that correspond to the input values of 1&ndash;100.
   *
   * @param args Command line arguments (ignored).
   */
  public static void main(String[] args) {
    for (int i = 1;  i <= 100; i++) {
      System.out.println(FizzBuzz.fizzBuzzValue(i));
    }
  }

}
