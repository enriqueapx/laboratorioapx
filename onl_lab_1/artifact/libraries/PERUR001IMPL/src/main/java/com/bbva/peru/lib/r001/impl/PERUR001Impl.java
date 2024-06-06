package com.bbva.peru.lib.r001.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The PERUR001Impl class...
 */
public class PERUR001Impl extends PERUR001Abstract {

	private static final Logger LOGGER = LoggerFactory.getLogger(PERUR001Impl.class);

	/**
	 * The execute method...
	 */
	@Autowired
	private PerformHelloWorld performHelloWorld;
	@Override
	public HelloWorldOut execute(HelloWorld helloWorld) {
		return performHelloWorld.perform(helloWorld);

	}

	public void setPerformHelloWorld(PerformHelloWorld performHelloWorld) {
		this.performHelloWorld = performHelloWorld;
	}
}
