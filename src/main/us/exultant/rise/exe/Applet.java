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
		
		Grider $grider = new Grider(400,300);
		$beard.eval("$('#main').append("+$grider.jotElementGenerator(new StringBuilder())+");");
	}
	private Beard $beard;
}
