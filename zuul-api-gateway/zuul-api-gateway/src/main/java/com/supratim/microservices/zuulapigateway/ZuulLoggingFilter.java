package com.supratim.microservices.zuulapigateway;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.LoggerFactory;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

import ch.qos.logback.classic.Logger;

public class ZuulLoggingFilter  extends ZuulFilter{
	
  private org.slf4j.Logger logger=LoggerFactory.getLogger(ZuulLoggingFilter.class);

	@Override
	public Object run() throws ZuulException {
	HttpServletRequest request=RequestContext.getCurrentContext().getRequest();
	logger.info("the request are:"+request.getRequestURL());
		return null;
	}

	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "pre";
	}

}
