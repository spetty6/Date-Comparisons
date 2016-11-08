
/**
 * This class adds, subtracts, and finds the difference between two dates.
 * 
 * @author (Samuel Petty) 
 * @version (4/4/15)
 */

import java.util.*;
public class Date 
{
 private int month;
 private int day;
 private int year;
 private String monthName;
    
    public Date () // initializes all values to 0.
    {
    month = 0;
    day = 0;
    year = 0;
}

/**
 * This constructor takes 3 values and assigns values.
 * 
 * @param newMonth-Represents the new month that user tests. newDay-Represents the new day that the user tests.
 * newYear-Represents the new year that the user tests.
 * 
 * @return none
 * 
 */
public Date(int newMonth, int newDay, int newYear)
{

month = newMonth;
day = newDay;
year = newYear;
}


/**
 * Onscreen representation of Date objects.
 * 
 * @param none
 * @return Date object strings.
 */
public String toString()
{
return month + "/" + day + "/" + year;
}

/**
 * Equals method that compares two dates to see if they have equal years.
 * 
 * @param newDate-Date object the user tests.
 * @return true or false boolean.
 * 
 */
public boolean equals(Date newDate)
{
return this.year == newDate.year;
}

/**
 * This method Compares two Date objects to see which one's year is larger.
 * 
 * @param newDate-Represents the Date the user is testing.
 * @return yearResults
 * 
 */
public int compareTo(Date newDate)
{
int yearResults;

if (this.year > newDate.year)
yearResults = 1;
else
yearResults = 0;
return yearResults;
}
/**
 * Expects one value from the user to add to the original date object.
 * 
 * @param numDays-Days being added to original date.
 * @return A new date object.
 */
public Date add (int numDays)
{
return new Date (month, day + numDays, year);
}

/**
 * Expects one value from the user to subtract from the original date object.
 * 
 * @param numDays-Days being subtracted from the original date.
 * @return A new date object.
 */
public Date subtract (int numDays)
{
return new Date(month, day - numDays, year);
}

/**
 * This method calulates the difference between two dates.
 * 
 * @param newDate-Represents the second date the user tests when differentiating.
 * @return an int to represent the days between the dates.
 */
public int daysBetween (Date newDate)
{
int numDays = 0;
int firstDays = 0;
int secondDays = 0;
int yearNums = 0;


switch (this.month)
{
case 1:
firstDays = 31 - this.day;
break;
case 2:
if (( this.year % 4 ==0) && (this.year % 100 == 0 && this.year % 400 == 0))
{
firstDays = 29 -this.day;

}
else
firstDays = 28 - this.day;
break;
case 3:
firstDays = 31 - this.day;
break;
case 4:
firstDays = 30 - this.day;
break;
case 5:
firstDays = 31 - this.day;
break;
case 6:
firstDays = 30 - this.day;
break;
case 7:
firstDays = 31 - this.day;
break;
case 8:
firstDays = 31 - this.day;
break;
case 9:
firstDays = 30 -this.day;
break;
case 10:
firstDays = 31 - this.day;
break;
case 11:
firstDays = 30 -this.day;
break;
case 12:
firstDays = 31 - this.day;
break;
}

switch (newDate.month)
{
case 1:
secondDays = newDate.day;
break;
case 2:
secondDays = newDate.day;
break;
case 3:
secondDays = newDate.day;
break;
case 4:
secondDays = newDate.day;
break;
case 5:
secondDays = newDate.day;
break;
case 6:
secondDays = newDate.day;
break;
case 7:
secondDays = newDate.day;
break;
case 8:
secondDays = newDate.day;
break;
case 9:
secondDays = newDate.day;
break;
case 10:
secondDays = newDate.day;
break;
case 11:
secondDays = newDate.day;
break;
case 12:
secondDays = newDate.day;
break;
}
yearNums = newDate.year - this.year;
//January
if (this.month == 1 && newDate.month == 2)
{
numDays = firstDays + secondDays + yearNums * 365;
}
else if (this.month == 1 && newDate.month == 3)
{ numDays = firstDays + secondDays + 28+ yearNums * 365;}
else if ( this.month == 1 && newDate.month == 4)
{ numDays = firstDays + secondDays + 28 + 31 + yearNums * 365;}
else if (this.month == 1 && newDate.month == 5)
{numDays = firstDays + secondDays + 28 + 31 * 1 + 30 * 1 + yearNums * 365;}
else if (this.month == 1 && newDate.month == 6)
{numDays = firstDays + secondDays + 28 + 31 * 2 + 30 * 1 + yearNums * 365;}
else if (this.month == 1 && newDate.month == 7)
{numDays = firstDays +secondDays + 28 + 31 * 2 + 30 * 2 + yearNums * 365;}
else if (this.month == 1 && newDate.month == 8)
{numDays = firstDays + secondDays + 28 + 31 * 3 + 30 * 2 + yearNums * 365;}
else if (this.month ==1 && newDate.month == 9)
{numDays = firstDays + secondDays + 28 + 31 *4 + 30 * 2 + yearNums * 365;}
else if (this.month == 1 && newDate.month == 10)
{numDays = firstDays + secondDays + 28 + 31 * 4 + 30 * 3 +yearNums * 365;}
else if (this.month == 1 && newDate.month == 11)
{numDays = firstDays + secondDays + 28 + 31 * 5 + 30 * 4 + yearNums * 365;}
else if (this.month == 1 && newDate.month == 12)
{numDays = firstDays +secondDays + 28 + 31 * 5 + 30 * 4 + yearNums * 365;}
//February
if (this.month == 2 && newDate.month == 3)
{
numDays = firstDays + secondDays + yearNums * 365;
}
else if (this.month == 2 && newDate.month == 4)
 {numDays = firstDays + secondDays + 31 + yearNums * 365;}
 else if(this.month == 2 && newDate.month == 5)
 {numDays = firstDays + secondDays + 31 * 1 + 30 * 1 + yearNums * 365;}
 else if (this.month == 2 && newDate.month == 6)
  {numDays = firstDays + secondDays + 31 * 2 + 30 * 1 + yearNums * 365;}
   else if (this.month == 2 && newDate.month == 7)
  {numDays = firstDays + secondDays + 31 * 2 + 30 * 2 + yearNums * 365;}
     else if (this.month == 2 && newDate.month == 8)
  {numDays = firstDays + secondDays + 31 * 3 + 30 * 2 + yearNums * 365;}
    else if (this.month == 2 && newDate.month == 9)
  {numDays = firstDays + secondDays + 31 * 4 + 30 * 2 + yearNums * 365;}
  else if (this.month == 2 && newDate.month == 10)
  {numDays = firstDays + secondDays + 31 * 4 + 30 * 3 + yearNums * 365;}
   else if (this.month == 2 && newDate.month == 11)
  {numDays = firstDays + secondDays + 31 * 5 + 30 * 3 + yearNums * 365;}
  else if (this.month == 2 && newDate.month == 12)
  {numDays = firstDays + secondDays + 31 * 5 + 30 * 4 + yearNums * 365;}
//March
  if (this.month == 3 && newDate.month == 4)
  { numDays = firstDays + secondDays + yearNums * 365;}
  else if (this.month == 3 && newDate.month == 5)
  {numDays = firstDays + secondDays + 30 + yearNums * 365;}
  else if (this.month == 3 && newDate.month == 6)
  {numDays = firstDays + secondDays + 31 * 1 + 30 * 1 + yearNums * 365;}
  else if (this.month == 3 && newDate.month == 7)
  {numDays = firstDays + secondDays + 31 * 1 + 30 * 2 + yearNums * 365;}
   else if (this.month == 3 && newDate.month == 8)
  {numDays = firstDays + secondDays + 31 * 2 + 30 * 2 + yearNums * 365;}
   else if (this.month == 3 && newDate.month == 9)
  {numDays = firstDays + secondDays + 31 * 3 + 30 * 2 + yearNums * 365;}
   else if (this.month == 3 && newDate.month == 10)
  {numDays = firstDays + secondDays + 31 * 3 + 30 * 3 + yearNums * 365;}
   else if (this.month == 3 && newDate.month == 11)
  {numDays = firstDays + secondDays + 31 * 4 + 30 * 3 + yearNums * 365;}
   else if (this.month == 3 && newDate.month == 12)
  {numDays = firstDays + secondDays + 31 * 4 + 30 * 4 + yearNums * 365;} 
//April  
  if (this.month == 4 && newDate.month == 5)
  {numDays = firstDays + secondDays + yearNums * 365;}
  else if (this.month == 4 && newDate.month == 6)
  {numDays = firstDays + secondDays + 31 + yearNums * 365;}
 else if (this.month == 4 && newDate.month == 7)
 {numDays = firstDays + secondDays + 31 * 1 + 30 * 1 + yearNums * 365;}
 else if (this.month == 4 && newDate.month == 8)
 {numDays = firstDays + secondDays + 31 * 2 + 30 * 1 + yearNums * 365;}
 else if (this.month == 4 && newDate.month == 9)
 {numDays = firstDays + secondDays + 31 * 3 + 30 * 1 + yearNums * 365;}
 else if (this.month == 4 && newDate.month == 10)
 {numDays = firstDays + secondDays + 31 * 3 + 30 * 2 + yearNums * 365;}
 else if (this.month == 4 && newDate.month == 11)
 {numDays = firstDays + secondDays + 31 * 4 + 30 * 3 + yearNums * 365;}
 else if (this.month == 4 && newDate.month == 12)
 {numDays = firstDays + secondDays + 31 * 4 + 30 * 3 + yearNums * 365;}
 //May
 if (this.month == 5 && newDate.month == 6)
  {numDays = firstDays + secondDays + yearNums * 365;}
  else if (this.month == 5 && newDate.month == 7)
  {numDays = firstDays + secondDays + 30 + yearNums * 365;}
 else if (this.month == 5 && newDate.month == 8)
 {numDays = firstDays + secondDays + 31 * 1 + 30 * 1 + yearNums * 365;}
 else if (this.month == 5 && newDate.month == 9)
 {numDays = firstDays + secondDays + 31 * 2 + 30 * 1 + yearNums * 365;}
 else if (this.month == 5 && newDate.month == 10)
 {numDays = firstDays + secondDays + 31 * 2 + 30 * 2 + yearNums * 365;}
 else if (this.month == 5 && newDate.month == 11)
 {numDays = firstDays + secondDays + 31 * 3 + 30 * 2 + yearNums * 365;}
 else if (this.month == 5 && newDate.month == 12)
 {numDays = firstDays + secondDays + 31 * 3 + 30 * 3 + yearNums * 365;}
 //June 
 if (this.month == 6 && newDate.month == 7)
  {numDays = firstDays + secondDays + yearNums * 365;}
  else if (this.month == 6 && newDate.month == 8)
  {numDays = firstDays + secondDays + 31 + yearNums * 365;}
 else if (this.month == 6 && newDate.month == 9)
 {numDays = firstDays + secondDays + 31 * 2 + 30 * 0 + yearNums * 365;}
 else if (this.month == 6 && newDate.month == 10)
 {numDays = firstDays + secondDays + 31 * 2 + 30 * 1 + yearNums * 365;}
 else if (this.month == 6 && newDate.month == 11)
 {numDays = firstDays + secondDays + 31 * 3 + 30 * 1 + yearNums * 365;}
 else if (this.month == 6 && newDate.month == 12)
 {numDays = firstDays + secondDays + 31 * 3 + 30 * 2 + yearNums * 365;}
 //July
 if (this.month == 7 && newDate.month == 8)
  {numDays = firstDays + secondDays + yearNums * 365;}
  else if (this.month == 7 && newDate.month == 9)
  {numDays = firstDays + secondDays + 31 + yearNums * 365;}
 else if (this.month == 7 && newDate.month == 10)
 {numDays = firstDays + secondDays + 31 * 1 + 30 * 1 + yearNums * 365;}
 else if (this.month == 7 && newDate.month == 11)
 {numDays = firstDays + secondDays + 31 * 2 + 30 * 1 + yearNums * 365;}
 else if (this.month == 7 && newDate.month == 12)
 {numDays = firstDays + secondDays + 31 * 2 + 30 * 2 + yearNums * 365;}
  //August
 if (this.month == 8 && newDate.month == 9)
  {numDays = firstDays + secondDays + yearNums * 365;}
  else if (this.month == 8 && newDate.month == 10)
  {numDays = firstDays + secondDays + 30 + yearNums * 365;}
 else if (this.month == 8 && newDate.month == 11)
 {numDays = firstDays + secondDays + 31 * 1 + 30 * 1 + yearNums * 365;}
 else if (this.month == 8 && newDate.month == 12)
 {numDays = firstDays + secondDays + 31 * 1 + 30 * 2 + yearNums * 365;}
  //September
 if (this.month == 9 && newDate.month == 10)
  {numDays = firstDays + secondDays + yearNums * 365;}
  else if (this.month == 9 && newDate.month == 11)
  {numDays = firstDays + secondDays + 31 + yearNums * 365;}
 else if (this.month == 9 && newDate.month == 12)
 {numDays = firstDays + secondDays + 31 * 1 + 30 * 1 + yearNums * 365;}
 //October
  if (this.month == 10 && newDate.month == 11)
  {numDays = firstDays + secondDays + yearNums * 365;}
  else if (this.month == 10 && newDate.month == 12)
  {numDays = firstDays + secondDays + 30 + yearNums * 365;}
  //November
   if (this.month == 11 && newDate.month == 12)
  {numDays = firstDays + secondDays + yearNums * 365;}

  return numDays;

}

/**
 * This method changes the date if the number of days added exceeds the maximum number of days allowed in
 * the corresponding month.
 * 
 * @param none
 * @return A new date object.
 */
public Date addLimit()
{
int leftDays = 0;

switch(month)
{
    case 1:
    if (day > 31)
    {
        leftDays = day - 31;
        month++;
    }
    else
    {
        leftDays = day;
    }
    break;
    case 2:
    if (day > 28)
    {leftDays = day - 28;
        month++;
    }
    else{
        leftDays = day;
    }
    break;
    case 3:
    if (day > 31)
    {leftDays = day - 31;
        month++;
    }
    else{
        leftDays = day;
    }
    break;
    case 4:
    if (day > 30)
    {leftDays = day - 30;
        month++;
    }
    else{
        leftDays = day;
    }
    break;
    case 5:
    if (day > 31)
    {leftDays = day - 31;
        month++;
    }
    else{
        leftDays = day;
    }
    break;
    case 6:
    if (day > 30)
    {leftDays = day - 30;
        month++;
    }
    else{
        leftDays = day;
    }
    break;
    case 7:
    if (day > 31)
    {leftDays = day - 31;
        month++;
    }
    else{
        leftDays = day;
    }
    break;
    case 8:
    if (day > 31)
    {leftDays = day - 31;
        month++;
    }
    else{
        leftDays = day;
    }
    break;
   case 9:
   if (day > 30)
    {leftDays = day - 30;
        month++;
    }
    else{
        leftDays = day;
    }
    break;
    case 10:
    if (day > 31)
    {leftDays = day - 31;
        month++;
    }
    else{
        leftDays = day;
    }
    break;
    case 11:
    if (day > 30)
    {leftDays = day - 30;
        month++;
    }
    else{
        leftDays = day;
    }
    break;
    case 12:
    if (day > 31)
    {leftDays = day - 31;
        year++;//goes to the next year.
    }
    else{
        leftDays = day;
    }
    break;
}
Date addLimitDate = new Date (month, leftDays, year);//new date object.
return addLimitDate;
}

/**
 * This method changes the date if the days become negative after subtraction.
 * 
 * @param none
 * @return A new date object.
 */
public Date subtractLimit()
{
int leftDays = 0;

switch(month)
{
    case 1:
    if (day < 1)
    {leftDays = day;
        day = 31 + leftDays;
        month = 12;
        year--;}//goes to the previous year.
    break;
    case 2:
    if (day < 1)
    {
        leftDays = day;
        day = 31 + leftDays;
        month--;
    }
    break;
    case 3:
    if (day < 1)
    {leftDays = day;
     day = 28 + leftDays;
     month--;
    }
    break;
    case 4:
    if (day < 1)
    {leftDays = day;
     day = 31 + leftDays;
     month--;
    }
    break;
    case 5:
    if (day < 1)
    {leftDays = day;
     day = 30 + leftDays;
     month--;
    }
    break;
    case 6:
    if (day < 1)
    {leftDays = day;
     day = 31 + leftDays;
     month--;
    }
    break;
    case 7:
    if (day < 1)
    {leftDays = day;
     day = 30 + leftDays;
     month--;
    }
    break;
    case 8:
    if (day < 1)
    {leftDays = day;
     day = 31 + leftDays;
     month--;
    }
    break;
    case 9:
    if (day < 1)
    {leftDays = day;
     day = 31 + leftDays;
     month--;
    }
    break;
    case 10:
    if (day < 1)
    {leftDays = day;
     day = 30 + leftDays;
     month--;
    }
    break;
    case 11:
    if (day < 1)
    {leftDays = day;
     day = 31 + leftDays;
     month--;
    }
    break;
    case 12:
    if (day < 1)
    {leftDays = day;
     day = 30 + leftDays;
     month--;
    }
    break;
}
Date subtractLimitDate = new Date (month, day, year);//new date object.
return subtractLimitDate;
}
  

/**
 * Converts the dates months into strings.
 * 
 * @param none
 * @return string format of the month name.
 * 
 */
public String getDate()
{
if (this.month == 1)
{
    monthName = "January";
}
else if(this.month == 2)
{monthName = "February";}

else if(this.month == 3)
{monthName = "March";}

else if(this.month == 4)
{monthName = "April";}

else if(this.month == 5)
{monthName = "May";}

else if(this.month == 6)
{monthName = "June";}

else if(this.month == 7)
{monthName = "July";}

else if(this.month == 8)
{monthName = "August";}

else if(this.month == 9)
{monthName = "September";}

else if(this.month == 10)
{monthName = "October";}

else if(this.month == 11)
{monthName = "November";}

else if(this.month == 12)
{monthName = "December";}   
return monthName;
}


}
