Feature: API schema to serve reviews to partners

		Background:
		   * url 'https://pickle.rick'
		   
		   
		   Scenario: list all reviews
		   Given path '/partners/api/review'
		   When method get
		   Then status 200