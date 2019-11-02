package com.awssdt.function;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.awssdt.entity.ApiOutput;

public class GetDataFunctionHandler implements RequestHandler<Object, Object> {

    @Override
    public ApiOutput handleRequest(Object apigwInput, Context context) {
    	
    	ApiOutput apiOutput = new ApiOutput();
    	
    	apiOutput.setStatusCode(200);
    	apiOutput.setBody("test output");
    	
    	return apiOutput;
    }
}