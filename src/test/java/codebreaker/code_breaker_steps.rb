require 'spec/expectations'
include_class 'codebreaker.Game'

Given(/the secret code is (.*)/) do |code|
    @game = Game.new(strip_space(code))
end

When(/I guess (.*)/) do |code|
    @mark = @game.guess(strip_space(code))
end

Then(/the mark should be (.*)/) do |code|
    @mark.should == code
end

def strip_space(s)
   s.gsub(" ", "")   
end
