/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apg.apgEngine.gameobject;

import apg.App;
import apg.apgEngine.Component;
import apg.apgEngine.GUI.GUI;
import apg.apgEngine.GUI.TextGui;
//import apg.apgEngine.MonoBehaviour;
import apg.apgEngine.gameobject.transform.Transform;
import java.util.ArrayList;
import apg.apgEngine.utils.AutoIncrement;
/**
 *
 * @author Victor J.B
 */
public class GameObject 
{
        
    private ArrayList<GameObject> children;
    
    private boolean isStatic;
    
    private int layer;
    
    private String tag;
    
    private String scene;
    
    private ArrayList<Component> components;
    
    private Transform transform;
       
    public void addComponent(Component obj)
    {
       components.add(obj);
    }

    public GameObject()
    {
        components = new ArrayList<>();
        transform = new Transform();
        tag = "none";
        layer = 0;
        isStatic = true;
        
    }
    
    public GameObject getGameObject()
    {
        return this;
    }
    
    public Component getComponent(String className) throws ClassNotFoundException
    {
        for(Component each : this.components)
        {
            if(each.getClass().getName().contains(className))
            {
                System.out.print("Found!!");
                return each;
            }
        }
        return null;
    }
}
