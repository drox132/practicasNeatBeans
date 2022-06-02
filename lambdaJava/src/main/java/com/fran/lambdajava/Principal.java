
import com.fran.lambdajava.Person;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;




public class Principal {
    
    public static void main(String[] args){
    
        Person p1 = new Person("Francisco",LocalDate.of(1992, 7, 23),true);
        Person p2 = new Person("Mileydi", LocalDate.of(2010,10,1),false);
        Person p3 = new Person("Julio",LocalDate.of(1992, 7, 23),true);
        Person p4 = new Person("Desire", LocalDate.of(1992,10,1),false);
        
       List<Person> listPerson= new ArrayList<>();
       
       listPerson.add(p1);
       listPerson.add(p2);
       listPerson.add(p3);
       listPerson.add(p4);
       
       for(int i=0 ; i<listPerson.size(); i++){
           System.out.println(listPerson.get(i));
       }
       
        System.out.println("======================================================================================");
        System.out.println("======================================================================================");
       
        
        for(Person p : listPerson){
           System.out.println(p);
       }
       
       
        System.out.println("======================================================================================");
        System.out.println("======================================================================================");
       
       //EXPRESIONES LAMBDA  PARA RECORRER UNA LISTA
       listPerson.forEach(p-> System.out.println(p));
     
        System.out.println("======================================================================================");
        System.out.println("======================================================================================");
       //ESTA EXPRESION ES LA MISMA PERO AMS RESUMIDA A PARTIER DE JAVA 8
        listPerson.forEach(System.out::println);
             
        
        //metodo filter
        
        List<Person> listFiltered=listPerson.stream().filter(
                p -> Principal.getAge(p.getFechaNacimiento())>=18)
                .collect(Collectors.toList());
        
        
        System.out.println("======================================================================================");
        System.out.println("======================================================================================");
      
        Principal.printList(listFiltered);
        
        System.out.println("======================================================================================");
        System.out.println("====================esto es pap probar==================================================================");
      
        
        listPerson.stream().filter(p -> Principal.getAge(p.getFechaNacimiento())>18).forEach(System.out::println);
        
        //filtrado de otra condicion
        
        List<Person> listProgramer= 
                listPerson.stream()
                .filter(p -> p.isIsProgramer())
                        .collect(Collectors.toList());
        
        System.out.println("======================================================================================");
        System.out.println("======================================================================================");
      
        Principal.printList(listProgramer);
        
        
        
        
        
        
        
    }
    
    public static int getAge (LocalDate fechaNacimiento){
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }
    
    public static void printList (List<?> list){
    
        list.forEach(System.out::println);
    }
    
}
