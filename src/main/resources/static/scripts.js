// Initialize selected numbers array to keep track of selections
const selectedNumbers = [];

function selectNumber(cell) {
    // Toggle the 'selected' class on the clicked cell
    const isSelected = cell.classList.toggle("selected");

    // Update the hidden input field with selected numbers
    updateSelectedNumbers();
}

function updateSelectedNumbers() {
    // Gather all cells that have the 'selected' class
    const selectedCells = document.querySelectorAll('.selected');

    // Extract the number from each selected cell and update the hidden input
    const numbers = Array.from(selectedCells).map(cell => cell.textContent.trim());
    document.getElementById('numbersInput').value = numbers.join(' ');
}

// Function to reset selections when the page is loaded
function initializeBoard() {
    // Remove the 'selected' class from all cells
    document.querySelectorAll('td').forEach(cell => {
        cell.classList.remove('selected');
        // Add click event listener to each cell
        cell.addEventListener('click', function() { selectNumber(cell); });
    });
    // Clear the selectedNumbers array
    selectedNumbers.length = 0;
}

// Call initializeBoard when the window loads
window.onload = initializeBoard;
