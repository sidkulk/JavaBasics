<<<<<<< HEAD
class Salary {
	double salary;
	Salary(double salary) {
		this.salary = salary;
	}
}

class Bonus extends Salary{
	double salary, bonus;
	Bonus(double salary, double bonus) {
		super(salary);
		this.bonus = bonus;
	}
	
	public double getTotSal() {
		return (bonus + super.salary);
	}
}

class Emp {
	public static void main(String[] args) {
		Bonus bn = new Bonus(100.00, 44.50);
		System.out.println("Total salary: "+bn.getTotSal());
	}
=======
class Salary {
	double salary;
	Salary(double salary) {
		this.salary = salary;
	}
}

class Bonus extends Salary{
	double salary, bonus;
	Bonus(double salary, double bonus) {
		super(salary);
		this.bonus = bonus;
	}
	
	public double getTotSal() {
		return (bonus + super.salary);
	}
}

class Emp {
	public static void main(String[] args) {
		Bonus bn = new Bonus(100.00, 44.50);
		System.out.println("Total salary: "+bn.getTotSal());
	}
>>>>>>> a4a590a54071c139ba587b93d0c42d571b20c322
}