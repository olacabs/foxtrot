/**
 * Copyright 2014 Flipkart Internet Pvt. Ltd.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.flipkart.foxtrot.core.datastore;

import com.flipkart.foxtrot.common.Document;

import java.util.List;

/**
 * User: Santanu Sinha (santanu.sinha@flipkart.com)
 * Date: 12/03/14
 * Time: 9:17 PM
 */
public interface DataStore {
    public void save(final String table, final Document document) throws DataStoreException;
    public void save(final String table, final List<Document> documents) throws DataStoreException;
    public Document get(final String table, final String id) throws DataStoreException;
    public List<Document> get(final String table, final List<String> ids) throws DataStoreException;
}
