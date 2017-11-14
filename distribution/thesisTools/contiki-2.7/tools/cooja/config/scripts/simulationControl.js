/*
 * Optimization control scripts.
 * This script is not meant to time out based on TIMEOUT().
 * Rather, when the message 'simulation ends' is sent by
 * the optimization sink, the simulation ends based on
 * log.testOK()
 */

TIMEOUT(20000000, log.log("last message: " + msg + "\n"));

while (true) {
  log.log(time + ":" + id + ":" + msg + "\n");
  if (msg.equals('simulation ends')) {
      log.testOK();
  }
  YIELD();
}