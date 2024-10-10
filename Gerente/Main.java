public class Main {

    public static void main(String[] args) {
        // Criação de um array de empregados
        Employee[] employees = new Employee[3];
        
        // Preenchendo o array com 2 empregados comuns e 1 gerente
        
        
        employees[0] = new Employee("João", 3000);
        employees[1] = new Employee("Maria", 2500);
        employees[2] = new Manager("Mesaque", 5000, "TI");
        
        

        // Percorrendo o array e exibindo os dados de cada empregado
        for (Employee employee : employees) {
            employee.showEmployeeData();
            System.out.println();
        }
    }
}
