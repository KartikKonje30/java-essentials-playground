
public class ConditionalStmt {
    public static void main(String[] args){

        // Conditional Statements
        // Conditional statements in Java allow the program to make decisions based on conditions and execute specific blocks of code depending on the outcome.
        
        // 1. if Statement
        // 2. if-else Statement
        // 3. if-else if Ladder
        // 4. switch Statement (works with int, char, String, and enum types)
        // 5. Ternary Operator (variable = (condition) ? value_if_true : value_if_false;)

        // example for if, if-else, else-if:

        boolean isSunny = true;
        boolean isWarm = true;

        if(isSunny && isWarm){
            System.out.println("\nBeach Day!");
        }
        else if(isSunny){
            System.out.println("\nGo for Hike!");
        }
        else{
            System.out.println("\nStay Home!");
        }

        // example for switch case:

        int day = 3;
        String dayName ;

        switch(day){
            case 1: 
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
        }

        System.out.println("\nSwitch case result: "+ dayName);

        // example for ternary condition:

        String a = day % 2 == 0 ? "Even" : "Odd";
        System.out.println("\nTernary Condtion result: "+ a);

        
        System.out.println();
        

    }
}
