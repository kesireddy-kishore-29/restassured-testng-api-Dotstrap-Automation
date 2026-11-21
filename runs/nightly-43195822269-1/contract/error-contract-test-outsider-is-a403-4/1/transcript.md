# Transcript: Every conversation operation answers an outsider with a 403 problem [POST /v1/conversations/{id}/close]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[4]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 15 | `qa-f1dc2c82-cc05-42ce-b712-5ed9d350a29c` |
| 2 | `POST /v1/accounts` | 201 | 34 | `qa-fe61cb23-31ce-4d39-a247-95437ee0efe9` |
| 3 | `POST /v1/accounts` | 201 | 38 | `qa-1f71a3d9-228a-49ac-853d-735a36320261` |
| 4 | `POST /v1/auth/token` | 200 | 21 | `qa-4e8b1b8d-f221-47b7-b74b-6f3e4c117e65` |
| 5 | `POST /v1/conversations` | 201 | 15 | `qa-d50752dc-f287-4e72-90d9-a2cb82c2c5b1` |
| 6 | `POST /v1/auth/token` | 200 | 15 | `qa-c712bf8f-e54b-4d4c-8a27-c87105fc7052` |
| 7 | `POST /v1/conversations/{id}/close` | 403 | 5 | `qa-9a6c215f-5fd6-4ac9-ab64-003ab2cc46b0` |
| 8 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-112ba1aa-f51c-4f13-9f4e-3a42149abede` |
| 9 | `POST /v1/auth/token` | 401 | 12 | `qa-5f931aa3-3165-4de6-92ce-ccb95ee0cbde` |
| 10 | `POST /v1/auth/token` | 200 | 19 | `qa-ef88131c-47c6-445e-a4af-a9d49bbbea63` |
| 11 | `DELETE /v1/accounts/me` | 204 | 27 | `qa-90079a30-9a74-46c4-a74e-984e9501923d` |
| 12 | `POST /v1/auth/token` | 401 | 21 | `qa-cdfb8bba-c87c-48a3-abb0-6f6d2903d1bd` |
| 13 | `DELETE /v1/accounts/me` | 204 | 27 | `qa-7aa416d8-e28c-442c-af8b-adab5d6a6bae` |
| 14 | `POST /v1/auth/token` | 401 | 10 | `qa-fe83734e-d375-46f9-b989-703064d6b848` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f1dc2c82-cc05-42ce-b712-5ed9d350a29c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1dc2c82-cc05-42ce-b712-5ed9d350a29c
Content-Type: application/json

--- request body ---
{"handle":"qa-3959063c6d97","displayName":"QA 3959063c6d97","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-f1dc2c82-cc05-42ce-b712-5ed9d350a29c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 470
RateLimit-Reset: 9
Location: /v1/accounts/qa-3959063c6d97
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bf073a02-3e46-4149-b7d6-3fba65a71020","handle":"qa-3959063c6d97","displayName":"QA 3959063c6d97","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.137578642Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-fe61cb23-31ce-4d39-a247-95437ee0efe9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fe61cb23-31ce-4d39-a247-95437ee0efe9
Content-Type: application/json

--- request body ---
{"handle":"qa-72dcc25bc2a5","displayName":"QA 72dcc25bc2a5","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-fe61cb23-31ce-4d39-a247-95437ee0efe9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 458
RateLimit-Reset: 9
Location: /v1/accounts/qa-72dcc25bc2a5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e7fcbffe-e596-4ba4-aed9-e4179af75da6","handle":"qa-72dcc25bc2a5","displayName":"QA 72dcc25bc2a5","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.175124760Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-1f71a3d9-228a-49ac-853d-735a36320261

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f71a3d9-228a-49ac-853d-735a36320261
Content-Type: application/json

--- request body ---
{"handle":"qa-3b650039665d","displayName":"QA 3b650039665d","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-1f71a3d9-228a-49ac-853d-735a36320261
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 454
RateLimit-Reset: 9
Location: /v1/accounts/qa-3b650039665d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_207e23ba-95a2-4ad8-9e85-e58f595a6909","handle":"qa-3b650039665d","displayName":"QA 3b650039665d","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.224232676Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-4e8b1b8d-f221-47b7-b74b-6f3e4c117e65

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e8b1b8d-f221-47b7-b74b-6f3e4c117e65
Content-Type: application/json

--- request body ---
{"handle":"qa-3959063c6d97","password":"****"}

--- response: 200 in 21 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-4e8b1b8d-f221-47b7-b74b-6f3e4c117e65
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 450
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bf073a02-3e46-4149-b7d6-3fba65a71020"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-d50752dc-f287-4e72-90d9-a2cb82c2c5b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d50752dc-f287-4e72-90d9-a2cb82c2c5b1
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-72dcc25bc2a5","subject":"Error contract","message":"Hi"}

--- response: 201 in 15 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-d50752dc-f287-4e72-90d9-a2cb82c2c5b1
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
Location: /v1/conversations/cnv_6b7abf5c-fa94-482c-a02b-ac80724ea524
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_6b7abf5c-fa94-482c-a02b-ac80724ea524","subject":"Error contract","status":"open","region":"eu","participants":["qa-3959063c6d97","qa-72dcc25bc2a5"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-12T09:56:31.284104615Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-c712bf8f-e54b-4d4c-8a27-c87105fc7052

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c712bf8f-e54b-4d4c-8a27-c87105fc7052
Content-Type: application/json

--- request body ---
{"handle":"qa-3b650039665d","password":"****"}

--- response: 200 in 15 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-c712bf8f-e54b-4d4c-8a27-c87105fc7052
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 445
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_207e23ba-95a2-4ad8-9e85-e58f595a6909"}
```

