package com.github.easystate;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ״̬���·��(����)
 *
 * @author <a href="mailto:zephyrleaves@gmail.com"></a>
 * @since 2010-4-13 13:48:10
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Next {
	/**
	 * ���򻡶� (ָ���¼�->״̬) <code>DOXXX->END</code>
	 *
	 * @return String
	 */
	String[] arc() default {};
}
