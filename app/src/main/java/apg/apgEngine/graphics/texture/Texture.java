/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apg.apgEngine.graphics.texture;

import apg.apgEngine.utils.AutoIncrement;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import static org.lwjgl.opengl.GL11.GL_LINEAR;
import static org.lwjgl.opengl.GL11.GL_REPEAT;
import static org.lwjgl.opengl.GL11.GL_TEXTURE_2D;
import static org.lwjgl.opengl.GL11.GL_TEXTURE_MAG_FILTER;
import static org.lwjgl.opengl.GL11.GL_TEXTURE_MIN_FILTER;
import static org.lwjgl.opengl.GL11.glGenTextures;
import static org.lwjgl.opengl.GL11.glTexParameteri;
import static org.lwjgl.opengl.GL11.glBindTexture;
import static org.lwjgl.opengl.GL11.GL_TEXTURE_WRAP_S;
import static org.lwjgl.opengl.GL11.GL_TEXTURE_WRAP_T;
import static org.lwjgl.opengl.GL11.glDeleteTextures;
import lombok.Getter;
import lombok.Setter;
import static org.lwjgl.opengl.GL11.GL_RGBA;
import static org.lwjgl.opengl.GL11.GL_RGBA8;
import static org.lwjgl.opengl.GL11.GL_UNSIGNED_BYTE;
import static org.lwjgl.opengl.GL11.glTexImage2D;
import static org.lwjgl.stb.STBImage.stbi_failure_reason;
import static org.lwjgl.stb.STBImage.stbi_load;
import static org.lwjgl.stb.STBImage.stbi_set_flip_vertically_on_load;
import org.lwjgl.system.MemoryStack;

/**
 *
 * @author Victor J.B
 * 
 *         // wraps
//        GL_REPEAT simply repeats the texture
//        GL_MIRRORED_REPEAT will repeat the texture too, but it gets mirrored with odd coordinates
//        GL_CLAMP_TO_EDGE clamps the coordinates between 0.0 and 1.0
//        GL_CLAMP_TO_BORDER will give the coordinates outside of 0.0 and 1.0 a specified border color
        
//        Filtering
//        The next parameter you should set is the texture filtering. This is used if your texture is scaled to a size different to the original image size. For simple texture there are two values.
//
//        GL_NEAREST selects the value that is next to the selected texture coordinate
//        GL_LINEAR calculates weighted average on the four surrounding neighbors
//        GL_NEAREST_MIPMAP_NEAREST takes the closest mipmap that matches the size of the pixel and samples with nearest neighbor interpolation
//        GL_LINEAR_MIPMAP_NEAREST samples the closest mipmaps with bilinear interpolation
//        GL_NEAREST_MIPMAP_LINEAR take the two closest mipmaps that matches the size of the pixel and samples with nearest neighbor interpolation
//        GL_LINEAR_MIPMAP_LINEAR samples the closest mipmaps with trilinear interpolation
 * 
 */
@Getter
public class Texture {
    
    private final int id;
    
    private int width;
    
    private int height;
    
    @Setter
    private wrapMode selectWrapMode;
    
    @Setter
    private filteringMode selectFilteringMode;
    
    @Setter
    private boolean isMipMapMode;
    
    @Setter
    private mipMapMode selectMipMapMode;
    
    private enum wrapMode {Repeat,MirrorRepeat,clampEdges,clampBorder}
    
    private enum filteringMode {Nearest,Linear,mipMap}
    
    private enum mipMapMode {NearestLinear,NearestNearest,LinearNearest,LinearLinear}

    
    public Texture()
    {

        id = glGenTextures();

    }
    
    public void setParamiter(int name, int value)
    {
        glTexParameteri(GL_TEXTURE_2D, name, value);
    }
    
    
    public void bind()
    {
        glBindTexture(GL_TEXTURE_2D,id);
    }
    
    public void delete()
    {
        glDeleteTextures(id);
    }
    
    public void setWidth(int width)
    {
        if(width > 0)
        {
            this.width = width;
        }
    }
    public void setHeight(int height)
    {
        if(height > 0)
        {
            this.height = height;
        }
    }
    
    
    
    public static Texture createTexture(int width, int height, ByteBuffer data)
    {
        Texture texture = new Texture();
        texture.setWidth(width);
        texture.setHeight(height);
        
        texture.bind();
        
        texture.setParamiter(GL_TEXTURE_WRAP_S,GL_REPEAT);
        texture.setParamiter(GL_TEXTURE_WRAP_T,GL_REPEAT);
        texture.setParamiter(GL_TEXTURE_MIN_FILTER,GL_LINEAR);
        texture.setParamiter(GL_TEXTURE_MAG_FILTER,GL_LINEAR);

        return texture;
    }
    
    public static Texture loadTexture(String path)
    {
        ByteBuffer image;
        int width,height;
        try(MemoryStack stack = MemoryStack.stackPush())
        {
            IntBuffer w = stack.mallocInt(1);
            IntBuffer h = stack.mallocInt(1);
            IntBuffer comp = stack.mallocInt(1);
            
            stbi_set_flip_vertically_on_load(true);
            image = stbi_load(path, w, h, comp, 4);
            if(image == null)
            {
                throw new RuntimeException("Failed to load a texture file!"
                                            +System.lineSeparator() + stbi_failure_reason());
            }
            width = w.get();
            height = h.get();
        }
        return createTexture(width, height, image);
    }
    public void uploadData(int width, int height, ByteBuffer data)
    {
        uploadData(GL_RGBA8, width, height, GL_RGBA, data);
    }
    
    public void uploadData(int internalFormat, int width, int height, int format, ByteBuffer data)
    {
        glTexImage2D(GL_TEXTURE_2D, 0, internalFormat, width, height, 0, format, GL_UNSIGNED_BYTE, data);
    }
}
