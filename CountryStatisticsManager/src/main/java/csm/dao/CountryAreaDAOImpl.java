package csm.dao;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import java.util.ArrayList;
import java.util.List;
import csm.entity.CountryArea;

@Repository("country_area")
public class CountryAreaDAOImpl implements MetricsDAO {
    private final EntityManager entityManager;

    public CountryAreaDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<Double> findMetricByCountryBetween(String stat, List<String> countries,int startYear,  int endYear) {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Double> query = builder.createQuery(Double.class);
        Root<CountryArea> root = query.from(CountryArea.class);


        List<Double> results = new ArrayList<>();


        query.select(root.get(stat));
        query.where(root.get("countryName").in(countries));

        List<Double> queryResults = entityManager.createQuery(query).getResultList();
        results.addAll(queryResults);


        return results;
    }


}
