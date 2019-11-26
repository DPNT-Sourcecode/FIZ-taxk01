package befaster.solutions.FIZ;

public class FizzBuzzSolution {

  public boolean checkHasThree(Integer number) {
    boolean check = false;
    Integer copy = number;
    while (copy) {
      int c = copy % 10;
      if (c == 3) {
        return true;
      }
      copy = copy / 10;
    }
  }

  public boolean checkHasFive(Integer number) {
    boolean check = false;
    Integer copy = number;
    while (copy) {
      int c = copy % 10;
      if (c == 5) {
        return true;
      }
      copy = copy / 10;
    }
  }

    public String fizzBuzz(Integer number) {
        if ((number % 3 == 0) && (number % 5 == 0)) {
          return "fizz buzz";
        } else if (number % 3 == 0) {
          return "fizz";
        } else if (number % 5 == 0) {
          return "buzz";
        } else {
          return number.toString();
        }
    }

}

