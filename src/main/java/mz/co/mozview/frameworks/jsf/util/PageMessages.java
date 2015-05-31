/*
 * MozView Technologies, Lda. 2010 - 2015
 */
package mz.co.mozview.frameworks.jsf.util;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 * @author Stélio Moiane
 *
 */
public class PageMessages {

	public static void addErrorMessage(final String label) {

		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, label, ""));
	}

	public static void addInfoMessage(final String label) {

		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, label, ""));
	}
}
