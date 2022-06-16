public class Main {

  public static void main(String[] args) {
    Helpers helpers = new Helpers();
    String newLine = System.getProperty("line.separator");
    
    System.out.println(
      "Selamat Datang Di Ramalan Cupu : " 
      + newLine 
      + "++++++++++++++++++++++++++++++++++" );
    System.out.println("");

    double min = 50.00;
    double max = 100.00;
    double range = max - min + 1;
    double randomNum = (Math.random() * range) + min;

    helpers.inputAndOutput(randomNum);
  }
}