## 7. POST /v1/conversations/{id}/close

```text
#7 POST http://localhost:7070/v1/conversations/cnv_6b7abf5c-fa94-482c-a02b-ac80724ea524/close
correlation: qa-9a6c215f-5fd6-4ac9-ab64-003ab2cc46b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a6c215f-5fd6-4ac9-ab64-003ab2cc46b0
Content-Type: application/json

--- response: 403 in 5 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9a6c215f-5fd6-4ac9-ab64-003ab2cc46b0
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
Content-Length: 291

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_6b7abf5c-fa94-482c-a02b-ac80724ea524/close","correlationId":"qa-9a6c215f-5fd6-4ac9-ab64-003ab2cc46b0"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-112ba1aa-f51c-4f13-9f4e-3a42149abede

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-112ba1aa-f51c-4f13-9f4e-3a42149abede
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-112ba1aa-f51c-4f13-9f4e-3a42149abede
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
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-5f931aa3-3165-4de6-92ce-ccb95ee0cbde

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f931aa3-3165-4de6-92ce-ccb95ee0cbde
Content-Type: application/json

--- request body ---
{"handle":"qa-3b650039665d","password":"****"}

--- response: 401 in 12 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5f931aa3-3165-4de6-92ce-ccb95ee0cbde
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 426
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5f931aa3-3165-4de6-92ce-ccb95ee0cbde"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-ef88131c-47c6-445e-a4af-a9d49bbbea63

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef88131c-47c6-445e-a4af-a9d49bbbea63
Content-Type: application/json

--- request body ---
{"handle":"qa-72dcc25bc2a5","password":"****"}

--- response: 200 in 19 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-ef88131c-47c6-445e-a4af-a9d49bbbea63
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 423
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e7fcbffe-e596-4ba4-aed9-e4179af75da6"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-90079a30-9a74-46c4-a74e-984e9501923d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-90079a30-9a74-46c4-a74e-984e9501923d
Content-Type: application/json

--- response: 204 in 27 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-90079a30-9a74-46c4-a74e-984e9501923d
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
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-cdfb8bba-c87c-48a3-abb0-6f6d2903d1bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cdfb8bba-c87c-48a3-abb0-6f6d2903d1bd
Content-Type: application/json

--- request body ---
{"handle":"qa-72dcc25bc2a5","password":"****"}

--- response: 401 in 21 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cdfb8bba-c87c-48a3-abb0-6f6d2903d1bd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 409
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cdfb8bba-c87c-48a3-abb0-6f6d2903d1bd"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7aa416d8-e28c-442c-af8b-adab5d6a6bae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7aa416d8-e28c-442c-af8b-adab5d6a6bae
Content-Type: application/json

--- response: 204 in 27 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7aa416d8-e28c-442c-af8b-adab5d6a6bae
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
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-fe83734e-d375-46f9-b989-703064d6b848

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fe83734e-d375-46f9-b989-703064d6b848
Content-Type: application/json

--- request body ---
{"handle":"qa-3959063c6d97","password":"****"}

--- response: 401 in 10 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fe83734e-d375-46f9-b989-703064d6b848
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 399
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fe83734e-d375-46f9-b989-703064d6b848"}
```
