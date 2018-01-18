package com.hello.Hello.controller;

import java.io.FileOutputStream;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.docraptor.ApiClient;
import com.docraptor.Doc;
import com.docraptor.DocApi;
@RestController
public class PDFCreaterController {
	
	@RequestMapping("/pdf")
	public String pdf() throws Exception {
		DocApi docraptor = new DocApi();
		ApiClient client = docraptor.getApiClient();
		client.setUsername("YOUR_API_KEY_HERE"); // this key works for test
													// documents
		// client.setDebugging(true);

		try {
			Doc doc = new Doc();
			doc.setTest(true); // test documents are free but watermarked
			//doc.setDocumentContent("<html><body>Hello World</body></html>"); // supply
																				// content
																				// directly
			 doc.setDocumentUrl("https://docs.spring.io/spring-data/jpa/docs/1.5.0.RELEASE/reference/html/repositories.html#repositories.query-methods");
			// // or use a url
			doc.setDocumentType(Doc.DocumentTypeEnum.PDF); // PDF or XLS or XLSX
			doc.setName("docraptor-java.pdf"); // help you find a document later
			doc.setJavascript(true); // enable JavaScript processing
			// prince_options = new PrinceOptions();
			// doc.setPrinceOptions(prince_options);
			// prince_options.setMedia("screen"); // use screen styles instead
			// of print styles
			// prince_options.setBaseurl("http://hello.com") // pretend URL when
			// using document_content

			byte[] create_response = docraptor.createDoc(doc);
			FileOutputStream file = new FileOutputStream("d:/docraptor-java.pdf");
			file.write(create_response);
			file.close();
			return "d:/docraptor-java.pdf";
		} catch (com.docraptor.ApiException error) {
			System.err.println(error);
			System.err.println(error.getCode());
			System.err.println(error.getMessage());
			System.err.println(error.getResponseBody());
			return "error";

		}
	}
}
