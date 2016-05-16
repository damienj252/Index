package search;

import java.util.ArrayList;
import java.util.List;


public class WordDetail 
{
	//String associated with the WordDetail class only
	private String definition;
	
	private List<Integer> pages = new ArrayList<Integer>();
	
	public WordDetail(String definition)
	{
		this.definition = definition;
	}//WordDetail

//--------------------------------------------------------------------	
	public String getDef() 
	{
		return definition;
	}//getDefiniton
	
	public void setDef(String definition) 
	{
		this.definition = definition;
	}//setDefinition
//--------------------------------------------------------------------	

	public void addIndex (int page)
	{
		pages.add(page);
	}//addIndex
	
	public List<Integer> getIndices() 
	{
		return pages;
	}//List

}//WordDetail
