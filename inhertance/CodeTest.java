package inhertance;

public class CodeTest {

    public static void main(String[] args) {

        // creation of objects
        Employee e = new Employee();
        Lawyer l = new Lawyer();
        Secretary s = new Secretary();
        LegalSecretary ls = new LegalSecretary();
        marketer m = new marketer();

        System.out.println(e.getVacationDays());
        System.out.println(l.getHours());
        System.out.println(s.getVacationDays());
        System.out.println(m.insidemarket());
        System.out.println(ls.getHours());
    }
}
