/*
 * Licensed Materials - Property of IBM
 * 
 * (c) Copyright IBM Corp. 2019.
 */
package dev.galasa.framework.spi;

import javax.validation.constraints.NotNull;

public interface IResultArchiveStoreRegistration {

    void initialise(@NotNull IFrameworkInitialisation frameworkInitialisation) throws ResultArchiveStoreException;
}
