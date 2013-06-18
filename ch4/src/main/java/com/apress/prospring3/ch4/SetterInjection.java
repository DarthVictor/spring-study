package com.apress.prospring3.ch4;

public class SetterInjection {
	private Dependency dependency;
	
	private void setDependency(Dependency dependency) {
		this.dependency = dependency;
	}

}
