package com.company;


class Students
{
    String FirstName;
    String LastName;
    byte Age;
    double Mark;
    //Actually when can do here a massive of marks,
    // and after that to calculate average, but let's simplify a bit program


    public Students(String SetFirstName, String SetLastName)
    {
        this.FirstName = SetFirstName;
        this.LastName = SetLastName;
    }

    public void SetAge(byte SetAge)
    {
        Age = SetAge;
    }

    public void SetMark(double SetMark)
    {
        Mark = SetMark;
    }
}
