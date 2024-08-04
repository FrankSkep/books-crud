<script>
    import { triggerToast } from '../../../lib/toastStore.js';
    export let data; // Recibo id del libro a editar
    const id = parseInt(data.id);

    import { goto } from '$app/navigation';

    async function deleteBook() {
        const response = await fetch(`http://localhost:8000/book/${id}`, {
            method: 'DELETE',
            headers: {
                'Content-Type': 'application/json'
            },
        });

        if (response.ok) {
            goto('/');
            triggerToast('Book deleted successfully', 'warning');
        } else {
            triggerToast('Failed to delete the book', 'danger')
        }
    }
    deleteBook();
</script>