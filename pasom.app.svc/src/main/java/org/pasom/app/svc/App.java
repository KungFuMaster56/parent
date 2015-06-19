package org.pasom.app.svc;

import java.rmi.RemoteException;

import javax.annotation.Resource;

import org.pasom.data.api.StationDataProcessorWapper;
import org.springframework.stereotype.Service;

/**
 * Hello world!
 *
 */
@Service
public class App {
	@Resource
	private StationDataProcessorWapper dataProcessor;

	public void test() throws RemoteException {
		dataProcessor.processData();
	}

}
