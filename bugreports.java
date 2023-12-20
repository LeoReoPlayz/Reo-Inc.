<script>
    document.getElementById("bug-report-form").addEventListener("submit", function (event) {
        event.preventDefault();

        // Retrieve form data
        const name = document.getElementById("name").value;
        const email = document.getElementById("email").value;
        const bugDescription = document.getElementById("bug-description").value;

        // You can add further logic here, like sending the data to a server or displaying a confirmation message.
        alert(`Bug reported!\nName: ${name}\nEmail: ${email}\nBug Description: ${bugDescription}`);
    });
</script>
