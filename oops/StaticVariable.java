class Employee{
    int emp_id;
    String emp_name;
    static String company= "decipher zone";// by using static company name we saves memory

     //Employee(int emp_id, String emp_name, String company)
     Employee(int emp_id,   String emp_name)
      {
        this.emp_id= emp_id;
        this.emp_name= emp_name;
       // this.company= company;
    }
    void show(){
        System.out.println("employee id: "+ emp_id+" employee name: "+emp_name+" company name: "+company);
    }
    public static void main(String[] args) {
        Employee e= new Employee(1,"amit"/*, "decipher zone"*/);
        e.show();
        Employee e1= new Employee(2, "sumit");
        e1.show();
    }
    
    
}
