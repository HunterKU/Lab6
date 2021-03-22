/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hunte
 */
public class EmployeeInfo {
    private String name;
    private int IDNumber;
    private String department;
    private String position;
  
public EmployeeInfo(String name, int IDNumber,String department, String position)
{
this.name = name;
this.IDNumber = IDNumber;
this.department = department;
this.position = position;
}

public EmployeeInfo(String name, int IDNumber)
{
this.name = name;
this.IDNumber = IDNumber;
this.department = "";
this.position = "";
}

public EmployeeInfo()
{
this.name = "";
this.IDNumber = 0;
this.department = "";
this.position = "";
}

public String Name()
{
return name;
}

public int Id()
{
return IDNumber;
}

public String Department()
{
return department;
}

public String Position()
{
return position;
}  
}
