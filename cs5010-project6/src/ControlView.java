import java.awt.event.ActionEvent;
import java.io.IOException;

public class ControlView{
  private ModelInterface model;


  private IView view;


  /**
   * This represents a constructor for the controller.
   */
  public ControlView(ModelInterface model, IView view) {
    this.model = model;
    this.view = view;
  }
  public void go(ActionEvent e){
    switch (e.getActionCommand()) {
      case "readPPM":
        String text = view.getFileName();
        model.
    }
  }
}