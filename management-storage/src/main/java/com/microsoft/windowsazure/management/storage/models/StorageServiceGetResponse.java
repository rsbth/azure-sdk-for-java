/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.storage.models;

import com.microsoft.windowsazure.core.OperationResponse;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;

/**
* The Get Storage Account Properties operation response.
*/
public class StorageServiceGetResponse extends OperationResponse
{
    private ArrayList<String> capabilities;
    
    /**
    * Indicates if the storage account is able to perform virtual machine
    * related operations. If so, this element returns a string containing
    * PersistentVMRole. Otherwise, this element will not be present.
    */
    public ArrayList<String> getCapabilities()
    {
        return this.capabilities;
    }
    
    /**
    * Indicates if the storage account is able to perform virtual machine
    * related operations. If so, this element returns a string containing
    * PersistentVMRole. Otherwise, this element will not be present.
    */
    public void setCapabilities(ArrayList<String> capabilities)
    {
        this.capabilities = capabilities;
    }
    
    private HashMap<String, String> extendedProperties;
    
    /**
    * Optional. Represents the name of an extended storage account property.
    * Each extended property must have both a defined name and value. You can
    * have a maximum of 50 extended property name/value pairs.  The maximum
    * length of the Name element is 64 characters, only alphanumeric
    * characters and underscores are valid in the Name, and the name must
    * start with a letter. Attempting to use other characters, starting the
    * Name with a non-letter character, or entering a name that is identical
    * to that of another extended property owned by the same storage account,
    * will result in a status code 400 (Bad Request) error.  Each extended
    * property value has a maximum length of 255 characters.
    */
    public HashMap<String, String> getExtendedProperties()
    {
        return this.extendedProperties;
    }
    
    /**
    * Optional. Represents the name of an extended storage account property.
    * Each extended property must have both a defined name and value. You can
    * have a maximum of 50 extended property name/value pairs.  The maximum
    * length of the Name element is 64 characters, only alphanumeric
    * characters and underscores are valid in the Name, and the name must
    * start with a letter. Attempting to use other characters, starting the
    * Name with a non-letter character, or entering a name that is identical
    * to that of another extended property owned by the same storage account,
    * will result in a status code 400 (Bad Request) error.  Each extended
    * property value has a maximum length of 255 characters.
    */
    public void setExtendedProperties(HashMap<String, String> extendedProperties)
    {
        this.extendedProperties = extendedProperties;
    }
    
    private StorageServiceProperties properties;
    
    /**
    * Details about the storage account.
    */
    public StorageServiceProperties getProperties()
    {
        return this.properties;
    }
    
    /**
    * Details about the storage account.
    */
    public void setProperties(StorageServiceProperties properties)
    {
        this.properties = properties;
    }
    
    private String serviceName;
    
    /**
    * The name of the storage account. This name is the DNS prefix name and can
    * be used to access blobs, queues, and tables in the storage account.  For
    * example, if the service name is MyStorageAccount you could access the
    * blob containers by calling:
    * http://MyStorageAccount.blob.core.windows.net/mycontainer/
    */
    public String getServiceName()
    {
        return this.serviceName;
    }
    
    /**
    * The name of the storage account. This name is the DNS prefix name and can
    * be used to access blobs, queues, and tables in the storage account.  For
    * example, if the service name is MyStorageAccount you could access the
    * blob containers by calling:
    * http://MyStorageAccount.blob.core.windows.net/mycontainer/
    */
    public void setServiceName(String serviceName)
    {
        this.serviceName = serviceName;
    }
    
    private URI uri;
    
    /**
    * The Service Management API request URI used to perform Get Storage
    * Account Properties requests against the storage account.
    */
    public URI getUri()
    {
        return this.uri;
    }
    
    /**
    * The Service Management API request URI used to perform Get Storage
    * Account Properties requests against the storage account.
    */
    public void setUri(URI uri)
    {
        this.uri = uri;
    }
    
    /**
    * Initializes a new instance of the StorageServiceGetResponse class.
    *
    */
    public StorageServiceGetResponse()
    {
        super();
        this.capabilities = new ArrayList<String>();
        this.extendedProperties = new HashMap<String, String>();
    }
}