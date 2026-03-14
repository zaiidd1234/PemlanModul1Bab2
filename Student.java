public class Student {
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double scienceGrade;
    private double englishGrade;

    private static int jumlahSiswa = 0;

    public Student() {
        name = "";
        address = "";
        age = 0;
        jumlahSiswa++; //no 1
    }

    public Student(String n, String a, int ag) {
        this.name = n;
        this.address = a;
        this.age = ag;
        jumlahSiswa++; // no 1
    }

    public Student (String n, String a, int ag, double math, double science, double english ){
        this.name = n;
        this.address = a;
        this.age = ag;
        this.mathGrade = math;
        this.scienceGrade = science;
        this.englishGrade = english;
        jumlahSiswa++; // no 2

    }

    public static void tampilanJumlahSiswa(){
        System.out.println("Jumlah siswa yg terdaftar : " + jumlahSiswa); // no 5
    }

    public void setName(String n) {
        name = n;
    }

    public void setAddress(String a) {
        address = a;
    }

    public void setAge(int ag) {
        age = ag;
    }

    public void setMath(double math){
        mathGrade = math;
    }

    public void setScience(double science) {
        this.scienceGrade = science;
    }

    public void setEnglish(double english) {
        this.englishGrade = english;
    }

    private double getAverage(){
    return(mathGrade + scienceGrade + englishGrade)/3;
    }

    public boolean statusAkhir(){ // no 3
        if (getAverage() >= 61){
            return true; // Lulus
        } else {
         return false; // gak Lulus
        
        }
    }

    public void displayMessage(){
    System.out.println("Siswa dengan nama : " + name);
    System.out.println("Beramalat di : " + address);
    System.out.println("Berumur : " + age);
    System.out.println("Mempunyai nilai rata rata : " + getAverage());

    if (statusAkhir()){
        System.out.println("Status : Lulus");
    } else {
        System.out.println("Status : Tidak Lulus");//no 3
    }
    System.out.println("===================================================");
    }
}