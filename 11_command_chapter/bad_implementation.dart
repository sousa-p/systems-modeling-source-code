class NotesRepository {
  List<String> notes = [];

  void addNote(String note) {
    notes.add(note);
    print('Nota adicionada: $note');
  }

  void removeNote(String note) {
    notes.remove(note);
    print('Nota removida: $note');
  }
}

class StateManager {
  final NotesRepository repository;

  StateManager(this.repository);

  void processAddNote(String note) {
    repository.addNote(note);
  }

  void processRemoveNote(String note) {
    repository.removeNote(note);
  }
}

void main() {
  final repository = NotesRepository();
  final stateManager = StateManager(repository);

  stateManager.processAddNote('Lembrete importante');
  stateManager.processRemoveNote('Lembrete importante');