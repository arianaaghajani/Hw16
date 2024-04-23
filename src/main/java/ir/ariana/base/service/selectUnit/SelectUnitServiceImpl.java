package ir.ariana.base.service.selectUnit;

import ir.ariana.base.model.SelectUnit;
import ir.ariana.base.repository.selectUnit.SelectUnitRepository;
import ir.ariana.base.service.base.BaseServiceImpl;
import org.hibernate.SessionFactory;

public class SelectUnitServiceImpl extends BaseServiceImpl<SelectUnit,Long, SelectUnitRepository>
        implements SelectUnitService{
    public SelectUnitServiceImpl(SelectUnitRepository repository, SessionFactory sessionFactory) {
        super(repository, sessionFactory);
    }
}
