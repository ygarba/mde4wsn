/*
 * This file is part of JGAP.
 *
 * JGAP offers a dual license model containing the LGPL as well as the MPL.
 *
 * For licensing information please see the file license.txt included with JGAP
 * or have a look at the top of class org.jgap.Chromosome which representatively
 * includes the JGAP license policy applicable for any file delivered with JGAP.
 */
package edu.yau.thesis.scratch;

import java.io.*;

import org.jgap.*;
import org.jgap.audit.*;
import org.jgap.data.*;
import org.jgap.impl.*;
import org.jgap.xml.*;
import org.w3c.dom.*;

import edu.yau.thesis.ga.OptFitnessFunction;


public class OptGATest {
  /** String containing the CVS revision. Read out via reflection!*/
  private final static String CVS_REVISION = "$Revision: 1.27 $";

  private static final int MAX_ALLOWED_EVOLUTIONS = 5;

  public static EvolutionMonitor m_monitor;

  /**
   * Executes the genetic algorithm to determine the minimum number of
   * coins necessary to make up the given target amount of change. The
   * solution will then be written to System.out.
   *
   * @param a_targetChangeAmount the target amount of change for which this
   * method is attempting to produce the minimum number of coins
   * @param a_doMonitor true: turn on monitoring for later evaluation of
   * evolution progress
   *
   * @throws Exception
   *
   * @author Neil Rotstan
   * @author Klaus Meffert
   * @since 1.0
   */
  public static void makeChangeForAmount(boolean a_doMonitor)
      throws Exception {
	  
	  int a_targetChangeAmount = 35;	//ToDo: remove
	  
    // Start with a DefaultConfiguration, which comes setup with the
    // most common settings.
    // -------------------------------------------------------------
    Configuration conf = new DefaultConfiguration();
    // Care that the fittest individual of the current population is
    // always taken to the next generation.
    // Consider: With that, the pop. size may exceed its original
    // size by one sometimes!
    // -------------------------------------------------------------
    conf.setPreservFittestIndividual(true);
    conf.setKeepPopulationSizeConstant(false);
    // Set the fitness function we want to use, which is our
    // MinimizingMakeChangeFitnessFunction. We construct it with
    // the target amount of change passed in to this method.
    // ---------------------------------------------------------
    //Yau: Now we get this from SimDialog class. Observer pattern issue again :D
    FitnessFunction fitFunc =
        new OptFitnessFunction();
    conf.setFitnessFunction(fitFunc);
    if (a_doMonitor) {
      // Turn on monitoring/auditing of evolution progress.
      // --------------------------------------------------
      m_monitor = new EvolutionMonitor();
      conf.setMonitor(m_monitor);
    }
    // Now we need to tell the Configuration object how we want our
    // Chromosomes to be setup. We do that by actually creating a
    // sample Chromosome and then setting it on the Configuration
    // object. As mentioned earlier, we want our Chromosomes to each
    // have four genes, one for each of the coin types. We want the
    // values (alleles) of those genes to be integers, which represent
    // how many coins of that type we have. We therefore use the
    // IntegerGene class to represent each of the genes. That class
    // also lets us specify a lower and upper bound, which we set
    // to sensible values for each coin type.
    // --------------------------------------------------------------
    Gene[] parameterGenes = new Gene[4];
    parameterGenes[0] = new IntegerGene(conf, 0, 1); // net
    parameterGenes[1] = new IntegerGene(conf, 0, 3); // mac
    parameterGenes[2] = new IntegerGene(conf, 0, 3); // rdc
    parameterGenes[3] = new IntegerGene(conf, 0, 1); // sleep
    IChromosome parameterChromosome = new Chromosome(conf, parameterGenes);
    conf.setSampleChromosome(parameterChromosome);
    
    //The more Chromosomes, the larger number of potential solutions (which is good for
    // finding the answer), but the longer it will take to evolve
    // the population (which could be seen as bad).
    // ------------------------------------------------------------
    conf.setPopulationSize(10);

    // Create random initial population of Chromosomes.
    // Here we try to read in a previous run via XMLManager.readFile(..)
    // for demonstration purpose only!
    // -----------------------------------------------------------------
    Genotype population;
    /*
    try {
      Document doc = XMLManager.readFile(new File("JGAPExample32.xml"));
      population = XMLManager.getGenotypeFromDocument(conf, doc);
    }
    catch (UnsupportedRepresentationException uex) {
      // JGAP codebase might have changed between two consecutive runs.
      // --------------------------------------------------------------
      population = Genotype.randomInitialGenotype(conf);
    }
    catch (FileNotFoundException fex) {
      population = Genotype.randomInitialGenotype(conf);
    }
    */
    // Now we initialize the population randomly, anyway (as an example only)!
    // If you want to load previous results from file, remove the next line!
    // -----------------------------------------------------------------------
    population = Genotype.randomInitialGenotype(conf);
    
    //Evolve population. Since we don't know what the best answer is going to be, we just evolve the max number of times.
    long startTime = System.currentTimeMillis();
    for (int i = 0; i < MAX_ALLOWED_EVOLUTIONS; i++) {
    	
      System.out.println("For this evolution .......................");
      
      //((OptFitnessFunction) fitFunc).setCurrentEvol(i);	//tell the fitness func the current evol. Needed for the plot. Coud we get it from chromosome?
      
      if (!uniqueChromosomes(population.getPopulation())) {
        throw new RuntimeException("Invalid state in generation "+i);
      }
      if(m_monitor != null) {
        population.evolve(m_monitor);
      }
      else {
        population.evolve();
      }
    }
    long endTime = System.currentTimeMillis();
    System.out.println("Total evolution time: " + ( endTime - startTime)
                       + " ms");
    
    // Save progress to file. A new run of this example will then be able to
    // resume where it stopped before! --> this is completely optional.
    // ---------------------------------------------------------------------

    // Represent Genotype as tree with elements Chromomes and Genes.
    // -------------------------------------------------------------
    /*
    DataTreeBuilder builder = DataTreeBuilder.getInstance();
    IDataCreators doc2 = builder.representGenotypeAsDocument(population);
    // create XML document from generated tree
    XMLDocumentBuilder docbuilder = new XMLDocumentBuilder();
    Document xmlDoc = (Document) docbuilder.buildDocument(doc2);
    XMLManager.writeFile(xmlDoc, new File("JGAPExample26.xml"));
    */
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
  }	//makeChangeForAmount ends

  /**
   * Main method. A single command-line argument is expected, which is the
   * amount of change to create (in other words, 75 would be equal to 75
   * cents).
   *
   * @param args amount of change in cents to create
   * @throws Exception
   *
   * @author Neil Rotstan
   * @author Klaus Meffert
   * @since 1.0
   */
  public static void main(String[] args)
      throws Exception {
    	 
	  boolean doMonitor = false;	
	  makeChangeForAmount(doMonitor);		//Yau: this is the GA
}
   

  /**
   * @param a_pop the population to verify
   * @return true if all chromosomes in the populationa are unique
   *
   * @author Klaus Meffert
   * @since 3.3.1
   */
  public static boolean uniqueChromosomes(Population a_pop) {
    // Check that all chromosomes are unique
    for(int i=0;i<a_pop.size()-1;i++) {
      IChromosome c = a_pop.getChromosome(i);
      for(int j=i+1;j<a_pop.size();j++) {
        IChromosome c2 =a_pop.getChromosome(j);
        if (c == c2) {
          return false;
        }
      }
    }
    return true;
  }
}
