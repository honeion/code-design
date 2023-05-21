package com.code.design5.domain.order;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = OrderSheetFormValidator.class)
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME) //언제까지 유지할 것인지. 런타임때까지 어노테이션이 유지된다.
public @interface OrderSheetForm {

    String message() default "Order sheet form is invalid";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
