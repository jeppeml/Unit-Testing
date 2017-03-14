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
public class Robot
{
    private String name;
    private int posX;
    private int posY;
    private int id;
    private VoiceType voiceType;
    
    public enum VoiceType {MALE, FEMALE}

    public Robot(String name, int posX, int posY, int id, VoiceType voiceType)
    {
        this.name = name;
        this.posX = posX;
        this.posY = posY;
        this.id = id;
        this.voiceType = voiceType;
    }
    
    public void move(int distX, int distY)
    {
        posX+=distX;
        posY+=distY;
    }
    
    public double getDistanceToPoint(int x, int y)
    {
        return Math.sqrt(Math.pow(x-posX, 2)+Math.pow(y-posY, 2));
    }
    
    public VoiceType getVoiceType()
    {
        return voiceType;
    }

    
    public void setVoiceType(VoiceType voiceType)
    {
        this.voiceType = voiceType;
    }
    
    

    /**
     * Get the value of id
     *
     * @return the value of id
     */
    public int getId()
    {
        return id;
    }

    /**
     * Set the value of id
     *
     * @param id new value of id
     */
    public void setId(int id)
    {
        this.id = id;
    }


    /**
     * Get the value of posY
     *
     * @return the value of posY
     */
    public int getPosY()
    {
        return posY;
    }

    /**
     * Set the value of posY
     *
     * @param posY new value of posY
     */
    public void setPosY(int posY)
    {
        this.posY = posY;
    }


    /**
     * Get the value of posX
     *
     * @return the value of posX
     */
    public int getPosX()
    {
        return posX;
    }

    /**
     * Set the value of posX
     *
     * @param posX new value of posX
     */
    public void setPosX(int posX)
    {
        this.posX = posX;
    }


    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name)
    {
        this.name = name;
    }

}
