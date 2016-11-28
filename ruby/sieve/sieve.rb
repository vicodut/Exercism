#!/usr/bin/env ruby
class Sieve
  def initialize(limit)
    @limit = limit
  end

  def mark_multiples(integer, is_primes)
    (integer..@limit).each do |j|
      is_primes[j * integer - 2] = false
    end
  end

  def primes
    is_primes = Array.new(@limit - 1, true)
    (2..Math.sqrt(@limit).to_i).each do |integer|
      mark_multiples(integer, is_primes) if is_primes[integer - 2]
    end
    (2..@limit).to_a.select { |x| is_primes[x - 2] }
  end
end
class BookKeeping
  VERSION = 1
end
