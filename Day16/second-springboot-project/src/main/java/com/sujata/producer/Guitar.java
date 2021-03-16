package com.sujata.producer;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class Guitar implements Instrument {

	@Override
	public void play() {
		System.out.println("TIN TIN TIN!!");

	}

}
