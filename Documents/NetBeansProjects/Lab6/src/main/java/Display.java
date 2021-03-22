/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hunte
 */
public class Display {
   public static void main(String[] args)
{
EmployeeInfo FirstEmployee = new EmployeeInfo("Susen Meyers", 47899,"Accounting", "Vice President");
EmployeeInfo SecondEmployee = new EmployeeInfo("Mark Jones", 39119,"IT", "Programmer");
EmployeeInfo ThirdEmployee = new EmployeeInfo("Joy Regers", 81774,"Manufacturing", "Engineer");

System.out.println("Name,  " + "ID Number, " + "Department, " + "Position");
System.out.println(FirstEmployee.Name()+", "+ FirstEmployee.Id()+ ", " + FirstEmployee.Department()+", "+ FirstEmployee.Position());
System.out.println(SecondEmployee.Name()+", "+ SecondEmployee.Id()+ ", " + SecondEmployee.Department()+", "+ SecondEmployee.Position());
System.out.println(ThirdEmployee.Name()+", "+ ThirdEmployee.Id()+ ", " + ThirdEmployee.Department()+", "+ ThirdEmployee.Position());
}
} 

