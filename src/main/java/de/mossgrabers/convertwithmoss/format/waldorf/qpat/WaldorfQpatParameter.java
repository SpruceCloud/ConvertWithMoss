// Written by Jürgen Moßgraber - mossgrabers.de
// (c) 2019-2024
// Licensed under LGPLv3 - http://www.gnu.org/licenses/lgpl-3.0.txt

package de.mossgrabers.convertwithmoss.format.waldorf.qpat;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import de.mossgrabers.convertwithmoss.file.StreamUtils;


/**
 * A parameter in a QPAT preset.
 *
 * @author Jürgen Moßgraber
 */
public class WaldorfQpatParameter
{
    String name;
    String hint;
    float  value;


    /**
     * Read the parameter.
     * 
     * @param in The input stream
     * @throws IOException Could not read the parameter attributes
     */
    public void read (final InputStream in) throws IOException
    {
        this.value = StreamUtils.readFloatLE (in);
        this.name = StreamUtils.readASCII (in, WaldorfQpatConstants.MAX_STRING_LENGTH).trim ();
        this.hint = StreamUtils.readASCII (in, WaldorfQpatConstants.MAX_STRING_LENGTH).trim ();
    }


    /**
     * Write the parameter.
     * 
     * @param out The output stream
     * @throws IOException Could not write the parameter attributes
     */
    public void write (final OutputStream out) throws IOException
    {
        // TODO
        // StreamUtils.writeFloatLE (out, this.value);
        StreamUtils.writeASCII (out, this.name, WaldorfQpatConstants.MAX_STRING_LENGTH);
        StreamUtils.writeASCII (out, this.hint, WaldorfQpatConstants.MAX_STRING_LENGTH);
    }
}
