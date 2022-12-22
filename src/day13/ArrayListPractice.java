package day13;

import day12.Employee;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Predicate;

public class ArrayListPractice {

    public static void main(String[] args) {

        ArrayList intList = new ArrayList(); // creates Objects variable

        intList.add(2); //Auto boxing
        intList.add("Manoj");

        Object test = 2; //Auto boxing

        Integer zeroPositionData = (Integer) intList.get(0);

        ArrayList<String> lists = new ArrayList<>(100);
        //lists.ensureCapacity(100);

        lists.add("A");
        lists.add("B");
        lists.add("C");
        lists.add("D");
        lists.add("F");

        String zeroPos = lists.get(0);
        System.out.println(lists);

        lists.add(4,"E");
        lists.add(6,null);
        lists.add(7,"H");

        System.out.println(lists);

        // ArrayList copyList1 = lists;
        // ArrayList copyLists2 = new ArrayList<String>(lists);

        ArrayList copyLists = new ArrayList<String>();

        copyLists.addAll(lists);
        System.out.println(copyLists);

        copyLists.set(6,"G"); // To update data in 6th position rather than add and push that to 7th posititon
        System.out.println(copyLists);

        copyLists.clear();
        System.out.println(copyLists);

        boolean contain = lists.contains("C");
        System.out.println(contain);

        ArrayList employees = new ArrayList<Employee>();

        employees.add(new Employee(1,"A",LocalDate.now(),500));
        employees.add(new Employee(2,"B",LocalDate.now(),500));
        employees.add(new Employee(3,"C",LocalDate.now(),500));
        employees.add(new Employee(4,"D",LocalDate.now(),500));

        Boolean containEmp = employees.contains(new Employee(2,"B",LocalDate.now(),500));
        System.out.println(containEmp);

        int index = employees.indexOf(new Employee(3,"C",LocalDate.now(),500));
        System.out.println(index);

        Employee deletedEmployee = (Employee) employees.remove(1);


        employees.remove(new Employee(4,"D",LocalDate.now(),500));
        // employees.removeAll();

       // employees.removeIf(new Predicate() {
          //  @Override
            //public boolean test(Employee employee) {
              //  return employee.getSalary() == 5000 && employee.getName().equalsIgnoreCase("A") ;
           // }
        // });

        //System.out.println(employees);

        //employees.clear();

       // boolean isListEmpty = employees.isEmpty();
        //System.out.println(isListEmpty);

        ArrayList<String> list1 = new ArrayList<>();
        //lists.ensureCapacity(100);

        list1.add("B");
        list1.add("C");
        list1.add("F");
        list1.add("A");
        list1.add("E");

        Collections.sort(list1);

        System.out.println(list1);

        list1.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1); // switch o1 and o2 to be in ABCD order
            }
        });

        System.out.println(list1);

        int sizeOfEmployee = employees.size();
        System.out.println(sizeOfEmployee);

        List<Employee> subEmployee = employees.subList(1,3);
        System.out.println(subEmployee);



    }
}
