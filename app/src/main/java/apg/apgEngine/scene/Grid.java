/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apg.apgEngine.scene;

import org.lwjgl.opengl.GL11;
import static apg.apgEngine.math.Math.inverseInt;
/**
 *
 * @author Victor J.B
 */
public class Grid {
    
    private static int gridSize = 16;
        
    public static void drawGrid() {
        for (int each = inverseInt(gridSize); each <= gridSize; each++) {
            for (int eac = inverseInt(gridSize); eac <= gridSize; eac++) {
                for (int ea = inverseInt(gridSize); ea <= gridSize; ea++) {
                    //positives
                    GL11.glBegin(GL11.GL_LINES);
                    GL11.glColor3f(1, 0, 0);
                    GL11.glVertex3f(each, eac, ea);
                    GL11.glVertex3f(each, eac, ea + 1);
                    GL11.glColor3f(0, 1, 0);
                    GL11.glVertex3f(each, eac, ea);
                    GL11.glVertex3f(each, eac + 1, ea);
                    GL11.glColor3f(0, 0, 1);
                    GL11.glVertex3f(each, eac, ea);
                    GL11.glVertex3f(each + 1, eac, ea);
                    GL11.glEnd();
                }
            }
        }
    }
}
