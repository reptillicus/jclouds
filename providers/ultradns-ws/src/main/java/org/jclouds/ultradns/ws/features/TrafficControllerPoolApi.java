/**
 * Licensed to jclouds, Inc. (jclouds) under one or more
 * contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  jclouds licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.jclouds.ultradns.ws.features;

import org.jclouds.rest.ResourceNotFoundException;
import org.jclouds.ultradns.ws.domain.TrafficControllerPool;
import org.jclouds.ultradns.ws.domain.TrafficControllerPoolRecord;

import com.google.common.collect.FluentIterable;

/**
 * @see TrafficControllerPoolAsyncApi
 * @author Adrian Cole
 */
public interface TrafficControllerPoolApi {

   /**
    * Returns all traffic controller pools in the zone.
    * 
    * @throws ResourceNotFoundException
    *            if the zone doesn't exist
    */
   FluentIterable<TrafficControllerPool> list() throws ResourceNotFoundException;

   /**
    * Returns all records in the traffic controller pool.
    * 
    * @throws ResourceNotFoundException
    *            if the pool doesn't exist
    */
   FluentIterable<TrafficControllerPoolRecord> listRecords(String poolId) throws ResourceNotFoundException;
}