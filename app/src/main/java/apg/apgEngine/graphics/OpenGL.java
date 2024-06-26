/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apg.apgEngine.graphics;

import apg.apgEngine.Objects;
import apg.apgEngine.gameobject.camera.Camera;
import static apg.apgEngine.geometry.tridimensional.Vector3.subVector3;
import static apg.apgEngine.geometry.tridimensional.Vector3.sumVector3;
import apg.apgEngine.graphics.mesh.Line;
import apg.apgEngine.graphics.mesh.Mesh;
import apg.apgEngine.graphics.mesh.Point;
import apg.apgEngine.graphics.mesh.Triangle;
import apg.apgEngine.scene.Scene;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWVidMode;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Victor J.B
 */
public class OpenGL {
    
    private static ArrayList<Mesh> allObjects = new ArrayList<>();
    
    private static ArrayList<Line> lines = new ArrayList<>();

    private static Camera mainCamera;
    
    public static void render()
    {/*
        for(Line li : lines)
        {
            li.Draw(); 
        }
        
        for(Mesh obj : allObjects)
        {
            for (Triangle tri : obj.getTriangles())
            {
                if(sumVector(mainCamera.getViewDirection()) -  sumVector(tri.getNormal()) >= 0)
                {
                    tri.setRendable(true);
                    tri.Draw();
                }
            }
        }*/
    }
    
    public static void setCamera(Camera aThis)
    {
        mainCamera = aThis;
    }
    
    public static void addMesh(Mesh m)
    {
        allObjects.add(m);
    }
    
    public static void addLine(Line n)
    {
        lines.add(n);
    }
}
