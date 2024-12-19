<script>
    import { goto } from '$app/navigation';
    import { onMount } from 'svelte';

    let totalBooks;

    onMount(async () => {
        const response = await fetch('http://localhost:8000/api/books/total');
        const data = await response.json();
        totalBooks = data;
    });
</script>

<style>
    /* General */
    * {
        margin: 0;
        padding: 0;
        box-sizing: border-box;
        font-family: 'Arial', sans-serif;
    }

    .welcome-container {
        text-align: center;
        padding: 40px 20px;
        background-color: #fff;
        border-radius: 8px;
        box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1);
        margin-top: 60px;
    }

    .welcome-container h1 {
        font-size: 2.5rem;
        color: #333;
        margin-bottom: 15px;
    }

    .welcome-container p {
        font-size: 1.1rem;
        color: #666;
        margin-bottom: 20px;
    }

    .btn {
        padding: 12px 24px;
        background-color: #007bff;
        color: #fff;
        border: none;
        border-radius: 6px;
        font-size: 1.1rem;
        cursor: pointer;
        transition: background-color 0.3s;
    }

    .btn:hover {
        background-color: #0056b3;
    }

    /* Dashboard and Card */
    .dashboard {
        display: flex;
        justify-content: center;
        margin-top: 40px;
        gap: 30px;
    }

    .card {
        background-color: #fff;
        border-radius: 10px;
        padding: 25px;
        width: 220px;
        text-align: center;
        box-shadow: 0 6px 20px rgba(0, 0, 0, 0.1);
        transition: transform 0.3s ease, box-shadow 0.3s ease;
    }

    .card:hover {
        transform: translateY(-8px);
        box-shadow: 0 12px 30px rgba(0, 0, 0, 0.2);
    }

    .card h2 {
        font-size: 1.7rem;
        color: #333;
        margin-bottom: 10px;
    }

    .card p {
        font-size: 1.3rem;
        color: #555;
    }
</style>

<div class="welcome-container">
    <h1>Welcome to the Library</h1>
    <p>Explore our collection of books and manage your personal library.</p>
    <button class="btn" on:click={() => goto('/books')}>View Books</button>
</div>

<div class="dashboard">
    <div class="card">
        <h2>Total Books</h2>
        <p>{totalBooks}</p>
    </div>
</div>
