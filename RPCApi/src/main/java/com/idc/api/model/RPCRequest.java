package com.idc.api.model;

import com.idc.api.interfaces.RPCSignal;

import java.io.Serializable;

public class RPCRequest implements RPCSignal, Serializable {
    private String className;
    private String methodName;
    private Object [] parameters;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public Object[] getParameters() {
        return parameters;
    }

    public void setParameters(Object[] parameters) {
        this.parameters = parameters;
    }
}
