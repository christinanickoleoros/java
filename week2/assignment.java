# Prompt the user for subtotal and gratuity rate
subtotal = float(input("Enter the subtotal: $"))
gratuity_rate = float(input("Enter the gratuity rate (in %): "))

# Calculate gratuity and total
gratuity = subtotal * (gratuity_rate / 100)
total = subtotal + gratuity

# Display results
print(f"Gratuity: ${gratuity:.2f}")
print(f"Total: ${total:.2f}")
