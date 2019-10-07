package org.blackdread.lib.restfilter.validation;

import org.blackdread.lib.restfilter.filter.Filter;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * <p>Created on 2019/10/06.</p>
 *
 * @author Yoann CAPLAIN
 */
public class SpecifiedForbiddenValidator implements ConstraintValidator<SpecifiedForbidden, Filter<?>> {

//    private static final Logger log = LoggerFactory.getLogger(SpecifiedForbiddenValidator.class);

    @Override
    public void initialize(SpecifiedForbidden constraintAnnotation) {
    }

    @Override
    public boolean isValid(Filter<?> value, ConstraintValidatorContext context) {
        if (value == null)
            return true;

        return value.getSpecified() == null;
    }

}
