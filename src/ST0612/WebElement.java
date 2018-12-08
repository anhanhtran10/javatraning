package ST0612;

public class WebElement {

	private String Value;
	private String css;

	public void Input(String value) {
		this.Value = value;
	}

	public void AddClass(String css) {
		this.css = css;
	}

	public void DoAction() {
		System.out.println(this.Value);
		System.out.println(this.css);
	}

	public static void main(String[] arg) {
		WebElement in = new WebElement();
		
		in.Input("A");
		in.AddClass("css");
		in.DoAction();
	}
}
