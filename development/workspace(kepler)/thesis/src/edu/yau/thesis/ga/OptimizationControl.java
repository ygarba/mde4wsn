package edu.yau.thesis.ga;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import org.jgap.*;
import org.jgap.audit.EvolutionMonitor;
import org.jgap.impl.*;

import edu.yau.thesis.IObservable;
import edu.yau.thesis.IObserver;

public class OptimizationControl extends Thread /*implements IObservable*/ {
	
	int populationSize, maxEvolutions;
	
	static String appPath; 
	static String m2tPath;
	
	FitnessFunction fitFunc;
	List<IObserver> observers = new ArrayList<IObserver>();		//observer pattern here
	
	
	public OptimizationControl(FitnessFunction _fitFunc, int _populationSize, int _maxEvolutions) {
		fitFunc = _fitFunc;
		populationSize = _populationSize;
		maxEvolutions = _maxEvolutions;			
	}
	
	
	public void run(){
		
		try {
			GAProcess();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}				
	}
	
	public void GAProcess()
		      throws Exception {
			  			  			  
		    // Start with a DefaultConfiguration, which comes setup with the
		    // most common settings.
		    // -------------------------------------------------------------
		    //Yau: Configuration conf = new DefaultConfiguration();
			Configuration conf = new ThesisConfiguration();			//now using non-default configurations
		    
		    // Care that the fittest individual of the current population is
		    // always taken to the next generation.
		    // Consider: With that, the pop. size may exceed its original
		    // size by one sometimes!
		    // -------------------------------------------------------------
		    conf.setPreservFittestIndividual(true);
		    conf.setKeepPopulationSizeConstant(true);	//was false
		    
		    // Our fitness function.
		    // ---------------------------------------------------------
		    //Yau: Now we get this from SimDialog class. Observer pattern issue again :D
		    //FitnessFunction fitFunc =
		    //    new OptFitnessFunction();
		    conf.setFitnessFunction(fitFunc);
		    
		    // Now we need to tell the Configuration object how we want our
		    // Chromosomes to be setup. We do that by actually creating a
		    // sample Chromosome and then setting it on the Configuration
		    // object. As mentioned earlier, we want our Chromosomes to each
		    // have four genes, one for each of the parameter types. We want the
		    // values (alleles) of those genes to be integers, which represent
		    // the parameter type (value). We therefore use the
		    // IntegerGene class to represent each of the genes. That class
		    // also lets us specify a lower and upper bound, which we set
		    // for the number n, of the type the parameter has (0, n).
		    // --------------------------------------------------------------
		    //Gene[] parameterGenes = new Gene[4];	
		    Gene[] parameterGenes = new Gene[5];										//modification 2017
		    parameterGenes[0] = new IntegerGene(conf, 0, 1); // net	//now just rime
		    parameterGenes[1] = new IntegerGene(conf, 0, 3); // mac
		    parameterGenes[2] = new IntegerGene(conf, 0, 8); // rdc
		    parameterGenes[3] = new IntegerGene(conf, 0, 1); // sleep
		    parameterGenes[4] = new IntegerGene(conf, 0, 3); // voltage scaling (1.8, 2.4, 3.0, 3.6)		//modification 2017
		    //parameterGenes[5] = new IntegerGene(conf, 0, 4); // frequency scaling			//modification 2017
		    
		    IChromosome parameterChromosome = new Chromosome(conf, parameterGenes);
		    conf.setSampleChromosome(parameterChromosome);
		    
		    //The more Chromosomes, the larger number of potential solutions (which is good for
		    // finding the answer), but the longer it will take to evolve
		    // the population (which could be seen as bad).
		    // -----------------------------------------------------------------
		    //conf.setPopulationSize(POPULATION_SIZE);
		    conf.setPopulationSize(populationSize);

		    // Create random initial population of Chromosomes.		    
		    // -----------------------------------------------------------------
		    Genotype population;
		    
		    // Now we initialize the population randomly
		    // -----------------------------------------------------------------
		    population = Genotype.randomInitialGenotype(conf);
		    
		    //Now to the main stuff...
		    // -----------------------------------------------------------------
		    System.out.println("GA Optimization starts with population size = " + populationSize +
		    		" and maximum generations = " + maxEvolutions + "  .....");
		    
		    //Evolve population. Since we don't know what the best answer is going to be, we just evolve the max number of times.
		    long startTime = System.currentTimeMillis();
		    //for (int i = 0; i < MAX_ALLOWED_EVOLUTIONS; i++) {
		    for (int i = 0; i < maxEvolutions; i++) {	
		    	
		      System.out.println("For this evolution .......................");
		      
//		      ((OptFitnessFunction) fitFunc).setCurrentEvol(i);	//tell the fitness func the current evol. Needed for the plot. Could we get it from chromosome?
		      
		      /*
		      if (!uniqueChromosomes(population.getPopulation())) {
		        throw new RuntimeException("Invalid state in generation "+i);
		      }
		      */
		      
		      population.evolve();	//here the fitness of the entire population is calculated
		      
		      //update observers here
		      //notifyObservers((double)i, population.getFittestChromosome().getFitnessValueDirectly()); //ToDo: very fitness
		      		      
		    }
		    long endTime = System.currentTimeMillis();
		    System.out.println("Total evolution time: " + ( endTime - startTime)
		                       + " ms");
		    
		    System.out.println("GA Optimization successful.....");
		    		  		    
		    /*
		    // Display the best solution we found.
		    // -----------------------------------
		    IChromosome bestSolutionSoFar = population.getFittestChromosome();
		    double v1 = bestSolutionSoFar.getFitnessValue();
		    
		    /*
		    System.out.println("The best solution has a fitness value of " +
		                       bestSolutionSoFar.getFitnessValue());
		    bestSolutionSoFar.setFitnessValueDirectly(-1);
		    System.out.println("It contains the following: ");
		    System.out.println("\t" +
		                       OptFitnessFunction.
		                       getNumberOfCoinsAtGene(
		        bestSolutionSoFar, 0) + " quarters.");
		    System.out.println("\t" +
		                       OptFitnessFunction.
		                       getNumberOfCoinsAtGene(
		        bestSolutionSoFar, 1) + " dimes.");
		    System.out.println("\t" +
		                       OptFitnessFunction.
		                       getNumberOfCoinsAtGene(
		        bestSolutionSoFar, 2) + " nickels.");
		    System.out.println("\t" +
		                       OptFitnessFunction.
		                       getNumberOfCoinsAtGene(
		        bestSolutionSoFar, 3) + " pennies.");
		    System.out.println("For a total of " +
		                       OptFitnessFunction.amountOfChange(
		        bestSolutionSoFar) + " cents in " +
		                       OptFitnessFunction.
		                       getTotalNumberOfCoins(
		        bestSolutionSoFar) + " coins.");
		     */
		  }	//GAProcess() ends
	
/*
public void registerObserver(IObserver observer)
{
	observers.add(observer);
}
	
  public void removeObserver(IObserver observer)
  {
  	//observers.re
  }
  
  public void notifyObservers(double x, double y)
  {
  	for (IObserver o : observers)
  	{
  		o.update(x,y);
  	}
  }
  
  public void notifyObservers(double x, double y, double z){}	//just for compliance. Only needed for power chart (power and lpm)
*/
}

