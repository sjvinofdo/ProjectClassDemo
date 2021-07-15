package org.test;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class FailureIgnoreRunCount {
public static void main(String[] args) {
	Result runClasses = JUnitCore.runClasses(JUnitSample.class,JUnitDemo.class);
	int failureCount = runClasses.getFailureCount();
	System.out.println("Failure Count : "+failureCount);
	
	int ignoreCount = runClasses.getIgnoreCount();
	System.out.println("Ignore Count : "+ignoreCount);
	
	int runCount = runClasses.getRunCount();
	System.out.println("Run Count : "+runCount);
	
	long runTime = runClasses.getRunTime();
	System.out.println("Run Time : "+runTime);
	
	List<Failure> failures = runClasses.getFailures();
	for (Failure fail : failures) {
		System.out.println("Failures : "+fail);
	}
}
}
