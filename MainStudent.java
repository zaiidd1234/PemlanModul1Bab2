import java.util.Scanner;
public class MainStudent {
public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Masukkan jumlah siswa :");
    int jumlahSiswa = input.nextInt();

    Student[]siswa = new Student[jumlahSiswa];

    for (int i = 0; i < jumlahSiswa; i++){
        System.out.println("\n         Data siswa ke-" + (i+1));
        System.out.println("==============================");
        System.out.print("Nama : ");
            String nama = input.next();

            System.out.print("Alamat : ");
            String alamat = input.next();

            System.out.print("Umur : ");
            int umur = input.nextInt();

            System.out.print("Nilai Math : ");
            double m = input.nextDouble();

            System.out.print("Nilai Science : ");
            double s = input.nextDouble();

            System.out.print("Nilai English : ");
            double e = input.nextDouble();

            siswa[i] = new Student(nama, alamat, umur, m, s, e);
        }

        System.out.println("\n=== DATA SISWA ===");
        for(int i = 0; i < jumlahSiswa; i++){
            siswa[i].displayMessage();
        }
    }
}





























//      Student anna = new Student("Anna", "Malang", 24, 50, 50 , 50);
//      anna.displayMessage();
    
//     System.out.println("===================================================");
    
//     Student chris = new Student("Chris", "Kediri", 21);
//     chris.setMath(70);
//     chris.setScience(60);
//     chris.setEnglish(90);
//     chris.displayMessage(); 
    
//     //siswa dengan nama anna dirubah informasi alamat dan umurnya melalui constructor
    
//     System.out.println("====================================================");
    
    
//     anna = new Student("anna", "Batu", 18);
//     anna.displayMessage();

// //siswa denagan nama chris dirubah informasi alamat dan umurnya melalui method
    
// System.out.println("====================================================");
//     chris.setAddress("Surabaya");
//     chris.setAge(22);
//     chris.displayMessage();
//     }
// }
 