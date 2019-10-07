package org.blackdread.lib.restfilter.validation;

import org.blackdread.lib.restfilter.filter.Filter;
import org.blackdread.lib.restfilter.filter.RangeFilter;
import org.blackdread.lib.restfilter.filter.StringFilter;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * <p>Created on 2019/10/06.</p>
 *
 * @author Yoann CAPLAIN
 */
public class FilterRestrictValidator implements ConstraintValidator<FilterRestrict, Filter<?>> {

//    private static final Logger log = LoggerFactory.getLogger(FilterRestrictValidator.class);

    private boolean restrictEquals;
    private boolean restrictNotEquals;
    private boolean restrictIn;
    private boolean restrictNotIn;
    private boolean restrictSpecified;
    private boolean restrictGreaterThan;
    private boolean restrictGreaterThanOrEqual;
    private boolean restrictLessThan;
    private boolean restrictLessThanOrEqual;
    private boolean restrictContains;
    private boolean restrictNotContains;

    @Override
    public void initialize(FilterRestrict constraintAnnotation) {
        restrictEquals = constraintAnnotation.restrictEquals();
        restrictNotEquals = constraintAnnotation.restrictNotEquals();
        restrictIn = constraintAnnotation.restrictIn();
        restrictNotIn = constraintAnnotation.restrictNotIn();
        restrictSpecified = constraintAnnotation.restrictSpecified();
        restrictGreaterThan = constraintAnnotation.restrictGreaterThan();
        restrictGreaterThanOrEqual = constraintAnnotation.restrictGreaterThanOrEqual();
        restrictLessThan = constraintAnnotation.restrictLessThan();
        restrictLessThanOrEqual = constraintAnnotation.restrictLessThanOrEqual();
        restrictContains = constraintAnnotation.restrictContains();
        restrictNotContains = constraintAnnotation.restrictNotContains();

        if (constraintAnnotation.inverseRestrict()) {
            restrictEquals = !restrictEquals;
            restrictNotEquals = !restrictNotEquals;
            restrictIn = !restrictIn;
            restrictNotIn = !restrictNotIn;
            restrictSpecified = !restrictSpecified;
            restrictGreaterThan = !restrictGreaterThan;
            restrictGreaterThanOrEqual = !restrictGreaterThanOrEqual;
            restrictLessThan = !restrictLessThan;
            restrictLessThanOrEqual = !restrictLessThanOrEqual;
            restrictContains = !restrictContains;
            restrictNotContains = !restrictNotContains;
        }
    }

    @Override
    public boolean isValid(Filter<?> value, ConstraintValidatorContext context) {
        if (value == null)
            return true;

        boolean isValid = true;
        context.disableDefaultConstraintViolation();

        if (restrictEquals && value.getEquals() != null) {
            isValid = false;
            context.buildConstraintViolationWithTemplate("{org.blackdread.lib.restfilter.validation.EqualsForbidden.message}")
                .addConstraintViolation();
        }

        if (restrictNotEquals && value.getNotEquals() != null) {
            isValid = false;
            context.buildConstraintViolationWithTemplate("{org.blackdread.lib.restfilter.validation.NotEqualsForbidden.message}")
                .addConstraintViolation();
        }

        if (restrictIn && value.getIn() != null) {
            isValid = false;
            context.buildConstraintViolationWithTemplate("{org.blackdread.lib.restfilter.validation.InForbidden.message}")
                .addConstraintViolation();
        }

        if (restrictNotIn && value.getNotIn() != null) {
            isValid = false;
            context.buildConstraintViolationWithTemplate("{org.blackdread.lib.restfilter.validation.NotInForbidden.message}")
                .addConstraintViolation();
        }

        if (restrictSpecified && value.getSpecified() != null) {
            isValid = false;
            context.buildConstraintViolationWithTemplate("{org.blackdread.lib.restfilter.validation.SpecifiedForbidden.message}")
                .addConstraintViolation();
        }

        if (value instanceof RangeFilter) {
            final RangeFilter rangeFilter = (RangeFilter) value;

            if (restrictGreaterThan && rangeFilter.getGreaterThan() != null) {
                isValid = false;
                context.buildConstraintViolationWithTemplate("{org.blackdread.lib.restfilter.validation.GreaterThanForbidden.message}")
                    .addConstraintViolation();
            }

            if (restrictGreaterThanOrEqual && rangeFilter.getGreaterThanOrEqual() != null) {
                isValid = false;
                context.buildConstraintViolationWithTemplate("{org.blackdread.lib.restfilter.validation.GreaterThanOrEqualForbidden.message}")
                    .addConstraintViolation();
            }

            if (restrictLessThan && rangeFilter.getLessThan() != null) {
                isValid = false;
                context.buildConstraintViolationWithTemplate("{org.blackdread.lib.restfilter.validation.LessThanForbidden.message}")
                    .addConstraintViolation();
            }

            if (restrictLessThanOrEqual && rangeFilter.getLessThanOrEqual() != null) {
                isValid = false;
                context.buildConstraintViolationWithTemplate("{org.blackdread.lib.restfilter.validation.LessThanOrEqualForbidden.message}")
                    .addConstraintViolation();
            }

        }

        if (value instanceof StringFilter) {
            final StringFilter stringFilter = (StringFilter) value;

            if (restrictContains && stringFilter.getContains() != null) {
                isValid = false;
                context.buildConstraintViolationWithTemplate("{org.blackdread.lib.restfilter.validation.ContainsForbidden.message}")
                    .addConstraintViolation();
            }

            if (restrictNotContains && stringFilter.getNotContains() != null) {
                isValid = false;
                context.buildConstraintViolationWithTemplate("{org.blackdread.lib.restfilter.validation.NotContainsForbidden.message}")
                    .addConstraintViolation();
            }

        }

        return isValid;
    }

}
