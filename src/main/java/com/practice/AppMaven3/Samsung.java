package com.practice.AppMaven3; 		

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Samsung {

	@Autowired
	@Qualifier("mediaTek")
	MobileProcesser cpu;
	
	public MobileProcesser getCpu() {
		return cpu;
	}

	public void setCpu(MobileProcesser cpu) {
		this.cpu = cpu;
	}

	public void config() {
		System.out.println("octa core, 4 gb Ram, 12 MP camera");
		cpu.process();
	}
}
