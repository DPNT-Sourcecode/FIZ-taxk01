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
    if((number % 3 == 0 && checkHasThree(number) == true) ||
        (number % 5 == 0 && checkHasFive(number) == true)) {
      return true;
    }
    return false;
  }

  public String deluxeType(Integer number) {
    if(checkDeluxe(number) == true) {
      if(number % 2 != 0) {
        return "fake deluxe";
      } else if(number % 2 == 0) {
        return "deluxe";
      }
    }
    return null;
  }

    public String fizzBuzz(Integer number) {

       if((number % 3 == 0 || checkHasThree(number) == true )
           &&  (number % 5 == 0 || checkHasFive(number) == true) && checkDeluxe(number) == true) {
           return "fizz buzz " + deluxeType(number);
       } else if((number % 3 == 0 || checkHasThree(number) == true )
             &&  (number % 5 == 0 || checkHasFive(number) == true) ) {
           return "fizz buzz";
       } else if ((number % 3 == 0 || checkHasThree(number) == true ) && checkDeluxe(number) == true) {
           return "fizz " + deluxeType(number);
       } else if((number % 5 == 0 || checkHasFive(number) == true) && checkDeluxe(number) == true) {
           return "buzz " + deluxeType(number);
       } else if (checkDeluxe(number) == true) {
         return deluxeType(number);
       } else if(number % 3 == 0 || checkHasThree(number) == true ) {
         return "fizz";
       } else if(number % 5 == 0 || checkHasFive(number) == true) {
         return "buzz";
       }

       return number.toString();

    }

}
