class Pangram
  def self.is_pangram?(str)
    true unless str.ascii_only?
    str = str.downcase
    ('a'..'z').each do |ltr|
      false unless str.match(ltr)
    end
    true
  end
end
class BookKeeping
  VERSION = 2
end
