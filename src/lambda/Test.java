package lambda;

public class Test{
	
	public static void invoke(SimpleFuncInterface fun){
		fun.implemented();
		fun.doWork();
	}

	public static Employee constructEmployee(ConstructorFuncInterface fun){
		return fun.createEmployee(1, "a");
	}

	public static int getInt(MethodFuncInterface fun){
		return fun.getInt();
	}

	public static void main(String []args){
		invoke(() -> System.out.println("Lambda passed as interface"));
		
		Employee e = constructEmployee(Employee::new);
		System.out.println(e.getA());
		System.out.println(e.getB());
		
		System.out.println(getInt(e::getA));
	}
}