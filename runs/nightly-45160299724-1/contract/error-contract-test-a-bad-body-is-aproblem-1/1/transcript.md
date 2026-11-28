# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[1]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 29 | `qa-59f929fe-d511-4f29-ba26-f7f976d01c6f` |
| 2 | `POST /v1/accounts` | 201 | 41 | `qa-fa61aed5-ea2a-437f-ae75-d8cb9d21c12d` |
| 3 | `POST /v1/auth/token` | 200 | 38 | `qa-99768f48-54f1-4ddd-ad17-4d3503c4e5d5` |
| 4 | `POST /v1/conversations` | 201 | 21 | `qa-cd807710-a8f9-44e9-9657-40e813c9cae7` |
| 5 | `POST /v1/auth/token` | 415 | 25 | `qa-db191fb4-bc82-4991-b938-ca0c0d49b915` |
| 6 | `POST /v1/auth/token` | 200 | 29 | `qa-7a8e05c7-a007-4cc2-893c-47fb7f7ecb7b` |
| 7 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-0e27611e-8257-4cb8-a1f0-2ea5d82bd2d8` |
| 8 | `POST /v1/auth/token` | 401 | 22 | `qa-1395dbe0-06e9-401e-97f8-b780a94dd778` |
| 9 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-badeae58-d761-4f7d-9b73-b36a574f7cf2` |
| 10 | `POST /v1/auth/token` | 401 | 24 | `qa-dc1e0add-b60d-481d-aab8-52fce2e632d9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-59f929fe-d511-4f29-ba26-f7f976d01c6f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-59f929fe-d511-4f29-ba26-f7f976d01c6f
Content-Type: application/json

--- request body ---
{"handle":"qa-a7c31b6ab0ca","displayName":"QA a7c31b6ab0ca","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-59f929fe-d511-4f29-ba26-f7f976d01c6f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 10
Location: /v1/accounts/qa-a7c31b6ab0ca
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e23274b7-2c9b-408b-90e8-89922ac0fd77","handle":"qa-a7c31b6ab0ca","displayName":"QA a7c31b6ab0ca","region":"eu","role":"user","createdAt":"2026-11-23T10:54:57.635014510Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-fa61aed5-ea2a-437f-ae75-d8cb9d21c12d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa61aed5-ea2a-437f-ae75-d8cb9d21c12d
Content-Type: application/json

--- request body ---
{"handle":"qa-512c43901389","displayName":"QA 512c43901389","password":"****","region":"eu"}

--- response: 201 in 41 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-fa61aed5-ea2a-437f-ae75-d8cb9d21c12d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 564
RateLimit-Reset: 10
Location: /v1/accounts/qa-512c43901389
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1312488e-ef1b-4ef8-86c0-7363bfe70418","handle":"qa-512c43901389","displayName":"QA 512c43901389","region":"eu","role":"user","createdAt":"2026-11-23T10:54:57.679821589Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-99768f48-54f1-4ddd-ad17-4d3503c4e5d5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-99768f48-54f1-4ddd-ad17-4d3503c4e5d5
Content-Type: application/json

--- request body ---
{"handle":"qa-a7c31b6ab0ca","password":"****"}

--- response: 200 in 38 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-99768f48-54f1-4ddd-ad17-4d3503c4e5d5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 554
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e23274b7-2c9b-408b-90e8-89922ac0fd77"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-cd807710-a8f9-44e9-9657-40e813c9cae7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd807710-a8f9-44e9-9657-40e813c9cae7
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-512c43901389","subject":"Error contract","message":"Hi"}

--- response: 201 in 21 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-cd807710-a8f9-44e9-9657-40e813c9cae7
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
Location: /v1/conversations/cnv_27fdd4a0-e442-43e3-af77-f020610325ce
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_27fdd4a0-e442-43e3-af77-f020610325ce","subject":"Error contract","status":"open","region":"eu","participants":["qa-a7c31b6ab0ca","qa-512c43901389"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-23T10:54:57.777057776Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-db191fb4-bc82-4991-b938-ca0c0d49b915

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db191fb4-bc82-4991-b938-ca0c0d49b915
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 25 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-db191fb4-bc82-4991-b938-ca0c0d49b915
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 547
RateLimit-Reset: 10
Content-Length: 254

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/auth/token","correlationId":"qa-db191fb4-bc82-4991-b938-ca0c0d49b915"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-7a8e05c7-a007-4cc2-893c-47fb7f7ecb7b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7a8e05c7-a007-4cc2-893c-47fb7f7ecb7b
Content-Type: application/json

--- request body ---
{"handle":"qa-512c43901389","password":"****"}

--- response: 200 in 29 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-7a8e05c7-a007-4cc2-893c-47fb7f7ecb7b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 525
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1312488e-ef1b-4ef8-86c0-7363bfe70418"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0e27611e-8257-4cb8-a1f0-2ea5d82bd2d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e27611e-8257-4cb8-a1f0-2ea5d82bd2d8
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0e27611e-8257-4cb8-a1f0-2ea5d82bd2d8
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

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-1395dbe0-06e9-401e-97f8-b780a94dd778

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1395dbe0-06e9-401e-97f8-b780a94dd778
Content-Type: application/json

--- request body ---
{"handle":"qa-512c43901389","password":"****"}

--- response: 401 in 22 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1395dbe0-06e9-401e-97f8-b780a94dd778
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 514
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1395dbe0-06e9-401e-97f8-b780a94dd778"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-badeae58-d761-4f7d-9b73-b36a574f7cf2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-badeae58-d761-4f7d-9b73-b36a574f7cf2
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-badeae58-d761-4f7d-9b73-b36a574f7cf2
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

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-dc1e0add-b60d-481d-aab8-52fce2e632d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc1e0add-b60d-481d-aab8-52fce2e632d9
Content-Type: application/json

--- request body ---
{"handle":"qa-a7c31b6ab0ca","password":"****"}

--- response: 401 in 24 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dc1e0add-b60d-481d-aab8-52fce2e632d9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 496
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-dc1e0add-b60d-481d-aab8-52fce2e632d9"}
```
