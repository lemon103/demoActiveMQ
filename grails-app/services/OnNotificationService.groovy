class OnNotificationService {
	boolean transactional = false
	static expose = ['jms']
	static destination = "queue.notification"
	def onMessage = {
		println "GOT MESSAGE: $it"
	}
}