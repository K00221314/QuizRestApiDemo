/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathmania.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Rob
 */
@Entity
@Table(name = "results")
@XmlRootElement
@NamedQueries(
{
	@NamedQuery(name = "Results.findAll", query = "SELECT r FROM Results r")
	, @NamedQuery(name = "Results.findByCategory", query = "SELECT r FROM Results r WHERE r.category = :category")
	, @NamedQuery(name = "Results.findByType", query = "SELECT r FROM Results r WHERE r.type = :type")
	, @NamedQuery(name = "Results.findByDifficulty", query = "SELECT r FROM Results r WHERE r.difficulty = :difficulty")
	, @NamedQuery(name = "Results.findByQuestion", query = "SELECT r FROM Results r WHERE r.question = :question")
	, @NamedQuery(name = "Results.findByCorrectAnswer", query = "SELECT r FROM Results r WHERE r.correctAnswer = :correctAnswer")
	, @NamedQuery(name = "Results.findByIncorrectAnswers", query = "SELECT r FROM Results r WHERE r.incorrectAnswers = :incorrectAnswers")
})
public class Results implements Serializable
{

	private static final long serialVersionUID = 1L;
	@Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "category")
	private String category;
	@Size(max = 200)
    @Column(name = "type")
	private String type;
	@Size(max = 200)
    @Column(name = "difficulty")
	private String difficulty;
	@Size(max = 200)
    @Column(name = "question")
	private String question;
	@Size(max = 200)
    @Column(name = "correct_answer")
	private String correctAnswer;
	@Size(max = 200)
    @Column(name = "incorrect_answers")
	private String incorrectAnswers;

	public Results()
	{
	}

	public Results(String category)
	{
		this.category = category;
	}

	public String getCategory()
	{
		return category;
	}

	public void setCategory(String category)
	{
		this.category = category;
	}

	public String getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	public String getDifficulty()
	{
		return difficulty;
	}

	public void setDifficulty(String difficulty)
	{
		this.difficulty = difficulty;
	}

	public String getQuestion()
	{
		return question;
	}

	public void setQuestion(String question)
	{
		this.question = question;
	}

	public String getCorrectAnswer()
	{
		return correctAnswer;
	}

	public void setCorrectAnswer(String correctAnswer)
	{
		this.correctAnswer = correctAnswer;
	}

	public String getIncorrectAnswers()
	{
		return incorrectAnswers;
	}

	public void setIncorrectAnswers(String incorrectAnswers)
	{
		this.incorrectAnswers = incorrectAnswers;
	}

	@Override
	public int hashCode()
	{
		int hash = 0;
		hash += (category != null ? category.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object)
	{
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Results))
		{
			return false;
		}
		Results other = (Results) object;
		if ((this.category == null && other.category != null) || (this.category != null && !this.category.equals(other.category)))
		{
			return false;
		}
		return true;
	}

	@Override
	public String toString()
	{
		return "mathmania.entities.Results[ category=" + category + " ]";
	}
	
}
