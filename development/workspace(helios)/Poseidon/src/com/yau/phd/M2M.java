/**
 * Author: Yau (May2015)
 * Brief:
 * This class implements the composition parts of the model weaving
 * The PIM, all the activities of the PIM and the aspects in platform
 * model are passed to, then it runs the composition algorithm (see
 * PhD thesis for details)
 */
package com.yau.phd;

import java.util.List;
import com.gentleware.poseidon.dsl.PoseidonCoreRootElement;
import com.gentleware.poseidon.dsl.wsn.*;
//import com.gentleware.poseidon.dsl.wsn.*;


public class M2M {
	
	public PoseidonCoreRootElement Composition(PoseidonCoreRootElement m, List<Activity> activities, List<Aspect> aspects) 
	{
		Activity activity = null;
		Aspect aspect = null;
		Pointcut pointcut = null;
		Advice advice = null;
		
		
		for (int i = 0; i < activities.size(); i++) {
			activity = activities.get(i);
			
			for (int j = 0; j < aspects.size(); j++) {
				aspect = aspects.get(j);
				
				//Here it's like typeSelect. We're getting the pointcut so that the expression can be extracted.
				for (int k = 0; k < aspect.eContents().size(); k++){
					if (aspect.eContents().get(k) instanceof Pointcut) {
						pointcut = (Pointcut) aspect.eContents().get(k);
						break;
					}
				} 
				
				//Here it's like typeSelect also. We're getting the advice
				for (int l = 0; l < aspect.eContents().size(); l++){
					if (aspect.eContents().get(l) instanceof Advice) {
						advice = (Advice) aspect.eContents().get(l);
						break;
					}
				}
				
				//Here we match jointpoint (activity.id) to pointcut (pointcut.expression)
				//Note also that advice.id is derived from pointcut.expression
				//During code generation, if jointpoint is true, then the id is used
				//to get the appropriate advice to replace the PIM activity
				//see comments below also.
				if (pointcut != null && (pointcut.getExpression().equals(activity.getId()))){
					//System.out.println("Jointpoint-Pointcut Match! " + activity.eClass().getName() + " & " + pointcut.eClass().getName());
					
					// Here we set the id of the advice to that of the pointcut
					// The advice is added to the PIM, hence in the PSM, during
					// code generation, the advice with the same id is used if
					// the activity is jointpoint.
					advice.setId(pointcut.getExpression());	
					m.get__ownedMember().add(advice);												
				}
			}
		}
		
		return m;
	}
}
