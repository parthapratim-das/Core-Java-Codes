package com.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CollectionsTest implements Comparable<CollectionsTest>{
	
	int cid;
	String cname;
	double cval;
	
	

	public CollectionsTest(int cid, String cname, double cval) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cval = cval;
	}



	public int getCid() {
		return cid;
	}



	public void setCid(int cid) {
		this.cid = cid;
	}



	public String getCname() {
		return cname;
	}



	public void setCname(String cname) {
		this.cname = cname;
	}



	public double getCval() {
		return cval;
	}



	public void setCval(double cval) {
		this.cval = cval;
	}

	

	@Override
	public String toString() {
		return "Collections [cid=" + cid + ", cname=" + cname + ", cval=" + cval + "]";
	}



	@Override
	public int compareTo(CollectionsTest o) {
		
		if(this.cval > o.cval)
			return 1;
		else 
			return -1;
	}

	

}
