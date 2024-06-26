/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apg.apgEngine.scene;

import apg.apgEngine.gameobject.GameObject;
import apg.apgEngine.gameobject.camera.Camera;
import java.util.ArrayList;
import lombok.Getter;

/**
 *
 * @author Victor J.B
 */
@Getter
public class Scene {
    
     private static ArrayList<GameObject> sceneObjects = new ArrayList<>();
     
     private static ArrayList<Camera> sceneCameras = new ArrayList<>();
             
}
