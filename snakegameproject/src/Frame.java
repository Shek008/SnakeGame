import javax.swing.JFrame;
public class Frame extends JFrame {
    Frame(){
        //sets the title of the frame
        this.setTitle("snake");
        //adding the panel to the frame
        this.add(new Panel());
        //this property is false by default
        this.setVisible(true);
        //this property is true by default
        this.setResizable(false);
        this.pack();
    }
}
