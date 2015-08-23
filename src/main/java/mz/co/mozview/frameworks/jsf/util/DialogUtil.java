/*
 * MozView Technologies, Lda. 2010 - 2015
 */
package mz.co.mozview.frameworks.jsf.util;

import java.util.HashMap;
import java.util.Map;

import org.primefaces.context.RequestContext;

/**
 * Utilitário para Abertura de dialogos no primefaces
 *
 * @author Stélio Moiane
 *
 */
public class DialogUtil {

	public static void reportDialog(final String pageName) {

		final Map<String, Object> options = new HashMap<>();
		options.put("modal", true);
		options.put("draggable", false);
		options.put("resizable", false);
		options.put("contentHeight", 540);
		options.put("contentWidth", 850);

		RequestContext.getCurrentInstance().openDialog(pageName, options, null);
	}
}
