class NotificationController {
	def index = {
		def message = "Hi, this is a Hello World with JMS & ActiveMQ, " + new Date()
		sendJMSMessage("queue.notification", message)
		render message
	}
}