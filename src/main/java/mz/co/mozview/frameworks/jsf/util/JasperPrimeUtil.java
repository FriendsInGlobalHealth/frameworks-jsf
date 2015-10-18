/**
 *
 */
package mz.co.mozview.frameworks.jsf.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
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
		DefaultStreamedContent streamedContent = null;

		final File file = new File(filePath + SUFIX);

		try (InputStream inputStream = new FileInputStream(file);) {

			streamedContent = new DefaultStreamedContent(inputStream, "application/pdf", file.getName());

		} catch (IOException e) {
			e.printStackTrace();
		}

		return streamedContent;
	}
}
