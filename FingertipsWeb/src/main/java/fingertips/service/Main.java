package fingertips.service;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import fingertips.web.vo.Questions;

public class Main {
	
	public static void main(String[] args) throws Exception {
		
		Questions question = new Questions();
		
		question.setId(1);
		question.setOption1("option1");
		question.setOption2("option2");
		question.setOption3("option3");
		question.setOption4("option4");
		question.setQuestion("question");
		question.setTopicId("topicId");
		
		question.setTopicName("topicName");
		question.setCorrectOption(1);
		
		
		JAXBContext jaxbContext = JAXBContext.newInstance(Questions.class);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
 
		// output pretty printed
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		
		//jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		
		StringWriter writer = new StringWriter();
 
		jaxbMarshaller.marshal(question, writer);
		
		System.out.println(writer.toString());
		
		
	} 
	
	//question.
	

	


}
