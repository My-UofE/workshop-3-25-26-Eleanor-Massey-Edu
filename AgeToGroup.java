public class AgeToGroup {
    public static void main(String[] args){
        //examples
        int x = 9;
        x = (x>0) ? x:0;
        int y = (x<100) ? 1:0;
        int day = 0; //referring to Sunday. 1 is Monday, 2 is Tuesday and so on
        int isWeekend = (day==0) ? 1:(day==6) ? 1:0; //if the day is 0, isWeekend is set to 1. Otherwise, if the day is not 0, isWeekend is set to the result of if day is 6.
        
        //tasks
        int age = Integer.parseInt(args[0]);
        int ageGroup = 1;
        if (age<=18) 
            ageGroup = 0;
        
        if (age>=65) 
            ageGroup = 2;       
            
        //System.out.println("Age: " + age + ", Age Group: " + ageGroup);

        //rewritten using ternary operators
        ageGroup = (age<=18) ? 0: (age>=65) ? 2:1;
        System.out.println("Age: " + age + ", Age Group: " + ageGroup);
    }
}
