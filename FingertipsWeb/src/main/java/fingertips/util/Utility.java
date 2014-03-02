package fingertips.util;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;

import fingertips.dto.QuestionDTO;
import fingertips.exception.QuestionConversionException;
import fingertips.web.vo.Questions;

public class Utility {

	public static String convertTOXML(QuestionDTO question)
			throws QuestionConversionException {

		JAXBContext jaxbContext = null;
		try {
			jaxbContext = JAXBContext.newInstance(Questions.class);
		} catch (JAXBException e) {
			e.printStackTrace();
			throw new QuestionConversionException(
					"Question Cannot be parsed into XML. ");

		}
		Marshaller jaxbMarshaller = null;

		try {
			jaxbMarshaller = jaxbContext.createMarshaller();
		} catch (JAXBException e) {
			e.printStackTrace();
			throw new QuestionConversionException(
					"Question Cannot be parsed into XML. ");
		}

		try {
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		} catch (PropertyException e) {
			e.printStackTrace();
			throw new QuestionConversionException(
					"Question Cannot be parsed into XML. ");
		}

		StringWriter writer = new StringWriter();

		try {
			jaxbMarshaller.marshal(question, writer);
		} catch (JAXBException e) {
			e.printStackTrace();
			throw new QuestionConversionException(
					"Question Cannot be parsed into XML. ");
		}

		return writer.toString();

	}

}
