<script>
    import { goto } from '$app/navigation';
    import { triggerToast } from '../../../lib/toastStore.js';

    export let data; // data from the server
    const id = parseInt(data.id);

    async function deleteBook() {
        const response = await fetch(`http://localhost:8000/api/books/${id}`, {
            method: 'DELETE',
            headers: {
                'Content-Type': 'application/json',
            },
        });

        if (response.ok) {
            goto('/books');
            triggerToast('Book deleted successfully', 'warning');
        } else {
            triggerToast('Failed to delete the book', 'danger');
        }
    }
    deleteBook();
</script>