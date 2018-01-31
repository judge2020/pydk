package u.r;

import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import u.r.util.TermSettings;

public class BoundSession extends GenericTermSession {
    private final String issuerTitle;

    BoundSession(ParcelFileDescriptor ptmxFd, TermSettings settings, String issuerTitle) {
        super(ptmxFd, settings, true);

        this.issuerTitle = issuerTitle;

        setTermIn(new ParcelFileDescriptor.AutoCloseInputStream(ptmxFd));
        setTermOut(new ParcelFileDescriptor.AutoCloseOutputStream(ptmxFd));
    }

    @Override
    public String getTitle() {
        final String extraTitle = super.getTitle();

        return TextUtils.isEmpty(extraTitle)
               ? issuerTitle
               : issuerTitle + " — " + extraTitle;
    }
}
