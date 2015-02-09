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

import org.spongepowered.api.text.message.Message;
import org.spongepowered.api.util.command.CommandSource;

/**
 * A confirmation request that can be passed to a {@link ConfirmationService} to send it to the
 * recipient.
 * 
 * <p>Plugins can create their own request classes which implement this interface or
 * alternatively extend the {@link AbstractRequest} class.</p>
 */
public interface Request
{
	/**
	 * Gets the recipient of the request.
	 * 
	 * @return The receipient
	 */
	CommandSource getRecipient();

	/**
	 * Gets the messages that will be sent to the recipient when the request is sent.
	 * 
	 * @return An array of messages
	 */
	Message[] getMessages();

	/**
	 * Indicates whether the request is expired.
	 * 
	 * @return true if the request is expired
	 */
	boolean isExpired();

	/**
	 * The method that will be executed when the player confirms the request.
	 */
	void confirm();

	/**
	 * The method that will be executed when the player denies the request.
	 */
	void deny();
}
