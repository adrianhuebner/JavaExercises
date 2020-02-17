# Java Code Exercises from Udemy Class
#### Udemy course link: [Java Masterclass](https://www.udemy.com/course/java-the-complete-java-developer-course/)

## Method Exercises

### SpeedConverter

- Create a method that takes in a double (kilometersPerHour) returns the rounded value of the calculation type: long
- Create another method that doesn't return anything (void) and needs to calculate milesPerHour from the first method

### MegaBytes Converter

- Create a method that takes in an int (kiloBytes) will not return anything (void) and will calculate the megabytes and the remaining kilobytes

### BarkingDog

- Create a method that takes in a boolean (barking) and an int (hourOfDay), that will determine whether or not we need to wake up if the dog is barking

### LeapYear

- Create a method that will take in an int (year) and will determine whether or not that year is a leap year or not
    - It should return true if it is a leap year and false if it is not a leap 
    
### DecimalComparator

- Create a method that takes in two doubles and return a boolean
    - True if two double numbers are the same up to three decimals
    - False if the two double numbers do not have the same first three decimals
    
### EqualSumChecker

- Create a method that takes in three ints (firstNumber, secondNumber, thirdNumber) and returns a boolean
    - True if firstNumber and secondNumber added together equal the thirdNumber
    - False if firstNumber and secondNumber don't add up to the thirdNumber
    
### TeenNumberChecker

- Create a method that takes in three ints (firstAge, secondAge, thirdAge) and returns a boolean
    - True if one of those ages is within the range 13-19
    - False if none of those ages is within the range 13-19
- Create a method that takes in one int (forthAge) and returns a boolean
    - True if the age within 13-19
    - False if the age is not within 13-19
    
### MinutesToYearsAndDayCalculator

- Create a method that takes in a long (minutes)
    - Need to calculate the years and days from the minutes
    
### IntEqualityPrinter

- Create a method that takes in three ints (firstNumber, secondNumber, thirdNumber)
    - Check to see if numbers are equal or different
        - Otherwise print "Neither all are equal or different"
    
## Method Overloading Challenges

### SecondsAndMinutes

- Create a method that takes in two ints (minutes, seconds)
    - Validate that minutes is greater than 0 and that seconds is greater than 0 and smaller than 59
    - Calculate how many hours, minutes and seconds equal the minutes and seconds passed to the method
- Create a method with the same name but only takes in one int (seconds)
    - Validate if it is greater than 0
    - Calculate how many minutes are in the seconds value, call first method 
- Call both methods to print to the console

### AreaCalculator

- Create a method that takes in a double (radius)
    - Return a double that represents the area of a circle
- Create a method with the same name that takes in two doubles (x, y) that represent sides of rectangle
    - Return the area of a rectangle
    