package com.propertysource.annotation;

public class DbProps {
	String url;
	String user;
	String pwd;
	public DbProps() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "DbProps [url=" + url + ", user=" + user + ", pwd=" + pwd + "]";
	}
	
}
