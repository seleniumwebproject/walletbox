package com.wp.system.exception;

import javax.validation.constraints.DecimalMin;
import java.util.ArrayList;
import java.util.List;

public class ServiceErrorResponse {
    private int status;

    private String error;

    private List<String> advices = new ArrayList<>();

    private StackTraceElement[] trace;

    public ServiceErrorResponse(ServiceException e) {
        this.trace = e.getStackTrace();
        this.error = e.getMessage();
        this.status = e.getHttpCode().value();
    }

    public void addAdvice(String advice) {
        this.advices.add(advice);
    }

    public void removeAdvice(String advice) {
        this.advices.remove(advice);
    }

    public void removeAdvice(int advice) {
        this.advices.remove(advice);
    }

    public List<String> getAdvices() {
        return advices;
    }

    public void setAdvices(List<String> advices) {
        this.advices = advices;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public StackTraceElement[] getTrace() {
        return trace;
    }

    public void setTrace(StackTraceElement[] trace) {
        this.trace = trace;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}