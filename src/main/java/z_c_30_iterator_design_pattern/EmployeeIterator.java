package z_c_30_iterator_design_pattern;

import java.util.List;
import java.util.NoSuchElementException;

public class EmployeeIterator implements Iterator{

    private int currentIndex = 0;
    private List<Employee> employeeList;

    public EmployeeIterator(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < employeeList.size();
    }

    @Override
    public Employee next() {
       if (!hasNext()) {
           throw  new NoSuchElementException();
       }

       return employeeList.get(currentIndex++);
    }
}
