package org.yx.rpc.server.start;

import org.yx.bean.AbstractBeanListener;
import org.yx.bean.BeanEvent;
import org.yx.log.Log;

public class SOABeanListener extends AbstractBeanListener {

	public SOABeanListener(String packs) {
		super(packs);
	}

	private SoaFactory factory = new SoaFactory();

	@Override
	public void listen(BeanEvent event) {
		try {
			factory.resolve(Class.forName(event.getClassName()));
		} catch (Exception e) {
			Log.printStack(e);
		}
	}

}
