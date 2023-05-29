package csm.dao;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Root;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import csm.entity.AgeMidYearPopulation;
import csm.entity.InternationalDataPK;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Repository("midyear_population")
public class AgeMidYearPopulationDAOImpl implements MetricsDAO {
    private final EntityManager entityManager;

    public AgeMidYearPopulationDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<Double> findMetricByCountryBetween(String stat, List<String> countries, int startYear, int endYear) {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Double> query = builder.createQuery(Double.class);
        Root<AgeMidYearPopulation> root = query.from(AgeMidYearPopulation.class);


        List<Double> results = new ArrayList<>();


        query.select(root.get(stat));
        query.where(builder.and(
                root.get("countryName").in(countries),
                builder.between(root.get("year"), startYear, endYear)
        ));

        List<Double> queryResults = entityManager.createQuery(query).getResultList();
        results.addAll(queryResults);


        return results;
    }


}
