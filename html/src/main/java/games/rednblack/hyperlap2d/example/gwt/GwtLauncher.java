package games.rednblack.hyperlap2d.example.gwt;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;
import com.badlogic.gdx.graphics.g2d.freetype.gwt.FreetypeInjector;
import com.badlogic.gdx.graphics.g2d.freetype.gwt.inject.OnCompletion;

import games.rednblack.hyperlap2d.example.HyperLap2DExample;

/** Launches the GWT application. */
public class GwtLauncher extends GwtApplication {
		@Override
		public GwtApplicationConfiguration getConfig () {
			// Resizable application, uses available space in browser
			return new GwtApplicationConfiguration(true);
			// Fixed size application:
			//return new GwtApplicationConfiguration(480, 320);
		}

		@Override
		public ApplicationListener createApplicationListener () { 
			return new HyperLap2DExample();
		}

	@Override
	public void onModuleLoad() {
		FreetypeInjector.inject(new OnCompletion() {
			public void run () {
				// Replace HtmlLauncher with the class name
				// If your class is called FooBar.java than the line should be FooBar.super.onModuleLoad();
				GwtLauncher.super.onModuleLoad();
			}
		});
	}
}
