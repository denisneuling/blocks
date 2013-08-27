/*
 * Copyright 2013 trewys GmbH 
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
package de.trewys.blocks.velocity;

import org.apache.velocity.VelocityContext;

import de.trewys.blocks.context.BlockContext;

/**
 * @author og
 *
 */
public class BlockVelocityContext extends VelocityContext {

	public static BlockVelocityContext createInstance(BlockContext context) {
		BlockVelocityContext velocityContext = new BlockVelocityContext();
		velocityContext.put("context", context);
		velocityContext.put("util", VelocityUtil.getInstance());
		return velocityContext;
	}
	
	protected BlockVelocityContext() {}
}