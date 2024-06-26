/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apg.apgEngine.graphics.mesh;

import apg.apgEngine.utils.AutoIncrement;
import apg.apgEngine.geometry.tridimensional.Vector3;

/**
 *
 * @author derek maso
 */
public class Point{
    
    private int id;
    
    private Vector3 coordenate;
    
    public Point()
    {
        this.coordenate = new Vector3();
        this.id = AutoIncrement.getNextPointId();
    }
    
    public Point(float x, float y, float z)
    {
        this.coordenate = new Vector3(x,y,z);
        this.id = AutoIncrement.getNextPointId();
    }
    
    public Vector3 getCoordenate()
    {
        return this.coordenate;
    }
    
    public void setCoordenate(float x,float y, float z)
    {
        this.coordenate.setVector3(x, y, z);
    }
    
}
