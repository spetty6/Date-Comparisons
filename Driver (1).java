
/**
 * This class tests the date objects the user creates and outputs them to the screen.
 * 
 * @author (Samuel Petty) 
 * @version (4/4/15)
 */
public class Driver
{
    public static void main(String args [])
    {
        Date startOutDate = new Date(1,1,1992);//creating Date objects to test.
        
        Date mayDate = new Date(5,15,2000);
        Date dateAdd = new Date (8,13,2000);
        
        Date septemberDate = new Date (9,10,2010);
        Date dateSubtract = new Date (12,25,2010);
        
        Date diffOne = new Date (5,25,2014);
        Date diffTwo = new Date (8,15,2014);
        Date diffThree = new Date (1,27,2005);
        Date diffFour = new Date (7,3,2008);
        
        
        Date comDateOne = new Date (4,3,2013);
        Date comDateTwo = new Date (8,4,2018);
        Date comDateThree = new Date (4,1,2013);
        
        Date equOne = new Date (5,18,2017);
        Date equTwo = new Date (3,2,2017);
        Date equThree = new Date (4,23,2014);
       
        
        
        
        System.out.println("Test- Adding 10 days to my start out date: ");
        System.out.println("Start out date: " + startOutDate);
        System.out.println("New Date: " + startOutDate.add(10));//testing my add method.
        System.out.println();
        
        System.out.println("Test- Adding 5 days to my May Date: ");
        System.out.println("Starting May Date: " + mayDate);
        System.out.println("New Date: " + mayDate.add(5));
        System.out.println();
        
        System.out.println("Test- Adding 2 days to a date: ");
        System.out.println("Starting Date: " +dateAdd);
        System.out.println("New Date: " + dateAdd.add(2));
        System.out.println();
        
        
        System.out.println("Test- Subtracting 8 days from my September Date: ");
        System.out.println("Start out Date: " + dateSubtract);
        System.out.println("New Date: " + dateSubtract.subtract(8));//testing my subtract method.
        System.out.println();
        
        
        System.out.println("Test- Difference between two dates with the same year: ");
        System.out.println("Date 1: " + diffOne);
        System.out.println("Date 2: " + diffTwo);
        System.out.println("Difference: " + diffOne.daysBetween(diffTwo) + " days");
        System.out.println();
        
        System.out.println("Test- Difference between two dates with different years: ");
        System.out.println("Date 1: " + diffThree);
        System.out.println("Date 2: " + diffFour);
        System.out.println("Difference: " + diffThree.daysBetween(diffFour) + " days");//tests my days between method. 
        System.out.println();
        
        System.out.println("Test- To see which date is larger: ");
        System.out.println("Date 1: " + comDateOne);
        System.out.println("Date 2: " + comDateTwo);
        System.out.println("Date 3: " + comDateThree);
        System.out.println("Comparing 2nd and 1st date " + comDateTwo.compareTo(comDateOne));
        System.out.println("Comparing 3rd and 2nd date " + comDateThree.compareTo(comDateTwo));
        System.out.println();
        
        
        System.out.println("Test- See if dates have equal years: ");
        System.out.println("Date 1: " + equOne);
        System.out.println("Date 2: " + equTwo);
        System.out.println("Date 3: " + equThree);
        System.out.println("Comparing 1st and 2nd date " + equOne.equals(equTwo));
        System.out.println(" Comparing 2nd and 3rd date " + equTwo.equals(equThree));
        System.out.println();
        
        
       
    
}
}
