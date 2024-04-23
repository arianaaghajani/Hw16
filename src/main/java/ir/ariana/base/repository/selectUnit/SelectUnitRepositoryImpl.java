package ir.ariana.base.repository.selectUnit;

import ir.ariana.base.model.SelectUnit;
import ir.ariana.base.repository.base.BaseRepositoryImpl;
import org.hibernate.SessionFactory;

public class SelectUnitRepositoryImpl extends BaseRepositoryImpl<SelectUnit,Long>
        implements SelectUnitRepository{
    public SelectUnitRepositoryImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public Class<SelectUnit> getEntityClass() {
        return SelectUnit.class;
    }

    @Override
    public String getEntity() {
        return null;
    }
}
