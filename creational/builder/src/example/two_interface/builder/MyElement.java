package example.two_interface.builder;

import org.xml.sax.Attributes;

public class MyElement {
	String uri, localName, qname;
	Attributes attributes;
	String value;

	public MyElement(String uri2, String localName2, String qName2,
			Attributes attributes2) {
		this.uri = uri;
		this.localName = localName;
		this.qname = qname;
		this.attributes = attributes;
		this.value = value;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public String getLocalName() {
		return localName;
	}

	public void setLocalName(String localName) {
		this.localName = localName;
	}

	public String getQname() {
		return qname;
	}

	public void setQname(String qname) {
		this.qname = qname;
	}

	public Attributes getAttributes() {
		return attributes;
	}

	public void setAttributes(Attributes attributes) {
		this.attributes = attributes;
	}

	public String getqName() {
		// TODO Auto-generated method stub
		return qname;
	}

	public String getValue() {
		// TODO Auto-generated method stub
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
