package edu.yau.thesis;

public interface IObservable {
	public void registerObserver(IObserver observer);
    public void removeObserver(IObserver observer);
    public void notifyFitness(double x, double y);
    public void notifyPacketLoss(double x, double y);
    public void notifyPower(double x, double y);
    public void notifyMemory(double x, double y);
}
