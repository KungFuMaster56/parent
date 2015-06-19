package org.pasom.data.svc;

import org.pasom.data.api.StationDataProcessorWapper;
import org.springframework.stereotype.Service;

import cc.htdf.data.Main;
import cc.htdf.data.business.StationDataProcessor;
import cc.htdf.data.business.StationDataProcessorFactory;
import cc.htdf.data.config.station.code.StationType;

/**
 * 各站原始数据解析入库
 * 
 * @author mengxn
 *
 */
@Service
public class StationDataProcessorImpl implements StationDataProcessorWapper {
	private StationDataProcessor sdp;

	public StationDataProcessorImpl() {
		super();
		this.sdp = StationDataProcessorFactory.getProcessor(
				StationType.CINRAD_STATION, Main.getLocation());
	}

	@Override
	public void processData() {
		sdp.processData();
		System.out.println("success!!!!");

	}

	@Override
	public void process() {
		sdp.process();
		System.out.println("success!!!!");

	}

	@Override
	public void initialize() {
		sdp.initialize();

	}

	@Override
	public boolean isProcessing() {
		return sdp.isProcessing();
	}

	@Override
	public String getStationType() {
		return sdp.getStationType();
	}

}
