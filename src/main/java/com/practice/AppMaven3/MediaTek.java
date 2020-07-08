package com.practice.AppMaven3;

import org.springframework.stereotype.Component;

@Component
public class MediaTek implements MobileProcesser {

	public void process() {

		System.out.println("MediaTek Processer...");
	}

}
