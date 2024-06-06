package com.bbva.peru;

import com.bbva.peru.lib.r001.PERUR001;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * trx lab
 *
 */
public class PERUT00101PETransaction extends AbstractPERUT00101PETransaction {

	private static final Logger LOGGER = LoggerFactory.getLogger(PERUT00101PETransaction.class);

	/**
	 * The execute method...
	 */
	@Override
	public void execute() {
		PERUR001 peruR001 = this.getServiceLibrary(PERUR001.class);
		HelloWorld hw = super.getHelloworld();
		HelloWorldOut hwo = peruR001.execute(hw);
		super.setHelloworldout(hwo);
	}

}
