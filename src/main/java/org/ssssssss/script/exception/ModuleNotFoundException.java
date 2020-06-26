package org.ssssssss.script.exception;

import org.ssssssss.script.parsing.Span;

public class ModuleNotFoundException extends ScriptException{

	public ModuleNotFoundException(String errorMessage, Span.Line line) {
		super(errorMessage, line);
	}
}