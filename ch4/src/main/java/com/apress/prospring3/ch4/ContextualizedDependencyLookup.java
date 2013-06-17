package com.apress.prospring3.ch4;

public class ContextualizedDependencyLookup implements ManagedComponent
{
    private Dependency dependency;
    
    public void performLookup(Container container)
    {
    	this.dependency = (Dependency) container.getDependency("myDependency");
    }
    
}
