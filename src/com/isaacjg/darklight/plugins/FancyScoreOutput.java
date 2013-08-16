package com.isaacjg.darklight.plugins;

import com.ijg.darklight.sdk.core.AccessHandler;
import com.ijg.darklight.sdk.core.Plugin;

public class FancyScoreOutput extends Plugin {

	public FancyScoreOutput(AccessHandler accessHandler) {
		super(accessHandler);
	}

	@Override
	protected void start() {
		accessHandler.setTemplateFile("score-template.html");
		accessHandler.setOutputFile("scorereport");
		accessHandler.setOutputFileExtension("html");
		accessHandler.setIssueDataOutputFormatterString("<li>[name] - [description]</li>");
	}
}
