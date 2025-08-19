class Employee {
    private int emp_id;
    public void setEmpId(int emp_id1){
        emp_id= emp_id1;
    }
    
    public int getEmp_Id(){
        return emp_id;
    }
}
class Encapsulation{
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setEmpId(1);
        System.out.println(e.getEmp_Id());

    }
}
