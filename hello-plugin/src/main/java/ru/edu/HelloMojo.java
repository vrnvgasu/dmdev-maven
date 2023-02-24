package ru.edu;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugin.logging.Log;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo(name = "hello")
public class HelloMojo extends AbstractMojo {

	// hello.message - в консоле через -D
	@Parameter(defaultValue = "Hello from plugin", property = "hello.message")
	private String message;

	@Override
	public void execute() throws MojoExecutionException, MojoFailureException {
		Log log = getLog();
		log.info(message);
	}

}
