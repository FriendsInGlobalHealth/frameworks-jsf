/**
 *
 */
package mz.co.mozview.frameworks.jsf.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

/**
 * @author Stélio Moiane
 *
 */
public class JasperPrimeUtil {

	private final static String SUFIX = ".pdf";

	public static StreamedContent getPdfStreamedContent(final String filePath) {
		InputStream inputStream = null;
		DefaultStreamedContent streamedContent = null;

		try {

			final File file = new File(filePath + SUFIX);
			inputStream = new FileInputStream(file);

			streamedContent = new DefaultStreamedContent(inputStream, "application/pdf", file.getName());

		} catch (final FileNotFoundException e) {
		}

		return streamedContent;
	}
}
