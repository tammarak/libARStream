package com.parrot.arsdk.arvideo;

import com.parrot.arsdk.arsal.ARNativeData;

/**
 * This interface describes a listener of ARVideoSender events
 */
public interface ARVideoSenderListener
{
    /**
     * This callback can be called in two different cases:<br>
     *    - Frame sent:<br>
     *       The frame was successfully sent to the reader<br>
     *    - Frame cancel:<br>
     *       The frame was cancelled before it was acknowledged<br>
     *       This does not ensure that the frame was not received.
     * @param cause The event that triggered this call (see global func description)
     * @param currentFrame The frame buffer for the event (see global func description)
     */
    public void didUpdateFrameStatus (ARVIDEO_SENDER_STATUS_ENUM cause, ARNativeData currentFrame);
}