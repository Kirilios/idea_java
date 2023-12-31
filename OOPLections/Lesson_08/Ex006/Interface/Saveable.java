package OOPLections.Lesson_08.Ex006.Interface;

import OOPLections.Lesson_08.Ex006.Document.TextDocument;

public interface Saveable {
    void SaveAs(TextDocument document, String path);
}
