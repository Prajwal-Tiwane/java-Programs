import java.awt.*;
import java.awt.event.*;

class MarvellousFrame
{
    public Frame fobj;
    public MarvellousFrame(String title)
    {  
        fobj = new Frame(title);
        fobj.setSize(400,400);
        fobj.setVisible(true); 
        fobj.addWindowListener(new MarvellousListener());
    }
}
class MarvellousListener extends WindowAdaptor
{
    public void windowClosing(WindowEvent obj)
    {
        System.exit(0);
    }
}
class GUI4
{
    public static void main(String arg[])
    {
        MarvellousFrame mobj = new MarvellousFrame("PPA");
    }
}