#!/usr/bin/env ruby
class Prime
  def initialize
    @limit = 0
    @is_primes = []
  end
  
  def self.nth(prime)
    @limit = prime
    @is_primes = Array.new
    
    iteration = 2
    
    while @self.primes.length < @limit do
      puts @is_primes
      iteration += 1
      puts "\n\n\n"
    end
    primes.last
  end
end

puts Prime.nth(10)