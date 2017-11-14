package edu.yau.thesis;

public interface IObserver {
	public void updateFitness(double x, double y);
	public void updatePacketLoss(double x, double y);
	public void updatePower(double x, double y);
	public void updateMemory(double x, double y);
}
