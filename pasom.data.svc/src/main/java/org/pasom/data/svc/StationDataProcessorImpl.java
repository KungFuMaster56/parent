package org.pasom.data.svc;

import java.rmi.RemoteException;

import org.pasom.data.api.StationDataProcessor;
import org.springframework.stereotype.Service;

/**
 * 各站原始数据解析入库
 * 
 * @author mengxn
 *
 */
@Service
public class StationDataProcessorImpl implements StationDataProcessor {

	@Override
	public void processData() throws RemoteException {
		System.out.println("success!!!!");

	}

}
