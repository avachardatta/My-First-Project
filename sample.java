class sample {
    
    
    int emp_id;
    String emp_name;
    String emp_designation;
    double salary;

    sample(int emp_id,String emp_name,String emp_designation,double salary){
        super();
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_designation = emp_designation;
        this.salary = salary; 
    }


public static void main(String[] args) {
    
    sample [] s1 = new sample[4];

    s1[0] = new sample(1001, "Dominic Torretto", "Web Developer", 45000);
    s1[1] = new sample(1002, "Mia Torretto", "Ux Designer", 35000);
    s1[2] = new sample(1003, "Brian Smith", "Account Executive", 75000);
    s1[3] = new sample(1004, "Will Smith", "Admin", 55000);




    for(sample s2 : s1){
        System.out.println(s2);
    }




 }



@Override
public String toString() {
    

    return ("Emp Id : " + emp_id + "Emp Name : " + emp_name + "Emp Designation : " + emp_designation + "Emp Salary : " + salary);
}



}

