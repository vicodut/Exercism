class Robot
  attr_reader :name
  ALPHABET = ('AA'..'ZZ').to_a
  NUMERALS = 0..999

  def initialize
    reset
  end

  def reset
    @name = random_name
  end

  private

  def random_name
    #ALPHABET.sample << format('%03d', rand(NUMERALS))
    ALPHABET.sample + format('%03d', rand(NUMERALS))
    #"#{ALPHABET.sample}#{format('%03d', Random.new.rand(1000))}"
  end
end
class BookKeeping
  VERSION = 2
end
