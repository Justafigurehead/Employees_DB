
public class Runner {
    public static void main(String[] args){

        Employee.deleteAll();
        Department.deleteAll();
        Department department1 = new Department("HR");
        Department department2 = new Department("Marketing");
        Department department3 = new Department("Sales");
        Department department4 = new Department("Admin");
        Department department5 = new Department("Finances");

        department1.save();
        department2.save();

        Employee employee1 = new Employee("Suzie Smith", department1, 45000);
        Employee employee2 = new Employee("Jamie Jones", department2, 25000);
        Employee employee3 = new Employee("John Doe", department4, 15000);
        Employee employee4 = new Employee("Carl Gallagher", department5, 20000);
        Employee employee5 = new Employee("Jane Doe", department3, 17000);
        Employee employee6 = new Employee("Harry Potter", department4, 20000);

        employee1.save();
        employee2.save();
        Employee.all();
        Department.all();

        employee1.deleteEmployee();
        Employee.all();

        department1.deleteDepartment();
        Department.all();

        department1.save();
        department1.setTitle("Human Relations");
        department1.updateDepartment();
        Department.all();

        employee1.save();
        employee1.setName("John");
        employee1.updateEmployee();
        Employee.all();

        department3.save();
        department4.save();
        department5.save();
        employee3.save();
        employee4.save();
        employee5.save();
        employee6.save();

    }
}
