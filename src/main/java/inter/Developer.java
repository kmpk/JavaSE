package inter;

public class Developer {
    String specialty = "Developer";

    public void displaySpecialty(){
        System.out.println("Specialty: " + this.specialty);
    }

    public static void main(String[] args) {
        JavaDeveloper javaDeveloper = new JavaDeveloper();
        javaDeveloper.demonstrateSuperKeyword();
    }
}
class JavaDeveloper extends Developer{
    public void demonstrateSuperKeyword(){
        JavaDeveloper javaDeveloper = new JavaDeveloper();

        System.out.println("Getting subclass specialty:");
        javaDeveloper.displaySpecialty();

        System.out.println("Getting superclass specialty:");
        super.displaySpecialty();
    }

    @Override
    public void displaySpecialty() {
        System.out.println("Specialty: " + this.specialty);
    }
}