import java.util.Scanner;

public class Helpers {
  public static void inputAndOutput(Double num) {
    
    System.out.println("Data Anda : ");
    Scanner setMansName = new Scanner(System.in);
    System.out.print("Masukkan Nama Anda : ");
    String mansName = setMansName.nextLine();
    
    Scanner setAgeQuestion = new Scanner(System.in);
    System.out.print("Masukkan Umur Anda : ");
    Integer mansAge = setAgeQuestion.nextInt();
  
    System.out.println("");

    System.out.println("Data Pasangan Anda : ");
    Scanner setWomansName = new Scanner(System.in);
    System.out.print("Masukkan Nama Pasangan Anda : ");
    String womansName = setWomansName.nextLine();

    Scanner setAge = new Scanner(System.in);
    System.out.print("Masukkan Umur Pasangan Anda :  ");
    Integer womansAge = setAge.nextInt();

    System.out.println("");
    System.out.println("");

    System.out.println(mansName + " [" + mansAge + "]" + " tahun");
    System.out.println(womansName + " [" + womansAge + "]" + " tahun");

    System.out.println("");
    System.out.println("");

    System.out.println("Tekan ENTER untuk melihat hasil ramalan");
    try {
      System.in.read();
      System.out.print("Kecocokkan anda dengan pasangan anda : " + String.format("%.2f", num) + " %");
      System.out.println("");
      System.out.println("");
    } catch(Exception e){}

    System.out.print( "Terimakasih karena anda telah menggunakan jasa kami");

  }
}
