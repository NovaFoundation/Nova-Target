package nova.target.nodewriters;

import net.fathomsoft.nova.tree.match.Match;

public abstract class MatchWriter extends ControlStatementWriter
{
	public abstract Match node();
	
	
}