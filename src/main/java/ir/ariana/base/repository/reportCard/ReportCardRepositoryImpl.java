package ir.ariana.base.repository.reportCard;

import ir.ariana.base.model.ReportCard;
import ir.ariana.base.repository.base.BaseRepositoryImpl;
import org.hibernate.SessionFactory;

public class ReportCardRepositoryImpl extends BaseRepositoryImpl<ReportCard,Long>
        implements ReportCardRepository {
    public ReportCardRepositoryImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public Class<ReportCard> getEntityClass() {
        return ReportCard.class;
    }

    @Override
    public String getEntity() {
        return null;
    }
}
