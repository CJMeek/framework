package dev.voras.framework.spi;

/**
 * <p>Used by the eJAT Framework to initialise the various Result Archive Stores that may exist within the OSGi instance.  The 
 * framework can run with zero or more Result Archive Stores·</p>
 * 
 * <p>The RASs should use @{link io.ejat.framework.spi.IFrameworkInitialisation#getResultArchiveStoreUris} to obtain a list of active
 * URIs which the framework wants initialised.   The RAS should examine this and determine if it is required.
 * It is up to the RAS if it wants to support multiple URIs of it's own implementation,  eg
 * file:///dir1, file:///dir2</p>
 * 
 *  
 * @author Michael Baylis
 *
 */
public interface IResultArchiveStoreService extends IResultArchiveStore {
}
