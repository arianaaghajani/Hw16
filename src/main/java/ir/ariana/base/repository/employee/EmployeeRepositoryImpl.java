package ir.ariana.base.repository.employee;
import ir.ariana.base.model.Employee;
import ir.ariana.base.repository.base.BaseRepositoryImpl;
import org.hibernate.SessionFactory;

public class EmployeeRepositoryImpl extends BaseRepositoryImpl<Employee,Long>
        implements EmployeeRepository{

    public EmployeeRepositoryImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public Class<Employee> getEntityClass() {
        return Employee.class;
    }

    @Override
    public String getEntity() {
        return null;
    }
}
