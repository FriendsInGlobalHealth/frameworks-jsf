/*
 * MozView Technologies, Lda. 2010 - 2015
 */
package mz.co.mozview.frameworks.jsf.util;

import java.text.MessageFormat;
import java.util.ResourceBundle;

import javax.faces.context.FacesContext;

/**
 * @author Stélio Moiane
 *
 */
public class Labels {

	public static String getLabel(final String label) {
		final FacesContext context = FacesContext.getCurrentInstance();
		final ResourceBundle bundle = context.getApplication().getResourceBundle(context, "labels");

		return bundle.getString(label);
	}

	public static String getLabel(final String label, final Object... params) {
		return MessageFormat.format(getLabel(label), params);
	}
}
