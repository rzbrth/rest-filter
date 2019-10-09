package org.blackdread.lib.restfilter.validation;

import org.blackdread.lib.restfilter.filter.RangeFilter;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * <p>Created on 2019/10/06.</p>
 *
 * @author Yoann CAPLAIN
 */
public class GreaterThanForbiddenValidator implements ConstraintValidator<GreaterThanForbidden, RangeFilter<?>> {

//    private static final Logger log = LoggerFactory.getLogger(GreaterThanForbiddenValidator.class);

    @Override
    public void initialize(GreaterThanForbidden constraintAnnotation) {
    }

    @Override
    public boolean isValid(RangeFilter<?> value, ConstraintValidatorContext context) {
        if (value == null)
            return true;

        return value.getGreaterThan() == null;
    }

}