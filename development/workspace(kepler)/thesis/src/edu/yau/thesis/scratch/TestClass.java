package edu.yau.thesis.scratch;

import edu.yau.thesis.CoojaSimulationInitiator;
import edu.yau.thesis.ga.OptFitnessFunction;
import edu.yau.thesis.ga.WriteConf2File;

import org.jgap.*;
import org.jgap.impl.DefaultConfiguration;
import org.jgap.impl.IntegerGene;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		IChromosome parameterChromosome = null;
		try {
			Configuration conf = new DefaultConfiguration();
			Gene[] parameterGenes = new Gene[4];
		    parameterGenes[0] = new IntegerGene(conf, 0, 1); // net
		    parameterGenes[1] = new IntegerGene(conf, 0, 3); // mac
		    parameterGenes[2] = new IntegerGene(conf, 0, 3); // rdc
		    parameterGenes[3] = new IntegerGene(conf, 0, 1); // sleep
		    parameterChromosome = new Chromosome(conf, parameterGenes);
		    conf.setSampleChromosome(parameterChromosome);
		} catch (InvalidConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		*/
		
		//parameterChromosome.getGene(0).setAllele(1);
		//WriteConf2File.Write2File(parameterChromosome);
		
		
		//call simulation
		System.out.println("Running cooja simulator. Please wait .....");
		CoojaSimulationInitiator simInitiator = new CoojaSimulationInitiator();
		simInitiator.DoSimulation();
		System.out.println("Simulation done .....");
		
		System.out.println("-----------------------------------------------------");
		try {
			OptFitnessFunction.ReadSimulationTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("-----------------------------------------------------");
	}

}
