class employee{
    int employeeid;
    String employeename;

    employee(int id, String name)
    {
        employeeid=id;
        employeename=name;
    }
    public static void main(String[] args)
    {
        employee e1 = new employee(123,"prasanna");
                System.out.println("employee name is " +e1.employeename);
        employee e2 = new employee(1234,"kumar");
        System.out.println("employee name is " +e2.employeename);
    }
}
