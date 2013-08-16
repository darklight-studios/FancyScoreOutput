package com.isaacjg.darklight.plugins;

import com.ijg.darklight.sdk.core.Plugin;
import com.ijg.darklight.sdk.core.PluginHandler;

public class FancyScoreOutput extends Plugin {

	public FancyScoreOutput(PluginHandler pluginHandler) {
		super(pluginHandler);
	}
	
	@Override
	protected void start() {
		pluginHandler.accessHandler.setTemplateFile("score-template.html");
		pluginHandler.accessHandler.setOutputFile("scorereport");
		pluginHandler.accessHandler.setOutputFileExtension("html");
		pluginHandler.accessHandler.setIssueDataOutputFormatterString("<li>[name] - [description]</li>");
	}
}
