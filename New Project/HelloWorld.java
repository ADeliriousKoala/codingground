public class HelloWorld{

     public static void main(String []args){
       int[][] employeeWages = { 
        {294, 92},
        {897, 100},
        {345, 57} };
        
        int sum = 0;
        for (int i = 0; i < employeeWages.length; i++)
        sum += employeeWages[i][1];
        double average = (double)sum/employeeWages.length;
        System.out.println(average);
        
        
         
         
     }
}
