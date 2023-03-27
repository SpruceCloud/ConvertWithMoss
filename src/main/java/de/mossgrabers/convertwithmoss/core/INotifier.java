// Written by Jürgen Moßgraber - mossgrabers.de
// (c) 2019-2023
// Licensed under LGPLv3 - http://www.gnu.org/licenses/lgpl-3.0.txt

package de.mossgrabers.convertwithmoss.core;

/**
 * Interface to notify the user about notification messages.
 *
 * @author J&uuml;rgen Mo&szlig;graber
 */
public interface INotifier
{
    /**
     * Log the message to the notifier.
     *
     * @param messageID The ID of the message to get
     * @param replaceStrings Replaces the %1..%n in the message with the strings
     */
    void log (String messageID, String... replaceStrings);


    /**
     * Log the message to the notifier.
     *
     * @param messageID The ID of the message to get
     * @param replaceStrings Replaces the %1..%n in the message with the strings
     */
    void logError (String messageID, String... replaceStrings);


    /**
     * Log the message to the notifier.
     *
     * @param messageID The ID of the message to get
     * @param throwable A throwable
     */
    void logError (String messageID, Throwable throwable);


    /**
     * Log the message to the notifier.
     *
     * @param throwable A throwable
     */
    void logError (Throwable throwable);


    /**
     * Log the text to the notifier. Only use for development or debugging.
     *
     * @param text The text to log
     */
    void logText (String text);


    /**
     * Update the button execution states.
     *
     * @param canClose Execution can be closed
     */
    void updateButtonStates (boolean canClose);
}