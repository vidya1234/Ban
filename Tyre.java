package Tyre;

class Tyre {
	int x=6;
    public void front() throws RuntimeException {
        System.out.println("Tire");
    }
 
    public void front(long a) {
        System.out.println("Radial Tire with long");
    }
}
 
 
 
class RadialTyre extends Tyre {
	int x=5;
    public void front() {
    	
        System.out.println("Radial Tire");
    }
    public void front(int a) throws RuntimeException {
        System.out.println("Radial Tire with int");
    }

 
    public static void main(String... args) {
        System.out.println("This is just a test");
        Tyre t = new RadialTyre();
        Tyre t1 = new Tyre();
        RadialTyre r = new RadialTyre();

        System.out.println(Tyre instanceof t1.);      //Line 1
        System.out.println(t1 instanceof RadialTyre);        //Line 2
        System.out.println(Tyre instanceof r);        //Line 3
        System.out.println(r instanceof RadialTyre);        //Line 4
}
}


