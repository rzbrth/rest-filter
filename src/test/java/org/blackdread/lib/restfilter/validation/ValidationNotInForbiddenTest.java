package org.blackdread.lib.restfilter.validation;

import org.blackdread.lib.restfilter.criteria.Criteria;
import org.blackdread.lib.restfilter.criteria.CriteriaUtil;
import org.blackdread.lib.restfilter.criteria.CriteriaUtilTest;
import org.blackdread.lib.restfilter.filter.LongFilter;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * <p>Created on 2019/10/06.</p>
 *
 * @author Yoann CAPLAIN
 */
class ValidationNotInForbiddenTest {

    private static final Logger log = LoggerFactory.getLogger(ValidationNotInForbiddenTest.class);

    private Validator validator;

    private MyCriteria myCriteria;

    @BeforeAll
    static void setUpClass() {
    }

    @BeforeEach
    void setUp() {
        Locale.setDefault(Locale.ENGLISH);

        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();

        myCriteria = new MyCriteria();
    }

    @Test
    void hasViolation() {
        myCriteria.longFilter = CriteriaUtil.buildNotInCriteria(List.of(5L, 6L));

        final Set<ConstraintViolation<MyCriteria>> constraintViolations = validator.validate(myCriteria);

        assertEquals(1, constraintViolations.size());
        assertEquals("NotIn filter is not allowed", constraintViolations.iterator().next().getMessage());
    }

    @Test
    void hasNoViolationForOthers() {
        myCriteria.longFilter = new LongFilter();
        CriteriaUtilTest.fillAll(myCriteria.longFilter);
        myCriteria.longFilter.setNotIn(null);

        final Set<ConstraintViolation<MyCriteria>> constraintViolations = validator.validate(myCriteria);

        assertEquals(Collections.emptySet(), constraintViolations);
    }

    @Test
    void violationCanBeTranslated() {
        Locale.setDefault(Locale.FRANCE);

        myCriteria.longFilter = CriteriaUtil.buildNotInCriteria(List.of(5L, 6L));

        final Set<ConstraintViolation<MyCriteria>> constraintViolations = validator.validate(myCriteria);

        assertEquals(1, constraintViolations.size());
        assertEquals("Le filtre NotIn n'est pas autorisé", constraintViolations.iterator().next().getMessage());
    }

    @Test
    void validatorAcceptNull() {
        final NotInForbiddenValidator validator = new NotInForbiddenValidator();
        final boolean valid = validator.isValid(null, null);
        assertTrue(valid);
    }


    private static class MyCriteria implements Criteria {

        @NotInForbidden
        private LongFilter longFilter;

        @Override
        public Criteria copy() {
            return null;
        }
    }
}
