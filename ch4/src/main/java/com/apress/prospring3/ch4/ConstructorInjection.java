package com.apress.prospring3.ch4;

public class ConstructorInjection 
{
	private Dependency dependency;
	
	public ConstructorInjection(Dependency dependency)
	{
		this.dependency = dependency;
	}

}
