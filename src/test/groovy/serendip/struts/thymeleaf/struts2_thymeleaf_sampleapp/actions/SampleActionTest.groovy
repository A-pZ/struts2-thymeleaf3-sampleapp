package serendip.struts.thymeleaf.struts2_thymeleaf_sampleapp.actions

import org.apache.struts2.StrutsJUnit4TestCase

import com.opensymphony.xwork2.ActionProxy
import com.opensymphony.xwork2.ActionSupport

import spock.lang.Specification

class SampleActionTest extends Specification {

	MockedStrutsAction sut = new MockedStrutsAction()

	def setup() {
		sut.setUp()
	}

	def cleanup() {
		sut.tearDown()
	}

	def "デフォルトAction"() {
		setup:
		ActionProxy proxy  = sut.getActionProxy("/")

		when:
		String result = proxy.execute()

		then:
		result == ActionSupport.SUCCESS

		ActionSupport action = proxy.getAction()
		action.hasActionMessages() == true
		action.getActionMessages().size() == 1
	}

	def "listAction"() {
		setup:
		ActionProxy proxy = sut.getActionProxy("/list")

		when:
		String result = proxy.execute()

		then:
		result == ActionSupport.SUCCESS

		ActionSupport action = proxy.getAction()
		action.hasActionErrors() == false
		action.hasActionMessages() == false
	}

	def "単一の入力チェックエラー"() {
		setup:
		sut.request.setParameter("products[0].stock","aaaaa")

		ActionProxy proxy = sut.getActionProxy("/registerList")

		when:
		String result = proxy.execute()

		then:
		result == ActionSupport.INPUT

		ActionSupport action = proxy.getAction()
		action.hasFieldErrors() == true
		action.getFieldErrors().get("products[0].stock")
	}

	class MockedStrutsAction extends StrutsJUnit4TestCase {

	}
}
