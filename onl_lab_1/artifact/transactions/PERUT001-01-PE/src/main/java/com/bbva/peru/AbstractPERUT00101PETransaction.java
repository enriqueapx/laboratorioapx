package com.bbva.peru;

import com.bbva.elara.transaction.AbstractTransaction;
import com.bbva.peru.dto.lab.HelloWorld;
import com.bbva.peru.dto.lab.HelloWorldOut;

/**
 * In this class, the input and output data is defined automatically through the setters and getters.
 */
public abstract class AbstractPERUT00101PETransaction extends AbstractTransaction {

	public AbstractPERUT00101PETransaction(){
	}


	/**
	 * Return value for input parameter helloworld
	 */
	protected HelloWorld getHelloworld(){
		return (HelloWorld)this.getParameter("helloworld");
	}

	/**
	 * Set value for HelloWorldOut output parameter helloworldOut
	 */
	protected void setHelloworldout(final HelloWorldOut field){
		this.addParameter("helloworldOut", field);
	}
}
