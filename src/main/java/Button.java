public class Button {
    private int Height;
    private int Width;
    private String Colour;

    private String Text;


    public Button(int height, int width, String colour,String text) {
        Height = height;
        Width = width;
        Colour = colour;
        Text = text;
    }

    public int getHeight() {
        return Height;
    }

    public int getWidth() {
        return Width;
    }

    public String getColour() {
        return Colour;
    }

    public String getText() {
        return Text;
    }

    public void setHeight(int height) {
        Height = height;
    }

    public void setWidth(int width) {
        Width = width;
    }

    public void setColour(String colour) {
        Colour = colour;
    }

    public void setText(String text) {
        Text = text;
    }

}
