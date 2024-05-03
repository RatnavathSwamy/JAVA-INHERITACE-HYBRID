package hybridinheritance;

public class Mainhybridinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n ----MULTILEVEL INHERITANCE-----");
		child2 n=new child2();
		n.child2method();
		n.child1method();
		n.parentmethod();
		System.out.println("\n ------HIERARCHICAL INHERITANCE---------");
		parentchild3 m=new parentchild3();
		m.child3method();
		m.parentmethod();

	}

}
