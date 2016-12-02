class Robot
  attr_reader :name
  ALPHABET = ('AA'..'ZZ').to_a
  NUMERALS = 0..999
  @@names = []

  def initialize
    reset
  end

  def reset
    @name = random_name while exist? name
    @@names.push(name).last
  end

  private

  def random_name
    format '%s%03i', ALPHABET.sample, rand(NUMERALS)
  end

  def exist?(new_name)
    @@names.include? new_name
  end
end
class BookKeeping
  VERSION = 2
end
