package com.inditex.prices.out.jpa.impl;


import com.inditex.prices.out.jpa.model.PriceEntity;
import com.inditex.prices.port.out.model.PriceCriteria;
import jakarta.persistence.criteria.Expression;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import jakarta.persistence.criteria.Subquery;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Component
public class PricesSpecification {

    private static final String PRODUCT_ID = "productId";
    private static final String BRAND_ID = "brandId";
    private static final String END_DATE = "endDate";
    private static final String START_DATE = "startDate";
    private static final String PRIORITY = "priority";

    public Specification<PriceEntity> getPrices(PriceCriteria priceCriteria) {

        return (root, query, criteriaBuilder) -> {

            List<Predicate> predicates = new ArrayList<>();

            if (Objects.nonNull(priceCriteria.getProductId())) {
                predicates.add(criteriaBuilder.equal(root.get(PRODUCT_ID), priceCriteria.getProductId()));
            }

            if (Objects.nonNull(priceCriteria.getBrandId())) {
                predicates.add(criteriaBuilder.equal(root.get(BRAND_ID), priceCriteria.getBrandId()));
            }

            if (Objects.nonNull(priceCriteria.getPriceDate())) {

                Subquery<Long> subQueryMaxPriority = query.subquery(Long.class);
                Root<PriceEntity> subRoot = subQueryMaxPriority.from(PriceEntity.class);

                Predicate endDatePredicateSub = criteriaBuilder.greaterThan(subRoot.get(END_DATE), priceCriteria.getPriceDate());
                Predicate startDatePredicateSub = criteriaBuilder.lessThan(subRoot.get(START_DATE), priceCriteria.getPriceDate());
                Predicate productPredicateSub = criteriaBuilder.equal(subRoot.get(PRODUCT_ID), priceCriteria.getProductId());
                Predicate brandPredicateSub = criteriaBuilder.equal(subRoot.get(BRAND_ID), priceCriteria.getBrandId());
                Expression<Long> maxPriority = criteriaBuilder.max(subRoot.get(PRIORITY));

                subQueryMaxPriority.select(maxPriority).where(startDatePredicateSub, endDatePredicateSub, productPredicateSub, brandPredicateSub);

                predicates.add(criteriaBuilder.equal(root.get(PRIORITY), subQueryMaxPriority));


                Predicate endDatePredicate = criteriaBuilder.greaterThan(root.get(END_DATE), priceCriteria.getPriceDate());
                Predicate startDatePredicate = criteriaBuilder.lessThan(root.get(START_DATE), priceCriteria.getPriceDate());

                predicates.add(endDatePredicate);
                predicates.add(startDatePredicate);

            }

            return criteriaBuilder.and(predicates.toArray(new Predicate[0]));

        };
    }
}
