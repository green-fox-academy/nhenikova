package com.greenfoxacademy.orientationexample.services;

import com.greenfoxacademy.orientationexample.models.Link;
import com.greenfoxacademy.orientationexample.repositories.LinkRepository;
import javassist.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Random;

@Service
public class AliasingServiceImpl implements AliasingService {

    private LinkRepository linkRepository;

    public AliasingServiceImpl(LinkRepository linkRepository) {
        this.linkRepository = linkRepository;
    }

    @Override
    public Link save(Link link) {
        if (aliasExists(link.getAlias())) {
            throw new IllegalArgumentException("Alias already in use");
        }

        String secretCode = generateSecretCode();

        link.setSecretCode(secretCode);

        linkRepository.save(link);

        return link;
    }

    @Override
    public Link findByAlias(String alias) {
        Optional<Link> optionalLink = linkRepository.findByAlias(alias);

        if (optionalLink.isPresent()) {
            Link link = optionalLink.get();

            incrementHitCount(link);

            return link;
        }

        return null;
    }

    private void incrementHitCount(Link link) {
        link.setHitCount(link.getHitCount() + 1);

        linkRepository.save(link);
    }

    @Override
    public Iterable<Link> getEveryLink() {
        return linkRepository.findAll();
    }

    @Override
    public void deleteLink(long id, String secretCode) throws NotFoundException {
        Optional<Link> optionalLink = linkRepository.findById(id);

        if (!optionalLink.isPresent()) {
            throw new NotFoundException("link was not found");
        }

        Link link = optionalLink.get();

        if (link.getSecretCode().equals(secretCode)) {
            linkRepository.deleteById(id);

            return;
        }

        throw new IllegalArgumentException("Secret code is not valid");
    }

    private boolean aliasExists(String alias) {
        Optional<Link> optionalLink = linkRepository.findByAlias(alias);

        return optionalLink.isPresent();
    }

    private String generateSecretCode() {
        String secretCode = "";
        Random random = new Random();

        for (int i = 0; i < 4; i++) {
            int digit = random.nextInt(9);

            secretCode += digit;
        }

        return secretCode;
    }
}