# HOL5 - Git Remote Push

## Objective

The objective of this hands-on is to learn how to connect a local Git repository with a remote GitHub repository and push local commits to GitHub.

---

## Prerequisites

- Git installed on the system
- GitHub account
- Existing GitHub repository

---

## Steps Performed

### 1. Initialize the Local Repository

```bash
git init
```

### 2. Add Files to the Staging Area

```bash
git add .
```

### 3. Commit the Changes

```bash
git commit -m "Initial commit for HOL5"
```

### 4. Add the Remote GitHub Repository

```bash
git remote add origin https://github.com/<your-username>/Cognizant-DN5-Java-FSE.git
```

### 5. Verify the Remote Repository

```bash
git remote -v
```

### 6. Push the Project to GitHub

```bash
git branch -M main
git push -u origin main
```

---

## Output

- Local repository successfully connected to GitHub.
- Project files uploaded to the remote repository.
- Future changes can be pushed using:

```bash
git push
```

---

## Git Commands Used

- `git init`
- `git add .`
- `git commit`
- `git remote add origin`
- `git remote -v`
- `git branch -M main`
- `git push -u origin main`

---

## Conclusion
#This hands-on demonstrates how to connect a local Git repository to a remote GitHub repository and push project files. It provides a basic understanding of remote repository management and version control using Git and GitHub.
