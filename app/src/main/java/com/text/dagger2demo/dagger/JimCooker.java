package com.text.dagger2demo.dagger;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by mengyuanyuan on 2017/8/1.
 */

@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface JimCooker {
}
