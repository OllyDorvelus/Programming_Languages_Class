module Price 
  def displayPrice(value)
    puts "$%0.2f" % [value]
  end
end

class Gemstones
  include Price
  def initialize(name, color, price)  
    # Instance variables  
    @name = name  
    @color = color 
    @price = price
  end
  def display
    puts "Gem: #{@name}"
    puts "Color: #{@color}"
    displayPrice(@price)
  end
  def getPrice
    return @price.to_f
  end
end
$answer = true
$gemArray = []
def askGem
  print "Are you sure you want to add a gemstone? Y/N:"
  response = gets.chomp
  while(true)
    if response == "Y" || response == "y"
      puts "Register a Gemstone Here"
      print "Please Enter the name of the Gemstone:"
      name = gets.chomp
      name.capitalize!
      print "Please Enter the color of the Gemstone:"
      color = gets.chomp
      color.capitalize!
      print "Please Enter the price of the Gemstone:"
      price = gets.chomp
      gemstone = Gemstones.new(name, color, price)
      puts ""
      $gemArray.push(gemstone)
     # gemstone.display
      puts ""
      $answer = true
      break
    elsif response == "N" || response == "n"
      puts "Program has been terminated"
      $answer = false
      break
    else
      print "Please enter in a valid response:"
      response = gets.chomp
    end
  end
end

def askGems
  print "Please Enter How Many Gemstones you want to input:"
  num = gets.chomp
  num = num.to_i
  puts "Okay" if num.is_a? String
  num.times{askGem if $answer}
end

def gemDisplay
  $gemArray.sort!{|gemstone1, gemstone2| gemstone1.getPrice <=> gemstone2.getPrice}
  $gemArray.each do |gemstone|
    puts gemstone.display
  end
end

askGems
gemDisplay