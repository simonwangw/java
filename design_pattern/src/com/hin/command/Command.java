package com.hin.command;

/**
 * ÃüÁî½Ó¿Ú
 * @author Administrator
 *
 */
public interface Command {
	// Ö´ĞĞÃüÁî
    public void execute();
    // ³·ÏúÃüÁî
    public void undo();
}
