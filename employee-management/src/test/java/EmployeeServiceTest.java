import com.codewithsimo.Employee;
import com.codewithsimo.EmployeeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeServiceTest {
    private EmployeeService service;

@BeforeEach
void setUp(){
    service = new EmployeeService();
}
@Test
    void shouldAddEmployee(){
    Employee emp76 = new Employee(1976,"Ismaeil",4500.0);
    service.addEmployee(emp76);
    assertEquals(1,service.getEmployeeCount());
}
@Test
    void shouldFindEmployeeById(){
    Employee employee = new Employee(86,"Maryam",5500.50);
    service.addEmployee(employee);

    assertTrue(service.findEmployeeById(86).isPresent());
    assertTrue(service.findEmployeeById(86)
            .orElseThrow()
            .getName()
            .equalsIgnoreCase("maryam"));
}
@Test
    void shouldRejectNegativeSalary(){
    assertThrows(
            IllegalArgumentException.class,()-> new Employee(101,"Joud",-4500.25));
}
    @Test
    void shouldRejectDuplicateEmployeeId() {
        service.addEmployee(new Employee(101, "Joud", 2500.05));

        assertThrows(
                IllegalArgumentException.class,
                () -> service.addEmployee(new Employee(101, "Cano", 2000.50))
        );

        assertEquals(1, service.getEmployeeCount());
    }

}
