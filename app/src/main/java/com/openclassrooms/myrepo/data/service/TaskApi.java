package com.openclassrooms.myrepo.data.service;

import com.openclassrooms.myrepo.model.Task;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * Cette classe simule la récupération de tâches depuis une API.
 * Les tâches générées sont utilisées à des fins de démonstration.
 */
public class TaskApi {
    /**
     * Récupère une liste de tâches simulées depuis l'API.
     *
     * @return Une liste de tâches simulées avec des descriptions pré-définies.
     */
    public List<Task> getTasks() {
        // Simule la récupération des tâches depuis une API
        List<Task> tasks = new ArrayList<>();

        // Modif 6 : utilisation de la classe Calendar pour obtenir une date
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date()); // Date actuelle

        // Modif 7 : utilisation de la classe Random pour obtenir un nombre aléatoire
        Random random = new Random();
        int randomDays = random.nextInt(30)+1; // Génère un nombre aléatoire entre 1 et 30

        tasks.add(new Task("Faire les courses pour le dîner", calendar.getTime()));

        calendar.add(Calendar.DAY_OF_YEAR, randomDays);
        tasks.add(new Task("Préparer le rapport pour la réunion", calendar.getTime()));

        randomDays = random.nextInt(30)+1;
        calendar.add(Calendar.DAY_OF_YEAR, randomDays);
        tasks.add(new Task("Répondre aux e-mails en attente", calendar.getTime()));

        randomDays = random.nextInt(30)+1;
        calendar.add(Calendar.DAY_OF_YEAR, randomDays);
        tasks.add(new Task("Faire de l'exercice pendant 30 minutes", calendar.getTime()));

        randomDays = random.nextInt(30)+1;
        calendar.add(Calendar.DAY_OF_YEAR, randomDays);
        tasks.add(new Task("Planifier les vacances d'été", calendar.getTime()));

        randomDays = random.nextInt(30)+1;
        calendar.add(Calendar.DAY_OF_YEAR, randomDays);
        tasks.add(new Task("Rendre le livre à la bibliothèque", calendar.getTime()));

        randomDays = random.nextInt(30)+1;
        calendar.add(Calendar.DAY_OF_YEAR, randomDays);
        tasks.add(new Task("Réviser pour l'examen de mathématiques", calendar.getTime()));

        randomDays = random.nextInt(30)+1;
        calendar.add(Calendar.DAY_OF_YEAR, randomDays);
        tasks.add(new Task("Appeler le plombier pour la fuite d'eau", calendar.getTime()));

        randomDays = random.nextInt(30)+1;
        calendar.add(Calendar.DAY_OF_YEAR, randomDays);
        tasks.add(new Task("Nettoyer le garage", calendar.getTime()));

        randomDays = random.nextInt(30)+1;
        calendar.add(Calendar.DAY_OF_YEAR, randomDays);
        tasks.add(new Task("Préparer une liste de courses", calendar.getTime()));
        return tasks;
    }
}
