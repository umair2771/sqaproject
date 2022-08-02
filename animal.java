public class animal { 
 private String Name;
 private int Age;
}
//Default Constructor is Auto-Called
//When the object is created
//write parameterized constructor with three parameters
class zebra extends animal {
	 Name = "Foxi";
	 Age = 4;
}
class Dolphin extends animal {
	 Name = Name1;
	 Age = Age1;
}
 
class PROB{
//main
public static void main(String args[ ]) 
	{   
		RunEncapTest encap = new RunEncapTest(); // Default Constructor is Auto-Called
		// When the object is created
		System.out.println();
		System.out.println("Using Default Constructor!!!");
		System.out.println();
		String name0 =  encap.getName();
    	System.out.println("Old Name Is: " + name0);
    	int Age0 = encap.getAge();
    	System.out.println("Old Age Is: " + Age0);
    	int id0 = encap.getId();
    	System.out.println("Old ID Is: " + id0);
    	System.out.println();
    	System.out.println("Applying Encapsulation!!!");
    	System.out.println();
    	//call setters for initialization
     	encap.setName("PewPew");
     	encap.setAge(23);
     	encap.setId(4123);
     
     	//call getter and print values
     	name0 =  encap.getName();
     	System.out.println("Set Name Is: " + name0);
     	Age0 = encap.getAge();
     	System.out.println("Set Age Is: " + Age0);
     	id0 = encap.getId();
     	System.out.println("Set ID Is: " + id0);
     
     	
     	
     	RunEncapTest encap1 = new RunEncapTest("CureMD",17,4000); // Parameterized Constructor is Auto-Called
		// When the object is created
		System.out.println();
		System.out.println("Using Paramterized Constructor!!!");
		System.out.println();
		name0 =  encap1.getName();
    	System.out.println("Old Name Is: " + name0);
    	Age0 = encap1.getAge();
    	System.out.println("Old Age Is: " + Age0);
    	id0 = encap1.getId();
    	System.out.println("Old ID Is: " + id0);
    	System.out.println();
    	System.out.println("Applying Encapsulation!!!");
    	System.out.println();
    	//call setters for initialization
     	encap1.setName("PomPom");
     	encap1.setAge(27);
     	encap1.setId(5000);
     
     	//call getter and print values
     	name0 =  encap1.getName();
     	System.out.println("Set Name Is: " + name0);
     	Age0 = encap1.getAge();
     	System.out.println("Set Age Is: " + Age0);
     	id0 = encap1.getId();
     	System.out.println("Set ID Is: " + id0);
	}

}