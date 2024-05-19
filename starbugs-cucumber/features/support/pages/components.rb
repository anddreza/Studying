require 'rspec'
require 'capybara/dsl'

class Popup
    include Capybara::DSL 
    include RSpec::Matchers

    def have_text(text)
        popup = find('.swal2-html-container')
        expect(popup.text).to eql 'Produto indisponível'
    end 

end