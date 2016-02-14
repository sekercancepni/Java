import javafx.scene.canvas.GraphicsContext;

public interface Drawable {
	// draw this through GraphicsContext object given as argument
	public abstract void draw(GraphicsContext gc);
}
