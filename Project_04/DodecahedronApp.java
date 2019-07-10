import java.util.Scanner;
/**
 *Creates a Dodecahedron class that reads in values for label, color, and edge
 *and creates a Dodecahedron object.
 *
 *Project 4 (DodecahedronApp)
 *@author Erika Yardumian - CPSC - 1213
 *@version 9/16/18
 */
public class DodecahedronApp {
  /**Class that reads in values and creates an object.
   *@param args - Command line arguments - not used.
   */
   public static void main(String[] args) {
      String label;
      String color;
      Double edge;
     
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter label, color, and edge length for "
         + "a dodecahedron.");
      System.out.print("\n\t" + "label: ");
      label = scan.nextLine();
      System.out.print("\t" + "color: ");
      color = scan.nextLine();
      System.out.print("\t" + "edge: ");
      edge = Double.parseDouble(scan.nextLine());
      if (edge <= 0) {
         System.out.print("Error: edge must be greater than 0.");
      }
      else {
         Dodecahedron example1 = new Dodecahedron(label, color, edge);
         System.out.println("\n" + example1);         
      }
   }
}