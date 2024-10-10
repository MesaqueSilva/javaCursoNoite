public class Manager extends Employee{

	private String department;
	public Manager(String name, double salary, String departament) {
		super(name, salary);
		this.department = departament;
		
		
	}
    
	//Metodo para calcular o bônus de 20% do dálario:
	@Override
	public double calculateBonus() {
		return this.salary * 0.20;
	}
	
	//Metodo para exibir dados do gerente
	@Override
	public void showEmployeeData() {
		super.showEmployeeData();
		System.out.println("Departamento: " + department);
	}
	
	
}
