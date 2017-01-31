// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package boxconnector.actions;

import static boxconnector.proxies.microflows.Microflows.getEmbedLinkImpl;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import com.mendix.systemwideinterfaces.core.IMendixObject;

/**
 * Used to retrieve an expiring URL for creating an embedded preview session. 
 * The URL will expire after 60 seconds and the preview session will expire after 60 minutes.
 */
public class GetEmbedLink extends CustomJavaAction<IMendixObject>
{
	private IMendixObject __BoxFileParameter1;
	private boxconnector.proxies.BoxFile BoxFileParameter1;

	public GetEmbedLink(IContext context, IMendixObject BoxFileParameter1)
	{
		super(context);
		this.__BoxFileParameter1 = BoxFileParameter1;
	}

	@Override
	public IMendixObject executeAction() throws Exception
	{
		this.BoxFileParameter1 = __BoxFileParameter1 == null ? null : boxconnector.proxies.BoxFile.initialize(getContext(), __BoxFileParameter1);

		// BEGIN USER CODE
		boxconnector.proxies.BoxFile boxFile = getEmbedLinkImpl(getContext(), BoxFileParameter1);
		
		if (boxFile != null)
			return boxFile.getMendixObject();
		else
			return null;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "GetEmbedLink";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}