package org.smart4j.framework.bean;

import java.lang.reflect.Method;

public class Handler {

    /**
     * Controller类
     */
    private Class<?> controllerClass;

    /**
     * Action方法
     */
    private Method acionMethod;

    public Handler(Class<?> controllerClass, Method acionMethod) {
        this.controllerClass = controllerClass;
        this.acionMethod = acionMethod;
    }

    public Class<?> getControllerClass() {
        return controllerClass;
    }

    public Method getAcionMethod() {
        return acionMethod;
    }
}
