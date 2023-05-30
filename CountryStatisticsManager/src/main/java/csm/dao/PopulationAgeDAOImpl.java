package csm.dao;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import csm.entity.PopulationData;

import java.util.ArrayList;
import java.util.List;

@Repository("population")
public class PopulationAgeDAOImpl implements MetricsDAO {
    private final EntityManager entityManager;

    public PopulationAgeDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<Double> findMetricByCountryBetween(String stat, List<String> countries, int startYear, int endYear) {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Double> query = builder.createQuery(Double.class);
        Root<PopulationData> root = query.from(PopulationData.class);


        List<Double> results = new ArrayList<>();


        query.select(root.get(stat));
        query.where(builder.and(
                root.get("countryName").in(countries),
                builder.between(root.get("populationDataPK").get("year"), startYear, endYear)
        ));

        List<Double> queryResults = entityManager.createQuery(query).getResultList();
        results.addAll(queryResults);


        return results;
    }


}
