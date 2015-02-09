/*
 * This file is part of DoubleCheck, licensed under the MIT License (MIT).
 *
 * Copyright (c) 2015 Felix Schmidt <http://homepage.rub.de/Felix.Schmidt-c2n/>
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.github.boformer.doublecheck.api;

import org.spongepowered.api.util.command.CommandSource;

import com.google.common.base.Optional;

/**
 * The Service that can be used by other plugins to send confirmation requests to a player or the
 * console. 
 * 
 * <p>The provider of the service can be obtained from the Sponge {@code ServiceManager}</p>
 */
public interface ConfirmationService
{
	/**
	 * Sends a new request to the specified recipient.
	 * 
	 * @param request The request
	 */
	void send(Request request);
	
	/**
	 * Gets the active request of a recipient, if there is one that is not expired.
	 * 
	 * @param receipient The recipient
	 * @return The request, if available
	 */
	Optional<Request> getActiveRequest(CommandSource receipient);

	/**
	 * Removes the active request of a recipient.
	 * 
	 * @param receipient The recipient
	 */
	void removeActiveRequest(CommandSource receipient);
}
