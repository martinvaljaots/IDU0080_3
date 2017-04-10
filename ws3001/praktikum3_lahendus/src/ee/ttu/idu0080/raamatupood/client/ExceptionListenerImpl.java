package ee.ttu.idu0080.raamatupood.client;

import javax.jms.ExceptionListener;
import javax.jms.JMSException;

import org.apache.log4j.Logger;

/**
 * Käivitatakse, kui tuleb viga.
 */
public class ExceptionListenerImpl implements ExceptionListener {

	private static final Logger log = Logger.getLogger(Consumer.class);
	
	public synchronized void onException(JMSException ex) {
		log.error("JMS Exception occured. Shutting down client.");
		ex.printStackTrace();
	}

}
