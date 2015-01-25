package com.github.boformer.doublecheck.api;

import org.spongepowered.api.util.command.CommandSource;

import com.google.common.base.Optional;

public interface QuestionService
{
	void ask(Question question);
	
	Optional<Question> getActiveQuestion(CommandSource receipient);
}