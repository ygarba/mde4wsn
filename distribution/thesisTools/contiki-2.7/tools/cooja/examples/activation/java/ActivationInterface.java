/*
 * Copyright (c) 2008, Swedish Institute of Computer Science.
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 * 3. Neither the name of the Institute nor the names of its contributors
 *    may be used to endorse or promote products derived from this software
 *    without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE INSTITUTE AND CONTRIBUTORS ``AS IS'' AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED.  IN NO EVENT SHALL THE INSTITUTE OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS
 * OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
 * LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY
 * OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 * SUCH DAMAGE.
 *
 */

import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import org.apache.log4j.Logger;
import org.jdom.Element;

import se.sics.cooja.*;
import se.sics.cooja.contikimote.ContikiMoteInterface;
import se.sics.cooja.interfaces.PolledAfterAllTicks;
import se.sics.cooja.interfaces.PolledBeforeAllTicks;

/**
 * An example of how to implement new mote interfaces.
 *
 * Contiki variables:
 * <ul>
 * <li>char simDummyVar
 * </ul>
 * <p>
 *
 * Core interface:
 * <ul>
 * <li>dummy_interface
 * </ul>
 * <p>
 *
 * This observable never changes.
 *
 * @author Fredrik Osterlind
 */
@ClassDescription("Tasks Activation")
public class ActivationInterface extends MoteInterface implements ContikiMoteInterface, PolledBeforeAllTicks, PolledAfterAllTicks {
  private static Logger logger = Logger.getLogger(ActivationInterface.class);

  private Mote mote;
  private SectionMoteMemory memory;
 
  public ActivationInterface(Mote mote) {   //constructor
    this.mote = mote;
    memory = (SectionMoteMemory) mote.getMemory();
  }

  public static String[] getCoreInterfaceDependencies() {   //get the C interface
    return new String[] { "activation_interface" };
  }
  
  public void doActionsBeforeTick() {
    //logger.debug("Java-part of activation interface acts BEFORE mote tick: " + memory.getByteValueOf("simDummyVar"));
  }

  public void doActionsAfterTick() {
    //logger.debug("Java-part of activation interface acts AFTER mote tick: " + memory.getByteValueOf("simDummyVar"));
  }

  public JPanel getInterfaceVisualizer() {
    JPanel panel = new JPanel();
 
    final JCheckBox sensorCheck = new JCheckBox("Sensor");
    final JCheckBox actuatorCheck = new JCheckBox("Actuator");
    final JCheckBox dongleCheck = new JCheckBox("Dongle");

    panel.add(sensorCheck);
    panel.add(actuatorCheck);
    panel.add(dongleCheck);
    
    if (memory.getByteValueOf("simSensorAvailable") == 0) {
      sensorCheck.setSelected(false);
    } else {
      sensorCheck.setSelected(true);
    }
    
    if (memory.getByteValueOf("simActuatorAvailable") == 0) {
      actuatorCheck.setSelected(false);
    } else {
      actuatorCheck.setSelected(true);
    }
    
    if (memory.getByteValueOf("simDongleAvailable") == 0) {
      dongleCheck.setSelected(false);
    } else {
      dongleCheck.setSelected(true);
    }
      
    
    sensorCheck.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JCheckBox chk = (JCheckBox)e.getSource();
        if (chk.isSelected()) {
          memory.setByteValueOf("simSensorAvailable", (byte)1);
        } else {
          memory.setByteValueOf("simSensorAvailable", (byte)0);
        }
      }
    });
    
    actuatorCheck.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JCheckBox chk = (JCheckBox)e.getSource();
        if (chk.isSelected()) {
          memory.setByteValueOf("simActuatorAvailable", (byte)1);
        } else {
          memory.setByteValueOf("simActuatorAvailable", (byte)0);
        }
      }
    });
    
    dongleCheck.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JCheckBox chk = (JCheckBox)e.getSource();
        if (chk.isSelected()) {
          memory.setByteValueOf("simDongleAvailable", (byte)1);
        } else {
          memory.setByteValueOf("simDongleAvailable", (byte)0);
        }
      }
    });
   
    return panel;
  }
  
  public void clickButton() {
  }

  public void releaseInterfaceVisualizer(JPanel panel) {
  }

  public Collection<Element> getConfigXML() {
    return null;
  }

  public void setConfigXML(Collection<Element> configXML, boolean visAvailable) {
  }

}
