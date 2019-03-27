package io.ejat.framework.spi;

import javax.validation.constraints.NotNull;

/**
 *  
 * @author James Davies
 *
 */
public interface IConfigurationPropertyStoreRegistration {
	
	/**
	 * <p>This method is called to selectively initialise the CPS.  If this CPS is to be initialise, 
	 * it should register the CPS with @{link {@link io.ejat.framework.spi.IFrameworkInitialisation#registerConfigurationPropertyStore(IConfigurationPropertyStore)}</p> 
	 * 
	 * <p>If there is any problem initialising the sole CPS, then an exception will be thrown that will effectively terminate the Framework</p>
	 * 
	 * @param frameworkInitialisation - Initialisation object containing access to various initialisation methods
	 * @throws ConfigurationPropertyStoreException - If there is a problem initialising the underlying store
	 */
    void initialise(@NotNull IFrameworkInitialisation frameworkInitialisation) throws ConfigurationPropertyStoreException;

}
