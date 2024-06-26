/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apg.apgEngine.graphics.mesh;

import apg.apgEngine.graphics.OpenGL;
import java.util.ArrayList;

/**
 *
 * @author Victor J.B
 */
public class Mesh{
    
    private int id;
    
    private String name;
    
    private ArrayList<Triangle> triangles;
    
    private ArrayList<Line> lines;
    
    public void addTriangle(Triangle t)
    {
        triangles.add(t);
    }
    
    public ArrayList<Triangle> getTriangles()
    {
        return triangles;
    }
    
    
    public Mesh()
    {
        name = "Empity Mesh";
        triangles = new ArrayList<Triangle>();
        lines = new ArrayList<Line>();
    }
}
