package com.practice.AppMaven3;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary // Use if more than one bean is detected...
public class Snapdragon implements MobileProcesser {

	public void process() {

		System.out.println("Snapdragon processer...");
	}

}
