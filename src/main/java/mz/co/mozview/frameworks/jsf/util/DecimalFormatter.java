/*
 * MozView Technologies, Lda. 2010 - 2016
 */
package mz.co.mozview.frameworks.jsf.util;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * @author Stélio Moiane
 *
 */
public class DecimalFormatter {

	public static String format(final BigDecimal value) {

		final String pattern = "#,##0.00#";

		final DecimalFormat decimalFormat = new DecimalFormat(pattern);

		return decimalFormat.format(value);
	}
}
