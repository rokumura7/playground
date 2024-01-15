package command;

import command.command.Command;
import command.command.MacroCommand;
import command.drawer.DrawCanvas;
import command.drawer.DrawCommand;

import javax.swing.*;
import java.awt.event.*;

public class App extends JFrame implements ActionListener, MouseMotionListener, WindowListener {
  private MacroCommand history = new MacroCommand();
  private DrawCanvas canvas = new DrawCanvas(400, 400, history);
  private JButton clearButton = new JButton("clear");

  public App(String title) {
    super(title);
    this.addWindowListener(this);
    canvas.addMouseMotionListener(this);
    clearButton.addActionListener(this);

    Box buttonBox = new Box(BoxLayout.X_AXIS);
    buttonBox.add(clearButton);
    Box mainBox = new Box(BoxLayout.Y_AXIS);
    mainBox.add(buttonBox);
    mainBox.add(canvas);
    getContentPane().add(mainBox);

    pack();
    setVisible(true);
  }
  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == clearButton) {
      history.clear();
      canvas.repaint();
    }
  }

  @Override
  public void mouseDragged(MouseEvent e) {
    Command cmd = new DrawCommand(canvas, e.getPoint());
    history.append(cmd);
    cmd.execute();
  }

  @Override
  public void windowClosing(WindowEvent e) {
    System.exit(0);
  }

  public static void main(String[] args) {
    new App("Command Pattern Sample.");
  }

  @Override
  public void mouseMoved(MouseEvent e) {}
  @Override
  public void windowOpened(WindowEvent e) {}
  @Override
  public void windowClosed(WindowEvent e) {}
  @Override
  public void windowIconified(WindowEvent e) {}
  @Override
  public void windowDeiconified(WindowEvent e) {}
  @Override
  public void windowActivated(WindowEvent e) {}
  @Override
  public void windowDeactivated(WindowEvent e) {}
}
