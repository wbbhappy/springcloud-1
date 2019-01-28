package com.hcmony;

import com.hcmony.test.Test;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(Test.class)
public @interface MyTestAnniont {
}
