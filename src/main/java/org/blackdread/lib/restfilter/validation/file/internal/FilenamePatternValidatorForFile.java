package org.blackdread.lib.restfilter.validation.file.internal;

import org.apache.commons.lang3.StringUtils;
import org.blackdread.lib.restfilter.validation.file.FilenamePattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.io.File;

public class FilenamePatternValidatorForFile extends FilenamePatternValidator implements ConstraintValidator<FilenamePattern, File> {

    @Override
    public boolean isValid(File value, ConstraintValidatorContext context) {
        if (value == null) {
            return true;
        }
        String fileName = value.getName();
        if (StringUtils.isBlank(fileName)) {
            // todo check logic to apply
            return false;
        }
        return super.isValid(fileName, context);
    }

}
