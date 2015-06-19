package org.pasom.data.api;

import java.rmi.Remote;
import java.rmi.RemoteException;


/**
 * 各站原始数据解析入库
 * 
 * @author mengxn
 *
 */

public interface StationDataProcessorWapper extends Remote {
	/**
	 * 站点数据处理
	 * 
	 * 需要对处理状态进行管理
	 * 
	 * @see #isProcessing()
	 */
	public void process() throws RemoteException;

	/**
	 * 处理站点数据
	 */
	public void processData() throws RemoteException;

	/**
	 * 初始化站点数据
	 */
	public void initialize() throws RemoteException;

	/**
	 * 是否正在进行处理.
	 * 
	 * 其他线程可以调用此方法以获得处理状态.
	 */
	public boolean isProcessing() throws RemoteException;

	/**
	 * 获取站点类型
	 */
	public String getStationType() throws RemoteException;
}