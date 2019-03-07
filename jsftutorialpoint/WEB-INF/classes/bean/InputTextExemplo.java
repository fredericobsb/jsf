package bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.html.HtmlInputText;
import javax.faces.component.html.HtmlOutputText;

@ManagedBean(name = "inputTextExemplo")
@ViewScoped
public class InputTextExemplo {

	private HtmlInputText inputText;
	private HtmlOutputText outputText;
	private String teste;
	
	public String getTeste() {
		return teste;
	}

	public void setTeste(String teste) {
		this.teste = teste;
	}

	public HtmlInputText getInputText() {
		return inputText;
	}

	public void setInputText(HtmlInputText inputText) {
		this.inputText = inputText;
	}

	public HtmlOutputText getOutputText() {
		//outputText.setStyle("color:navy");
		return outputText;
	}

	public void setOutputText(HtmlOutputText outputText) {
		this.outputText = outputText;
	}

	public String action()
	{
		getInputText();// verifica o que esta vindo do inputText
		//inputText.setDisabled(true);
		return "success";
	}
}
