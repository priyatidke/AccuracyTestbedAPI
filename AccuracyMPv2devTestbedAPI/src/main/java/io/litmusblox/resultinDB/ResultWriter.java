package io.litmusblox.resultinDB;

public interface ResultWriter {
	void storeResult(String id,String rolep1,String rolep2,String rolep3, int accuracy);
	//void storeResult(String rolep1,String rolep2,String rolep3, int accuracy);


}
