package com.graphsfm.stservice.guice;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;

public class STGuiceServletContextListener extends GuiceServletContextListener {
	@Override
	protected Injector getInjector() {
		return Guice.createInjector(
				new STServletModule(), // configures servlets and filters.
				new MainModule()); // configures business logic services.
	}
}
