import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class ChallengeTest extends TestBase {

    @Test
    public void qrTest(){
        ChallengePage challengePage = new ChallengePage("ircfilltheplate");
        challengePage.clickParticipate();
        GetFreeAppDialog getFreeAppDialog = new GetFreeAppDialog();
        assertTrue(getFreeAppDialog.isQrVisible(), "QR was not displayed!");
    }

}