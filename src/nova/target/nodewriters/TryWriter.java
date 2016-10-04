package nova.target.nodewriters;

import net.fathomsoft.nova.tree.exceptionhandling.Try;

public abstract class TryWriter extends ExceptionHandlerWriter
{
	public abstract Try node();
	
	
}