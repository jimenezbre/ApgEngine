/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apg.apgEngine.gameobject.primitive;

import apg.apgEngine.gameobject.GameObject;
import apg.apgEngine.graphics.mesh.Mesh;
import apg.apgEngine.graphics.mesh.Point;
import apg.apgEngine.graphics.mesh.Triangle;
import apg.apgEngine.geometry.tridimensional.Vector3;
import apg.apgEngine.graphics.OpenGL;

/**
 *
 * @author Victor J.B
 */
public class Cube{
    
    
    
    public Cube(){
        Mesh mesh = new Mesh();
        //front
        mesh.addTriangle(new Triangle(new Vector3(0f,0f,-1f),
                                      new Point(-0.5f,-0.5f,-0.5f), //inf esq
                                      new Point(0.5f,-0.5f,-0.5f), //inf dir
                                      new Point(-0.5f,0.5f,-0.5f))); // sup esq
        mesh.addTriangle(new Triangle(new Vector3(0f,0f,-1f),
                                      new Point(0.5f,-0.5f,-0.5f), // inf dir
                                      new Point(0.5f,0.5f,-0.5f), // sup dir
                                      new Point(-0.5f,0.5f,-0.5f))); // sup esq
        //back
        mesh.addTriangle(new Triangle(new Vector3(0f,0f,1f),
                                      new Point(-0.5f,-0.5f,0.5f), //inf esq
                                      new Point(0.5f,-0.5f,0.5f), //inf dir
                                      new Point(-0.5f,0.5f,0.5f))); // sup esq
        mesh.addTriangle(new Triangle(new Vector3(0f,0f,1f),
                                      new Point(0.5f,-0.5f,0.5f), // inf dir
                                      new Point(0.5f,0.5f,0.5f), // sup dir
                                      new Point(-0.5f,0.5f,0.5f))); // sup esq
        //right
        mesh.addTriangle(new Triangle(new Vector3(1f,0f,0f),
                                      new Point(0.5f,-0.5f,-0.5f), //inf esq
                                      new Point(0.5f,-0.5f,0.5f), //inf dir
                                      new Point(0.5f,0.5f,-0.5f))); // sup esq
        mesh.addTriangle(new Triangle(new Vector3(1f,0f,0f),
                                      new Point(0.5f,-0.5f,0.5f), // inf dir
                                      new Point(0.5f,0.5f,0.5f), // sup dir
                                      new Point(0.5f,0.5f,-0.5f))); // sup esq
        //left
        mesh.addTriangle(new Triangle(new Vector3(-1f,0f,0f),
                                      new Point(-0.5f,-0.5f,0.5f), //inf esq
                                      new Point(-0.5f,-0.5f,-0.5f), //inf dir
                                      new Point(-0.5f,0.5f,0.5f))); // sup esq
        mesh.addTriangle(new Triangle(new Vector3(-1f,0f,0f),
                                      new Point(-0.5f,-0.5f,-0.5f), // inf dir
                                      new Point(-0.5f,0.5f,-0.5f), // sup dir
                                      new Point(-0.5f,0.5f,0.5f))); // sup esq
        //up
        mesh.addTriangle(new Triangle(new Vector3(0f,1f,0f),
                                      new Point(-0.5f,0.5f,-0.5f), //inf esq
                                      new Point(0.5f,0.5f,-0.5f), //inf dir
                                      new Point(-0.5f,0.5f,0.5f))); // sup esq
        mesh.addTriangle(new Triangle(new Vector3(0f,1f,0f),
                                      new Point(0.5f,0.5f,-0.5f), // inf dir
                                      new Point(0.5f,0.5f,0.5f), // sup dir
                                      new Point(-0.5f,0.5f,0.5f))); // sup esq
        //down
        mesh.addTriangle(new Triangle(new Vector3(0f,-1f,0f),
                                      new Point(-0.5f,0.5f,-0.5f), //inf esq
                                      new Point(0.5f,0.5f,-0.5f), //inf dir
                                      new Point(-0.5f,0.5f,0.5f))); // sup esq
        mesh.addTriangle(new Triangle(new Vector3(0f,-1f,0f),
                                      new Point(0.5f,0.5f,-0.5f), // inf dir
                                      new Point(0.5f,0.5f,0.5f), // sup dir
                                      new Point(-0.5f,0.5f,0.5f))); // sup esq
        OpenGL.addMesh(mesh);
    }
}
