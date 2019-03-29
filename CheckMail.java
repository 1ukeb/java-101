
/**
 * Write a description of class CheckMail here.
 * 
 * @author Luke Bradaric 
 * @version (a version number or a date)
 */
public class CheckMail
{
    private float weight;
    private float length;
    private float width;
    private float height;

    public CheckMail(float w, float len, float wid, float hei)
    {
        weight = w;
        length = len;
        width = wid;
        height = hei;
        Test();
    }
    
    private void Test()
    {
        float largest = 0;
        float dim2 = 0;
        float dim3 = 0;
        
        if (length > width)
        {
            if (length > height)
            {
                largest = length;
                dim2 = width;
                dim3 = height;
            }
            else if (length < height)
            {
                largest = height;
                dim2 = length;
                dim3 = width;
            }
        }
        else if (width > length)
        {
            if (width > height)
            {
                largest = width;
                dim2 = length;
                dim3 = height;
            }
            else if (width < height)
            {
                largest = height;
                dim2 = length;
                dim3 = width;
            }
        }
        
        
        if (largest + ((dim2 * 2) + (dim3 * 2)) > 100 && weight > 70)
        {
            System.out.println("Package is too large and too heavy.");
        }
        else if (weight > 70)
        {
            System.out.println("Package is too heavy.");
        }
        else if (largest + ((dim2 * 2) + (dim3 * 2)) > 100)
        {
            System.out.println("Package is too large.");
        }
        else
        {
            System.out.println("Package is acceptable.");
        }

        
        
        
    }

}
