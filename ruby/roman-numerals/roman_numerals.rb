#!/usr/bin/env ruby
class Integer
  ROMAN_NB = {
    1 => 'I',
    4 => 'IV',
    5 => 'V',
    9 => 'IX',
    10 => 'X',
    40 => 'XL',
    50 => 'L',
    90 => 'XC',
    100 => 'C',
    400 => 'CD',
    500 => 'D',
    900 => 'CM',
    1000 => 'M'
  }.freeze
  def to_roman
    decimal = self
    roman = ''
    ROMAN_NB.keys.reverse_each do |num|
      roman << ROMAN_NB[num] * (decimal / num) unless (decimal / num).zero?
      decimal -= (decimal / num) * num
    end
    roman
  end
end
class BookKeeping
  VERSION = 2
end
