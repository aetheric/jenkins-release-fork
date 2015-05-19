package nz.co.aetheric.jenkins.releaseforker;

import hudson.Messages;
import hudson.model.Action;
import lombok.extern.slf4j.Slf4j;

/**
 * This acts as the trigger for forking a particular code line into a release.
 * <p>Author: <a href="http://gplus.to/tzrlk">Peter Cummuskey</a></p>
 */
@Slf4j
public class ReleaseForkAction implements Action {

	@Override
	public String getIconFileName() {
		return "gear2.gif";
	}

	@Override
	public String getDisplayName() {
		return Messages.ReleaseForkAction_DisplayName();
	}

	@Override
	public String getUrlName() {
		return "release-forker";
	}

}
