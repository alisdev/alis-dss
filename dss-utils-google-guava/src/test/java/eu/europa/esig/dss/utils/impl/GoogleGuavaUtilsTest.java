package eu.europa.esig.dss.utils.impl;

import eu.europa.esig.dss.utils.IUtils;

public class GoogleGuavaUtilsTest extends AbstractUtilsTest {

	@Override
	public IUtils getImpl() {
		return UtilsBinder.getSingleton().getUtilsFactory().getUtils();
	}

}
