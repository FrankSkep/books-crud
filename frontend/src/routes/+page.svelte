<script>
    import { onMount } from 'svelte';
    import { writable } from 'svelte/store';
    import ListBooks from '../lib/ListBooks.svelte';

    let books = writable([]);

    // Fetch data from the server
    onMount(async () => {
        const response = await fetch('http://localhost:8000/book');
        const data = await response.json();
        books.set(data);
    });
</script>

<ListBooks {books} />