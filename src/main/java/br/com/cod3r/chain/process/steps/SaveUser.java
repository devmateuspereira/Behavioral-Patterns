package br.com.cod3r.chain.process.steps;

import br.com.cod3r.chain.process.repository.UserRepository;
import br.com.cod3r.chain.process.service.ProcessContext;

import java.util.Map;

public class SaveUser extends ProcessStep {

    public SaveUser(Object... args) {
        super(args);
    }

    @Override
    @SuppressWarnings("unchecked")
    public ProcessContext execute(ProcessContext context) throws Exception {
        Map<String, Object> userInput = (Map<String, Object>) context.get("input");
        UserRepository.getInstance().saveUser(userInput);
        return next(context, String.format("User '%s' saved!", userInput.get("name")));
    }

}