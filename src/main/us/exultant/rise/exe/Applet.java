package us.exultant.rise.exe;

import java.awt.*;
import us.exultant.beard.*;
import us.exultant.rise.view.map.*;
import javax.swing.*;

public class Applet extends JApplet {
	public void init() {
		add(new JLabel("j!"), BorderLayout.CENTER);
		
		$beard = new Beard(this);
		$beard.normalizePage();
		
		$beard.eval("$('#main').html('ohai!');");
		
		Grider $grider = new Grider(800,600);
		$grider.jotElementGenerator($beard, "#main");
	}
	private Beard $beard;
}
