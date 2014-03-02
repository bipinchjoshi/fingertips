package fingertips.dto;

import java.util.List;

public class QuestionDTO {

	private long questionId;

	private String question;

	private List<String> optionList;

	private int correctOptionIndex;

	private long topicId;

	public long getQuestionId() {
		return questionId;
	}

	public String getQuestion() {
		return question;
	}

	public List<String> getOptionList() {
		return optionList;
	}

	public int getCorrectOptionIndex() {
		return correctOptionIndex;
	}

	public void setQuestionId(long questionId) {
		this.questionId = questionId;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public void setOptionList(List<String> optionList) {
		this.optionList = optionList;
	}

	public void setCorrectOptionIndex(int correctOptionIndex) {
		this.correctOptionIndex = correctOptionIndex;
	}

	public long getTopicId() {
		return topicId;
	}

	public void setTopicId(long topicId) {
		this.topicId = topicId;
	}

}
