package edu.yau.thesis.scratch;

import edu.yau.thesis.CoojaSimulationInitiator;
import edu.yau.thesis.ga.OptFitnessFunction;
import edu.yau.thesis.ga.WriteConf2File;

import org.jgap.*;
import org.jgap.impl.DefaultConfiguration;
import org.jgap.impl.IntegerGene;

public class ReadSimTrace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OptFitnessFunction obj = new OptFitnessFunction();
		try {
			OptFitnessFunction.ReadSimulationTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
