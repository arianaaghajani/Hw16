package ir.ariana.base.service.employee;

import ir.ariana.base.model.Employee;
import ir.ariana.base.repository.employee.EmployeeRepository;
import ir.ariana.base.service.base.BaseServiceImpl;
import org.hibernate.SessionFactory;

public class EmployeeServiceImpl extends BaseServiceImpl<Employee,Long, EmployeeRepository>
implements EmployeeService{
    public EmployeeServiceImpl(EmployeeRepository repository, SessionFactory sessionFactory) {
        super(repository, sessionFactory);
    }
}
