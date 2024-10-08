import java.util.Scanner;
public class EVALUAPLUS {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" GESTION DE NOTAS DEL GRUPO A ");

                final double LIMIT_APPROBATION = 3.0; 
                final int MIN_STUDENTS=5;
                final int NUMBER_NOTES=3;

                System.out.println("Ingrese el numero de estudiantes, deben ser almenos 5 estudiantes");
                int numberStudents=scanner.nextInt();
                scanner.nextLine();

                while (numberStudents<MIN_STUDENTS) {
                    System.out.println("Debe Ingresar al menos 5 estudiantes");
                    numberStudents=scanner.nextInt();
                    scanner.nextLine(); 
                }

                String[] nameStudents=new String[numberStudents];
                int[] idstudents = new int[numberStudents];
                double[] promedio = new double[numberStudents];
                double[][] grades= new double[numberStudents][NUMBER_NOTES];
               
                for (int i = 0; i < numberStudents; i++) {
                    System.out.print("Nombre completo del estudiante " + (i+1) + ": ");
                    nameStudents[i]=scanner.nextLine();
                    System.out.print("Identificacion: ");
                    int id_student=scanner.nextInt();

                    boolean bandera=true;

                    while (bandera==true){
                        if(i>0){
                            
                            for (int h = 0; h < idstudents.length; h++) {
                                if (id_student==idstudents[h]){
                                do {
                                    System.out.println("Ya hay un estudiante con la misma identificacion");
                                    System.out.print("Ingrese nuevamente la identificacion: ");
                                    id_student=scanner.nextInt();
                                    h=0;
                                } while (id_student==idstudents[h]); 
                                }
                            }
                        }
                        
                        if(id_student<1000 || id_student>9999){
                            System.out.println("identificacion incorrecta (Debe ser de 4 digitos)");
                            System.out.print("Ingrese nuevamente la identificacion: ");
                            id_student=scanner.nextInt();
                        }else{
                            bandera=false;
                        }
                    }

                    idstudents[i]=id_student;
                    float suma=0;                   
                    System.out.println(" Digite las tres notas: ");
                      for (int j = 0; j < NUMBER_NOTES; j++){
                        System.out.print("nota " + (j+1) + ": ");
                        grades[i][j] = scanner.nextDouble();
                        while (grades[i][j] < 0 || grades[i][j] > 5){
                            System.out.println("nota incorrecta");
                            System.out.println("ingrese nuevamente la nota entre el rango de 0.0 y 5.0");
                            grades[i][j] = scanner.nextDouble();
                        }
                        suma += grades[i][j];
                      }

                      scanner.nextLine();
                      promedio[i] = suma/NUMBER_NOTES;

                }

                String status = "";
                System.out.println("**REPORTE GENERAL**");
                System.out.println("----------------------");
               
                for (int i = 0; i < numberStudents; i++) {
                    status=(promedio[i] >= LIMIT_APPROBATION)? "APROBADO" : "REPROBADO";
                    System.out.println("Estudiante " +nameStudents[i]+ " (ID): " +idstudents[i] + " - PROMEDIO: " + String.format("%.3f", promedio[i]) + " fue: " +status );
                        

                }
            scanner.close();
    }
    
}
