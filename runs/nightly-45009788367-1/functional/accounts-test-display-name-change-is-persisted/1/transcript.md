# Transcript: A new display name is stored and returned

| | |
|---|---|
| Test | `com.qaautomation.tests.functional.AccountsTest#displayNameChangeIsPersisted` |
| Features | FEAT-ACCT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 375 | `qa-458857a9-99cd-4875-9007-efe41ba4f551` |
| 2 | `POST /v1/auth/token` | 200 | 66 | `qa-0d86a1a5-9b4c-4c82-8631-723fdf739df3` |
| 3 | `PATCH /v1/accounts/me` | 200 | 65 | `qa-944ba2a0-92c8-4953-b0c4-f4dc9d2295d2` |
| 4 | `GET /v1/accounts/me` | 200 | 19 | `qa-5e3ee1ee-fb5a-41ee-b227-c4e0bbb0e8ef` |
| 5 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-69f461ef-622f-4138-a507-e86280059e0d` |
| 6 | `POST /v1/auth/token` | 401 | 34 | `qa-96298e4a-a665-4854-8969-3bef59c60cf6` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-458857a9-99cd-4875-9007-efe41ba4f551

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-458857a9-99cd-4875-9007-efe41ba4f551
Content-Type: application/json

--- request body ---
{"handle":"qa-b729882d9c41","displayName":"QA b729882d9c41","password":"****","region":"eu"}

--- response: 201 in 375 ms ---
Date: Sun, 22 Nov 2026 09:54:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-458857a9-99cd-4875-9007-efe41ba4f551
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Location: /v1/accounts/qa-b729882d9c41
X-Served-Region: eu
Content-Length: 181

{"id":"acc_191196c0-bfdc-4c9f-81c8-3188ad3c150e","handle":"qa-b729882d9c41","displayName":"QA b729882d9c41","region":"eu","role":"user","createdAt":"2026-11-22T09:54:53.948953315Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-0d86a1a5-9b4c-4c82-8631-723fdf739df3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d86a1a5-9b4c-4c82-8631-723fdf739df3
Content-Type: application/json

--- request body ---
{"handle":"qa-b729882d9c41","password":"****"}

--- response: 200 in 66 ms ---
Date: Sun, 22 Nov 2026 09:54:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-0d86a1a5-9b4c-4c82-8631-723fdf739df3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_191196c0-bfdc-4c9f-81c8-3188ad3c150e"}
```

## 3. PATCH /v1/accounts/me

```text
#3 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-944ba2a0-92c8-4953-b0c4-f4dc9d2295d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-944ba2a0-92c8-4953-b0c4-f4dc9d2295d2
Content-Type: application/json

--- request body ---
{"displayName":"Ava Lindqvist"}

--- response: 200 in 65 ms ---
Date: Sun, 22 Nov 2026 09:54:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-944ba2a0-92c8-4953-b0c4-f4dc9d2295d2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 179

{"id":"acc_191196c0-bfdc-4c9f-81c8-3188ad3c150e","handle":"qa-b729882d9c41","displayName":"Ava Lindqvist","region":"eu","role":"user","createdAt":"2026-11-22T09:54:53.948953315Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-5e3ee1ee-fb5a-41ee-b227-c4e0bbb0e8ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e3ee1ee-fb5a-41ee-b227-c4e0bbb0e8ef
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Sun, 22 Nov 2026 09:54:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-5e3ee1ee-fb5a-41ee-b227-c4e0bbb0e8ef
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 179

{"id":"acc_191196c0-bfdc-4c9f-81c8-3188ad3c150e","handle":"qa-b729882d9c41","displayName":"Ava Lindqvist","region":"eu","role":"user","createdAt":"2026-11-22T09:54:53.948953315Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-69f461ef-622f-4138-a507-e86280059e0d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-69f461ef-622f-4138-a507-e86280059e0d
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Sun, 22 Nov 2026 09:54:54 GMT
Content-Type: text/plain
X-Correlation-Id: qa-69f461ef-622f-4138-a507-e86280059e0d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-96298e4a-a665-4854-8969-3bef59c60cf6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96298e4a-a665-4854-8969-3bef59c60cf6
Content-Type: application/json

--- request body ---
{"handle":"qa-b729882d9c41","password":"****"}

--- response: 401 in 34 ms ---
Date: Sun, 22 Nov 2026 09:54:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-96298e4a-a665-4854-8969-3bef59c60cf6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-96298e4a-a665-4854-8969-3bef59c60cf6"}
```
