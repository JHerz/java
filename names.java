package names;
public class Names {

    
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Bob");
        p.setAddress("33 Youreinmy Lane");
        
		Organization o = new Organization();
        o.setName("PCS");
        o.setAddress("1300 Outtamy Way");
        
		System.out.print(p.getName()+ "'s address:  ");
        System.out.println(p.getAddress());
        System.out.print(o.getName()+ "'s address:  "); 
        System.out.println(o.getAddress());
    }
    
}
