package com.example.netflixzuulapigatewayserver;

import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Component
public class ZuulLoggiFilter extends ZuulFilter {

	private Logger logger=LoggerFactory.getLogger(this.getClass());
	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Object run() throws ZuulException {
HttpServletRequest htp=	RequestContext.getCurrentContext().getRequest();
logger.info("request -> {} request uri -> {}",htp,htp.getRequestURI());			
return null;
	}

	@Override
	public String filterType() {
		//when do we need to log the event details
		return "pre";
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 0;
	}

}
