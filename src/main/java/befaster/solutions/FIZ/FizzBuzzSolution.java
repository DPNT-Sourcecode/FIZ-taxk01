package befaster.solutions.FIZ;

public class FizzBuzzSolution {

  public boolean checkHasThree(Integer number) {
    boolean check = false;
    Integer copy = number;
    while (copy > 0) {
      int c = copy % 10;
      if (c == 3) {
        return true;
      }
      copy = copy / 10;
    }
    return check;
  }

  public boolean checkHasFive(Integer number) {
    boolean check = false;
    Integer copy = number;
    while (copy > 0) {
      int c = copy % 10;
      if (c == 5) {
        return true;
      }
      copy = copy / 10;
    }
    return check;
  }
  public boolean checkDeluxe(Integer number) {
    if (number <= 10) {
      return false;
    }
    Integer copy = number;
    int lastDigit = copy % 10;
    copy = copy/10;
    while(copy > 0) {
      int c = copy % 10;
      if(c != lastDigit) {
        return false;
      }
      copy = copy/10;
    }
    return true;
  }

    public String fizzBuzz(Integer number) {

       if((number % 3 == 0 || checkHasThree(number) == true )
           &&  (number % 5 == 0 || checkHasFive(number) == true) && checkDeluxe(number) == true) {
           return "fizz buzz deluxe";
       } else if((number % 3 == 0 || checkHasThree(number) == true )
             &&  (number % 5 == 0 || checkHasFive(number) == true) ) {
           return "fizz buzz";
       } else if (number % 3 == 0 || checkHasThree(number) == true) {
           return "fizz";
       } else if(number % 5 == 0 || checkHasFive(number) == true) {
           return "buzz";
       }

       return number.toString();

    }

}



