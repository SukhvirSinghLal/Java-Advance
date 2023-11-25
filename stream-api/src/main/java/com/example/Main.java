package com.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    static List<Employee> employees=new ArrayList<>();
    static{
        employees.add(new Employee("Jatin","Singh",5000.0,List.of("project11","project12")));
        employees.add(new Employee("Rahul","Kumar",4000.0,List.of("project21","project22")));
        employees.add(new Employee("Gagan","Singh",7000.0,List.of("project31","project32")));
        employees.add(new Employee("Manas","Sharma",10000.0,List.of("project41","project42")));

    }
    public static void main(String[] args) {

        //System.out.println(Stream.of(employees));
        //System.out.println(employees.stream());

        //Note: forEach is terminal operation i.e, you can't do any operation after that
        //employees.stream().forEach(employee -> System.out.println(employee));

        //Intermediate Operations
        //map & collect
//       List<Employee> increasedSalary=employees.stream()
//               .map(employee -> new Employee(employee.getFirstName(),
//                employee.getLastName(),
//                employee.getSalary() * 1.10,
//                employee.getProjects())
//                )
//               .collect(Collectors.toList());         //chaining of operation
//        System.out.println(increasedSalary);

        //filter operation
//        List<Employee> filteredEmp= employees.stream()
//                .filter(employee -> employee.getSalary()>=7000)
//                .collect(Collectors.toList());         //chaining of operation
//        System.out.println(filteredEmp);

        //findFirst - terminal operation
//        Employee firstEmp= employees.stream()
//                .filter(employee -> employee.getSalary()>=7000)
//                .findFirst()
//                .orElse(null);         //chaining of operation
//        System.out.println(firstEmp);

        //flat map - Intermediate Operation

//        String projects=employees.stream()
//                .map(employee -> employee.getProjects())
//                .flatMap(strings -> strings.stream())
//                .collect(Collectors.joining(","));
//
//        System.out.println(projects);

        //ShortCircuit Operations
//        List<Employee> skipedFistEmployee=employees.stream()
//                .skip(1)
//                .limit(1)
//                .collect(Collectors.toList());
//
//        System.out.println(skipedFistEmployee);

        //Get finite data out of infinite
//        Stream.generate(Math::random)
//                .limit(5)
//                .forEach(t -> System.out.println(t));

        //Sorting
//        List<Employee> sortedEmp=employees.stream()
//                .sorted((o1, o2) -> o1.getFirstName().compareToIgnoreCase(o2.getFirstName()))
//                .collect(Collectors.toList());
//        System.out.println(sortedEmp);

        // min or max
//        Employee hightestSalariedEmp=employees.stream()
//                .max(Comparator.comparing(Employee::getSalary))
//                .orElseThrow(NoSuchElementException::new);
//        System.out.println(hightestSalariedEmp);

        //reduce - For accumulation

        Double totalOfSalary= employees.stream()
                .map(employee -> employee.getSalary())
                .reduce(0.0,Double::sum);
        System.out.println(totalOfSalary);

    }
}