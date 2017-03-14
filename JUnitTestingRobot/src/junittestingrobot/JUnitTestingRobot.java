/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junittestingrobot;

/**
 *
 * @author jeppjleemoritzled
 */
public class JUnitTestingRobot
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Robot r = new Robot("Daniel", 100, 100, 0, Robot.VoiceType.FEMALE);
        Robot r2d2 = new Robot("R2d2", 50, 50, 1, Robot.VoiceType.MALE);
    }
    
}
