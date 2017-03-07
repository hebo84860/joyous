package com.joyous.common.trance;

import com.joyous.common.entity.Oper;
import com.joyous.common.util.DateUtils;
import com.joyous.common.util.JSONMapper;
import org.jboss.resteasy.specimpl.MultivaluedMapImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.core.MultivaluedMap;
import java.util.Date;
import java.util.UUID;

public class TraceContext {
	
	private static Logger logger = LoggerFactory.getLogger(TraceContext.class);
	
	public final static String prefix = "HHLVFHEADER";
	
	public static String getHeaderKey(String key){
		return (TraceContext.prefix+key).toLowerCase();
	}


	public static MultivaluedMap<String,Object> getContext2MultivaluedMap(){
		
    	MultivaluedMap<String,Object> headerMap = new MultivaluedMapImpl<String, Object>();
		try{
	    	
	    	String oper = TraceContext.getOper();
	    	if(null!=oper){
		    	headerMap.putSingle(getHeaderKey(TraceContextKey.OPER.name()),oper);
	    	}
	    	String customer = TraceContext.getCustomer();
	    	if(null!=customer){
	    		headerMap.putSingle(getHeaderKey(TraceContextKey.CUSTOMER.name()),customer);
	    	}
	    	String traceId = TraceContext.getTraceId();
	    	if(null!=traceId){
	    		headerMap.putSingle(getHeaderKey(TraceContextKey.TRACENO.name()),traceId);
	    	}
	    	String ip = TraceContext.getIp();
	    	if(null!=ip){
	    		headerMap.putSingle(getHeaderKey(TraceContextKey.IP.name()),ip);
	    	}
	    	String equipmentNo = TraceContext.getEquipmentNo();
	    	if(null!=equipmentNo){
	    		headerMap.putSingle(getHeaderKey(TraceContextKey.EQUIPMENTNO.name()),equipmentNo);
	    	}
	    	String serverTrace=TraceContext.getServerTrace();
	    	if(null!=serverTrace){
	    		headerMap.putSingle(getHeaderKey(TraceContextKey.SERVERIPTRACE.name()),serverTrace);
	    	}    	
	    	String serverTraceTime = TraceContext.getServerTraceTime();
	    	if(null!=serverTraceTime){
	    		headerMap.putSingle(getHeaderKey(TraceContextKey.SERVERTIMETRACE.name()),serverTraceTime);
	    	}
	    	String isLogging = TraceContext.getNotLogging();
	    	if(null!=isLogging){
	    		headerMap.putSingle(getHeaderKey(TraceContextKey.NOTLOGGING.name()),isLogging);
	    	}    	

		}catch(Exception ex){
			logger.warn("startTrace fail getContext2MultivaluedMap!");
    	}
    	return headerMap;
		
	}
	

	public static String getCustomer() {
		return TraceContextKey.CUSTOMER.get();
	}


	public static String getServerTraceTime() {
		return TraceContextKey.SERVERTIMETRACE.get();
	}

	public static String getServerTrace() {
		return TraceContextKey.SERVERIPTRACE.get();
	}
	
	public static String generateTraceId() {
		UUID uuid = UUID.randomUUID();
		return uuid.toString();
	}
	
	public static void setTraceId(String value) {
		TraceContextKey.TRACENO.set(value);
	}
	
	public static String getTraceId() {
		if(null==TraceContextKey.TRACENO.get()){
			setTraceId(generateTraceId());
		}
		return TraceContextKey.TRACENO.get();
	}
	

	public static void setIp(String value) {
		TraceContextKey.IP.set(value);
	}
	public static String getIp() {
		return TraceContextKey.IP.get();
	}
	public static void removeIp() {
		TraceContextKey.IP.remove();
	}
	
	public static void setEquipmentNo(String equipmentNo) {
		TraceContextKey.EQUIPMENTNO.set(equipmentNo);
	}
	public static String getEquipmentNo() {
		return TraceContextKey.EQUIPMENTNO.get();
	}
	public static void removeEquipmentNo() {
		TraceContextKey.EQUIPMENTNO.remove();
	}
	
	public static void setOper(Oper value) {

		try{
			String oper = JSONMapper.getInstance().writeValueAsString(value);
			TraceContextKey.OPER.set(oper);
		}catch(Exception ex){
			logger.info("oper null or read from json error!",ex);
		}
	}
	
	public static void setOper(String value) {
		TraceContextKey.OPER.set(value);
	}
	
	

	public static String getOper() {
		return TraceContextKey.OPER.get();
	}
	
	public static void removeOper() {
		TraceContextKey.OPER.remove();
	}
	

	public static void setNotLogging(boolean value) {
		TraceContextKey.NOTLOGGING.set(String.valueOf(value));
	}
	
	public static String getNotLogging() {
		return TraceContextKey.NOTLOGGING.get();
	}

	public static void removeNotLogging() {
		TraceContextKey.NOTLOGGING.remove();
	}
	

}
