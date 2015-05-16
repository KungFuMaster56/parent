package org.pasom.data.api;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * 各站原始数据解析入库
 * 
 * @author mengxn
 *
 */

public interface StationDataProcessor extends Remote {

	void processData() throws RemoteException;
}