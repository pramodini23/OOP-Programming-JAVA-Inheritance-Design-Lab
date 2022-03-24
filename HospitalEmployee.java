package Assignment1_InheritanceLab;

public class HospitalEmployee {
    String name;
    int number;

    public HospitalEmployee(String name, int number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return  name + " " +number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void work() {
        System.out.println(name + " works for the hospital.");
    }

}


class Nurse extends HospitalEmployee {
    int numOfPatients;

    public Nurse(String name, int number, int numOfPatients) {
        super(name, number);
        this.numOfPatients = numOfPatients;
    }

    @Override
    public String toString() {
        return name+" "+number+" has "+numOfPatients+" patients.";
    }
}

class Doctor extends HospitalEmployee {
    String specialty;

    public Doctor(String name, int number, String specialty) {
        super(name, number);
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return name + " " + number + " " + specialty;
    }
}

class Surgeon extends HospitalEmployee {
    String specialty;
    boolean operating;

    public Surgeon(String name, int number, String specialty, boolean operating) {
        super(name, number);
        this.specialty = specialty;
        this.operating = operating;
    }

    @Override
    public String toString() {
        return name + " " + number + " " + specialty + " Operating:" +operating;
    }
}