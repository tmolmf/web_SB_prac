package com.ttm.sample.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.*;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/* 요청이 컨트롤러로 전달되기 전 인터셉터를 거침.
 * 로그인, 세션 등 확인용으로 쓰임
 * 해당 위치에서 DB 에 저장된 세션 정보와 일치하는지 확인 하는 정도? 
 * 안되어 있으면 로그인 화면으로 보내버리고.... 
 * 뭐 그정도면 되겠다.*/
@Component
public class HttpInterceptor extends HandlerInterceptorAdapter {

    private static final Logger logger = LogManager.getLogger(HttpInterceptor.class);

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		
		HttpSession session = request.getSession();
		logger.debug("intercept : "+session);
		
		return super.preHandle(request, response, handler);
	}

}
