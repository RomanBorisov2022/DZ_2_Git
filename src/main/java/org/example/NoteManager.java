package org.example;



import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class NoteManager {
    public void addNote() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите заметку: ");
        String noteContent = scanner.nextLine();
        Note note = new Note(noteContent);
        saveNoteToFile(note);
    }

    private void saveNoteToFile(Note note) {
        try (FileWriter fileWriter = new FileWriter("notes.txt", true);
             PrintWriter writer = new PrintWriter(fileWriter)) {
            writer.println("Дозапись в файл: " + note.getFormattedTimestamp() + " -> " + note.getContent());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

