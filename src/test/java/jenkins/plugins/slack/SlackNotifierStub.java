package jenkins.plugins.slack;

public class SlackNotifierStub extends SlackNotifier {

    public SlackNotifierStub(String teamDomain, String authToken, String authTokenCredentialId, String room,
                             String sendAs, boolean startNotification, boolean notifyAborted, boolean notifyFailure,
                             boolean notifyNotBuilt, boolean notifySuccess, boolean notifyUnstable, boolean notifyBackToNormal,
                             boolean notifyRepeatedFailure, boolean notifyFailureAfter3times, boolean includeTestSummary, CommitInfoChoice commitInfoChoice,
                             boolean includeCustomMessage, String customMessage) {
        super(teamDomain, authToken, authTokenCredentialId, room, sendAs, startNotification, notifyAborted, notifyFailure,
                notifyNotBuilt, notifySuccess, notifyUnstable, notifyBackToNormal, notifyRepeatedFailure, notifyFailureAfter3times,
                includeTestSummary, commitInfoChoice, includeCustomMessage, customMessage);
    }

    public static class DescriptorImplStub extends SlackNotifier.DescriptorImpl {

        private SlackService slackService;

        @Override
        public synchronized void load() {
        }

        @Override
        SlackService getSlackService(final String teamDomain, final String authToken, final String authTokenCredentialId, final String room) {
            return slackService;
        }

        public void setSlackService(SlackService slackService) {
            this.slackService = slackService;
        }
    }
}
