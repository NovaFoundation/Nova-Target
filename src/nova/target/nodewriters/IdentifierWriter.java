package nova.target.nodewriters;

import net.fathomsoft.nova.tree.*;

public abstract class IdentifierWriter extends ValueWriter implements AccessibleWriter
{
	public abstract Identifier node();
	
	
}