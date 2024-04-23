package ir.ariana.base.service.reportCard;

import ir.ariana.base.model.ReportCard;
import ir.ariana.base.repository.reportCard.ReportCardRepository;
import ir.ariana.base.service.base.BaseServiceImpl;
import org.hibernate.SessionFactory;

public class ReportCardServiceImpl extends BaseServiceImpl<ReportCard, Long, ReportCardRepository>
        implements ReportCardService {
    public ReportCardServiceImpl(ReportCardRepository repository, SessionFactory sessionFactory) {
        super(repository, sessionFactory);
    }
}
