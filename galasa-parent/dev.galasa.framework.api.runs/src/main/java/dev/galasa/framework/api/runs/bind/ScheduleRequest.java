package dev.galasa.framework.api.runs.bind;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Properties;

public class ScheduleRequest implements Serializable {
	private static final long serialVersionUID = 1L;

	private List<String>  classNames;
	private List<String>  rerunUUIDs;
	private List<String>  testingAreas;
	private RequestorType requestorType = RequestorType.INDIVIDUAL;
	private String        buildVersion;
	private String        testStream;
	private String		  obr;
	private String        mavenRepository;
	
	private List<JatJaxbProperties> runProperties;


	public static class JatJaxbProperties implements Serializable {
		
		private static final long serialVersionUID = 1L;
		
		public String key;
		public String value;
		
		@Override
		public String toString() {
			return key + "=" + value;
		}
	}

	public Properties getRunProperties() {
		return convertToProperties(runProperties);
	}

	
	public void setRunProperties(Properties runProperties) {
		this.runProperties = convertFromProperties(runProperties);
	}
	

	private List<JatJaxbProperties> convertFromProperties(Properties properties) {
		if (properties == null) {
			return null;
		}
		
		List<JatJaxbProperties> jatProps = new ArrayList<JatJaxbProperties>();
		for(Entry<Object, Object> entry : properties.entrySet()) {
			JatJaxbProperties jatProp = new JatJaxbProperties();
			jatProp.key   = entry.getKey().toString();
			jatProp.value = entry.getValue().toString();
			jatProps.add(jatProp);
		}
		
		return jatProps;
	}
	
	private Properties convertToProperties(List<JatJaxbProperties> jaxbProperties) {
		if (jaxbProperties == null) {
			return null;
		}
		
		Properties props = new Properties();
		
		for(JatJaxbProperties jatProp : jaxbProperties) {
			props.put(jatProp.key, jatProp.value);
		}
		
		return props;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public List<String> getClassNames() {
		return classNames;
	}


	public List<String> getRerunUUIDs() {
		return rerunUUIDs;
	}


	public List<String> getTestingAreas() {
		return testingAreas;
	}


	public RequestorType getRequestorType() {
		return requestorType;
	}


	public String getBuildVersion() {
		return buildVersion;
	}


	public String getTestStream() {
		return testStream;
	}


	public String getObr() {
		return obr;
	}


	public String getMavenRepository() {
		return mavenRepository;
	}	
	

}
