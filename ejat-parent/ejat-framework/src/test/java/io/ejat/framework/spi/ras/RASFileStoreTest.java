package io.ejat.framework.spi.ras;

import java.io.IOException;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.FileStoreAttributeView;

import org.junit.Assert;
import org.junit.Test;

public class RASFileStoreTest {
	
	@Test
	public void testBasicStuff() throws IOException {
		ResultArchiveStoreFileStore store = new ResultArchiveStoreFileStore();
		
		Assert.assertEquals("incorrect response", "ras", store.name());
		Assert.assertEquals("incorrect response", "ras", store.type());
		Assert.assertFalse("incorrect response", store.isReadOnly());
		Assert.assertEquals("incorrect response", Long.MAX_VALUE, store.getTotalSpace());
		Assert.assertEquals("incorrect response", Long.MAX_VALUE, store.getUsableSpace());
		Assert.assertEquals("incorrect response", Long.MAX_VALUE, store.getUnallocatedSpace());
		Assert.assertFalse("incorrect response", store.supportsFileAttributeView(BasicFileAttributeView.class));
		Assert.assertFalse("incorrect response", store.supportsFileAttributeView("basic"));
		Assert.assertNull("incorrect response", store.getFileStoreAttributeView(FileStoreAttributeView.class));
		Assert.assertNull("incorrect response", store.getAttribute("?"));
		
	}
	
}
