package main;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
class ToughQuestion2 {
            public static void main(String[] args) throws NumberFormatException, IOException {
                        Integer bread;
                        Integer butter;
                        Integer jam;
                        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                        Calories cal=new Calories();
                        System.out.println("1.Bread only\n2.Bread+Jam\n3.Bread+Jam+Butter");
                        System.out.println("Enter the choice");
                        Integer choice = Integer.parseInt(br.readLine());
                        switch(choice)
                        {
                        case 1 : System.out.println("Enter the number of Slice of bread");
                        	bread = Integer.parseInt(br.readLine());
                        	//call the function which calculate the calories for only bread
          
                        	System.out.printf("%.3f",(cal.calculateCalories(bread))*4.1868);
                        	System.out.println(" kJ of energy generated from "+cal.calculateCalories(bread)+" calories");
                        	System.out.println();
                        	break;
                        	
                        case 2 : System.out.println("Enter the number of Slice of bread");
                        	bread = Integer.parseInt(br.readLine());
                        	System.out.println("Enter the number teaspoon of Jam");
                        	jam = Integer.parseInt(br.readLine());
                        	//call the function which calculate the calories for only bread & jam
                        	System.out.printf("%.3f",(cal.calculateCalories(bread,jam))*4.1868);
                        	System.out.println(" kJ of energy generated from "+cal.calculateCalories(bread,jam)+" calories");
                        	System.out.println();
                        	break;
                        	
                        case 3 : System.out.println("Enter the number of Slice of bread");
                        	bread = Integer.parseInt(br.readLine());
                        	System.out.println("Enter the number teaspoon of Jam");
                        	jam = Integer.parseInt(br.readLine());
                        	System.out.println("Enter the number teaspoon of Butter");
                        	butter = Integer.parseInt(br.readLine());
                        	//call the function which calculate the calories for  bread,jam & butter
                        	System.out.printf("%.3f",(cal.calculateCalories(bread,jam,butter))*4.1868);
                        	System.out.println(" kJ of energy generated from "+cal.calculateCalories(bread,jam,butter)+" calories");
                        	System.out.println();
                        	break;
                        }
                        //System.out.printf("%.3f",ca.calculateEnergy());
                        //System.out.println(" kJ of energy generated from "+ca.returnCalories()+" calories");
            }
}
class Calories {
            
            double calculateCalories(double bread) {
            //you have to overload this function for three parameters refer the question
            		return (74 * bread);
            }
            double calculateCalories(double bread,double jam) {
            //you have to overload this function for three parameters refer the question
            	return ((74 * bread) + (26 * jam));
            }
            public double calculateCalories(double bread,double jam,double butter) {
            //you have to overload this function for three parameters refer the question
            	return ((74 * bread) + (26 * jam) + (102 * butter));
            }
            
 }